package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class PeriodicalGDPTotalInCurrentPricesIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalGDPTotalInCurrentPricesIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalGDPTotalInCurrentPricesIterator.class);

	String subjectURI = null;
	String GDPTotalInCurrentPrices = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Periodical ancestorInstance = (Periodical) findAncestorWithClass(this, Periodical.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#GDPTotalInCurrentPrices> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				GDPTotalInCurrentPrices = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in PeriodicalIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in PeriodicalIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				GDPTotalInCurrentPrices = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in PeriodicalIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in PeriodicalIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Periodical doEndTag", e);
			throw new JspTagException("Exception raised in Periodical doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setGDPTotalInCurrentPrices(String GDPTotalInCurrentPrices) {
		this.GDPTotalInCurrentPrices = GDPTotalInCurrentPrices;
	}

	public String getGDPTotalInCurrentPrices() {
		return GDPTotalInCurrentPrices;
	}

}
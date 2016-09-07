package edu.uiowa.slis.VIVOISF.SubnationalRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SubnationalRegionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SubnationalRegionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SubnationalRegionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			SubnationalRegion theSubnationalRegion = (SubnationalRegion)findAncestorWithClass(this, SubnationalRegion.class);
			if (!theSubnationalRegion.commitNeeded) {
				pageContext.getOut().print(theSubnationalRegion.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing SubnationalRegion for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SubnationalRegion for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			SubnationalRegion theSubnationalRegion = (SubnationalRegion)findAncestorWithClass(this, SubnationalRegion.class);
			return theSubnationalRegion.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing SubnationalRegion for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SubnationalRegion for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			SubnationalRegion theSubnationalRegion = (SubnationalRegion)findAncestorWithClass(this, SubnationalRegion.class);
			theSubnationalRegion.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing SubnationalRegion for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SubnationalRegion for label tag ");
		}
	}
}

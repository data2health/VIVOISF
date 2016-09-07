package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmFeaturesIterator theFilmFeaturesIterator = (FilmFeaturesIterator)findAncestorWithClass(this, FilmFeaturesIterator.class);
			pageContext.getOut().print(theFilmFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for features tag ");
		}
		return SKIP_BODY;
	}
}

package fr.inria.atlanmod.neoemf.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class PrefetchingHighlightingConfiguration extends DefaultHighlightingConfiguration
    implements IHighlightingConfiguration {
	
	public static final String ATL_BLUE = "atlBlue";
	
  @Override
  public void configure(IHighlightingConfigurationAcceptor acceptor) {
	  super.configure(acceptor);
	  acceptor.acceptDefaultHighlighting(ATL_BLUE, "ATL Blue", atlBlueTextStyle());
  }
  
  public TextStyle atlBlueTextStyle() {
    TextStyle textStyle = new TextStyle();
    textStyle.setColor(new RGB(31, 71, 125));
    textStyle.setStyle(SWT.BOLD);
    return textStyle;
  }
}

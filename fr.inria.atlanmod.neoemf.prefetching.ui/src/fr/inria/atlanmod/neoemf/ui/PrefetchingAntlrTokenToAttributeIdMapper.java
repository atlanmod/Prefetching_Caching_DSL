package fr.inria.atlanmod.neoemf.ui;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class PrefetchingAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper
{
//    private static final Pattern QUOTED = Pattern.compile("(?:^'(\\w[^']*)'$)|(?:^\"(\\w[^\"]*)\")$", Pattern.MULTILINE);

	private List<String> atlBlueKeywords = Arrays.asList("'LRU'","'Predictive'","'['","']'","'size'");
	
	
	
    @Override
    protected String calculateId(String tokenName, int tokenType) {
    	if(atlBlueKeywords.contains(tokenName)) {
            return PrefetchingHighlightingConfiguration.ATL_BLUE;
        }
        return super.calculateId(tokenName,tokenType);
    }
}

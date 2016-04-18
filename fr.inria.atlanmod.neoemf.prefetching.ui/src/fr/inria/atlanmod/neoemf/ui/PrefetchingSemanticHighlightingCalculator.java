package fr.inria.atlanmod.neoemf.ui;

import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class PrefetchingSemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		  if (resource == null || resource.getParseResult() == null)
			    return;
		  
		  INode root = resource.getParseResult().getRootNode();
		  for (INode node : root.getAsTreeIterable()) {
			  if(node.getGrammarElement() instanceof RuleCall) {
				  RuleCall r = (RuleCall)node.getGrammarElement();
				  if(r.getRule().getName().equals("PatternExp")) {
					acceptor.addPosition(node.getOffset(), node.getLength(),
							PrefetchingHighlightingConfiguration.ATL_BLUE);
				  }
				  if(r.getRule().getName().equals("ClassPatternExp")) {
					acceptor.addPosition(node.getOffset(), node.getLength(),
							PrefetchingHighlightingConfiguration.ATL_BLUE);
				  }
			  }
		  }
	}

}

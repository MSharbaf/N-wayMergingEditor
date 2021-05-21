/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.nml.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.nml.parser.antlr.internal.InternalNMLParser;
import org.xtext.example.nml.services.NMLGrammarAccess;

public class NMLParser extends AbstractAntlrParser {

	@Inject
	private NMLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalNMLParser createParser(XtextTokenStream stream) {
		return new InternalNMLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "TopLevelCP";
	}

	public NMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(NMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
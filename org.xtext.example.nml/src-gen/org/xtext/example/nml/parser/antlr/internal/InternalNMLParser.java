package org.xtext.example.nml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.nml.services.NMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalNMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_SIMPLE_ID", "RULE_ESCAPED_ID", "RULE_SINGLE_QUOTED_STRING", "RULE_ESCAPED_CHARACTER", "RULE_LETTER_CHARACTER", "RULE_DOUBLE_QUOTED_STRING", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'pre'", "'}'", "'rule'", "'post'", "'import'", "':'", "';'", "'mergeOctopus'", "'with'", "','", "'withBase'", "'into'", "'extends'", "'mergeOurs'", "'exists_in'", "'priority'", "'transfer'", "'from'", "'to'", "'guard'", "'or'", "'and'", "'!'", "'['", "']'", "'('", "')'", "'var'", "'='", "'::='", "'.'", "'equivalent'", "'+'", "'new'", "'>'", "'<'", "'<>'", "'>='", "'=<'", "'->'", "'-'", "'not'", "'not2'", "'*'", "'/'", "'<='", "'and2'", "'implies'", "'implies2'", "'or2'", "'xor'", "'xor2'", "'?.'", "'?->'", "'Map'", "'Tuple'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'..'", "'++'", "'Lambda'", "'<-'", "'true'", "'false'", "'invalid'", "'null'", "'@'", "'in'", "'|'", "'if'", "'then'", "'else'", "'endif'", "'elseif'", "'let'", "'self'", "'|?'", "'|1'", "'?'", "'::'", "'&&'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_INT=4;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_SINGLE_QUOTED_STRING=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_DOUBLE_QUOTED_STRING=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_ESCAPED_ID=6;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_LETTER_CHARACTER=9;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int RULE_ESCAPED_CHARACTER=8;
    public static final int T__95=95;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=11;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int RULE_SIMPLE_ID=5;
    public static final int T__83=83;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalNMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalNML.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private NMLGrammarAccess grammarAccess;

        public InternalNMLParser(TokenStream input, NMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TopLevelCP";
       	}

       	@Override
       	protected NMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTopLevelCP"
    // InternalNML.g:70:1: entryRuleTopLevelCP returns [EObject current=null] : iv_ruleTopLevelCP= ruleTopLevelCP EOF ;
    public final EObject entryRuleTopLevelCP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelCP = null;


        try {
            // InternalNML.g:70:51: (iv_ruleTopLevelCP= ruleTopLevelCP EOF )
            // InternalNML.g:71:2: iv_ruleTopLevelCP= ruleTopLevelCP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTopLevelCPRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTopLevelCP=ruleTopLevelCP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTopLevelCP; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopLevelCP"


    // $ANTLR start "ruleTopLevelCP"
    // InternalNML.g:77:1: ruleTopLevelCP returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedDomains_3_0= ruleDomainCP ) )+ (otherlv_4= 'pre' ( ruleUnrestrictedName )? otherlv_6= '{' ( (lv_ownedPre_7_0= ruleStatementCS ) )* otherlv_8= '}' )? (otherlv_9= 'rule' ruleUnrestrictedName ( (lv_ownedOctopus_11_0= ruleOctopusCP ) ) )* (otherlv_12= 'rule' ruleUnrestrictedName ( (lv_ownedOurs_14_0= ruleOursCP ) ) )* (otherlv_15= 'rule' ruleUnrestrictedName ( (lv_ownedTransformation_17_0= ruleTransferCP ) ) )* (otherlv_18= 'post' ( ruleUnrestrictedName )? otherlv_20= '{' ( (lv_ownedPre_21_0= ruleStatementCS ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleTopLevelCP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedDomains_3_0 = null;

        EObject lv_ownedPre_7_0 = null;

        EObject lv_ownedOctopus_11_0 = null;

        EObject lv_ownedOurs_14_0 = null;

        EObject lv_ownedTransformation_17_0 = null;

        EObject lv_ownedPre_21_0 = null;



        	enterRule();

        try {
            // InternalNML.g:83:2: ( (otherlv_0= 'module' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedDomains_3_0= ruleDomainCP ) )+ (otherlv_4= 'pre' ( ruleUnrestrictedName )? otherlv_6= '{' ( (lv_ownedPre_7_0= ruleStatementCS ) )* otherlv_8= '}' )? (otherlv_9= 'rule' ruleUnrestrictedName ( (lv_ownedOctopus_11_0= ruleOctopusCP ) ) )* (otherlv_12= 'rule' ruleUnrestrictedName ( (lv_ownedOurs_14_0= ruleOursCP ) ) )* (otherlv_15= 'rule' ruleUnrestrictedName ( (lv_ownedTransformation_17_0= ruleTransferCP ) ) )* (otherlv_18= 'post' ( ruleUnrestrictedName )? otherlv_20= '{' ( (lv_ownedPre_21_0= ruleStatementCS ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // InternalNML.g:84:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedDomains_3_0= ruleDomainCP ) )+ (otherlv_4= 'pre' ( ruleUnrestrictedName )? otherlv_6= '{' ( (lv_ownedPre_7_0= ruleStatementCS ) )* otherlv_8= '}' )? (otherlv_9= 'rule' ruleUnrestrictedName ( (lv_ownedOctopus_11_0= ruleOctopusCP ) ) )* (otherlv_12= 'rule' ruleUnrestrictedName ( (lv_ownedOurs_14_0= ruleOursCP ) ) )* (otherlv_15= 'rule' ruleUnrestrictedName ( (lv_ownedTransformation_17_0= ruleTransferCP ) ) )* (otherlv_18= 'post' ( ruleUnrestrictedName )? otherlv_20= '{' ( (lv_ownedPre_21_0= ruleStatementCS ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // InternalNML.g:84:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedDomains_3_0= ruleDomainCP ) )+ (otherlv_4= 'pre' ( ruleUnrestrictedName )? otherlv_6= '{' ( (lv_ownedPre_7_0= ruleStatementCS ) )* otherlv_8= '}' )? (otherlv_9= 'rule' ruleUnrestrictedName ( (lv_ownedOctopus_11_0= ruleOctopusCP ) ) )* (otherlv_12= 'rule' ruleUnrestrictedName ( (lv_ownedOurs_14_0= ruleOursCP ) ) )* (otherlv_15= 'rule' ruleUnrestrictedName ( (lv_ownedTransformation_17_0= ruleTransferCP ) ) )* (otherlv_18= 'post' ( ruleUnrestrictedName )? otherlv_20= '{' ( (lv_ownedPre_21_0= ruleStatementCS ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // InternalNML.g:85:3: otherlv_0= 'module' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedDomains_3_0= ruleDomainCP ) )+ (otherlv_4= 'pre' ( ruleUnrestrictedName )? otherlv_6= '{' ( (lv_ownedPre_7_0= ruleStatementCS ) )* otherlv_8= '}' )? (otherlv_9= 'rule' ruleUnrestrictedName ( (lv_ownedOctopus_11_0= ruleOctopusCP ) ) )* (otherlv_12= 'rule' ruleUnrestrictedName ( (lv_ownedOurs_14_0= ruleOursCP ) ) )* (otherlv_15= 'rule' ruleUnrestrictedName ( (lv_ownedTransformation_17_0= ruleTransferCP ) ) )* (otherlv_18= 'post' ( ruleUnrestrictedName )? otherlv_20= '{' ( (lv_ownedPre_21_0= ruleStatementCS ) )* otherlv_22= '}' )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTopLevelCPAccess().getModuleKeyword_0());
              		
            }
            // InternalNML.g:89:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalNML.g:90:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalNML.g:90:4: (lv_name_1_0= ruleIdentifier )
            // InternalNML.g:91:5: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTopLevelCPAccess().getNameIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTopLevelCPRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.ocl.xtext.base.Base.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTopLevelCPAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalNML.g:112:3: ( (lv_ownedDomains_3_0= ruleDomainCP ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalNML.g:113:4: (lv_ownedDomains_3_0= ruleDomainCP )
            	    {
            	    // InternalNML.g:113:4: (lv_ownedDomains_3_0= ruleDomainCP )
            	    // InternalNML.g:114:5: lv_ownedDomains_3_0= ruleDomainCP
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTopLevelCPAccess().getOwnedDomainsDomainCPParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_ownedDomains_3_0=ruleDomainCP();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTopLevelCPRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedDomains",
            	      						lv_ownedDomains_3_0,
            	      						"org.xtext.example.nml.NML.DomainCP");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalNML.g:131:3: (otherlv_4= 'pre' ( ruleUnrestrictedName )? otherlv_6= '{' ( (lv_ownedPre_7_0= ruleStatementCS ) )* otherlv_8= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalNML.g:132:4: otherlv_4= 'pre' ( ruleUnrestrictedName )? otherlv_6= '{' ( (lv_ownedPre_7_0= ruleStatementCS ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTopLevelCPAccess().getPreKeyword_4_0());
                      			
                    }
                    // InternalNML.g:136:4: ( ruleUnrestrictedName )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=RULE_SIMPLE_ID && LA2_0<=RULE_ESCAPED_ID)) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalNML.g:137:5: ruleUnrestrictedName
                            {
                            if ( state.backtracking==0 ) {

                              					/* */
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getTopLevelCPAccess().getUnrestrictedNameParserRuleCall_4_1());
                              				
                            }
                            pushFollow(FollowSets000.FOLLOW_4);
                            ruleUnrestrictedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getTopLevelCPAccess().getLeftCurlyBracketKeyword_4_2());
                      			
                    }
                    // InternalNML.g:152:4: ( (lv_ownedPre_7_0= ruleStatementCS ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=RULE_SIMPLE_ID && LA3_0<=RULE_ESCAPED_ID)||(LA3_0>=45 && LA3_0<=47)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalNML.g:153:5: (lv_ownedPre_7_0= ruleStatementCS )
                    	    {
                    	    // InternalNML.g:153:5: (lv_ownedPre_7_0= ruleStatementCS )
                    	    // InternalNML.g:154:6: lv_ownedPre_7_0= ruleStatementCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getTopLevelCPAccess().getOwnedPreStatementCSParserRuleCall_4_3_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_8);
                    	    lv_ownedPre_7_0=ruleStatementCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getTopLevelCPRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"ownedPre",
                    	      							lv_ownedPre_7_0,
                    	      							"org.xtext.example.nml.NML.StatementCS");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getTopLevelCPAccess().getRightCurlyBracketKeyword_4_4());
                      			
                    }

                    }
                    break;

            }

            // InternalNML.g:176:3: (otherlv_9= 'rule' ruleUnrestrictedName ( (lv_ownedOctopus_11_0= ruleOctopusCP ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==RULE_SIMPLE_ID) ) {
                        int LA5_3 = input.LA(3);

                        if ( (LA5_3==25) ) {
                            alt5=1;
                        }


                    }
                    else if ( (LA5_1==RULE_ESCAPED_ID) ) {
                        int LA5_4 = input.LA(3);

                        if ( (LA5_4==25) ) {
                            alt5=1;
                        }


                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalNML.g:177:4: otherlv_9= 'rule' ruleUnrestrictedName ( (lv_ownedOctopus_11_0= ruleOctopusCP ) )
            	    {
            	    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_9, grammarAccess.getTopLevelCPAccess().getRuleKeyword_5_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTopLevelCPAccess().getUnrestrictedNameParserRuleCall_5_1());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    ruleUnrestrictedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalNML.g:191:4: ( (lv_ownedOctopus_11_0= ruleOctopusCP ) )
            	    // InternalNML.g:192:5: (lv_ownedOctopus_11_0= ruleOctopusCP )
            	    {
            	    // InternalNML.g:192:5: (lv_ownedOctopus_11_0= ruleOctopusCP )
            	    // InternalNML.g:193:6: lv_ownedOctopus_11_0= ruleOctopusCP
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTopLevelCPAccess().getOwnedOctopusOctopusCPParserRuleCall_5_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_ownedOctopus_11_0=ruleOctopusCP();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTopLevelCPRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedOctopus",
            	      							lv_ownedOctopus_11_0,
            	      							"org.xtext.example.nml.NML.OctopusCP");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalNML.g:211:3: (otherlv_12= 'rule' ruleUnrestrictedName ( (lv_ownedOurs_14_0= ruleOursCP ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==RULE_SIMPLE_ID) ) {
                        int LA6_3 = input.LA(3);

                        if ( (LA6_3==31) ) {
                            alt6=1;
                        }


                    }
                    else if ( (LA6_1==RULE_ESCAPED_ID) ) {
                        int LA6_4 = input.LA(3);

                        if ( (LA6_4==31) ) {
                            alt6=1;
                        }


                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalNML.g:212:4: otherlv_12= 'rule' ruleUnrestrictedName ( (lv_ownedOurs_14_0= ruleOursCP ) )
            	    {
            	    otherlv_12=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_12, grammarAccess.getTopLevelCPAccess().getRuleKeyword_6_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTopLevelCPAccess().getUnrestrictedNameParserRuleCall_6_1());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    ruleUnrestrictedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalNML.g:226:4: ( (lv_ownedOurs_14_0= ruleOursCP ) )
            	    // InternalNML.g:227:5: (lv_ownedOurs_14_0= ruleOursCP )
            	    {
            	    // InternalNML.g:227:5: (lv_ownedOurs_14_0= ruleOursCP )
            	    // InternalNML.g:228:6: lv_ownedOurs_14_0= ruleOursCP
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTopLevelCPAccess().getOwnedOursOursCPParserRuleCall_6_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_ownedOurs_14_0=ruleOursCP();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTopLevelCPRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedOurs",
            	      							lv_ownedOurs_14_0,
            	      							"org.xtext.example.nml.NML.OursCP");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalNML.g:246:3: (otherlv_15= 'rule' ruleUnrestrictedName ( (lv_ownedTransformation_17_0= ruleTransferCP ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalNML.g:247:4: otherlv_15= 'rule' ruleUnrestrictedName ( (lv_ownedTransformation_17_0= ruleTransferCP ) )
            	    {
            	    otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_15, grammarAccess.getTopLevelCPAccess().getRuleKeyword_7_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTopLevelCPAccess().getUnrestrictedNameParserRuleCall_7_1());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    ruleUnrestrictedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalNML.g:261:4: ( (lv_ownedTransformation_17_0= ruleTransferCP ) )
            	    // InternalNML.g:262:5: (lv_ownedTransformation_17_0= ruleTransferCP )
            	    {
            	    // InternalNML.g:262:5: (lv_ownedTransformation_17_0= ruleTransferCP )
            	    // InternalNML.g:263:6: lv_ownedTransformation_17_0= ruleTransferCP
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTopLevelCPAccess().getOwnedTransformationTransferCPParserRuleCall_7_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_ownedTransformation_17_0=ruleTransferCP();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTopLevelCPRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedTransformation",
            	      							lv_ownedTransformation_17_0,
            	      							"org.xtext.example.nml.NML.TransferCP");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalNML.g:281:3: (otherlv_18= 'post' ( ruleUnrestrictedName )? otherlv_20= '{' ( (lv_ownedPre_21_0= ruleStatementCS ) )* otherlv_22= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalNML.g:282:4: otherlv_18= 'post' ( ruleUnrestrictedName )? otherlv_20= '{' ( (lv_ownedPre_21_0= ruleStatementCS ) )* otherlv_22= '}'
                    {
                    otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getTopLevelCPAccess().getPostKeyword_8_0());
                      			
                    }
                    // InternalNML.g:286:4: ( ruleUnrestrictedName )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=RULE_SIMPLE_ID && LA8_0<=RULE_ESCAPED_ID)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalNML.g:287:5: ruleUnrestrictedName
                            {
                            if ( state.backtracking==0 ) {

                              					/* */
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getTopLevelCPAccess().getUnrestrictedNameParserRuleCall_8_1());
                              				
                            }
                            pushFollow(FollowSets000.FOLLOW_4);
                            ruleUnrestrictedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }

                    otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getTopLevelCPAccess().getLeftCurlyBracketKeyword_8_2());
                      			
                    }
                    // InternalNML.g:302:4: ( (lv_ownedPre_21_0= ruleStatementCS ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_SIMPLE_ID && LA9_0<=RULE_ESCAPED_ID)||(LA9_0>=45 && LA9_0<=47)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalNML.g:303:5: (lv_ownedPre_21_0= ruleStatementCS )
                    	    {
                    	    // InternalNML.g:303:5: (lv_ownedPre_21_0= ruleStatementCS )
                    	    // InternalNML.g:304:6: lv_ownedPre_21_0= ruleStatementCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getTopLevelCPAccess().getOwnedPreStatementCSParserRuleCall_8_3_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_8);
                    	    lv_ownedPre_21_0=ruleStatementCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getTopLevelCPRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"ownedPre",
                    	      							lv_ownedPre_21_0,
                    	      							"org.xtext.example.nml.NML.StatementCS");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,19,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getTopLevelCPAccess().getRightCurlyBracketKeyword_8_4());
                      			
                    }

                    }
                    break;

            }

            otherlv_23=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getTopLevelCPAccess().getRightCurlyBracketKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopLevelCP"


    // $ANTLR start "entryRuleDomainCP"
    // InternalNML.g:334:1: entryRuleDomainCP returns [EObject current=null] : iv_ruleDomainCP= ruleDomainCP EOF ;
    public final EObject entryRuleDomainCP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainCP = null;


        try {
            // InternalNML.g:334:49: (iv_ruleDomainCP= ruleDomainCP EOF )
            // InternalNML.g:335:2: iv_ruleDomainCP= ruleDomainCP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainCPRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDomainCP=ruleDomainCP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainCP; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainCP"


    // $ANTLR start "ruleDomainCP"
    // InternalNML.g:341:1: ruleDomainCP returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_name_1_0= ruleID ) ) otherlv_2= ':' )? ( (lv_nsURI_3_0= ruleURI ) ) otherlv_4= ';' ) ;
    public final EObject ruleDomainCP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_nsURI_3_0 = null;



        	enterRule();

        try {
            // InternalNML.g:347:2: ( (otherlv_0= 'import' ( ( (lv_name_1_0= ruleID ) ) otherlv_2= ':' )? ( (lv_nsURI_3_0= ruleURI ) ) otherlv_4= ';' ) )
            // InternalNML.g:348:2: (otherlv_0= 'import' ( ( (lv_name_1_0= ruleID ) ) otherlv_2= ':' )? ( (lv_nsURI_3_0= ruleURI ) ) otherlv_4= ';' )
            {
            // InternalNML.g:348:2: (otherlv_0= 'import' ( ( (lv_name_1_0= ruleID ) ) otherlv_2= ':' )? ( (lv_nsURI_3_0= ruleURI ) ) otherlv_4= ';' )
            // InternalNML.g:349:3: otherlv_0= 'import' ( ( (lv_name_1_0= ruleID ) ) otherlv_2= ':' )? ( (lv_nsURI_3_0= ruleURI ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDomainCPAccess().getImportKeyword_0());
              		
            }
            // InternalNML.g:353:3: ( ( (lv_name_1_0= ruleID ) ) otherlv_2= ':' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_SIMPLE_ID && LA11_0<=RULE_ESCAPED_ID)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalNML.g:354:4: ( (lv_name_1_0= ruleID ) ) otherlv_2= ':'
                    {
                    // InternalNML.g:354:4: ( (lv_name_1_0= ruleID ) )
                    // InternalNML.g:355:5: (lv_name_1_0= ruleID )
                    {
                    // InternalNML.g:355:5: (lv_name_1_0= ruleID )
                    // InternalNML.g:356:6: lv_name_1_0= ruleID
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDomainCPAccess().getNameIDParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_name_1_0=ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDomainCPRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.eclipse.ocl.xtext.base.Base.ID");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDomainCPAccess().getColonKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalNML.g:378:3: ( (lv_nsURI_3_0= ruleURI ) )
            // InternalNML.g:379:4: (lv_nsURI_3_0= ruleURI )
            {
            // InternalNML.g:379:4: (lv_nsURI_3_0= ruleURI )
            // InternalNML.g:380:5: lv_nsURI_3_0= ruleURI
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainCPAccess().getNsURIURIParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_nsURI_3_0=ruleURI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainCPRule());
              					}
              					set(
              						current,
              						"nsURI",
              						lv_nsURI_3_0,
              						"org.eclipse.ocl.xtext.base.Base.URI");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDomainCPAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainCP"


    // $ANTLR start "entryRuleOctopusCP"
    // InternalNML.g:405:1: entryRuleOctopusCP returns [EObject current=null] : iv_ruleOctopusCP= ruleOctopusCP EOF ;
    public final EObject entryRuleOctopusCP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOctopusCP = null;


        try {
            // InternalNML.g:405:50: (iv_ruleOctopusCP= ruleOctopusCP EOF )
            // InternalNML.g:406:2: iv_ruleOctopusCP= ruleOctopusCP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOctopusCPRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOctopusCP=ruleOctopusCP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOctopusCP; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOctopusCP"


    // $ANTLR start "ruleOctopusCP"
    // InternalNML.g:412:1: ruleOctopusCP returns [EObject current=null] : (otherlv_0= 'mergeOctopus' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'with' ( (lv_ownedModels_3_0= rulemodelTypeCS ) ) (otherlv_4= ',' ( (lv_ownedModels_5_0= rulemodelTypeCS ) ) )* (otherlv_6= 'withBase' ( (lv_ownedModels_7_0= rulemodelTypeCS ) ) )? otherlv_8= 'into' ( (lv_ownedModels_9_0= rulemodelTypeCS ) ) (otherlv_10= 'extends' ruleUnrestrictedName (otherlv_12= ',' ruleUnrestrictedName )* )? otherlv_14= '{' ( (lv_ownedConditions_15_0= ruleStatementCS ) )+ otherlv_16= '}' ) ;
    public final EObject ruleOctopusCP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_ownedModels_1_0 = null;

        EObject lv_ownedModels_3_0 = null;

        EObject lv_ownedModels_5_0 = null;

        EObject lv_ownedModels_7_0 = null;

        EObject lv_ownedModels_9_0 = null;

        EObject lv_ownedConditions_15_0 = null;



        	enterRule();

        try {
            // InternalNML.g:418:2: ( (otherlv_0= 'mergeOctopus' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'with' ( (lv_ownedModels_3_0= rulemodelTypeCS ) ) (otherlv_4= ',' ( (lv_ownedModels_5_0= rulemodelTypeCS ) ) )* (otherlv_6= 'withBase' ( (lv_ownedModels_7_0= rulemodelTypeCS ) ) )? otherlv_8= 'into' ( (lv_ownedModels_9_0= rulemodelTypeCS ) ) (otherlv_10= 'extends' ruleUnrestrictedName (otherlv_12= ',' ruleUnrestrictedName )* )? otherlv_14= '{' ( (lv_ownedConditions_15_0= ruleStatementCS ) )+ otherlv_16= '}' ) )
            // InternalNML.g:419:2: (otherlv_0= 'mergeOctopus' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'with' ( (lv_ownedModels_3_0= rulemodelTypeCS ) ) (otherlv_4= ',' ( (lv_ownedModels_5_0= rulemodelTypeCS ) ) )* (otherlv_6= 'withBase' ( (lv_ownedModels_7_0= rulemodelTypeCS ) ) )? otherlv_8= 'into' ( (lv_ownedModels_9_0= rulemodelTypeCS ) ) (otherlv_10= 'extends' ruleUnrestrictedName (otherlv_12= ',' ruleUnrestrictedName )* )? otherlv_14= '{' ( (lv_ownedConditions_15_0= ruleStatementCS ) )+ otherlv_16= '}' )
            {
            // InternalNML.g:419:2: (otherlv_0= 'mergeOctopus' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'with' ( (lv_ownedModels_3_0= rulemodelTypeCS ) ) (otherlv_4= ',' ( (lv_ownedModels_5_0= rulemodelTypeCS ) ) )* (otherlv_6= 'withBase' ( (lv_ownedModels_7_0= rulemodelTypeCS ) ) )? otherlv_8= 'into' ( (lv_ownedModels_9_0= rulemodelTypeCS ) ) (otherlv_10= 'extends' ruleUnrestrictedName (otherlv_12= ',' ruleUnrestrictedName )* )? otherlv_14= '{' ( (lv_ownedConditions_15_0= ruleStatementCS ) )+ otherlv_16= '}' )
            // InternalNML.g:420:3: otherlv_0= 'mergeOctopus' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'with' ( (lv_ownedModels_3_0= rulemodelTypeCS ) ) (otherlv_4= ',' ( (lv_ownedModels_5_0= rulemodelTypeCS ) ) )* (otherlv_6= 'withBase' ( (lv_ownedModels_7_0= rulemodelTypeCS ) ) )? otherlv_8= 'into' ( (lv_ownedModels_9_0= rulemodelTypeCS ) ) (otherlv_10= 'extends' ruleUnrestrictedName (otherlv_12= ',' ruleUnrestrictedName )* )? otherlv_14= '{' ( (lv_ownedConditions_15_0= ruleStatementCS ) )+ otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOctopusCPAccess().getMergeOctopusKeyword_0());
              		
            }
            // InternalNML.g:424:3: ( (lv_ownedModels_1_0= rulemodelTypeCS ) )
            // InternalNML.g:425:4: (lv_ownedModels_1_0= rulemodelTypeCS )
            {
            // InternalNML.g:425:4: (lv_ownedModels_1_0= rulemodelTypeCS )
            // InternalNML.g:426:5: lv_ownedModels_1_0= rulemodelTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOctopusCPAccess().getOwnedModelsModelTypeCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_17);
            lv_ownedModels_1_0=rulemodelTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOctopusCPRule());
              					}
              					add(
              						current,
              						"ownedModels",
              						lv_ownedModels_1_0,
              						"org.xtext.example.nml.NML.modelTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOctopusCPAccess().getWithKeyword_2());
              		
            }
            // InternalNML.g:447:3: ( (lv_ownedModels_3_0= rulemodelTypeCS ) )
            // InternalNML.g:448:4: (lv_ownedModels_3_0= rulemodelTypeCS )
            {
            // InternalNML.g:448:4: (lv_ownedModels_3_0= rulemodelTypeCS )
            // InternalNML.g:449:5: lv_ownedModels_3_0= rulemodelTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOctopusCPAccess().getOwnedModelsModelTypeCSParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_18);
            lv_ownedModels_3_0=rulemodelTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOctopusCPRule());
              					}
              					add(
              						current,
              						"ownedModels",
              						lv_ownedModels_3_0,
              						"org.xtext.example.nml.NML.modelTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:466:3: (otherlv_4= ',' ( (lv_ownedModels_5_0= rulemodelTypeCS ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalNML.g:467:4: otherlv_4= ',' ( (lv_ownedModels_5_0= rulemodelTypeCS ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getOctopusCPAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalNML.g:471:4: ( (lv_ownedModels_5_0= rulemodelTypeCS ) )
            	    // InternalNML.g:472:5: (lv_ownedModels_5_0= rulemodelTypeCS )
            	    {
            	    // InternalNML.g:472:5: (lv_ownedModels_5_0= rulemodelTypeCS )
            	    // InternalNML.g:473:6: lv_ownedModels_5_0= rulemodelTypeCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOctopusCPAccess().getOwnedModelsModelTypeCSParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_ownedModels_5_0=rulemodelTypeCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOctopusCPRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedModels",
            	      							lv_ownedModels_5_0,
            	      							"org.xtext.example.nml.NML.modelTypeCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalNML.g:491:3: (otherlv_6= 'withBase' ( (lv_ownedModels_7_0= rulemodelTypeCS ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalNML.g:492:4: otherlv_6= 'withBase' ( (lv_ownedModels_7_0= rulemodelTypeCS ) )
                    {
                    otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getOctopusCPAccess().getWithBaseKeyword_5_0());
                      			
                    }
                    // InternalNML.g:496:4: ( (lv_ownedModels_7_0= rulemodelTypeCS ) )
                    // InternalNML.g:497:5: (lv_ownedModels_7_0= rulemodelTypeCS )
                    {
                    // InternalNML.g:497:5: (lv_ownedModels_7_0= rulemodelTypeCS )
                    // InternalNML.g:498:6: lv_ownedModels_7_0= rulemodelTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOctopusCPAccess().getOwnedModelsModelTypeCSParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_19);
                    lv_ownedModels_7_0=rulemodelTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOctopusCPRule());
                      						}
                      						add(
                      							current,
                      							"ownedModels",
                      							lv_ownedModels_7_0,
                      							"org.xtext.example.nml.NML.modelTypeCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,29,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getOctopusCPAccess().getIntoKeyword_6());
              		
            }
            // InternalNML.g:520:3: ( (lv_ownedModels_9_0= rulemodelTypeCS ) )
            // InternalNML.g:521:4: (lv_ownedModels_9_0= rulemodelTypeCS )
            {
            // InternalNML.g:521:4: (lv_ownedModels_9_0= rulemodelTypeCS )
            // InternalNML.g:522:5: lv_ownedModels_9_0= rulemodelTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOctopusCPAccess().getOwnedModelsModelTypeCSParserRuleCall_7_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_20);
            lv_ownedModels_9_0=rulemodelTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOctopusCPRule());
              					}
              					add(
              						current,
              						"ownedModels",
              						lv_ownedModels_9_0,
              						"org.xtext.example.nml.NML.modelTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:539:3: (otherlv_10= 'extends' ruleUnrestrictedName (otherlv_12= ',' ruleUnrestrictedName )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalNML.g:540:4: otherlv_10= 'extends' ruleUnrestrictedName (otherlv_12= ',' ruleUnrestrictedName )*
                    {
                    otherlv_10=(Token)match(input,30,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getOctopusCPAccess().getExtendsKeyword_8_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOctopusCPAccess().getUnrestrictedNameParserRuleCall_8_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalNML.g:554:4: (otherlv_12= ',' ruleUnrestrictedName )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==27) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalNML.g:555:5: otherlv_12= ',' ruleUnrestrictedName
                    	    {
                    	    otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_12, grammarAccess.getOctopusCPAccess().getCommaKeyword_8_2_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					/* */
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getOctopusCPAccess().getUnrestrictedNameParserRuleCall_8_2_1());
                    	      				
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_21);
                    	    ruleUnrestrictedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getOctopusCPAccess().getLeftCurlyBracketKeyword_9());
              		
            }
            // InternalNML.g:575:3: ( (lv_ownedConditions_15_0= ruleStatementCS ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_SIMPLE_ID && LA16_0<=RULE_ESCAPED_ID)||(LA16_0>=45 && LA16_0<=47)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalNML.g:576:4: (lv_ownedConditions_15_0= ruleStatementCS )
            	    {
            	    // InternalNML.g:576:4: (lv_ownedConditions_15_0= ruleStatementCS )
            	    // InternalNML.g:577:5: lv_ownedConditions_15_0= ruleStatementCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOctopusCPAccess().getOwnedConditionsStatementCSParserRuleCall_10_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_ownedConditions_15_0=ruleStatementCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getOctopusCPRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedConditions",
            	      						lv_ownedConditions_15_0,
            	      						"org.xtext.example.nml.NML.StatementCS");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getOctopusCPAccess().getRightCurlyBracketKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOctopusCP"


    // $ANTLR start "entryRuleOursCP"
    // InternalNML.g:602:1: entryRuleOursCP returns [EObject current=null] : iv_ruleOursCP= ruleOursCP EOF ;
    public final EObject entryRuleOursCP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOursCP = null;


        try {
            // InternalNML.g:602:47: (iv_ruleOursCP= ruleOursCP EOF )
            // InternalNML.g:603:2: iv_ruleOursCP= ruleOursCP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOursCPRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOursCP=ruleOursCP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOursCP; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOursCP"


    // $ANTLR start "ruleOursCP"
    // InternalNML.g:609:1: ruleOursCP returns [EObject current=null] : (otherlv_0= 'mergeOurs' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'with' ( (lv_ownedModels_3_0= rulemodelTypeCS ) ) (otherlv_4= ',' ( (lv_ownedModels_5_0= rulemodelTypeCS ) ) )* (otherlv_6= 'withBase' ( (lv_ownedModels_7_0= rulemodelTypeCS ) ) (otherlv_8= 'exists_in' this_INT_9= RULE_INT )? )? (otherlv_10= 'priority' ( (lv_ownedOrders_11_0= rulemodelOrderCS ) ) (otherlv_12= ',' ( (lv_ownedOrders_13_0= rulemodelOrderCS ) ) )* )? otherlv_14= 'into' ( (lv_ownedModels_15_0= rulemodelTypeCS ) ) (otherlv_16= 'extends' ruleUnrestrictedName (otherlv_18= ',' ruleUnrestrictedName )* )? otherlv_20= '{' ( (lv_ownedStatement_21_0= ruleStatementCS ) )+ otherlv_22= '}' ) ;
    public final EObject ruleOursCP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_INT_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_ownedModels_1_0 = null;

        EObject lv_ownedModels_3_0 = null;

        EObject lv_ownedModels_5_0 = null;

        EObject lv_ownedModels_7_0 = null;

        EObject lv_ownedOrders_11_0 = null;

        EObject lv_ownedOrders_13_0 = null;

        EObject lv_ownedModels_15_0 = null;

        EObject lv_ownedStatement_21_0 = null;



        	enterRule();

        try {
            // InternalNML.g:615:2: ( (otherlv_0= 'mergeOurs' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'with' ( (lv_ownedModels_3_0= rulemodelTypeCS ) ) (otherlv_4= ',' ( (lv_ownedModels_5_0= rulemodelTypeCS ) ) )* (otherlv_6= 'withBase' ( (lv_ownedModels_7_0= rulemodelTypeCS ) ) (otherlv_8= 'exists_in' this_INT_9= RULE_INT )? )? (otherlv_10= 'priority' ( (lv_ownedOrders_11_0= rulemodelOrderCS ) ) (otherlv_12= ',' ( (lv_ownedOrders_13_0= rulemodelOrderCS ) ) )* )? otherlv_14= 'into' ( (lv_ownedModels_15_0= rulemodelTypeCS ) ) (otherlv_16= 'extends' ruleUnrestrictedName (otherlv_18= ',' ruleUnrestrictedName )* )? otherlv_20= '{' ( (lv_ownedStatement_21_0= ruleStatementCS ) )+ otherlv_22= '}' ) )
            // InternalNML.g:616:2: (otherlv_0= 'mergeOurs' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'with' ( (lv_ownedModels_3_0= rulemodelTypeCS ) ) (otherlv_4= ',' ( (lv_ownedModels_5_0= rulemodelTypeCS ) ) )* (otherlv_6= 'withBase' ( (lv_ownedModels_7_0= rulemodelTypeCS ) ) (otherlv_8= 'exists_in' this_INT_9= RULE_INT )? )? (otherlv_10= 'priority' ( (lv_ownedOrders_11_0= rulemodelOrderCS ) ) (otherlv_12= ',' ( (lv_ownedOrders_13_0= rulemodelOrderCS ) ) )* )? otherlv_14= 'into' ( (lv_ownedModels_15_0= rulemodelTypeCS ) ) (otherlv_16= 'extends' ruleUnrestrictedName (otherlv_18= ',' ruleUnrestrictedName )* )? otherlv_20= '{' ( (lv_ownedStatement_21_0= ruleStatementCS ) )+ otherlv_22= '}' )
            {
            // InternalNML.g:616:2: (otherlv_0= 'mergeOurs' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'with' ( (lv_ownedModels_3_0= rulemodelTypeCS ) ) (otherlv_4= ',' ( (lv_ownedModels_5_0= rulemodelTypeCS ) ) )* (otherlv_6= 'withBase' ( (lv_ownedModels_7_0= rulemodelTypeCS ) ) (otherlv_8= 'exists_in' this_INT_9= RULE_INT )? )? (otherlv_10= 'priority' ( (lv_ownedOrders_11_0= rulemodelOrderCS ) ) (otherlv_12= ',' ( (lv_ownedOrders_13_0= rulemodelOrderCS ) ) )* )? otherlv_14= 'into' ( (lv_ownedModels_15_0= rulemodelTypeCS ) ) (otherlv_16= 'extends' ruleUnrestrictedName (otherlv_18= ',' ruleUnrestrictedName )* )? otherlv_20= '{' ( (lv_ownedStatement_21_0= ruleStatementCS ) )+ otherlv_22= '}' )
            // InternalNML.g:617:3: otherlv_0= 'mergeOurs' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'with' ( (lv_ownedModels_3_0= rulemodelTypeCS ) ) (otherlv_4= ',' ( (lv_ownedModels_5_0= rulemodelTypeCS ) ) )* (otherlv_6= 'withBase' ( (lv_ownedModels_7_0= rulemodelTypeCS ) ) (otherlv_8= 'exists_in' this_INT_9= RULE_INT )? )? (otherlv_10= 'priority' ( (lv_ownedOrders_11_0= rulemodelOrderCS ) ) (otherlv_12= ',' ( (lv_ownedOrders_13_0= rulemodelOrderCS ) ) )* )? otherlv_14= 'into' ( (lv_ownedModels_15_0= rulemodelTypeCS ) ) (otherlv_16= 'extends' ruleUnrestrictedName (otherlv_18= ',' ruleUnrestrictedName )* )? otherlv_20= '{' ( (lv_ownedStatement_21_0= ruleStatementCS ) )+ otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOursCPAccess().getMergeOursKeyword_0());
              		
            }
            // InternalNML.g:621:3: ( (lv_ownedModels_1_0= rulemodelTypeCS ) )
            // InternalNML.g:622:4: (lv_ownedModels_1_0= rulemodelTypeCS )
            {
            // InternalNML.g:622:4: (lv_ownedModels_1_0= rulemodelTypeCS )
            // InternalNML.g:623:5: lv_ownedModels_1_0= rulemodelTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOursCPAccess().getOwnedModelsModelTypeCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_17);
            lv_ownedModels_1_0=rulemodelTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOursCPRule());
              					}
              					add(
              						current,
              						"ownedModels",
              						lv_ownedModels_1_0,
              						"org.xtext.example.nml.NML.modelTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOursCPAccess().getWithKeyword_2());
              		
            }
            // InternalNML.g:644:3: ( (lv_ownedModels_3_0= rulemodelTypeCS ) )
            // InternalNML.g:645:4: (lv_ownedModels_3_0= rulemodelTypeCS )
            {
            // InternalNML.g:645:4: (lv_ownedModels_3_0= rulemodelTypeCS )
            // InternalNML.g:646:5: lv_ownedModels_3_0= rulemodelTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOursCPAccess().getOwnedModelsModelTypeCSParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_23);
            lv_ownedModels_3_0=rulemodelTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOursCPRule());
              					}
              					add(
              						current,
              						"ownedModels",
              						lv_ownedModels_3_0,
              						"org.xtext.example.nml.NML.modelTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:663:3: (otherlv_4= ',' ( (lv_ownedModels_5_0= rulemodelTypeCS ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalNML.g:664:4: otherlv_4= ',' ( (lv_ownedModels_5_0= rulemodelTypeCS ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getOursCPAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalNML.g:668:4: ( (lv_ownedModels_5_0= rulemodelTypeCS ) )
            	    // InternalNML.g:669:5: (lv_ownedModels_5_0= rulemodelTypeCS )
            	    {
            	    // InternalNML.g:669:5: (lv_ownedModels_5_0= rulemodelTypeCS )
            	    // InternalNML.g:670:6: lv_ownedModels_5_0= rulemodelTypeCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOursCPAccess().getOwnedModelsModelTypeCSParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    lv_ownedModels_5_0=rulemodelTypeCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOursCPRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedModels",
            	      							lv_ownedModels_5_0,
            	      							"org.xtext.example.nml.NML.modelTypeCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalNML.g:688:3: (otherlv_6= 'withBase' ( (lv_ownedModels_7_0= rulemodelTypeCS ) ) (otherlv_8= 'exists_in' this_INT_9= RULE_INT )? )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalNML.g:689:4: otherlv_6= 'withBase' ( (lv_ownedModels_7_0= rulemodelTypeCS ) ) (otherlv_8= 'exists_in' this_INT_9= RULE_INT )?
                    {
                    otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getOursCPAccess().getWithBaseKeyword_5_0());
                      			
                    }
                    // InternalNML.g:693:4: ( (lv_ownedModels_7_0= rulemodelTypeCS ) )
                    // InternalNML.g:694:5: (lv_ownedModels_7_0= rulemodelTypeCS )
                    {
                    // InternalNML.g:694:5: (lv_ownedModels_7_0= rulemodelTypeCS )
                    // InternalNML.g:695:6: lv_ownedModels_7_0= rulemodelTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOursCPAccess().getOwnedModelsModelTypeCSParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_ownedModels_7_0=rulemodelTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOursCPRule());
                      						}
                      						add(
                      							current,
                      							"ownedModels",
                      							lv_ownedModels_7_0,
                      							"org.xtext.example.nml.NML.modelTypeCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNML.g:712:4: (otherlv_8= 'exists_in' this_INT_9= RULE_INT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==32) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalNML.g:713:5: otherlv_8= 'exists_in' this_INT_9= RULE_INT
                            {
                            otherlv_8=(Token)match(input,32,FollowSets000.FOLLOW_25); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getOursCPAccess().getExists_inKeyword_5_2_0());
                              				
                            }
                            this_INT_9=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_INT_9, grammarAccess.getOursCPAccess().getINTTerminalRuleCall_5_2_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalNML.g:723:3: (otherlv_10= 'priority' ( (lv_ownedOrders_11_0= rulemodelOrderCS ) ) (otherlv_12= ',' ( (lv_ownedOrders_13_0= rulemodelOrderCS ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalNML.g:724:4: otherlv_10= 'priority' ( (lv_ownedOrders_11_0= rulemodelOrderCS ) ) (otherlv_12= ',' ( (lv_ownedOrders_13_0= rulemodelOrderCS ) ) )*
                    {
                    otherlv_10=(Token)match(input,33,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getOursCPAccess().getPriorityKeyword_6_0());
                      			
                    }
                    // InternalNML.g:728:4: ( (lv_ownedOrders_11_0= rulemodelOrderCS ) )
                    // InternalNML.g:729:5: (lv_ownedOrders_11_0= rulemodelOrderCS )
                    {
                    // InternalNML.g:729:5: (lv_ownedOrders_11_0= rulemodelOrderCS )
                    // InternalNML.g:730:6: lv_ownedOrders_11_0= rulemodelOrderCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOursCPAccess().getOwnedOrdersModelOrderCSParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_ownedOrders_11_0=rulemodelOrderCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOursCPRule());
                      						}
                      						add(
                      							current,
                      							"ownedOrders",
                      							lv_ownedOrders_11_0,
                      							"org.xtext.example.nml.NML.modelOrderCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNML.g:747:4: (otherlv_12= ',' ( (lv_ownedOrders_13_0= rulemodelOrderCS ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==27) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalNML.g:748:5: otherlv_12= ',' ( (lv_ownedOrders_13_0= rulemodelOrderCS ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_12, grammarAccess.getOursCPAccess().getCommaKeyword_6_2_0());
                    	      				
                    	    }
                    	    // InternalNML.g:752:5: ( (lv_ownedOrders_13_0= rulemodelOrderCS ) )
                    	    // InternalNML.g:753:6: (lv_ownedOrders_13_0= rulemodelOrderCS )
                    	    {
                    	    // InternalNML.g:753:6: (lv_ownedOrders_13_0= rulemodelOrderCS )
                    	    // InternalNML.g:754:7: lv_ownedOrders_13_0= rulemodelOrderCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOursCPAccess().getOwnedOrdersModelOrderCSParserRuleCall_6_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_27);
                    	    lv_ownedOrders_13_0=rulemodelOrderCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOursCPRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedOrders",
                    	      								lv_ownedOrders_13_0,
                    	      								"org.xtext.example.nml.NML.modelOrderCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,29,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getOursCPAccess().getIntoKeyword_7());
              		
            }
            // InternalNML.g:777:3: ( (lv_ownedModels_15_0= rulemodelTypeCS ) )
            // InternalNML.g:778:4: (lv_ownedModels_15_0= rulemodelTypeCS )
            {
            // InternalNML.g:778:4: (lv_ownedModels_15_0= rulemodelTypeCS )
            // InternalNML.g:779:5: lv_ownedModels_15_0= rulemodelTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOursCPAccess().getOwnedModelsModelTypeCSParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_20);
            lv_ownedModels_15_0=rulemodelTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOursCPRule());
              					}
              					add(
              						current,
              						"ownedModels",
              						lv_ownedModels_15_0,
              						"org.xtext.example.nml.NML.modelTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:796:3: (otherlv_16= 'extends' ruleUnrestrictedName (otherlv_18= ',' ruleUnrestrictedName )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalNML.g:797:4: otherlv_16= 'extends' ruleUnrestrictedName (otherlv_18= ',' ruleUnrestrictedName )*
                    {
                    otherlv_16=(Token)match(input,30,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getOursCPAccess().getExtendsKeyword_9_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOursCPAccess().getUnrestrictedNameParserRuleCall_9_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalNML.g:811:4: (otherlv_18= ',' ruleUnrestrictedName )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==27) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalNML.g:812:5: otherlv_18= ',' ruleUnrestrictedName
                    	    {
                    	    otherlv_18=(Token)match(input,27,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_18, grammarAccess.getOursCPAccess().getCommaKeyword_9_2_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					/* */
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getOursCPAccess().getUnrestrictedNameParserRuleCall_9_2_1());
                    	      				
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_21);
                    	    ruleUnrestrictedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_20, grammarAccess.getOursCPAccess().getLeftCurlyBracketKeyword_10());
              		
            }
            // InternalNML.g:832:3: ( (lv_ownedStatement_21_0= ruleStatementCS ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_SIMPLE_ID && LA24_0<=RULE_ESCAPED_ID)||(LA24_0>=45 && LA24_0<=47)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalNML.g:833:4: (lv_ownedStatement_21_0= ruleStatementCS )
            	    {
            	    // InternalNML.g:833:4: (lv_ownedStatement_21_0= ruleStatementCS )
            	    // InternalNML.g:834:5: lv_ownedStatement_21_0= ruleStatementCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOursCPAccess().getOwnedStatementStatementCSParserRuleCall_11_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_ownedStatement_21_0=ruleStatementCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getOursCPRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedStatement",
            	      						lv_ownedStatement_21_0,
            	      						"org.xtext.example.nml.NML.StatementCS");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_22=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getOursCPAccess().getRightCurlyBracketKeyword_12());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOursCP"


    // $ANTLR start "entryRuleTransferCP"
    // InternalNML.g:859:1: entryRuleTransferCP returns [EObject current=null] : iv_ruleTransferCP= ruleTransferCP EOF ;
    public final EObject entryRuleTransferCP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransferCP = null;


        try {
            // InternalNML.g:859:51: (iv_ruleTransferCP= ruleTransferCP EOF )
            // InternalNML.g:860:2: iv_ruleTransferCP= ruleTransferCP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransferCPRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTransferCP=ruleTransferCP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransferCP; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransferCP"


    // $ANTLR start "ruleTransferCP"
    // InternalNML.g:866:1: ruleTransferCP returns [EObject current=null] : (otherlv_0= 'transfer' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'from' ( (lv_ownedLists_3_0= rulemodelListCS ) ) otherlv_4= 'to' ( (lv_ownedModels_5_0= rulemodelTypeCS ) ) (otherlv_6= 'extends' ruleUnrestrictedName (otherlv_8= ',' ruleUnrestrictedName )* )? otherlv_10= '{' (otherlv_11= 'guard' ( (otherlv_12= 'or' | otherlv_13= 'and' )? ( (lv_ownedConditions_14_0= ruleConditionCS ) ) )+ )? ( (lv_ownedStatement_15_0= ruleStatementCS ) )+ otherlv_16= '}' ) ;
    public final EObject ruleTransferCP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        EObject lv_ownedModels_1_0 = null;

        EObject lv_ownedLists_3_0 = null;

        EObject lv_ownedModels_5_0 = null;

        EObject lv_ownedConditions_14_0 = null;

        EObject lv_ownedStatement_15_0 = null;



        	enterRule();

        try {
            // InternalNML.g:872:2: ( (otherlv_0= 'transfer' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'from' ( (lv_ownedLists_3_0= rulemodelListCS ) ) otherlv_4= 'to' ( (lv_ownedModels_5_0= rulemodelTypeCS ) ) (otherlv_6= 'extends' ruleUnrestrictedName (otherlv_8= ',' ruleUnrestrictedName )* )? otherlv_10= '{' (otherlv_11= 'guard' ( (otherlv_12= 'or' | otherlv_13= 'and' )? ( (lv_ownedConditions_14_0= ruleConditionCS ) ) )+ )? ( (lv_ownedStatement_15_0= ruleStatementCS ) )+ otherlv_16= '}' ) )
            // InternalNML.g:873:2: (otherlv_0= 'transfer' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'from' ( (lv_ownedLists_3_0= rulemodelListCS ) ) otherlv_4= 'to' ( (lv_ownedModels_5_0= rulemodelTypeCS ) ) (otherlv_6= 'extends' ruleUnrestrictedName (otherlv_8= ',' ruleUnrestrictedName )* )? otherlv_10= '{' (otherlv_11= 'guard' ( (otherlv_12= 'or' | otherlv_13= 'and' )? ( (lv_ownedConditions_14_0= ruleConditionCS ) ) )+ )? ( (lv_ownedStatement_15_0= ruleStatementCS ) )+ otherlv_16= '}' )
            {
            // InternalNML.g:873:2: (otherlv_0= 'transfer' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'from' ( (lv_ownedLists_3_0= rulemodelListCS ) ) otherlv_4= 'to' ( (lv_ownedModels_5_0= rulemodelTypeCS ) ) (otherlv_6= 'extends' ruleUnrestrictedName (otherlv_8= ',' ruleUnrestrictedName )* )? otherlv_10= '{' (otherlv_11= 'guard' ( (otherlv_12= 'or' | otherlv_13= 'and' )? ( (lv_ownedConditions_14_0= ruleConditionCS ) ) )+ )? ( (lv_ownedStatement_15_0= ruleStatementCS ) )+ otherlv_16= '}' )
            // InternalNML.g:874:3: otherlv_0= 'transfer' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'from' ( (lv_ownedLists_3_0= rulemodelListCS ) ) otherlv_4= 'to' ( (lv_ownedModels_5_0= rulemodelTypeCS ) ) (otherlv_6= 'extends' ruleUnrestrictedName (otherlv_8= ',' ruleUnrestrictedName )* )? otherlv_10= '{' (otherlv_11= 'guard' ( (otherlv_12= 'or' | otherlv_13= 'and' )? ( (lv_ownedConditions_14_0= ruleConditionCS ) ) )+ )? ( (lv_ownedStatement_15_0= ruleStatementCS ) )+ otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTransferCPAccess().getTransferKeyword_0());
              		
            }
            // InternalNML.g:878:3: ( (lv_ownedModels_1_0= rulemodelTypeCS ) )
            // InternalNML.g:879:4: (lv_ownedModels_1_0= rulemodelTypeCS )
            {
            // InternalNML.g:879:4: (lv_ownedModels_1_0= rulemodelTypeCS )
            // InternalNML.g:880:5: lv_ownedModels_1_0= rulemodelTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTransferCPAccess().getOwnedModelsModelTypeCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_28);
            lv_ownedModels_1_0=rulemodelTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTransferCPRule());
              					}
              					add(
              						current,
              						"ownedModels",
              						lv_ownedModels_1_0,
              						"org.xtext.example.nml.NML.modelTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTransferCPAccess().getFromKeyword_2());
              		
            }
            // InternalNML.g:901:3: ( (lv_ownedLists_3_0= rulemodelListCS ) )
            // InternalNML.g:902:4: (lv_ownedLists_3_0= rulemodelListCS )
            {
            // InternalNML.g:902:4: (lv_ownedLists_3_0= rulemodelListCS )
            // InternalNML.g:903:5: lv_ownedLists_3_0= rulemodelListCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTransferCPAccess().getOwnedListsModelListCSParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_29);
            lv_ownedLists_3_0=rulemodelListCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTransferCPRule());
              					}
              					add(
              						current,
              						"ownedLists",
              						lv_ownedLists_3_0,
              						"org.xtext.example.nml.NML.modelListCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTransferCPAccess().getToKeyword_4());
              		
            }
            // InternalNML.g:924:3: ( (lv_ownedModels_5_0= rulemodelTypeCS ) )
            // InternalNML.g:925:4: (lv_ownedModels_5_0= rulemodelTypeCS )
            {
            // InternalNML.g:925:4: (lv_ownedModels_5_0= rulemodelTypeCS )
            // InternalNML.g:926:5: lv_ownedModels_5_0= rulemodelTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTransferCPAccess().getOwnedModelsModelTypeCSParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_20);
            lv_ownedModels_5_0=rulemodelTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTransferCPRule());
              					}
              					add(
              						current,
              						"ownedModels",
              						lv_ownedModels_5_0,
              						"org.xtext.example.nml.NML.modelTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:943:3: (otherlv_6= 'extends' ruleUnrestrictedName (otherlv_8= ',' ruleUnrestrictedName )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalNML.g:944:4: otherlv_6= 'extends' ruleUnrestrictedName (otherlv_8= ',' ruleUnrestrictedName )*
                    {
                    otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getTransferCPAccess().getExtendsKeyword_6_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTransferCPAccess().getUnrestrictedNameParserRuleCall_6_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalNML.g:958:4: (otherlv_8= ',' ruleUnrestrictedName )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==27) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalNML.g:959:5: otherlv_8= ',' ruleUnrestrictedName
                    	    {
                    	    otherlv_8=(Token)match(input,27,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_8, grammarAccess.getTransferCPAccess().getCommaKeyword_6_2_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					/* */
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getTransferCPAccess().getUnrestrictedNameParserRuleCall_6_2_1());
                    	      				
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_21);
                    	    ruleUnrestrictedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTransferCPAccess().getLeftCurlyBracketKeyword_7());
              		
            }
            // InternalNML.g:979:3: (otherlv_11= 'guard' ( (otherlv_12= 'or' | otherlv_13= 'and' )? ( (lv_ownedConditions_14_0= ruleConditionCS ) ) )+ )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalNML.g:980:4: otherlv_11= 'guard' ( (otherlv_12= 'or' | otherlv_13= 'and' )? ( (lv_ownedConditions_14_0= ruleConditionCS ) ) )+
                    {
                    otherlv_11=(Token)match(input,37,FollowSets000.FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getTransferCPAccess().getGuardKeyword_8_0());
                      			
                    }
                    // InternalNML.g:984:4: ( (otherlv_12= 'or' | otherlv_13= 'and' )? ( (lv_ownedConditions_14_0= ruleConditionCS ) ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        alt28 = dfa28.predict(input);
                        switch (alt28) {
                    	case 1 :
                    	    // InternalNML.g:985:5: (otherlv_12= 'or' | otherlv_13= 'and' )? ( (lv_ownedConditions_14_0= ruleConditionCS ) )
                    	    {
                    	    // InternalNML.g:985:5: (otherlv_12= 'or' | otherlv_13= 'and' )?
                    	    int alt27=3;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==38) ) {
                    	        alt27=1;
                    	    }
                    	    else if ( (LA27_0==39) ) {
                    	        alt27=2;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // InternalNML.g:986:6: otherlv_12= 'or'
                    	            {
                    	            otherlv_12=(Token)match(input,38,FollowSets000.FOLLOW_31); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_12, grammarAccess.getTransferCPAccess().getOrKeyword_8_1_0_0());
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalNML.g:991:6: otherlv_13= 'and'
                    	            {
                    	            otherlv_13=(Token)match(input,39,FollowSets000.FOLLOW_31); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_13, grammarAccess.getTransferCPAccess().getAndKeyword_8_1_0_1());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // InternalNML.g:996:5: ( (lv_ownedConditions_14_0= ruleConditionCS ) )
                    	    // InternalNML.g:997:6: (lv_ownedConditions_14_0= ruleConditionCS )
                    	    {
                    	    // InternalNML.g:997:6: (lv_ownedConditions_14_0= ruleConditionCS )
                    	    // InternalNML.g:998:7: lv_ownedConditions_14_0= ruleConditionCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTransferCPAccess().getOwnedConditionsConditionCSParserRuleCall_8_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_32);
                    	    lv_ownedConditions_14_0=ruleConditionCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTransferCPRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedConditions",
                    	      								lv_ownedConditions_14_0,
                    	      								"org.xtext.example.nml.NML.ConditionCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);


                    }
                    break;

            }

            // InternalNML.g:1017:3: ( (lv_ownedStatement_15_0= ruleStatementCS ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_SIMPLE_ID && LA30_0<=RULE_ESCAPED_ID)||(LA30_0>=45 && LA30_0<=47)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalNML.g:1018:4: (lv_ownedStatement_15_0= ruleStatementCS )
            	    {
            	    // InternalNML.g:1018:4: (lv_ownedStatement_15_0= ruleStatementCS )
            	    // InternalNML.g:1019:5: lv_ownedStatement_15_0= ruleStatementCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTransferCPAccess().getOwnedStatementStatementCSParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_ownedStatement_15_0=ruleStatementCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTransferCPRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedStatement",
            	      						lv_ownedStatement_15_0,
            	      						"org.xtext.example.nml.NML.StatementCS");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getTransferCPAccess().getRightCurlyBracketKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransferCP"


    // $ANTLR start "entryRulemodelTypeCS"
    // InternalNML.g:1044:1: entryRulemodelTypeCS returns [EObject current=null] : iv_rulemodelTypeCS= rulemodelTypeCS EOF ;
    public final EObject entryRulemodelTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemodelTypeCS = null;


        try {
            // InternalNML.g:1044:52: (iv_rulemodelTypeCS= rulemodelTypeCS EOF )
            // InternalNML.g:1045:2: iv_rulemodelTypeCS= rulemodelTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulemodelTypeCS=rulemodelTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemodelTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemodelTypeCS"


    // $ANTLR start "rulemodelTypeCS"
    // InternalNML.g:1051:1: rulemodelTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ruleUnrestrictedName otherlv_3= '!' ruleUnrestrictedName ) ;
    public final EObject rulemodelTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalNML.g:1057:2: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ruleUnrestrictedName otherlv_3= '!' ruleUnrestrictedName ) )
            // InternalNML.g:1058:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ruleUnrestrictedName otherlv_3= '!' ruleUnrestrictedName )
            {
            // InternalNML.g:1058:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ruleUnrestrictedName otherlv_3= '!' ruleUnrestrictedName )
            // InternalNML.g:1059:3: ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ruleUnrestrictedName otherlv_3= '!' ruleUnrestrictedName
            {
            // InternalNML.g:1059:3: ( (lv_name_0_0= ruleIdentifier ) )
            // InternalNML.g:1060:4: (lv_name_0_0= ruleIdentifier )
            {
            // InternalNML.g:1060:4: (lv_name_0_0= ruleIdentifier )
            // InternalNML.g:1061:5: lv_name_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelTypeCSAccess().getNameIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_name_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelTypeCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.base.Base.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getModelTypeCSAccess().getColonKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getModelTypeCSAccess().getUnrestrictedNameParserRuleCall_2());
              		
            }
            pushFollow(FollowSets000.FOLLOW_33);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getModelTypeCSAccess().getExclamationMarkKeyword_3());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getModelTypeCSAccess().getUnrestrictedNameParserRuleCall_4());
              		
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemodelTypeCS"


    // $ANTLR start "entryRulemodelOrderCS"
    // InternalNML.g:1110:1: entryRulemodelOrderCS returns [EObject current=null] : iv_rulemodelOrderCS= rulemodelOrderCS EOF ;
    public final EObject entryRulemodelOrderCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemodelOrderCS = null;


        try {
            // InternalNML.g:1110:53: (iv_rulemodelOrderCS= rulemodelOrderCS EOF )
            // InternalNML.g:1111:2: iv_rulemodelOrderCS= rulemodelOrderCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelOrderCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulemodelOrderCS=rulemodelOrderCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemodelOrderCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemodelOrderCS"


    // $ANTLR start "rulemodelOrderCS"
    // InternalNML.g:1117:1: rulemodelOrderCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' otherlv_2= '[' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* otherlv_6= ']' ) ;
    public final EObject rulemodelOrderCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalNML.g:1123:2: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' otherlv_2= '[' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* otherlv_6= ']' ) )
            // InternalNML.g:1124:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' otherlv_2= '[' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* otherlv_6= ']' )
            {
            // InternalNML.g:1124:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' otherlv_2= '[' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* otherlv_6= ']' )
            // InternalNML.g:1125:3: ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' otherlv_2= '[' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* otherlv_6= ']'
            {
            // InternalNML.g:1125:3: ( (lv_name_0_0= ruleIdentifier ) )
            // InternalNML.g:1126:4: (lv_name_0_0= ruleIdentifier )
            {
            // InternalNML.g:1126:4: (lv_name_0_0= ruleIdentifier )
            // InternalNML.g:1127:5: lv_name_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelOrderCSAccess().getNameIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_name_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelOrderCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.base.Base.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getModelOrderCSAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,41,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getModelOrderCSAccess().getLeftSquareBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getModelOrderCSAccess().getUnrestrictedNameParserRuleCall_3());
              		
            }
            pushFollow(FollowSets000.FOLLOW_35);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalNML.g:1162:3: (otherlv_4= ',' ruleUnrestrictedName )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==27) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalNML.g:1163:4: otherlv_4= ',' ruleUnrestrictedName
            	    {
            	    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getModelOrderCSAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelOrderCSAccess().getUnrestrictedNameParserRuleCall_4_1());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_35);
            	    ruleUnrestrictedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getModelOrderCSAccess().getRightSquareBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemodelOrderCS"


    // $ANTLR start "entryRulemodelListCS"
    // InternalNML.g:1186:1: entryRulemodelListCS returns [EObject current=null] : iv_rulemodelListCS= rulemodelListCS EOF ;
    public final EObject entryRulemodelListCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemodelListCS = null;


        try {
            // InternalNML.g:1186:52: (iv_rulemodelListCS= rulemodelListCS EOF )
            // InternalNML.g:1187:2: iv_rulemodelListCS= rulemodelListCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelListCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulemodelListCS=rulemodelListCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemodelListCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemodelListCS"


    // $ANTLR start "rulemodelListCS"
    // InternalNML.g:1193:1: rulemodelListCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' otherlv_2= '(' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* otherlv_6= ')' ) ;
    public final EObject rulemodelListCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalNML.g:1199:2: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' otherlv_2= '(' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* otherlv_6= ')' ) )
            // InternalNML.g:1200:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' otherlv_2= '(' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* otherlv_6= ')' )
            {
            // InternalNML.g:1200:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' otherlv_2= '(' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* otherlv_6= ')' )
            // InternalNML.g:1201:3: ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' otherlv_2= '(' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* otherlv_6= ')'
            {
            // InternalNML.g:1201:3: ( (lv_name_0_0= ruleIdentifier ) )
            // InternalNML.g:1202:4: (lv_name_0_0= ruleIdentifier )
            {
            // InternalNML.g:1202:4: (lv_name_0_0= ruleIdentifier )
            // InternalNML.g:1203:5: lv_name_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelListCSAccess().getNameIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_name_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelListCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.base.Base.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getModelListCSAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getModelListCSAccess().getLeftParenthesisKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getModelListCSAccess().getUnrestrictedNameParserRuleCall_3());
              		
            }
            pushFollow(FollowSets000.FOLLOW_37);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalNML.g:1238:3: (otherlv_4= ',' ruleUnrestrictedName )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==27) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalNML.g:1239:4: otherlv_4= ',' ruleUnrestrictedName
            	    {
            	    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getModelListCSAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelListCSAccess().getUnrestrictedNameParserRuleCall_4_1());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_37);
            	    ruleUnrestrictedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_6=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getModelListCSAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemodelListCS"


    // $ANTLR start "entryRuleStatementCS"
    // InternalNML.g:1262:1: entryRuleStatementCS returns [EObject current=null] : iv_ruleStatementCS= ruleStatementCS EOF ;
    public final EObject entryRuleStatementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementCS = null;


        try {
            // InternalNML.g:1262:52: (iv_ruleStatementCS= ruleStatementCS EOF )
            // InternalNML.g:1263:2: iv_ruleStatementCS= ruleStatementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStatementCS=ruleStatementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatementCS"


    // $ANTLR start "ruleStatementCS"
    // InternalNML.g:1269:1: ruleStatementCS returns [EObject current=null] : ( (otherlv_0= 'var' )? ( (lv_ownedElement_1_0= ruleFQN ) )? (otherlv_2= '=' | otherlv_3= '::=' )? ( (lv_ownedElement_4_0= ruleFQN ) ) (otherlv_5= '.' otherlv_6= 'equivalent' otherlv_7= '(' otherlv_8= ')' )? ( (otherlv_9= '+' | otherlv_10= 'new' ) ( (lv_ownedElement_11_0= ruleFQN ) ) )* otherlv_12= ';' ) ;
    public final EObject ruleStatementCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_ownedElement_1_0 = null;

        AntlrDatatypeRuleToken lv_ownedElement_4_0 = null;

        AntlrDatatypeRuleToken lv_ownedElement_11_0 = null;



        	enterRule();

        try {
            // InternalNML.g:1275:2: ( ( (otherlv_0= 'var' )? ( (lv_ownedElement_1_0= ruleFQN ) )? (otherlv_2= '=' | otherlv_3= '::=' )? ( (lv_ownedElement_4_0= ruleFQN ) ) (otherlv_5= '.' otherlv_6= 'equivalent' otherlv_7= '(' otherlv_8= ')' )? ( (otherlv_9= '+' | otherlv_10= 'new' ) ( (lv_ownedElement_11_0= ruleFQN ) ) )* otherlv_12= ';' ) )
            // InternalNML.g:1276:2: ( (otherlv_0= 'var' )? ( (lv_ownedElement_1_0= ruleFQN ) )? (otherlv_2= '=' | otherlv_3= '::=' )? ( (lv_ownedElement_4_0= ruleFQN ) ) (otherlv_5= '.' otherlv_6= 'equivalent' otherlv_7= '(' otherlv_8= ')' )? ( (otherlv_9= '+' | otherlv_10= 'new' ) ( (lv_ownedElement_11_0= ruleFQN ) ) )* otherlv_12= ';' )
            {
            // InternalNML.g:1276:2: ( (otherlv_0= 'var' )? ( (lv_ownedElement_1_0= ruleFQN ) )? (otherlv_2= '=' | otherlv_3= '::=' )? ( (lv_ownedElement_4_0= ruleFQN ) ) (otherlv_5= '.' otherlv_6= 'equivalent' otherlv_7= '(' otherlv_8= ')' )? ( (otherlv_9= '+' | otherlv_10= 'new' ) ( (lv_ownedElement_11_0= ruleFQN ) ) )* otherlv_12= ';' )
            // InternalNML.g:1277:3: (otherlv_0= 'var' )? ( (lv_ownedElement_1_0= ruleFQN ) )? (otherlv_2= '=' | otherlv_3= '::=' )? ( (lv_ownedElement_4_0= ruleFQN ) ) (otherlv_5= '.' otherlv_6= 'equivalent' otherlv_7= '(' otherlv_8= ')' )? ( (otherlv_9= '+' | otherlv_10= 'new' ) ( (lv_ownedElement_11_0= ruleFQN ) ) )* otherlv_12= ';'
            {
            // InternalNML.g:1277:3: (otherlv_0= 'var' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==45) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalNML.g:1278:4: otherlv_0= 'var'
                    {
                    otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getStatementCSAccess().getVarKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalNML.g:1283:3: ( (lv_ownedElement_1_0= ruleFQN ) )?
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalNML.g:1284:4: (lv_ownedElement_1_0= ruleFQN )
                    {
                    // InternalNML.g:1284:4: (lv_ownedElement_1_0= ruleFQN )
                    // InternalNML.g:1285:5: lv_ownedElement_1_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStatementCSAccess().getOwnedElementFQNParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_ownedElement_1_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStatementCSRule());
                      					}
                      					add(
                      						current,
                      						"ownedElement",
                      						lv_ownedElement_1_0,
                      						"org.xtext.example.nml.NML.FQN");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalNML.g:1302:3: (otherlv_2= '=' | otherlv_3= '::=' )?
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                alt35=1;
            }
            else if ( (LA35_0==47) ) {
                alt35=2;
            }
            switch (alt35) {
                case 1 :
                    // InternalNML.g:1303:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getStatementCSAccess().getEqualsSignKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:1308:4: otherlv_3= '::='
                    {
                    otherlv_3=(Token)match(input,47,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStatementCSAccess().getColonColonEqualsSignKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalNML.g:1313:3: ( (lv_ownedElement_4_0= ruleFQN ) )
            // InternalNML.g:1314:4: (lv_ownedElement_4_0= ruleFQN )
            {
            // InternalNML.g:1314:4: (lv_ownedElement_4_0= ruleFQN )
            // InternalNML.g:1315:5: lv_ownedElement_4_0= ruleFQN
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStatementCSAccess().getOwnedElementFQNParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_39);
            lv_ownedElement_4_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStatementCSRule());
              					}
              					add(
              						current,
              						"ownedElement",
              						lv_ownedElement_4_0,
              						"org.xtext.example.nml.NML.FQN");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:1332:3: (otherlv_5= '.' otherlv_6= 'equivalent' otherlv_7= '(' otherlv_8= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==48) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalNML.g:1333:4: otherlv_5= '.' otherlv_6= 'equivalent' otherlv_7= '(' otherlv_8= ')'
                    {
                    otherlv_5=(Token)match(input,48,FollowSets000.FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getStatementCSAccess().getFullStopKeyword_4_0());
                      			
                    }
                    otherlv_6=(Token)match(input,49,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getStatementCSAccess().getEquivalentKeyword_4_1());
                      			
                    }
                    otherlv_7=(Token)match(input,43,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getStatementCSAccess().getLeftParenthesisKeyword_4_2());
                      			
                    }
                    otherlv_8=(Token)match(input,44,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getStatementCSAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }
                    break;

            }

            // InternalNML.g:1350:3: ( (otherlv_9= '+' | otherlv_10= 'new' ) ( (lv_ownedElement_11_0= ruleFQN ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=50 && LA38_0<=51)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalNML.g:1351:4: (otherlv_9= '+' | otherlv_10= 'new' ) ( (lv_ownedElement_11_0= ruleFQN ) )
            	    {
            	    // InternalNML.g:1351:4: (otherlv_9= '+' | otherlv_10= 'new' )
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==50) ) {
            	        alt37=1;
            	    }
            	    else if ( (LA37_0==51) ) {
            	        alt37=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalNML.g:1352:5: otherlv_9= '+'
            	            {
            	            otherlv_9=(Token)match(input,50,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_9, grammarAccess.getStatementCSAccess().getPlusSignKeyword_5_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalNML.g:1357:5: otherlv_10= 'new'
            	            {
            	            otherlv_10=(Token)match(input,51,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_10, grammarAccess.getStatementCSAccess().getNewKeyword_5_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalNML.g:1362:4: ( (lv_ownedElement_11_0= ruleFQN ) )
            	    // InternalNML.g:1363:5: (lv_ownedElement_11_0= ruleFQN )
            	    {
            	    // InternalNML.g:1363:5: (lv_ownedElement_11_0= ruleFQN )
            	    // InternalNML.g:1364:6: lv_ownedElement_11_0= ruleFQN
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStatementCSAccess().getOwnedElementFQNParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_42);
            	    lv_ownedElement_11_0=ruleFQN();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getStatementCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedElement",
            	      							lv_ownedElement_11_0,
            	      							"org.xtext.example.nml.NML.FQN");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getStatementCSAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatementCS"


    // $ANTLR start "entryRuleConditionCS"
    // InternalNML.g:1390:1: entryRuleConditionCS returns [EObject current=null] : iv_ruleConditionCS= ruleConditionCS EOF ;
    public final EObject entryRuleConditionCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionCS = null;


        try {
            // InternalNML.g:1390:52: (iv_ruleConditionCS= ruleConditionCS EOF )
            // InternalNML.g:1391:2: iv_ruleConditionCS= ruleConditionCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConditionCS=ruleConditionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionCS"


    // $ANTLR start "ruleConditionCS"
    // InternalNML.g:1397:1: ruleConditionCS returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleFQN ) )? (otherlv_1= '>' | otherlv_2= '<' | otherlv_3= '=' | otherlv_4= '<>' | otherlv_5= '!' | otherlv_6= '>=' | otherlv_7= '=<' )? ( (lv_ownedElement_8_0= ruleFQN ) ) ) ;
    public final EObject ruleConditionCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_ownedElement_0_0 = null;

        AntlrDatatypeRuleToken lv_ownedElement_8_0 = null;



        	enterRule();

        try {
            // InternalNML.g:1403:2: ( ( ( (lv_ownedElement_0_0= ruleFQN ) )? (otherlv_1= '>' | otherlv_2= '<' | otherlv_3= '=' | otherlv_4= '<>' | otherlv_5= '!' | otherlv_6= '>=' | otherlv_7= '=<' )? ( (lv_ownedElement_8_0= ruleFQN ) ) ) )
            // InternalNML.g:1404:2: ( ( (lv_ownedElement_0_0= ruleFQN ) )? (otherlv_1= '>' | otherlv_2= '<' | otherlv_3= '=' | otherlv_4= '<>' | otherlv_5= '!' | otherlv_6= '>=' | otherlv_7= '=<' )? ( (lv_ownedElement_8_0= ruleFQN ) ) )
            {
            // InternalNML.g:1404:2: ( ( (lv_ownedElement_0_0= ruleFQN ) )? (otherlv_1= '>' | otherlv_2= '<' | otherlv_3= '=' | otherlv_4= '<>' | otherlv_5= '!' | otherlv_6= '>=' | otherlv_7= '=<' )? ( (lv_ownedElement_8_0= ruleFQN ) ) )
            // InternalNML.g:1405:3: ( (lv_ownedElement_0_0= ruleFQN ) )? (otherlv_1= '>' | otherlv_2= '<' | otherlv_3= '=' | otherlv_4= '<>' | otherlv_5= '!' | otherlv_6= '>=' | otherlv_7= '=<' )? ( (lv_ownedElement_8_0= ruleFQN ) )
            {
            // InternalNML.g:1405:3: ( (lv_ownedElement_0_0= ruleFQN ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_SIMPLE_ID) ) {
                int LA39_1 = input.LA(2);

                if ( (synpred41_InternalNML()) ) {
                    alt39=1;
                }
            }
            else if ( (LA39_0==RULE_ESCAPED_ID) ) {
                int LA39_2 = input.LA(2);

                if ( (synpred41_InternalNML()) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalNML.g:1406:4: (lv_ownedElement_0_0= ruleFQN )
                    {
                    // InternalNML.g:1406:4: (lv_ownedElement_0_0= ruleFQN )
                    // InternalNML.g:1407:5: lv_ownedElement_0_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConditionCSAccess().getOwnedElementFQNParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_43);
                    lv_ownedElement_0_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConditionCSRule());
                      					}
                      					add(
                      						current,
                      						"ownedElement",
                      						lv_ownedElement_0_0,
                      						"org.xtext.example.nml.NML.FQN");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalNML.g:1424:3: (otherlv_1= '>' | otherlv_2= '<' | otherlv_3= '=' | otherlv_4= '<>' | otherlv_5= '!' | otherlv_6= '>=' | otherlv_7= '=<' )?
            int alt40=8;
            switch ( input.LA(1) ) {
                case 52:
                    {
                    alt40=1;
                    }
                    break;
                case 53:
                    {
                    alt40=2;
                    }
                    break;
                case 46:
                    {
                    alt40=3;
                    }
                    break;
                case 54:
                    {
                    alt40=4;
                    }
                    break;
                case 40:
                    {
                    alt40=5;
                    }
                    break;
                case 55:
                    {
                    alt40=6;
                    }
                    break;
                case 56:
                    {
                    alt40=7;
                    }
                    break;
            }

            switch (alt40) {
                case 1 :
                    // InternalNML.g:1425:4: otherlv_1= '>'
                    {
                    otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getConditionCSAccess().getGreaterThanSignKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:1430:4: otherlv_2= '<'
                    {
                    otherlv_2=(Token)match(input,53,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getConditionCSAccess().getLessThanSignKeyword_1_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalNML.g:1435:4: otherlv_3= '='
                    {
                    otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getConditionCSAccess().getEqualsSignKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalNML.g:1440:4: otherlv_4= '<>'
                    {
                    otherlv_4=(Token)match(input,54,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getConditionCSAccess().getLessThanSignGreaterThanSignKeyword_1_3());
                      			
                    }

                    }
                    break;
                case 5 :
                    // InternalNML.g:1445:4: otherlv_5= '!'
                    {
                    otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getConditionCSAccess().getExclamationMarkKeyword_1_4());
                      			
                    }

                    }
                    break;
                case 6 :
                    // InternalNML.g:1450:4: otherlv_6= '>='
                    {
                    otherlv_6=(Token)match(input,55,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getConditionCSAccess().getGreaterThanSignEqualsSignKeyword_1_5());
                      			
                    }

                    }
                    break;
                case 7 :
                    // InternalNML.g:1455:4: otherlv_7= '=<'
                    {
                    otherlv_7=(Token)match(input,56,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getConditionCSAccess().getEqualsSignLessThanSignKeyword_1_6());
                      			
                    }

                    }
                    break;

            }

            // InternalNML.g:1460:3: ( (lv_ownedElement_8_0= ruleFQN ) )
            // InternalNML.g:1461:4: (lv_ownedElement_8_0= ruleFQN )
            {
            // InternalNML.g:1461:4: (lv_ownedElement_8_0= ruleFQN )
            // InternalNML.g:1462:5: lv_ownedElement_8_0= ruleFQN
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionCSAccess().getOwnedElementFQNParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedElement_8_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionCSRule());
              					}
              					add(
              						current,
              						"ownedElement",
              						lv_ownedElement_8_0,
              						"org.xtext.example.nml.NML.FQN");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionCS"


    // $ANTLR start "entryRuleFQN"
    // InternalNML.g:1483:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalNML.g:1483:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalNML.g:1484:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalNML.g:1490:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_ID_1 = null;

        AntlrDatatypeRuleToken this_UnrestrictedName_4 = null;

        AntlrDatatypeRuleToken this_ID_5 = null;



        	enterRule();

        try {
            // InternalNML.g:1496:2: ( ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )* ) )
            // InternalNML.g:1497:2: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )* )
            {
            // InternalNML.g:1497:2: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )* )
            // InternalNML.g:1498:3: (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )*
            {
            // InternalNML.g:1498:3: (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_SIMPLE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred49_InternalNML()) ) {
                    alt41=1;
                }
                else if ( (true) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA41_0==RULE_ESCAPED_ID) ) {
                int LA41_2 = input.LA(2);

                if ( (synpred49_InternalNML()) ) {
                    alt41=1;
                }
                else if ( (true) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalNML.g:1499:4: this_UnrestrictedName_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFQNAccess().getUnrestrictedNameParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_44);
                    this_UnrestrictedName_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_UnrestrictedName_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:1510:4: this_ID_1= ruleID
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFQNAccess().getIDParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_44);
                    this_ID_1=ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalNML.g:1521:3: ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==48) ) {
                    int LA46_2 = input.LA(2);

                    if ( ((LA46_2>=RULE_SIMPLE_ID && LA46_2<=RULE_ESCAPED_ID)) ) {
                        alt46=1;
                    }


                }
                else if ( (LA46_0==57) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalNML.g:1522:4: (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )?
            	    {
            	    // InternalNML.g:1522:4: (kw= '.' | kw= '->' )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==48) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==57) ) {
            	        alt42=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalNML.g:1523:5: kw= '.'
            	            {
            	            kw=(Token)match(input,48,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalNML.g:1529:5: kw= '->'
            	            {
            	            kw=(Token)match(input,57,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getFQNAccess().getHyphenMinusGreaterThanSignKeyword_1_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalNML.g:1535:4: (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID )
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==RULE_SIMPLE_ID) ) {
            	        int LA43_1 = input.LA(2);

            	        if ( (synpred51_InternalNML()) ) {
            	            alt43=1;
            	        }
            	        else if ( (true) ) {
            	            alt43=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 43, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA43_0==RULE_ESCAPED_ID) ) {
            	        int LA43_2 = input.LA(2);

            	        if ( (synpred51_InternalNML()) ) {
            	            alt43=1;
            	        }
            	        else if ( (true) ) {
            	            alt43=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 43, 2, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 43, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalNML.g:1536:5: this_UnrestrictedName_4= ruleUnrestrictedName
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getFQNAccess().getUnrestrictedNameParserRuleCall_1_1_0());
            	              				
            	            }
            	            pushFollow(FollowSets000.FOLLOW_45);
            	            this_UnrestrictedName_4=ruleUnrestrictedName();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_UnrestrictedName_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalNML.g:1547:5: this_ID_5= ruleID
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getFQNAccess().getIDParserRuleCall_1_1_1());
            	              				
            	            }
            	            pushFollow(FollowSets000.FOLLOW_45);
            	            this_ID_5=ruleID();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_ID_5);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalNML.g:1558:4: (kw= '(' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==43) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalNML.g:1559:5: kw= '('
            	            {
            	            kw=(Token)match(input,43,FollowSets000.FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getFQNAccess().getLeftParenthesisKeyword_1_2());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalNML.g:1565:4: (kw= ')' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==44) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // InternalNML.g:1566:5: kw= ')'
            	            {
            	            kw=(Token)match(input,44,FollowSets000.FOLLOW_44); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getFQNAccess().getRightParenthesisKeyword_1_3());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleEssentialOCLUnaryOperatorName"
    // InternalNML.g:1577:1: entryRuleEssentialOCLUnaryOperatorName returns [String current=null] : iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF ;
    public final String entryRuleEssentialOCLUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnaryOperatorName = null;


        try {
            // InternalNML.g:1577:69: (iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF )
            // InternalNML.g:1578:2: iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLUnaryOperatorName=ruleEssentialOCLUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLUnaryOperatorName"


    // $ANTLR start "ruleEssentialOCLUnaryOperatorName"
    // InternalNML.g:1584:1: ruleEssentialOCLUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' | kw= 'not2' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNML.g:1590:2: ( (kw= '-' | kw= 'not' | kw= 'not2' ) )
            // InternalNML.g:1591:2: (kw= '-' | kw= 'not' | kw= 'not2' )
            {
            // InternalNML.g:1591:2: (kw= '-' | kw= 'not' | kw= 'not2' )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt47=1;
                }
                break;
            case 59:
                {
                alt47=2;
                }
                break;
            case 60:
                {
                alt47=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalNML.g:1592:3: kw= '-'
                    {
                    kw=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getHyphenMinusKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:1598:3: kw= 'not'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getNotKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNML.g:1604:3: kw= 'not2'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getNot2Keyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLUnaryOperatorName"


    // $ANTLR start "entryRuleEssentialOCLInfixOperatorName"
    // InternalNML.g:1613:1: entryRuleEssentialOCLInfixOperatorName returns [String current=null] : iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF ;
    public final String entryRuleEssentialOCLInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperatorName = null;


        try {
            // InternalNML.g:1613:69: (iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF )
            // InternalNML.g:1614:2: iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLInfixOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLInfixOperatorName=ruleEssentialOCLInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLInfixOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLInfixOperatorName"


    // $ANTLR start "ruleEssentialOCLInfixOperatorName"
    // InternalNML.g:1620:1: ruleEssentialOCLInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNML.g:1626:2: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' ) )
            // InternalNML.g:1627:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' )
            {
            // InternalNML.g:1627:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' )
            int alt48=18;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt48=1;
                }
                break;
            case 62:
                {
                alt48=2;
                }
                break;
            case 50:
                {
                alt48=3;
                }
                break;
            case 58:
                {
                alt48=4;
                }
                break;
            case 52:
                {
                alt48=5;
                }
                break;
            case 53:
                {
                alt48=6;
                }
                break;
            case 55:
                {
                alt48=7;
                }
                break;
            case 63:
                {
                alt48=8;
                }
                break;
            case 46:
                {
                alt48=9;
                }
                break;
            case 54:
                {
                alt48=10;
                }
                break;
            case 39:
                {
                alt48=11;
                }
                break;
            case 64:
                {
                alt48=12;
                }
                break;
            case 65:
                {
                alt48=13;
                }
                break;
            case 66:
                {
                alt48=14;
                }
                break;
            case 38:
                {
                alt48=15;
                }
                break;
            case 67:
                {
                alt48=16;
                }
                break;
            case 68:
                {
                alt48=17;
                }
                break;
            case 69:
                {
                alt48=18;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalNML.g:1628:3: kw= '*'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:1634:3: kw= '/'
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getSolidusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNML.g:1640:3: kw= '+'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getPlusSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNML.g:1646:3: kw= '-'
                    {
                    kw=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getHyphenMinusKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNML.g:1652:3: kw= '>'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNML.g:1658:3: kw= '<'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalNML.g:1664:3: kw= '>='
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignEqualsSignKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalNML.g:1670:3: kw= '<='
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignEqualsSignKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalNML.g:1676:3: kw= '='
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getEqualsSignKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalNML.g:1682:3: kw= '<>'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignGreaterThanSignKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalNML.g:1688:3: kw= 'and'
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAndKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalNML.g:1694:3: kw= 'and2'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAnd2Keyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalNML.g:1700:3: kw= 'implies'
                    {
                    kw=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getImpliesKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalNML.g:1706:3: kw= 'implies2'
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getImplies2Keyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalNML.g:1712:3: kw= 'or'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getOrKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalNML.g:1718:3: kw= 'or2'
                    {
                    kw=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getOr2Keyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalNML.g:1724:3: kw= 'xor'
                    {
                    kw=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getXorKeyword_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalNML.g:1730:3: kw= 'xor2'
                    {
                    kw=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getXor2Keyword_17());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLInfixOperatorName"


    // $ANTLR start "entryRuleEssentialOCLNavigationOperatorName"
    // InternalNML.g:1739:1: entryRuleEssentialOCLNavigationOperatorName returns [String current=null] : iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF ;
    public final String entryRuleEssentialOCLNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperatorName = null;


        try {
            // InternalNML.g:1739:74: (iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF )
            // InternalNML.g:1740:2: iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLNavigationOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLNavigationOperatorName=ruleEssentialOCLNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLNavigationOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLNavigationOperatorName"


    // $ANTLR start "ruleEssentialOCLNavigationOperatorName"
    // InternalNML.g:1746:1: ruleEssentialOCLNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNML.g:1752:2: ( (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) )
            // InternalNML.g:1753:2: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            {
            // InternalNML.g:1753:2: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt49=1;
                }
                break;
            case 57:
                {
                alt49=2;
                }
                break;
            case 70:
                {
                alt49=3;
                }
                break;
            case 71:
                {
                alt49=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalNML.g:1754:3: kw= '.'
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getFullStopKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:1760:3: kw= '->'
                    {
                    kw=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getHyphenMinusGreaterThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNML.g:1766:3: kw= '?.'
                    {
                    kw=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getQuestionMarkFullStopKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNML.g:1772:3: kw= '?->'
                    {
                    kw=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getQuestionMarkHyphenMinusGreaterThanSignKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLNavigationOperatorName"


    // $ANTLR start "entryRuleBinaryOperatorName"
    // InternalNML.g:1781:1: entryRuleBinaryOperatorName returns [String current=null] : iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF ;
    public final String entryRuleBinaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperatorName = null;


        try {
            // InternalNML.g:1781:58: (iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF )
            // InternalNML.g:1782:2: iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBinaryOperatorName=ruleBinaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryOperatorName"


    // $ANTLR start "ruleBinaryOperatorName"
    // InternalNML.g:1788:1: ruleBinaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_InfixOperatorName_0 = null;

        AntlrDatatypeRuleToken this_NavigationOperatorName_1 = null;



        	enterRule();

        try {
            // InternalNML.g:1794:2: ( (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName ) )
            // InternalNML.g:1795:2: (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName )
            {
            // InternalNML.g:1795:2: (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=38 && LA50_0<=39)||LA50_0==46||LA50_0==50||(LA50_0>=52 && LA50_0<=55)||LA50_0==58||(LA50_0>=61 && LA50_0<=69)) ) {
                alt50=1;
            }
            else if ( (LA50_0==48||LA50_0==57||(LA50_0>=70 && LA50_0<=71)) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalNML.g:1796:3: this_InfixOperatorName_0= ruleInfixOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getInfixOperatorNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_InfixOperatorName_0=ruleInfixOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_InfixOperatorName_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:1807:3: this_NavigationOperatorName_1= ruleNavigationOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getNavigationOperatorNameParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NavigationOperatorName_1=ruleNavigationOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NavigationOperatorName_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOperatorName"


    // $ANTLR start "entryRuleInfixOperatorName"
    // InternalNML.g:1821:1: entryRuleInfixOperatorName returns [String current=null] : iv_ruleInfixOperatorName= ruleInfixOperatorName EOF ;
    public final String entryRuleInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperatorName = null;


        try {
            // InternalNML.g:1821:57: (iv_ruleInfixOperatorName= ruleInfixOperatorName EOF )
            // InternalNML.g:1822:2: iv_ruleInfixOperatorName= ruleInfixOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInfixOperatorName=ruleInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfixOperatorName"


    // $ANTLR start "ruleInfixOperatorName"
    // InternalNML.g:1828:1: ruleInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName ;
    public final AntlrDatatypeRuleToken ruleInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperatorName_0 = null;



        	enterRule();

        try {
            // InternalNML.g:1834:2: (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName )
            // InternalNML.g:1835:2: this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getInfixOperatorNameAccess().getEssentialOCLInfixOperatorNameParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_EssentialOCLInfixOperatorName_0=ruleEssentialOCLInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLInfixOperatorName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfixOperatorName"


    // $ANTLR start "entryRuleNavigationOperatorName"
    // InternalNML.g:1848:1: entryRuleNavigationOperatorName returns [String current=null] : iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF ;
    public final String entryRuleNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperatorName = null;


        try {
            // InternalNML.g:1848:62: (iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF )
            // InternalNML.g:1849:2: iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigationOperatorName=ruleNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigationOperatorName"


    // $ANTLR start "ruleNavigationOperatorName"
    // InternalNML.g:1855:1: ruleNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName ;
    public final AntlrDatatypeRuleToken ruleNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperatorName_0 = null;



        	enterRule();

        try {
            // InternalNML.g:1861:2: (this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName )
            // InternalNML.g:1862:2: this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getNavigationOperatorNameAccess().getEssentialOCLNavigationOperatorNameParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_EssentialOCLNavigationOperatorName_0=ruleEssentialOCLNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLNavigationOperatorName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigationOperatorName"


    // $ANTLR start "entryRuleUnaryOperatorName"
    // InternalNML.g:1875:1: entryRuleUnaryOperatorName returns [String current=null] : iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF ;
    public final String entryRuleUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperatorName = null;


        try {
            // InternalNML.g:1875:57: (iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF )
            // InternalNML.g:1876:2: iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnaryOperatorName=ruleUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOperatorName"


    // $ANTLR start "ruleUnaryOperatorName"
    // InternalNML.g:1882:1: ruleUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName ;
    public final AntlrDatatypeRuleToken ruleUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnaryOperatorName_0 = null;



        	enterRule();

        try {
            // InternalNML.g:1888:2: (this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName )
            // InternalNML.g:1889:2: this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getUnaryOperatorNameAccess().getEssentialOCLUnaryOperatorNameParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_EssentialOCLUnaryOperatorName_0=ruleEssentialOCLUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnaryOperatorName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperatorName"


    // $ANTLR start "entryRuleEssentialOCLUnrestrictedName"
    // InternalNML.g:1902:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // InternalNML.g:1902:68: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // InternalNML.g:1903:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLUnrestrictedName=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLUnrestrictedName"


    // $ANTLR start "ruleEssentialOCLUnrestrictedName"
    // InternalNML.g:1909:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;



        	enterRule();

        try {
            // InternalNML.g:1915:2: (this_Identifier_0= ruleIdentifier )
            // InternalNML.g:1916:2: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameAccess().getIdentifierParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_Identifier_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Identifier_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLUnrestrictedName"


    // $ANTLR start "entryRuleUnrestrictedName"
    // InternalNML.g:1929:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // InternalNML.g:1929:56: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // InternalNML.g:1930:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnrestrictedName=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnrestrictedName"


    // $ANTLR start "ruleUnrestrictedName"
    // InternalNML.g:1936:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;



        	enterRule();

        try {
            // InternalNML.g:1942:2: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // InternalNML.g:1943:2: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_EssentialOCLUnrestrictedName_0=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnrestrictedName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnrestrictedName"


    // $ANTLR start "entryRuleEssentialOCLUnreservedName"
    // InternalNML.g:1956:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // InternalNML.g:1956:66: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // InternalNML.g:1957:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLUnreservedName=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLUnreservedName"


    // $ANTLR start "ruleEssentialOCLUnreservedName"
    // InternalNML.g:1963:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;



        	enterRule();

        try {
            // InternalNML.g:1969:2: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' ) )
            // InternalNML.g:1970:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' )
            {
            // InternalNML.g:1970:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' )
            int alt51=5;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
            case RULE_ESCAPED_ID:
                {
                alt51=1;
                }
                break;
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
                {
                alt51=2;
                }
                break;
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
                {
                alt51=3;
                }
                break;
            case 72:
                {
                alt51=4;
                }
                break;
            case 73:
                {
                alt51=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalNML.g:1971:3: this_UnrestrictedName_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getUnrestrictedNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_UnrestrictedName_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_UnrestrictedName_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:1982:3: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getCollectionTypeIdentifierParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CollectionTypeIdentifier_1=ruleCollectionTypeIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CollectionTypeIdentifier_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNML.g:1993:3: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getPrimitiveTypeIdentifierParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrimitiveTypeIdentifier_2=rulePrimitiveTypeIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PrimitiveTypeIdentifier_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNML.g:2004:3: kw= 'Map'
                    {
                    kw=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnreservedNameAccess().getMapKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNML.g:2010:3: kw= 'Tuple'
                    {
                    kw=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnreservedNameAccess().getTupleKeyword_4());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLUnreservedName"


    // $ANTLR start "entryRuleUnreservedName"
    // InternalNML.g:2019:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // InternalNML.g:2019:54: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // InternalNML.g:2020:2: iv_ruleUnreservedName= ruleUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnreservedName=ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnreservedName"


    // $ANTLR start "ruleUnreservedName"
    // InternalNML.g:2026:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;



        	enterRule();

        try {
            // InternalNML.g:2032:2: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // InternalNML.g:2033:2: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getUnreservedNameAccess().getEssentialOCLUnreservedNameParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_EssentialOCLUnreservedName_0=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnreservedName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnreservedName"


    // $ANTLR start "entryRuleURIFirstPathElementCS"
    // InternalNML.g:2046:1: entryRuleURIFirstPathElementCS returns [EObject current=null] : iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF ;
    public final EObject entryRuleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIFirstPathElementCS = null;


        try {
            // InternalNML.g:2046:62: (iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF )
            // InternalNML.g:2047:2: iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleURIFirstPathElementCS=ruleURIFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURIFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURIFirstPathElementCS"


    // $ANTLR start "ruleURIFirstPathElementCS"
    // InternalNML.g:2053:1: ruleURIFirstPathElementCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) ;
    public final EObject ruleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalNML.g:2059:2: ( ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) )
            // InternalNML.g:2060:2: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            {
            // InternalNML.g:2060:2: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_SIMPLE_ID && LA52_0<=RULE_ESCAPED_ID)) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalNML.g:2061:3: ( ( ruleUnrestrictedName ) )
                    {
                    // InternalNML.g:2061:3: ( ( ruleUnrestrictedName ) )
                    // InternalNML.g:2062:4: ( ruleUnrestrictedName )
                    {
                    // InternalNML.g:2062:4: ( ruleUnrestrictedName )
                    // InternalNML.g:2063:5: ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getURIFirstPathElementCSRule());
                      					}
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getURIFirstPathElementCSAccess().getReferredElementNamedElementCrossReference_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNML.g:2081:3: ( () ( ( ruleURI ) ) )
                    {
                    // InternalNML.g:2081:3: ( () ( ( ruleURI ) ) )
                    // InternalNML.g:2082:4: () ( ( ruleURI ) )
                    {
                    // InternalNML.g:2082:4: ()
                    // InternalNML.g:2083:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getURIFirstPathElementCSAccess().getPathElementWithURICSAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNML.g:2092:4: ( ( ruleURI ) )
                    // InternalNML.g:2093:5: ( ruleURI )
                    {
                    // InternalNML.g:2093:5: ( ruleURI )
                    // InternalNML.g:2094:6: ruleURI
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getURIFirstPathElementCSRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getURIFirstPathElementCSAccess().getReferredElementNamespaceCrossReference_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleURI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURIFirstPathElementCS"


    // $ANTLR start "entryRulePrimitiveTypeIdentifier"
    // InternalNML.g:2116:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // InternalNML.g:2116:63: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // InternalNML.g:2117:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimitiveTypeIdentifier=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveTypeIdentifier"


    // $ANTLR start "rulePrimitiveTypeIdentifier"
    // InternalNML.g:2123:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNML.g:2129:2: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // InternalNML.g:2130:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // InternalNML.g:2130:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt53=8;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt53=1;
                }
                break;
            case 75:
                {
                alt53=2;
                }
                break;
            case 76:
                {
                alt53=3;
                }
                break;
            case 77:
                {
                alt53=4;
                }
                break;
            case 78:
                {
                alt53=5;
                }
                break;
            case 79:
                {
                alt53=6;
                }
                break;
            case 80:
                {
                alt53=7;
                }
                break;
            case 81:
                {
                alt53=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalNML.g:2131:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:2137:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNML.g:2143:3: kw= 'Real'
                    {
                    kw=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNML.g:2149:3: kw= 'String'
                    {
                    kw=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNML.g:2155:3: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNML.g:2161:3: kw= 'OclAny'
                    {
                    kw=(Token)match(input,79,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalNML.g:2167:3: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,80,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalNML.g:2173:3: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,81,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclVoidKeyword_7());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveTypeIdentifier"


    // $ANTLR start "entryRulePrimitiveTypeCS"
    // InternalNML.g:2182:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // InternalNML.g:2182:56: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // InternalNML.g:2183:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimitiveTypeCS=rulePrimitiveTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveTypeCS"


    // $ANTLR start "rulePrimitiveTypeCS"
    // InternalNML.g:2189:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalNML.g:2195:2: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // InternalNML.g:2196:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // InternalNML.g:2196:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // InternalNML.g:2197:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // InternalNML.g:2197:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // InternalNML.g:2198:4: lv_name_0_0= rulePrimitiveTypeIdentifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_0_0=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPrimitiveTypeCSRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PrimitiveTypeIdentifier");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveTypeCS"


    // $ANTLR start "entryRuleCollectionTypeIdentifier"
    // InternalNML.g:2218:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // InternalNML.g:2218:64: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // InternalNML.g:2219:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionTypeIdentifier=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionTypeIdentifier"


    // $ANTLR start "ruleCollectionTypeIdentifier"
    // InternalNML.g:2225:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNML.g:2231:2: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // InternalNML.g:2232:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // InternalNML.g:2232:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt54=5;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt54=1;
                }
                break;
            case 83:
                {
                alt54=2;
                }
                break;
            case 84:
                {
                alt54=3;
                }
                break;
            case 85:
                {
                alt54=4;
                }
                break;
            case 86:
                {
                alt54=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalNML.g:2233:3: kw= 'Set'
                    {
                    kw=(Token)match(input,82,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:2239:3: kw= 'Bag'
                    {
                    kw=(Token)match(input,83,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNML.g:2245:3: kw= 'Sequence'
                    {
                    kw=(Token)match(input,84,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNML.g:2251:3: kw= 'Collection'
                    {
                    kw=(Token)match(input,85,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNML.g:2257:3: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,86,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getOrderedSetKeyword_4());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionTypeIdentifier"


    // $ANTLR start "entryRuleCollectionTypeCS"
    // InternalNML.g:2266:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // InternalNML.g:2266:57: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // InternalNML.g:2267:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionTypeCS=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionTypeCS"


    // $ANTLR start "ruleCollectionTypeCS"
    // InternalNML.g:2273:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedCollectionMultiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalNML.g:2279:2: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? ) )
            // InternalNML.g:2280:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? )
            {
            // InternalNML.g:2280:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? )
            // InternalNML.g:2281:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )?
            {
            // InternalNML.g:2281:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // InternalNML.g:2282:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // InternalNML.g:2282:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // InternalNML.g:2283:5: lv_name_0_0= ruleCollectionTypeIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_47);
            lv_name_0_0=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionTypeIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:2300:3: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==43) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalNML.g:2301:4: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalNML.g:2305:4: ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) )
                    // InternalNML.g:2306:5: (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS )
                    {
                    // InternalNML.g:2306:5: (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS )
                    // InternalNML.g:2307:6: lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpWithoutMultiplicityCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_49);
                    lv_ownedType_2_0=ruleTypeExpWithoutMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpWithoutMultiplicityCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNML.g:2324:4: ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==41) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalNML.g:2325:5: (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS )
                            {
                            // InternalNML.g:2325:5: (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS )
                            // InternalNML.g:2326:6: lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedCollectionMultiplicityMultiplicityCSParserRuleCall_1_2_0());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_41);
                            lv_ownedCollectionMultiplicity_3_0=ruleMultiplicityCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                              						}
                              						set(
                              							current,
                              							"ownedCollectionMultiplicity",
                              							lv_ownedCollectionMultiplicity_3_0,
                              							"org.eclipse.ocl.xtext.base.Base.MultiplicityCS");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionTypeCS"


    // $ANTLR start "entryRuleMapTypeCS"
    // InternalNML.g:2352:1: entryRuleMapTypeCS returns [EObject current=null] : iv_ruleMapTypeCS= ruleMapTypeCS EOF ;
    public final EObject entryRuleMapTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapTypeCS = null;


        try {
            // InternalNML.g:2352:50: (iv_ruleMapTypeCS= ruleMapTypeCS EOF )
            // InternalNML.g:2353:2: iv_ruleMapTypeCS= ruleMapTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMapTypeCS=ruleMapTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapTypeCS"


    // $ANTLR start "ruleMapTypeCS"
    // InternalNML.g:2359:1: ruleMapTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) ;
    public final EObject ruleMapTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedKeyType_2_0 = null;

        EObject lv_ownedValueType_4_0 = null;



        	enterRule();

        try {
            // InternalNML.g:2365:2: ( ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) )
            // InternalNML.g:2366:2: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            {
            // InternalNML.g:2366:2: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            // InternalNML.g:2367:3: ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            {
            // InternalNML.g:2367:3: ( (lv_name_0_0= 'Map' ) )
            // InternalNML.g:2368:4: (lv_name_0_0= 'Map' )
            {
            // InternalNML.g:2368:4: (lv_name_0_0= 'Map' )
            // InternalNML.g:2369:5: lv_name_0_0= 'Map'
            {
            lv_name_0_0=(Token)match(input,72,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getMapTypeCSAccess().getNameMapKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMapTypeCSRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_0_0, "Map");
              				
            }

            }


            }

            // InternalNML.g:2381:3: (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==43) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalNML.g:2382:4: otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMapTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalNML.g:2386:4: ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) )
                    // InternalNML.g:2387:5: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    {
                    // InternalNML.g:2387:5: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    // InternalNML.g:2388:6: lv_ownedKeyType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedKeyTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_50);
                    lv_ownedKeyType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMapTypeCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedKeyType",
                      							lv_ownedKeyType_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMapTypeCSAccess().getCommaKeyword_1_2());
                      			
                    }
                    // InternalNML.g:2409:4: ( (lv_ownedValueType_4_0= ruleTypeExpCS ) )
                    // InternalNML.g:2410:5: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    {
                    // InternalNML.g:2410:5: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    // InternalNML.g:2411:6: lv_ownedValueType_4_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedValueTypeTypeExpCSParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
                    lv_ownedValueType_4_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMapTypeCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedValueType",
                      							lv_ownedValueType_4_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getMapTypeCSAccess().getRightParenthesisKeyword_1_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapTypeCS"


    // $ANTLR start "entryRuleTupleTypeCS"
    // InternalNML.g:2437:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // InternalNML.g:2437:52: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // InternalNML.g:2438:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTupleTypeCS=ruleTupleTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleTypeCS"


    // $ANTLR start "ruleTupleTypeCS"
    // InternalNML.g:2444:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) ;
    public final EObject ruleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalNML.g:2450:2: ( ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) )
            // InternalNML.g:2451:2: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            {
            // InternalNML.g:2451:2: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            // InternalNML.g:2452:3: ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            {
            // InternalNML.g:2452:3: ( (lv_name_0_0= 'Tuple' ) )
            // InternalNML.g:2453:4: (lv_name_0_0= 'Tuple' )
            {
            // InternalNML.g:2453:4: (lv_name_0_0= 'Tuple' )
            // InternalNML.g:2454:5: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,73,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getTupleTypeCSAccess().getNameTupleKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTupleTypeCSRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_0_0, "Tuple");
              				
            }

            }


            }

            // InternalNML.g:2466:3: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==43) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalNML.g:2467:4: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalNML.g:2471:4: ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( ((LA59_0>=RULE_SIMPLE_ID && LA59_0<=RULE_ESCAPED_ID)) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalNML.g:2472:5: ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            {
                            // InternalNML.g:2472:5: ( (lv_ownedParts_2_0= ruleTuplePartCS ) )
                            // InternalNML.g:2473:6: (lv_ownedParts_2_0= ruleTuplePartCS )
                            {
                            // InternalNML.g:2473:6: (lv_ownedParts_2_0= ruleTuplePartCS )
                            // InternalNML.g:2474:7: lv_ownedParts_2_0= ruleTuplePartCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_37);
                            lv_ownedParts_2_0=ruleTuplePartCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                              							}
                              							add(
                              								current,
                              								"ownedParts",
                              								lv_ownedParts_2_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TuplePartCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalNML.g:2491:5: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==27) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // InternalNML.g:2492:6: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_0());
                            	      					
                            	    }
                            	    // InternalNML.g:2496:6: ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    // InternalNML.g:2497:7: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    {
                            	    // InternalNML.g:2497:7: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    // InternalNML.g:2498:8: lv_ownedParts_4_0= ruleTuplePartCS
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_37);
                            	    lv_ownedParts_4_0=ruleTuplePartCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"ownedParts",
                            	      									lv_ownedParts_4_0,
                            	      									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TuplePartCS");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop58;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleTypeCS"


    // $ANTLR start "entryRuleTuplePartCS"
    // InternalNML.g:2526:1: entryRuleTuplePartCS returns [EObject current=null] : iv_ruleTuplePartCS= ruleTuplePartCS EOF ;
    public final EObject entryRuleTuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePartCS = null;


        try {
            // InternalNML.g:2526:52: (iv_ruleTuplePartCS= ruleTuplePartCS EOF )
            // InternalNML.g:2527:2: iv_ruleTuplePartCS= ruleTuplePartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTuplePartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTuplePartCS=ruleTuplePartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuplePartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTuplePartCS"


    // $ANTLR start "ruleTuplePartCS"
    // InternalNML.g:2533:1: ruleTuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleTuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalNML.g:2539:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // InternalNML.g:2540:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalNML.g:2540:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // InternalNML.g:2541:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // InternalNML.g:2541:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalNML.g:2542:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalNML.g:2542:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalNML.g:2543:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
              		
            }
            // InternalNML.g:2564:3: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // InternalNML.g:2565:4: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // InternalNML.g:2565:4: (lv_ownedType_2_0= ruleTypeExpCS )
            // InternalNML.g:2566:5: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTuplePartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_2_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTuplePartCS"


    // $ANTLR start "entryRuleCollectionLiteralExpCS"
    // InternalNML.g:2587:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // InternalNML.g:2587:63: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // InternalNML.g:2588:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionLiteralExpCS=ruleCollectionLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionLiteralExpCS"


    // $ANTLR start "ruleCollectionLiteralExpCS"
    // InternalNML.g:2594:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalNML.g:2600:2: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalNML.g:2601:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalNML.g:2601:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // InternalNML.g:2602:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalNML.g:2602:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // InternalNML.g:2603:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // InternalNML.g:2603:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // InternalNML.g:2604:5: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_ownedType_0_0=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNML.g:2625:3: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_INT && LA62_0<=RULE_SINGLE_QUOTED_STRING)||LA62_0==23||LA62_0==43||(LA62_0>=58 && LA62_0<=61)||(LA62_0>=72 && LA62_0<=86)||LA62_0==89||(LA62_0>=91 && LA62_0<=94)||LA62_0==98||(LA62_0>=103 && LA62_0<=104)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalNML.g:2626:4: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // InternalNML.g:2626:4: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // InternalNML.g:2627:5: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // InternalNML.g:2627:5: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // InternalNML.g:2628:6: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_53);
                    lv_ownedParts_2_0=ruleCollectionLiteralPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionLiteralPartCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNML.g:2645:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==27) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalNML.g:2646:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNML.g:2650:5: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // InternalNML.g:2651:6: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // InternalNML.g:2651:6: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // InternalNML.g:2652:7: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_53);
                    	    lv_ownedParts_4_0=ruleCollectionLiteralPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionLiteralPartCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCollectionLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionLiteralExpCS"


    // $ANTLR start "entryRuleCollectionLiteralPartCS"
    // InternalNML.g:2679:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // InternalNML.g:2679:64: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // InternalNML.g:2680:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionLiteralPartCS=ruleCollectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionLiteralPartCS"


    // $ANTLR start "ruleCollectionLiteralPartCS"
    // InternalNML.g:2686:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedExpression_0_0 = null;

        EObject lv_ownedLastExpression_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;



        	enterRule();

        try {
            // InternalNML.g:2692:2: ( ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) )
            // InternalNML.g:2693:2: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            {
            // InternalNML.g:2693:2: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            int alt64=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_SINGLE_QUOTED_STRING:
            case 43:
            case 58:
            case 59:
            case 60:
            case 61:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 98:
            case 103:
            case 104:
                {
                alt64=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA64_2 = input.LA(2);

                if ( (LA64_2==EOF||LA64_2==17||LA64_2==19||LA64_2==27||(LA64_2>=38 && LA64_2<=39)||LA64_2==41||LA64_2==43||LA64_2==46||LA64_2==48||LA64_2==50||(LA64_2>=52 && LA64_2<=55)||(LA64_2>=57 && LA64_2<=58)||(LA64_2>=61 && LA64_2<=71)||LA64_2==87||LA64_2==95||LA64_2==108) ) {
                    alt64=1;
                }
                else if ( (LA64_2==23) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA64_3 = input.LA(2);

                if ( (LA64_3==23) ) {
                    alt64=2;
                }
                else if ( (LA64_3==EOF||LA64_3==17||LA64_3==19||LA64_3==27||(LA64_3>=38 && LA64_3<=39)||LA64_3==41||LA64_3==43||LA64_3==46||LA64_3==48||LA64_3==50||(LA64_3>=52 && LA64_3<=55)||(LA64_3>=57 && LA64_3<=58)||(LA64_3>=61 && LA64_3<=71)||LA64_3==87||LA64_3==95||LA64_3==108) ) {
                    alt64=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 3, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt64=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalNML.g:2694:3: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    {
                    // InternalNML.g:2694:3: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    // InternalNML.g:2695:4: ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    {
                    // InternalNML.g:2695:4: ( (lv_ownedExpression_0_0= ruleExpCS ) )
                    // InternalNML.g:2696:5: (lv_ownedExpression_0_0= ruleExpCS )
                    {
                    // InternalNML.g:2696:5: (lv_ownedExpression_0_0= ruleExpCS )
                    // InternalNML.g:2697:6: lv_ownedExpression_0_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionExpCSParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_55);
                    lv_ownedExpression_0_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedExpression",
                      							lv_ownedExpression_0_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNML.g:2714:4: (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==87) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalNML.g:2715:5: otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            {
                            otherlv_1=(Token)match(input,87,FollowSets000.FOLLOW_56); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_0_1_0());
                              				
                            }
                            // InternalNML.g:2719:5: ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            // InternalNML.g:2720:6: (lv_ownedLastExpression_2_0= ruleExpCS )
                            {
                            // InternalNML.g:2720:6: (lv_ownedLastExpression_2_0= ruleExpCS )
                            // InternalNML.g:2721:7: lv_ownedLastExpression_2_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedLastExpressionExpCSParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedLastExpression_2_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedLastExpression",
                              								lv_ownedLastExpression_2_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNML.g:2741:3: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    {
                    // InternalNML.g:2741:3: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    // InternalNML.g:2742:4: (lv_ownedExpression_3_0= rulePatternExpCS )
                    {
                    // InternalNML.g:2742:4: (lv_ownedExpression_3_0= rulePatternExpCS )
                    // InternalNML.g:2743:5: lv_ownedExpression_3_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionPatternExpCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedExpression_3_0=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedExpression",
                      						lv_ownedExpression_3_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionLiteralPartCS"


    // $ANTLR start "entryRuleCollectionPatternCS"
    // InternalNML.g:2764:1: entryRuleCollectionPatternCS returns [EObject current=null] : iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF ;
    public final EObject entryRuleCollectionPatternCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionPatternCS = null;


        try {
            // InternalNML.g:2764:60: (iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF )
            // InternalNML.g:2765:2: iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionPatternCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionPatternCS=ruleCollectionPatternCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionPatternCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionPatternCS"


    // $ANTLR start "ruleCollectionPatternCS"
    // InternalNML.g:2771:1: ruleCollectionPatternCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleCollectionPatternCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;

        AntlrDatatypeRuleToken lv_restVariableName_6_0 = null;



        	enterRule();

        try {
            // InternalNML.g:2777:2: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' ) )
            // InternalNML.g:2778:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' )
            {
            // InternalNML.g:2778:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' )
            // InternalNML.g:2779:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}'
            {
            // InternalNML.g:2779:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // InternalNML.g:2780:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // InternalNML.g:2780:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // InternalNML.g:2781:5: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_ownedType_0_0=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionPatternCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNML.g:2802:3: ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=RULE_SIMPLE_ID && LA66_0<=RULE_ESCAPED_ID)||LA66_0==23) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalNML.g:2803:4: ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) )
                    {
                    // InternalNML.g:2803:4: ( (lv_ownedParts_2_0= rulePatternExpCS ) )
                    // InternalNML.g:2804:5: (lv_ownedParts_2_0= rulePatternExpCS )
                    {
                    // InternalNML.g:2804:5: (lv_ownedParts_2_0= rulePatternExpCS )
                    // InternalNML.g:2805:6: lv_ownedParts_2_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_57);
                    lv_ownedParts_2_0=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNML.g:2822:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==27) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalNML.g:2823:5: otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCollectionPatternCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNML.g:2827:5: ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    // InternalNML.g:2828:6: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    {
                    	    // InternalNML.g:2828:6: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    // InternalNML.g:2829:7: lv_ownedParts_4_0= rulePatternExpCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_57);
                    	    lv_ownedParts_4_0=rulePatternExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    // InternalNML.g:2847:4: (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) )
                    // InternalNML.g:2848:5: otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) )
                    {
                    otherlv_5=(Token)match(input,88,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getCollectionPatternCSAccess().getPlusSignPlusSignKeyword_2_2_0());
                      				
                    }
                    // InternalNML.g:2852:5: ( (lv_restVariableName_6_0= ruleIdentifier ) )
                    // InternalNML.g:2853:6: (lv_restVariableName_6_0= ruleIdentifier )
                    {
                    // InternalNML.g:2853:6: (lv_restVariableName_6_0= ruleIdentifier )
                    // InternalNML.g:2854:7: lv_restVariableName_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getRestVariableNameIdentifierParserRuleCall_2_2_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_restVariableName_6_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
                      							}
                      							set(
                      								current,
                      								"restVariableName",
                      								lv_restVariableName_6_0,
                      								"org.eclipse.ocl.xtext.base.Base.Identifier");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getCollectionPatternCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionPatternCS"


    // $ANTLR start "entryRuleShadowPartCS"
    // InternalNML.g:2881:1: entryRuleShadowPartCS returns [EObject current=null] : iv_ruleShadowPartCS= ruleShadowPartCS EOF ;
    public final EObject entryRuleShadowPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShadowPartCS = null;


        try {
            // InternalNML.g:2881:53: (iv_ruleShadowPartCS= ruleShadowPartCS EOF )
            // InternalNML.g:2882:2: iv_ruleShadowPartCS= ruleShadowPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShadowPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShadowPartCS=ruleShadowPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShadowPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShadowPartCS"


    // $ANTLR start "ruleShadowPartCS"
    // InternalNML.g:2888:1: ruleShadowPartCS returns [EObject current=null] : ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) ) ;
    public final EObject ruleShadowPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedInitExpression_2_1 = null;

        EObject lv_ownedInitExpression_2_2 = null;

        EObject lv_ownedInitExpression_3_0 = null;



        	enterRule();

        try {
            // InternalNML.g:2894:2: ( ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) ) )
            // InternalNML.g:2895:2: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) )
            {
            // InternalNML.g:2895:2: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=RULE_SIMPLE_ID && LA68_0<=RULE_ESCAPED_ID)) ) {
                alt68=1;
            }
            else if ( (LA68_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalNML.g:2896:3: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
                    {
                    // InternalNML.g:2896:3: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
                    // InternalNML.g:2897:4: ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
                    {
                    // InternalNML.g:2897:4: ( ( ruleUnrestrictedName ) )
                    // InternalNML.g:2898:5: ( ruleUnrestrictedName )
                    {
                    // InternalNML.g:2898:5: ( ruleUnrestrictedName )
                    // InternalNML.g:2899:6: ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getShadowPartCSRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getShadowPartCSAccess().getReferredPropertyPropertyCrossReference_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_58);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getShadowPartCSAccess().getEqualsSignKeyword_0_1());
                      			
                    }
                    // InternalNML.g:2920:4: ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
                    // InternalNML.g:2921:5: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
                    {
                    // InternalNML.g:2921:5: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
                    // InternalNML.g:2922:6: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
                    {
                    // InternalNML.g:2922:6: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
                    int alt67=2;
                    switch ( input.LA(1) ) {
                    case RULE_INT:
                    case RULE_SINGLE_QUOTED_STRING:
                    case 43:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 89:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 98:
                    case 103:
                    case 104:
                        {
                        alt67=1;
                        }
                        break;
                    case RULE_SIMPLE_ID:
                        {
                        int LA67_2 = input.LA(2);

                        if ( (LA67_2==EOF||LA67_2==17||LA67_2==19||LA67_2==27||(LA67_2>=38 && LA67_2<=39)||LA67_2==41||LA67_2==43||LA67_2==46||LA67_2==48||LA67_2==50||(LA67_2>=52 && LA67_2<=55)||(LA67_2>=57 && LA67_2<=58)||(LA67_2>=61 && LA67_2<=71)||LA67_2==95||LA67_2==108) ) {
                            alt67=1;
                        }
                        else if ( (LA67_2==23) ) {
                            alt67=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ESCAPED_ID:
                        {
                        int LA67_3 = input.LA(2);

                        if ( (LA67_3==EOF||LA67_3==17||LA67_3==19||LA67_3==27||(LA67_3>=38 && LA67_3<=39)||LA67_3==41||LA67_3==43||LA67_3==46||LA67_3==48||LA67_3==50||(LA67_3>=52 && LA67_3<=55)||(LA67_3>=57 && LA67_3<=58)||(LA67_3>=61 && LA67_3<=71)||LA67_3==95||LA67_3==108) ) {
                            alt67=1;
                        }
                        else if ( (LA67_3==23) ) {
                            alt67=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 67, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 23:
                        {
                        alt67=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }

                    switch (alt67) {
                        case 1 :
                            // InternalNML.g:2923:7: lv_ownedInitExpression_2_1= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_2_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_2_1=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getShadowPartCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_2_1,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalNML.g:2939:7: lv_ownedInitExpression_2_2= rulePatternExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionPatternExpCSParserRuleCall_0_2_0_1());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_2_2=rulePatternExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getShadowPartCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_2_2,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNML.g:2959:3: ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) )
                    {
                    // InternalNML.g:2959:3: ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) )
                    // InternalNML.g:2960:4: (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS )
                    {
                    // InternalNML.g:2960:4: (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS )
                    // InternalNML.g:2961:5: lv_ownedInitExpression_3_0= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionStringLiteralExpCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedInitExpression_3_0=ruleStringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getShadowPartCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedInitExpression",
                      						lv_ownedInitExpression_3_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.StringLiteralExpCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShadowPartCS"


    // $ANTLR start "entryRulePatternExpCS"
    // InternalNML.g:2982:1: entryRulePatternExpCS returns [EObject current=null] : iv_rulePatternExpCS= rulePatternExpCS EOF ;
    public final EObject entryRulePatternExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternExpCS = null;


        try {
            // InternalNML.g:2982:53: (iv_rulePatternExpCS= rulePatternExpCS EOF )
            // InternalNML.g:2983:2: iv_rulePatternExpCS= rulePatternExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePatternExpCS=rulePatternExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternExpCS"


    // $ANTLR start "rulePatternExpCS"
    // InternalNML.g:2989:1: rulePatternExpCS returns [EObject current=null] : ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject rulePatternExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_patternVariableName_0_0 = null;

        EObject lv_ownedPatternType_2_0 = null;



        	enterRule();

        try {
            // InternalNML.g:2995:2: ( ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) )
            // InternalNML.g:2996:2: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalNML.g:2996:2: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            // InternalNML.g:2997:3: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            {
            // InternalNML.g:2997:3: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=RULE_SIMPLE_ID && LA69_0<=RULE_ESCAPED_ID)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalNML.g:2998:4: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    {
                    // InternalNML.g:2998:4: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    // InternalNML.g:2999:5: lv_patternVariableName_0_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPatternExpCSAccess().getPatternVariableNameUnrestrictedNameParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_patternVariableName_0_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPatternExpCSRule());
                      					}
                      					set(
                      						current,
                      						"patternVariableName",
                      						lv_patternVariableName_0_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPatternExpCSAccess().getColonKeyword_1());
              		
            }
            // InternalNML.g:3020:3: ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            // InternalNML.g:3021:4: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            {
            // InternalNML.g:3021:4: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            // InternalNML.g:3022:5: lv_ownedPatternType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPatternExpCSAccess().getOwnedPatternTypeTypeExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedPatternType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPatternExpCSRule());
              					}
              					set(
              						current,
              						"ownedPatternType",
              						lv_ownedPatternType_2_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternExpCS"


    // $ANTLR start "entryRuleLambdaLiteralExpCS"
    // InternalNML.g:3043:1: entryRuleLambdaLiteralExpCS returns [EObject current=null] : iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF ;
    public final EObject entryRuleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambdaLiteralExpCS = null;


        try {
            // InternalNML.g:3043:59: (iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF )
            // InternalNML.g:3044:2: iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLambdaLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLambdaLiteralExpCS=ruleLambdaLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLambdaLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLambdaLiteralExpCS"


    // $ANTLR start "ruleLambdaLiteralExpCS"
    // InternalNML.g:3050:1: ruleLambdaLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) ;
    public final EObject ruleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedExpressionCS_2_0 = null;



        	enterRule();

        try {
            // InternalNML.g:3056:2: ( (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) )
            // InternalNML.g:3057:2: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            {
            // InternalNML.g:3057:2: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            // InternalNML.g:3058:3: otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,89,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLambdaLiteralExpCSAccess().getLambdaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLambdaLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNML.g:3066:3: ( (lv_ownedExpressionCS_2_0= ruleExpCS ) )
            // InternalNML.g:3067:4: (lv_ownedExpressionCS_2_0= ruleExpCS )
            {
            // InternalNML.g:3067:4: (lv_ownedExpressionCS_2_0= ruleExpCS )
            // InternalNML.g:3068:5: lv_ownedExpressionCS_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLambdaLiteralExpCSAccess().getOwnedExpressionCSExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
            lv_ownedExpressionCS_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLambdaLiteralExpCSRule());
              					}
              					set(
              						current,
              						"ownedExpressionCS",
              						lv_ownedExpressionCS_2_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLambdaLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLambdaLiteralExpCS"


    // $ANTLR start "entryRuleMapLiteralExpCS"
    // InternalNML.g:3093:1: entryRuleMapLiteralExpCS returns [EObject current=null] : iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF ;
    public final EObject entryRuleMapLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralExpCS = null;


        try {
            // InternalNML.g:3093:56: (iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF )
            // InternalNML.g:3094:2: iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMapLiteralExpCS=ruleMapLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapLiteralExpCS"


    // $ANTLR start "ruleMapLiteralExpCS"
    // InternalNML.g:3100:1: ruleMapLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleMapLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalNML.g:3106:2: ( ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalNML.g:3107:2: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalNML.g:3107:2: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // InternalNML.g:3108:3: ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalNML.g:3108:3: ( (lv_ownedType_0_0= ruleMapTypeCS ) )
            // InternalNML.g:3109:4: (lv_ownedType_0_0= ruleMapTypeCS )
            {
            // InternalNML.g:3109:4: (lv_ownedType_0_0= ruleMapTypeCS )
            // InternalNML.g:3110:5: lv_ownedType_0_0= ruleMapTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedTypeMapTypeCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_ownedType_0_0=ruleMapTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.MapTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNML.g:3131:3: ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=RULE_INT && LA71_0<=RULE_SINGLE_QUOTED_STRING)||LA71_0==43||(LA71_0>=58 && LA71_0<=61)||(LA71_0>=72 && LA71_0<=86)||LA71_0==89||(LA71_0>=91 && LA71_0<=94)||LA71_0==98||(LA71_0>=103 && LA71_0<=104)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalNML.g:3132:4: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    {
                    // InternalNML.g:3132:4: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) )
                    // InternalNML.g:3133:5: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    {
                    // InternalNML.g:3133:5: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    // InternalNML.g:3134:6: lv_ownedParts_2_0= ruleMapLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_53);
                    lv_ownedParts_2_0=ruleMapLiteralPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.MapLiteralPartCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNML.g:3151:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==27) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalNML.g:3152:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_56); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getMapLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNML.g:3156:5: ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    // InternalNML.g:3157:6: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    {
                    	    // InternalNML.g:3157:6: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    // InternalNML.g:3158:7: lv_ownedParts_4_0= ruleMapLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_53);
                    	    lv_ownedParts_4_0=ruleMapLiteralPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.MapLiteralPartCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMapLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapLiteralExpCS"


    // $ANTLR start "entryRuleMapLiteralPartCS"
    // InternalNML.g:3185:1: entryRuleMapLiteralPartCS returns [EObject current=null] : iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF ;
    public final EObject entryRuleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralPartCS = null;


        try {
            // InternalNML.g:3185:57: (iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF )
            // InternalNML.g:3186:2: iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMapLiteralPartCS=ruleMapLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapLiteralPartCS"


    // $ANTLR start "ruleMapLiteralPartCS"
    // InternalNML.g:3192:1: ruleMapLiteralPartCS returns [EObject current=null] : ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedKey_0_0 = null;

        EObject lv_ownedValue_2_0 = null;



        	enterRule();

        try {
            // InternalNML.g:3198:2: ( ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) )
            // InternalNML.g:3199:2: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            {
            // InternalNML.g:3199:2: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            // InternalNML.g:3200:3: ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) )
            {
            // InternalNML.g:3200:3: ( (lv_ownedKey_0_0= ruleExpCS ) )
            // InternalNML.g:3201:4: (lv_ownedKey_0_0= ruleExpCS )
            {
            // InternalNML.g:3201:4: (lv_ownedKey_0_0= ruleExpCS )
            // InternalNML.g:3202:5: lv_ownedKey_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedKeyExpCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_60);
            lv_ownedKey_0_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapLiteralPartCSRule());
              					}
              					set(
              						current,
              						"ownedKey",
              						lv_ownedKey_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,90,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapLiteralPartCSAccess().getLessThanSignHyphenMinusKeyword_1());
              		
            }
            // InternalNML.g:3223:3: ( (lv_ownedValue_2_0= ruleExpCS ) )
            // InternalNML.g:3224:4: (lv_ownedValue_2_0= ruleExpCS )
            {
            // InternalNML.g:3224:4: (lv_ownedValue_2_0= ruleExpCS )
            // InternalNML.g:3225:5: lv_ownedValue_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedValueExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedValue_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapLiteralPartCSRule());
              					}
              					set(
              						current,
              						"ownedValue",
              						lv_ownedValue_2_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapLiteralPartCS"


    // $ANTLR start "entryRulePrimitiveLiteralExpCS"
    // InternalNML.g:3246:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // InternalNML.g:3246:62: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // InternalNML.g:3247:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimitiveLiteralExpCS=rulePrimitiveLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveLiteralExpCS"


    // $ANTLR start "rulePrimitiveLiteralExpCS"
    // InternalNML.g:3253:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
    public final EObject rulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteralExpCS_0 = null;

        EObject this_StringLiteralExpCS_1 = null;

        EObject this_BooleanLiteralExpCS_2 = null;

        EObject this_UnlimitedNaturalLiteralExpCS_3 = null;

        EObject this_InvalidLiteralExpCS_4 = null;

        EObject this_NullLiteralExpCS_5 = null;



        	enterRule();

        try {
            // InternalNML.g:3259:2: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // InternalNML.g:3260:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // InternalNML.g:3260:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt72=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt72=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt72=2;
                }
                break;
            case 91:
            case 92:
                {
                alt72=3;
                }
                break;
            case 61:
                {
                alt72=4;
                }
                break;
            case 93:
                {
                alt72=5;
                }
                break;
            case 94:
                {
                alt72=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalNML.g:3261:3: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NumberLiteralExpCS_0=ruleNumberLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumberLiteralExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:3273:3: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringLiteralExpCS_1=ruleStringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringLiteralExpCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNML.g:3285:3: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BooleanLiteralExpCS_2=ruleBooleanLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanLiteralExpCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNML.g:3297:3: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_UnlimitedNaturalLiteralExpCS_3=ruleUnlimitedNaturalLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnlimitedNaturalLiteralExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNML.g:3309:3: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_InvalidLiteralExpCS_4=ruleInvalidLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InvalidLiteralExpCS_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNML.g:3321:3: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NullLiteralExpCS_5=ruleNullLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NullLiteralExpCS_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralExpCS"
    // InternalNML.g:3336:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // InternalNML.g:3336:58: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // InternalNML.g:3337:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTupleLiteralExpCS=ruleTupleLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleLiteralExpCS"


    // $ANTLR start "ruleTupleLiteralExpCS"
    // InternalNML.g:3343:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalNML.g:3349:2: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // InternalNML.g:3350:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // InternalNML.g:3350:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // InternalNML.g:3351:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,73,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNML.g:3359:3: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // InternalNML.g:3360:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // InternalNML.g:3360:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // InternalNML.g:3361:5: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_53);
            lv_ownedParts_2_0=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
              					}
              					add(
              						current,
              						"ownedParts",
              						lv_ownedParts_2_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TupleLiteralPartCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:3378:3: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==27) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalNML.g:3379:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalNML.g:3383:4: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // InternalNML.g:3384:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // InternalNML.g:3384:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // InternalNML.g:3385:6: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_53);
            	    lv_ownedParts_4_0=ruleTupleLiteralPartCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedParts",
            	      							lv_ownedParts_4_0,
            	      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TupleLiteralPartCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTupleLiteralExpCSAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralPartCS"
    // InternalNML.g:3411:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // InternalNML.g:3411:59: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // InternalNML.g:3412:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTupleLiteralPartCS=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleLiteralPartCS"


    // $ANTLR start "ruleTupleLiteralPartCS"
    // InternalNML.g:3418:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;



        	enterRule();

        try {
            // InternalNML.g:3424:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) )
            // InternalNML.g:3425:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            {
            // InternalNML.g:3425:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            // InternalNML.g:3426:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            {
            // InternalNML.g:3426:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalNML.g:3427:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalNML.g:3427:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalNML.g:3428:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_61);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:3445:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==23) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalNML.g:3446:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalNML.g:3450:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalNML.g:3451:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalNML.g:3451:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalNML.g:3452:6: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_58);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalNML.g:3474:3: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            // InternalNML.g:3475:4: (lv_ownedInitExpression_4_0= ruleExpCS )
            {
            // InternalNML.g:3475:4: (lv_ownedInitExpression_4_0= ruleExpCS )
            // InternalNML.g:3476:5: lv_ownedInitExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedInitExpression_4_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
              					}
              					set(
              						current,
              						"ownedInitExpression",
              						lv_ownedInitExpression_4_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleLiteralPartCS"


    // $ANTLR start "entryRuleNumberLiteralExpCS"
    // InternalNML.g:3497:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // InternalNML.g:3497:59: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // InternalNML.g:3498:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumberLiteralExpCS=ruleNumberLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteralExpCS"


    // $ANTLR start "ruleNumberLiteralExpCS"
    // InternalNML.g:3504:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_symbol_0_0 = null;



        	enterRule();

        try {
            // InternalNML.g:3510:2: ( ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) ) )
            // InternalNML.g:3511:2: ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) )
            {
            // InternalNML.g:3511:2: ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) )
            // InternalNML.g:3512:3: (lv_symbol_0_0= ruleNUMBER_LITERAL )
            {
            // InternalNML.g:3512:3: (lv_symbol_0_0= ruleNUMBER_LITERAL )
            // InternalNML.g:3513:4: lv_symbol_0_0= ruleNUMBER_LITERAL
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNumberLiteralExpCSAccess().getSymbolNUMBER_LITERALParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_symbol_0_0=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNumberLiteralExpCSRule());
              				}
              				set(
              					current,
              					"symbol",
              					lv_symbol_0_0,
              					"org.eclipse.ocl.xtext.base.Base.NUMBER_LITERAL");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteralExpCS"


    // $ANTLR start "entryRuleStringLiteralExpCS"
    // InternalNML.g:3533:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // InternalNML.g:3533:59: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // InternalNML.g:3534:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteralExpCS"


    // $ANTLR start "ruleStringLiteralExpCS"
    // InternalNML.g:3540:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_segments_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_segments_0_0 = null;



        	enterRule();

        try {
            // InternalNML.g:3546:2: ( ( (lv_segments_0_0= ruleStringLiteral ) )+ )
            // InternalNML.g:3547:2: ( (lv_segments_0_0= ruleStringLiteral ) )+
            {
            // InternalNML.g:3547:2: ( (lv_segments_0_0= ruleStringLiteral ) )+
            int cnt75=0;
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==RULE_SINGLE_QUOTED_STRING) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalNML.g:3548:3: (lv_segments_0_0= ruleStringLiteral )
            	    {
            	    // InternalNML.g:3548:3: (lv_segments_0_0= ruleStringLiteral )
            	    // InternalNML.g:3549:4: lv_segments_0_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getSegmentsStringLiteralParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_62);
            	    lv_segments_0_0=ruleStringLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getStringLiteralExpCSRule());
            	      				}
            	      				add(
            	      					current,
            	      					"segments",
            	      					lv_segments_0_0,
            	      					"org.eclipse.ocl.xtext.base.Base.StringLiteral");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt75 >= 1 ) break loop75;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(75, input);
                        throw eee;
                }
                cnt75++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteralExpCS"


    // $ANTLR start "entryRuleBooleanLiteralExpCS"
    // InternalNML.g:3569:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // InternalNML.g:3569:60: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // InternalNML.g:3570:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteralExpCS"


    // $ANTLR start "ruleBooleanLiteralExpCS"
    // InternalNML.g:3576:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token lv_symbol_1_0=null;


        	enterRule();

        try {
            // InternalNML.g:3582:2: ( ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) )
            // InternalNML.g:3583:2: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            {
            // InternalNML.g:3583:2: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==91) ) {
                alt76=1;
            }
            else if ( (LA76_0==92) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalNML.g:3584:3: ( (lv_symbol_0_0= 'true' ) )
                    {
                    // InternalNML.g:3584:3: ( (lv_symbol_0_0= 'true' ) )
                    // InternalNML.g:3585:4: (lv_symbol_0_0= 'true' )
                    {
                    // InternalNML.g:3585:4: (lv_symbol_0_0= 'true' )
                    // InternalNML.g:3586:5: lv_symbol_0_0= 'true'
                    {
                    lv_symbol_0_0=(Token)match(input,91,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbol_0_0, grammarAccess.getBooleanLiteralExpCSAccess().getSymbolTrueKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      					}
                      					setWithLastConsumed(current, "symbol", lv_symbol_0_0, "true");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNML.g:3599:3: ( (lv_symbol_1_0= 'false' ) )
                    {
                    // InternalNML.g:3599:3: ( (lv_symbol_1_0= 'false' ) )
                    // InternalNML.g:3600:4: (lv_symbol_1_0= 'false' )
                    {
                    // InternalNML.g:3600:4: (lv_symbol_1_0= 'false' )
                    // InternalNML.g:3601:5: lv_symbol_1_0= 'false'
                    {
                    lv_symbol_1_0=(Token)match(input,92,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbol_1_0, grammarAccess.getBooleanLiteralExpCSAccess().getSymbolFalseKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      					}
                      					setWithLastConsumed(current, "symbol", lv_symbol_1_0, "false");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteralExpCS"


    // $ANTLR start "entryRuleUnlimitedNaturalLiteralExpCS"
    // InternalNML.g:3617:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // InternalNML.g:3617:69: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // InternalNML.g:3618:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnlimitedNaturalLiteralExpCS=ruleUnlimitedNaturalLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedNaturalLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "ruleUnlimitedNaturalLiteralExpCS"
    // InternalNML.g:3624:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalNML.g:3630:2: ( ( () otherlv_1= '*' ) )
            // InternalNML.g:3631:2: ( () otherlv_1= '*' )
            {
            // InternalNML.g:3631:2: ( () otherlv_1= '*' )
            // InternalNML.g:3632:3: () otherlv_1= '*'
            {
            // InternalNML.g:3632:3: ()
            // InternalNML.g:3633:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getAsteriskKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "entryRuleInvalidLiteralExpCS"
    // InternalNML.g:3650:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // InternalNML.g:3650:60: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // InternalNML.g:3651:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvalidLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInvalidLiteralExpCS=ruleInvalidLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvalidLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvalidLiteralExpCS"


    // $ANTLR start "ruleInvalidLiteralExpCS"
    // InternalNML.g:3657:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalNML.g:3663:2: ( ( () otherlv_1= 'invalid' ) )
            // InternalNML.g:3664:2: ( () otherlv_1= 'invalid' )
            {
            // InternalNML.g:3664:2: ( () otherlv_1= 'invalid' )
            // InternalNML.g:3665:3: () otherlv_1= 'invalid'
            {
            // InternalNML.g:3665:3: ()
            // InternalNML.g:3666:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,93,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInvalidLiteralExpCSAccess().getInvalidKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvalidLiteralExpCS"


    // $ANTLR start "entryRuleNullLiteralExpCS"
    // InternalNML.g:3683:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // InternalNML.g:3683:57: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // InternalNML.g:3684:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNullLiteralExpCS=ruleNullLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullLiteralExpCS"


    // $ANTLR start "ruleNullLiteralExpCS"
    // InternalNML.g:3690:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalNML.g:3696:2: ( ( () otherlv_1= 'null' ) )
            // InternalNML.g:3697:2: ( () otherlv_1= 'null' )
            {
            // InternalNML.g:3697:2: ( () otherlv_1= 'null' )
            // InternalNML.g:3698:3: () otherlv_1= 'null'
            {
            // InternalNML.g:3698:3: ()
            // InternalNML.g:3699:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,94,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNullLiteralExpCSAccess().getNullKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullLiteralExpCS"


    // $ANTLR start "entryRuleTypeLiteralCS"
    // InternalNML.g:3716:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // InternalNML.g:3716:54: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // InternalNML.g:3717:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeLiteralCS=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLiteralCS"


    // $ANTLR start "ruleTypeLiteralCS"
    // InternalNML.g:3723:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_CollectionTypeCS_1 = null;

        EObject this_MapTypeCS_2 = null;

        EObject this_TupleTypeCS_3 = null;



        	enterRule();

        try {
            // InternalNML.g:3729:2: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) )
            // InternalNML.g:3730:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            {
            // InternalNML.g:3730:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            int alt77=4;
            switch ( input.LA(1) ) {
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
                {
                alt77=1;
                }
                break;
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
                {
                alt77=2;
                }
                break;
            case 72:
                {
                alt77=3;
                }
                break;
            case 73:
                {
                alt77=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalNML.g:3731:3: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrimitiveTypeCS_0=rulePrimitiveTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveTypeCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:3743:3: this_CollectionTypeCS_1= ruleCollectionTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getCollectionTypeCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CollectionTypeCS_1=ruleCollectionTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionTypeCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNML.g:3755:3: this_MapTypeCS_2= ruleMapTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getMapTypeCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MapTypeCS_2=ruleMapTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MapTypeCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNML.g:3767:3: this_TupleTypeCS_3= ruleTupleTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getTupleTypeCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TupleTypeCS_3=ruleTupleTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleTypeCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLiteralCS"


    // $ANTLR start "entryRuleTypeLiteralWithMultiplicityCS"
    // InternalNML.g:3782:1: entryRuleTypeLiteralWithMultiplicityCS returns [EObject current=null] : iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF ;
    public final EObject entryRuleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralWithMultiplicityCS = null;


        try {
            // InternalNML.g:3782:70: (iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF )
            // InternalNML.g:3783:2: iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeLiteralWithMultiplicityCS=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralWithMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLiteralWithMultiplicityCS"


    // $ANTLR start "ruleTypeLiteralWithMultiplicityCS"
    // InternalNML.g:3789:1: ruleTypeLiteralWithMultiplicityCS returns [EObject current=null] : (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeLiteralCS_0 = null;

        EObject lv_ownedMultiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalNML.g:3795:2: ( (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // InternalNML.g:3796:2: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // InternalNML.g:3796:2: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            // InternalNML.g:3797:3: this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_63);
            this_TypeLiteralCS_0=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TypeLiteralCS_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalNML.g:3808:3: ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==41) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalNML.g:3809:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    {
                    // InternalNML.g:3809:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    // InternalNML.g:3810:5: lv_ownedMultiplicity_1_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedMultiplicity_1_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeLiteralWithMultiplicityCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedMultiplicity",
                      						lv_ownedMultiplicity_1_0,
                      						"org.eclipse.ocl.xtext.base.Base.MultiplicityCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLiteralWithMultiplicityCS"


    // $ANTLR start "entryRuleTypeLiteralExpCS"
    // InternalNML.g:3831:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // InternalNML.g:3831:57: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // InternalNML.g:3832:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeLiteralExpCS=ruleTypeLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLiteralExpCS"


    // $ANTLR start "ruleTypeLiteralExpCS"
    // InternalNML.g:3838:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;



        	enterRule();

        try {
            // InternalNML.g:3844:2: ( ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) )
            // InternalNML.g:3845:2: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            {
            // InternalNML.g:3845:2: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            // InternalNML.g:3846:3: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            {
            // InternalNML.g:3846:3: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            // InternalNML.g:3847:4: lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralWithMultiplicityCSParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedType_0_0=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getTypeLiteralExpCSRule());
              				}
              				set(
              					current,
              					"ownedType",
              					lv_ownedType_0_0,
              					"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeLiteralWithMultiplicityCS");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLiteralExpCS"


    // $ANTLR start "entryRuleTypeNameExpCS"
    // InternalNML.g:3867:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // InternalNML.g:3867:54: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // InternalNML.g:3868:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeNameExpCS=ruleTypeNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeNameExpCS"


    // $ANTLR start "ruleTypeNameExpCS"
    // InternalNML.g:3874:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedCurlyBracketedClause_1_0 = null;

        EObject lv_ownedPatternGuard_3_0 = null;



        	enterRule();

        try {
            // InternalNML.g:3880:2: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) )
            // InternalNML.g:3881:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            {
            // InternalNML.g:3881:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            // InternalNML.g:3882:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            {
            // InternalNML.g:3882:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalNML.g:3883:4: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalNML.g:3883:4: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalNML.g:3884:5: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_64);
            lv_ownedPathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_0_0,
              						"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:3901:3: ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==17) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalNML.g:3902:4: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    {
                    // InternalNML.g:3902:4: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) )
                    // InternalNML.g:3903:5: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    {
                    // InternalNML.g:3903:5: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    // InternalNML.g:3904:6: lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_64);
                    lv_ownedCurlyBracketedClause_1_0=ruleCurlyBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedCurlyBracketedClause",
                      							lv_ownedCurlyBracketedClause_1_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CurlyBracketedClauseCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNML.g:3921:4: (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==17) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalNML.g:3922:5: otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}'
                            {
                            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_56); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getTypeNameExpCSAccess().getLeftCurlyBracketKeyword_1_1_0());
                              				
                            }
                            // InternalNML.g:3926:5: ( (lv_ownedPatternGuard_3_0= ruleExpCS ) )
                            // InternalNML.g:3927:6: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            {
                            // InternalNML.g:3927:6: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            // InternalNML.g:3928:7: lv_ownedPatternGuard_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPatternGuardExpCSParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_13);
                            lv_ownedPatternGuard_3_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedPatternGuard",
                              								lv_ownedPatternGuard_3_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getTypeNameExpCSAccess().getRightCurlyBracketKeyword_1_1_2());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeNameExpCS"


    // $ANTLR start "entryRuleTypeExpWithoutMultiplicityCS"
    // InternalNML.g:3955:1: entryRuleTypeExpWithoutMultiplicityCS returns [EObject current=null] : iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF ;
    public final EObject entryRuleTypeExpWithoutMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpWithoutMultiplicityCS = null;


        try {
            // InternalNML.g:3955:69: (iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF )
            // InternalNML.g:3956:2: iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeExpWithoutMultiplicityCS=ruleTypeExpWithoutMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpWithoutMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeExpWithoutMultiplicityCS"


    // $ANTLR start "ruleTypeExpWithoutMultiplicityCS"
    // InternalNML.g:3962:1: ruleTypeExpWithoutMultiplicityCS returns [EObject current=null] : (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ;
    public final EObject ruleTypeExpWithoutMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;

        EObject this_CollectionPatternCS_2 = null;



        	enterRule();

        try {
            // InternalNML.g:3968:2: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) )
            // InternalNML.g:3969:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )
            {
            // InternalNML.g:3969:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )
            int alt81=3;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // InternalNML.g:3970:3: this_TypeNameExpCS_0= ruleTypeNameExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSAccess().getTypeNameExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypeNameExpCS_0=ruleTypeNameExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeNameExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:3982:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypeLiteralCS_1=ruleTypeLiteralCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeLiteralCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNML.g:3994:3: this_CollectionPatternCS_2= ruleCollectionPatternCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSAccess().getCollectionPatternCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CollectionPatternCS_2=ruleCollectionPatternCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionPatternCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeExpWithoutMultiplicityCS"


    // $ANTLR start "entryRuleTypeExpCS"
    // InternalNML.g:4009:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // InternalNML.g:4009:50: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // InternalNML.g:4010:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeExpCS=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeExpCS"


    // $ANTLR start "ruleTypeExpCS"
    // InternalNML.g:4016:1: ruleTypeExpCS returns [EObject current=null] : (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeExpWithoutMultiplicityCS_0 = null;

        EObject lv_ownedMultiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalNML.g:4022:2: ( (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // InternalNML.g:4023:2: (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // InternalNML.g:4023:2: (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            // InternalNML.g:4024:3: this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeExpWithoutMultiplicityCSParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_63);
            this_TypeExpWithoutMultiplicityCS_0=ruleTypeExpWithoutMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TypeExpWithoutMultiplicityCS_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalNML.g:4035:3: ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==41) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalNML.g:4036:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    {
                    // InternalNML.g:4036:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    // InternalNML.g:4037:5: lv_ownedMultiplicity_1_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeExpCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedMultiplicity_1_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeExpCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedMultiplicity",
                      						lv_ownedMultiplicity_1_0,
                      						"org.eclipse.ocl.xtext.base.Base.MultiplicityCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeExpCS"


    // $ANTLR start "entryRuleExpCS"
    // InternalNML.g:4058:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // InternalNML.g:4058:46: (iv_ruleExpCS= ruleExpCS EOF )
            // InternalNML.g:4059:2: iv_ruleExpCS= ruleExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpCS=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpCS"


    // $ANTLR start "ruleExpCS"
    // InternalNML.g:4065:1: ruleExpCS returns [EObject current=null] : ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;

        EObject this_PrefixedLetExpCS_4 = null;



        	enterRule();

        try {
            // InternalNML.g:4071:2: ( ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) )
            // InternalNML.g:4072:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            {
            // InternalNML.g:4072:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            int alt84=2;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // InternalNML.g:4073:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    {
                    // InternalNML.g:4073:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    // InternalNML.g:4074:4: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedPrimaryExpCSParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_65);
                    this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PrefixedPrimaryExpCS_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalNML.g:4085:4: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( ((LA83_0>=38 && LA83_0<=39)||LA83_0==46||LA83_0==48||LA83_0==50||(LA83_0>=52 && LA83_0<=55)||(LA83_0>=57 && LA83_0<=58)||(LA83_0>=61 && LA83_0<=71)) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // InternalNML.g:4086:5: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                            {
                            // InternalNML.g:4086:5: ()
                            // InternalNML.g:4087:6: 
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						current = forceCreateModelElementAndSet(
                              							grammarAccess.getExpCSAccess().getInfixExpCSOwnedLeftAction_0_1_0(),
                              							current);
                              					
                            }

                            }

                            // InternalNML.g:4096:5: ( (lv_name_2_0= ruleBinaryOperatorName ) )
                            // InternalNML.g:4097:6: (lv_name_2_0= ruleBinaryOperatorName )
                            {
                            // InternalNML.g:4097:6: (lv_name_2_0= ruleBinaryOperatorName )
                            // InternalNML.g:4098:7: lv_name_2_0= ruleBinaryOperatorName
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_56);
                            lv_name_2_0=ruleBinaryOperatorName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpCSRule());
                              							}
                              							set(
                              								current,
                              								"name",
                              								lv_name_2_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.BinaryOperatorName");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalNML.g:4115:5: ( (lv_ownedRight_3_0= ruleExpCS ) )
                            // InternalNML.g:4116:6: (lv_ownedRight_3_0= ruleExpCS )
                            {
                            // InternalNML.g:4116:6: (lv_ownedRight_3_0= ruleExpCS )
                            // InternalNML.g:4117:7: lv_ownedRight_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedRight_3_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedRight",
                              								lv_ownedRight_3_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNML.g:4137:3: this_PrefixedLetExpCS_4= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedLetExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrefixedLetExpCS_4=rulePrefixedLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrefixedLetExpCS_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpCS"


    // $ANTLR start "entryRulePrefixedLetExpCS"
    // InternalNML.g:4152:1: entryRulePrefixedLetExpCS returns [EObject current=null] : iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF ;
    public final EObject entryRulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedLetExpCS = null;


        try {
            // InternalNML.g:4152:57: (iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF )
            // InternalNML.g:4153:2: iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrefixedLetExpCS=rulePrefixedLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixedLetExpCS"


    // $ANTLR start "rulePrefixedLetExpCS"
    // InternalNML.g:4159:1: rulePrefixedLetExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) ;
    public final EObject rulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_LetExpCS_3 = null;



        	enterRule();

        try {
            // InternalNML.g:4165:2: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) )
            // InternalNML.g:4166:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            {
            // InternalNML.g:4166:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=58 && LA85_0<=60)) ) {
                alt85=1;
            }
            else if ( (LA85_0==103) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalNML.g:4167:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    {
                    // InternalNML.g:4167:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    // InternalNML.g:4168:4: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    {
                    // InternalNML.g:4168:4: ()
                    // InternalNML.g:4169:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixedLetExpCSAccess().getPrefixExpCSAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNML.g:4178:4: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // InternalNML.g:4179:5: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // InternalNML.g:4179:5: (lv_name_1_0= ruleUnaryOperatorName )
                    // InternalNML.g:4180:6: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_name_1_0=ruleUnaryOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedLetExpCSRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnaryOperatorName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNML.g:4197:4: ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    // InternalNML.g:4198:5: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    {
                    // InternalNML.g:4198:5: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    // InternalNML.g:4199:6: lv_ownedRight_2_0= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getOwnedRightPrefixedLetExpCSParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedRight_2_0=rulePrefixedLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedLetExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedRight",
                      							lv_ownedRight_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PrefixedLetExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNML.g:4218:3: this_LetExpCS_3= ruleLetExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getLetExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LetExpCS_3=ruleLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LetExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixedLetExpCS"


    // $ANTLR start "entryRulePrefixedPrimaryExpCS"
    // InternalNML.g:4233:1: entryRulePrefixedPrimaryExpCS returns [EObject current=null] : iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF ;
    public final EObject entryRulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedPrimaryExpCS = null;


        try {
            // InternalNML.g:4233:61: (iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF )
            // InternalNML.g:4234:2: iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrefixedPrimaryExpCS=rulePrefixedPrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedPrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixedPrimaryExpCS"


    // $ANTLR start "rulePrefixedPrimaryExpCS"
    // InternalNML.g:4240:1: rulePrefixedPrimaryExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) ;
    public final EObject rulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_PrimaryExpCS_3 = null;



        	enterRule();

        try {
            // InternalNML.g:4246:2: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) )
            // InternalNML.g:4247:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            {
            // InternalNML.g:4247:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=58 && LA86_0<=60)) ) {
                alt86=1;
            }
            else if ( ((LA86_0>=RULE_INT && LA86_0<=RULE_SINGLE_QUOTED_STRING)||LA86_0==43||LA86_0==61||(LA86_0>=72 && LA86_0<=86)||LA86_0==89||(LA86_0>=91 && LA86_0<=94)||LA86_0==98||LA86_0==104) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalNML.g:4248:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    {
                    // InternalNML.g:4248:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    // InternalNML.g:4249:4: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    {
                    // InternalNML.g:4249:4: ()
                    // InternalNML.g:4250:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixedPrimaryExpCSAccess().getPrefixExpCSAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalNML.g:4259:4: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // InternalNML.g:4260:5: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // InternalNML.g:4260:5: (lv_name_1_0= ruleUnaryOperatorName )
                    // InternalNML.g:4261:6: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_66);
                    lv_name_1_0=ruleUnaryOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedPrimaryExpCSRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnaryOperatorName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNML.g:4278:4: ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    // InternalNML.g:4279:5: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    {
                    // InternalNML.g:4279:5: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    // InternalNML.g:4280:6: lv_ownedRight_2_0= rulePrefixedPrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getOwnedRightPrefixedPrimaryExpCSParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedRight_2_0=rulePrefixedPrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedPrimaryExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedRight",
                      							lv_ownedRight_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PrefixedPrimaryExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNML.g:4299:3: this_PrimaryExpCS_3= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getPrimaryExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrimaryExpCS_3=rulePrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimaryExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixedPrimaryExpCS"


    // $ANTLR start "entryRulePrimaryExpCS"
    // InternalNML.g:4314:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // InternalNML.g:4314:53: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // InternalNML.g:4315:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimaryExpCS=rulePrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpCS"


    // $ANTLR start "rulePrimaryExpCS"
    // InternalNML.g:4321:1: rulePrimaryExpCS returns [EObject current=null] : (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS ) ;
    public final EObject rulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NestedExpCS_0 = null;

        EObject this_IfExpCS_1 = null;

        EObject this_SelfExpCS_2 = null;

        EObject this_PrimitiveLiteralExpCS_3 = null;

        EObject this_TupleLiteralExpCS_4 = null;

        EObject this_MapLiteralExpCS_5 = null;

        EObject this_CollectionLiteralExpCS_6 = null;

        EObject this_LambdaLiteralExpCS_7 = null;

        EObject this_TypeLiteralExpCS_8 = null;

        EObject this_NameExpCS_9 = null;



        	enterRule();

        try {
            // InternalNML.g:4327:2: ( (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS ) )
            // InternalNML.g:4328:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS )
            {
            // InternalNML.g:4328:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS )
            int alt87=10;
            alt87 = dfa87.predict(input);
            switch (alt87) {
                case 1 :
                    // InternalNML.g:4329:3: this_NestedExpCS_0= ruleNestedExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedExpCS_0=ruleNestedExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:4341:3: this_IfExpCS_1= ruleIfExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IfExpCS_1=ruleIfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfExpCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNML.g:4353:3: this_SelfExpCS_2= ruleSelfExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSelfExpCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SelfExpCS_2=ruleSelfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SelfExpCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNML.g:4365:3: this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrimitiveLiteralExpCS_3=rulePrimitiveLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveLiteralExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNML.g:4377:3: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTupleLiteralExpCSParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TupleLiteralExpCS_4=ruleTupleLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleLiteralExpCS_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNML.g:4389:3: this_MapLiteralExpCS_5= ruleMapLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getMapLiteralExpCSParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MapLiteralExpCS_5=ruleMapLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MapLiteralExpCS_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalNML.g:4401:3: this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getCollectionLiteralExpCSParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CollectionLiteralExpCS_6=ruleCollectionLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionLiteralExpCS_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalNML.g:4413:3: this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getLambdaLiteralExpCSParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LambdaLiteralExpCS_7=ruleLambdaLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LambdaLiteralExpCS_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalNML.g:4425:3: this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTypeLiteralExpCSParserRuleCall_8());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypeLiteralExpCS_8=ruleTypeLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeLiteralExpCS_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalNML.g:4437:3: this_NameExpCS_9= ruleNameExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNameExpCSParserRuleCall_9());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NameExpCS_9=ruleNameExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NameExpCS_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpCS"


    // $ANTLR start "entryRuleNameExpCS"
    // InternalNML.g:4452:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // InternalNML.g:4452:50: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // InternalNML.g:4453:2: iv_ruleNameExpCS= ruleNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNameExpCS=ruleNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameExpCS"


    // $ANTLR start "ruleNameExpCS"
    // InternalNML.g:4459:1: ruleNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? ) ;
    public final EObject ruleNameExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_isPre_4_0=null;
        Token otherlv_5=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedSquareBracketedClauses_1_0 = null;

        EObject lv_ownedRoundBracketedClause_2_0 = null;

        EObject lv_ownedCurlyBracketedClause_3_0 = null;



        	enterRule();

        try {
            // InternalNML.g:4465:2: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? ) )
            // InternalNML.g:4466:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? )
            {
            // InternalNML.g:4466:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? )
            // InternalNML.g:4467:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )?
            {
            // InternalNML.g:4467:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalNML.g:4468:4: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalNML.g:4468:4: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalNML.g:4469:5: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_67);
            lv_ownedPathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_0_0,
              						"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:4486:3: ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==41) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalNML.g:4487:4: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    {
            	    // InternalNML.g:4487:4: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    // InternalNML.g:4488:5: lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedSquareBracketedClausesSquareBracketedClauseCSParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_67);
            	    lv_ownedSquareBracketedClauses_1_0=ruleSquareBracketedClauseCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedSquareBracketedClauses",
            	      						lv_ownedSquareBracketedClauses_1_0,
            	      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.SquareBracketedClauseCS");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            // InternalNML.g:4505:3: ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==43) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalNML.g:4506:4: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    {
                    // InternalNML.g:4506:4: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    // InternalNML.g:4507:5: lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_68);
                    lv_ownedRoundBracketedClause_2_0=ruleRoundBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedRoundBracketedClause",
                      						lv_ownedRoundBracketedClause_2_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.RoundBracketedClauseCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalNML.g:4524:3: ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==17) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalNML.g:4525:4: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    {
                    // InternalNML.g:4525:4: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    // InternalNML.g:4526:5: lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_69);
                    lv_ownedCurlyBracketedClause_3_0=ruleCurlyBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedCurlyBracketedClause",
                      						lv_ownedCurlyBracketedClause_3_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CurlyBracketedClauseCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalNML.g:4543:3: ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==95) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalNML.g:4544:4: ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre'
                    {
                    // InternalNML.g:4544:4: ( (lv_isPre_4_0= '@' ) )
                    // InternalNML.g:4545:5: (lv_isPre_4_0= '@' )
                    {
                    // InternalNML.g:4545:5: (lv_isPre_4_0= '@' )
                    // InternalNML.g:4546:6: lv_isPre_4_0= '@'
                    {
                    lv_isPre_4_0=(Token)match(input,95,FollowSets000.FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isPre_4_0, grammarAccess.getNameExpCSAccess().getIsPreCommercialAtKeyword_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNameExpCSRule());
                      						}
                      						setWithLastConsumed(current, "isPre", true, "@");
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getNameExpCSAccess().getPreKeyword_4_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameExpCS"


    // $ANTLR start "entryRuleCurlyBracketedClauseCS"
    // InternalNML.g:4567:1: entryRuleCurlyBracketedClauseCS returns [EObject current=null] : iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF ;
    public final EObject entryRuleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurlyBracketedClauseCS = null;


        try {
            // InternalNML.g:4567:63: (iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF )
            // InternalNML.g:4568:2: iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCurlyBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCurlyBracketedClauseCS=ruleCurlyBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCurlyBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCurlyBracketedClauseCS"


    // $ANTLR start "ruleCurlyBracketedClauseCS"
    // InternalNML.g:4574:1: ruleCurlyBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalNML.g:4580:2: ( ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalNML.g:4581:2: ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalNML.g:4581:2: ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' )
            // InternalNML.g:4582:3: () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalNML.g:4582:3: ()
            // InternalNML.g:4583:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCurlyBracketedClauseCSAccess().getCurlyBracketedClauseCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCurlyBracketedClauseCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNML.g:4596:3: ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( ((LA93_0>=RULE_SIMPLE_ID && LA93_0<=RULE_SINGLE_QUOTED_STRING)) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalNML.g:4597:4: ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                    {
                    // InternalNML.g:4597:4: ( (lv_ownedParts_2_0= ruleShadowPartCS ) )
                    // InternalNML.g:4598:5: (lv_ownedParts_2_0= ruleShadowPartCS )
                    {
                    // InternalNML.g:4598:5: (lv_ownedParts_2_0= ruleShadowPartCS )
                    // InternalNML.g:4599:6: lv_ownedParts_2_0= ruleShadowPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_53);
                    lv_ownedParts_2_0=ruleShadowPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCurlyBracketedClauseCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ShadowPartCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNML.g:4616:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==27) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // InternalNML.g:4617:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCurlyBracketedClauseCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNML.g:4621:5: ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                    	    // InternalNML.g:4622:6: (lv_ownedParts_4_0= ruleShadowPartCS )
                    	    {
                    	    // InternalNML.g:4622:6: (lv_ownedParts_4_0= ruleShadowPartCS )
                    	    // InternalNML.g:4623:7: lv_ownedParts_4_0= ruleShadowPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_53);
                    	    lv_ownedParts_4_0=ruleShadowPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCurlyBracketedClauseCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ShadowPartCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop92;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCurlyBracketedClauseCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCurlyBracketedClauseCS"


    // $ANTLR start "entryRuleRoundBracketedClauseCS"
    // InternalNML.g:4650:1: entryRuleRoundBracketedClauseCS returns [EObject current=null] : iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF ;
    public final EObject entryRuleRoundBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundBracketedClauseCS = null;


        try {
            // InternalNML.g:4650:63: (iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF )
            // InternalNML.g:4651:2: iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRoundBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRoundBracketedClauseCS=ruleRoundBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoundBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoundBracketedClauseCS"


    // $ANTLR start "ruleRoundBracketedClauseCS"
    // InternalNML.g:4657:1: ruleRoundBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleRoundBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_ownedArguments_2_0 = null;

        EObject lv_ownedArguments_3_1 = null;

        EObject lv_ownedArguments_3_2 = null;

        EObject lv_ownedArguments_3_3 = null;



        	enterRule();

        try {
            // InternalNML.g:4663:2: ( ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' ) )
            // InternalNML.g:4664:2: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' )
            {
            // InternalNML.g:4664:2: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' )
            // InternalNML.g:4665:3: () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')'
            {
            // InternalNML.g:4665:3: ()
            // InternalNML.g:4666:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRoundBracketedClauseCSAccess().getRoundBracketedClauseCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRoundBracketedClauseCSAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalNML.g:4679:3: ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( ((LA96_0>=RULE_INT && LA96_0<=RULE_SINGLE_QUOTED_STRING)||LA96_0==23||LA96_0==43||(LA96_0>=58 && LA96_0<=61)||(LA96_0>=72 && LA96_0<=86)||LA96_0==89||(LA96_0>=91 && LA96_0<=94)||LA96_0==98||(LA96_0>=103 && LA96_0<=104)) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalNML.g:4680:4: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )*
                    {
                    // InternalNML.g:4680:4: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) )
                    // InternalNML.g:4681:5: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    {
                    // InternalNML.g:4681:5: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    // InternalNML.g:4682:6: lv_ownedArguments_2_0= ruleNavigatingArgCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingArgCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_73);
                    lv_ownedArguments_2_0=ruleNavigatingArgCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedArguments",
                      							lv_ownedArguments_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingArgCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNML.g:4699:4: ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==24||LA95_0==27||LA95_0==97) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalNML.g:4700:5: ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) )
                    	    {
                    	    // InternalNML.g:4700:5: ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) )
                    	    // InternalNML.g:4701:6: (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS )
                    	    {
                    	    // InternalNML.g:4701:6: (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS )
                    	    int alt94=3;
                    	    switch ( input.LA(1) ) {
                    	    case 27:
                    	        {
                    	        alt94=1;
                    	        }
                    	        break;
                    	    case 24:
                    	        {
                    	        alt94=2;
                    	        }
                    	        break;
                    	    case 97:
                    	        {
                    	        alt94=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 94, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt94) {
                    	        case 1 :
                    	            // InternalNML.g:4702:7: lv_ownedArguments_3_1= ruleNavigatingCommaArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_1_0_0());
                    	              						
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_73);
                    	            lv_ownedArguments_3_1=ruleNavigatingCommaArgCS();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"ownedArguments",
                    	              								lv_ownedArguments_3_1,
                    	              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingCommaArgCS");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalNML.g:4718:7: lv_ownedArguments_3_2= ruleNavigatingSemiArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingSemiArgCSParserRuleCall_2_1_0_1());
                    	              						
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_73);
                    	            lv_ownedArguments_3_2=ruleNavigatingSemiArgCS();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"ownedArguments",
                    	              								lv_ownedArguments_3_2,
                    	              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingSemiArgCS");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalNML.g:4734:7: lv_ownedArguments_3_3= ruleNavigatingBarArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingBarArgCSParserRuleCall_2_1_0_2());
                    	              						
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_73);
                    	            lv_ownedArguments_3_3=ruleNavigatingBarArgCS();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"ownedArguments",
                    	              								lv_ownedArguments_3_3,
                    	              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingBarArgCS");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRoundBracketedClauseCSAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoundBracketedClauseCS"


    // $ANTLR start "entryRuleSquareBracketedClauseCS"
    // InternalNML.g:4761:1: entryRuleSquareBracketedClauseCS returns [EObject current=null] : iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF ;
    public final EObject entryRuleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquareBracketedClauseCS = null;


        try {
            // InternalNML.g:4761:64: (iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF )
            // InternalNML.g:4762:2: iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSquareBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSquareBracketedClauseCS=ruleSquareBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSquareBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSquareBracketedClauseCS"


    // $ANTLR start "ruleSquareBracketedClauseCS"
    // InternalNML.g:4768:1: ruleSquareBracketedClauseCS returns [EObject current=null] : (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedTerms_1_0 = null;

        EObject lv_ownedTerms_3_0 = null;



        	enterRule();

        try {
            // InternalNML.g:4774:2: ( (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) )
            // InternalNML.g:4775:2: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            {
            // InternalNML.g:4775:2: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            // InternalNML.g:4776:3: otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSquareBracketedClauseCSAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalNML.g:4780:3: ( (lv_ownedTerms_1_0= ruleExpCS ) )
            // InternalNML.g:4781:4: (lv_ownedTerms_1_0= ruleExpCS )
            {
            // InternalNML.g:4781:4: (lv_ownedTerms_1_0= ruleExpCS )
            // InternalNML.g:4782:5: lv_ownedTerms_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_35);
            lv_ownedTerms_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSquareBracketedClauseCSRule());
              					}
              					add(
              						current,
              						"ownedTerms",
              						lv_ownedTerms_1_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:4799:3: (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==27) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalNML.g:4800:4: otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_56); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSquareBracketedClauseCSAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalNML.g:4804:4: ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    // InternalNML.g:4805:5: (lv_ownedTerms_3_0= ruleExpCS )
            	    {
            	    // InternalNML.g:4805:5: (lv_ownedTerms_3_0= ruleExpCS )
            	    // InternalNML.g:4806:6: lv_ownedTerms_3_0= ruleExpCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_35);
            	    lv_ownedTerms_3_0=ruleExpCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSquareBracketedClauseCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedTerms",
            	      							lv_ownedTerms_3_0,
            	      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);

            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSquareBracketedClauseCSAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSquareBracketedClauseCS"


    // $ANTLR start "entryRuleNavigatingArgCS"
    // InternalNML.g:4832:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // InternalNML.g:4832:56: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // InternalNML.g:4833:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingArgCS=ruleNavigatingArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingArgCS"


    // $ANTLR start "ruleNavigatingArgCS"
    // InternalNML.g:4839:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) ) ;
    public final EObject ruleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_ownedNameExpression_0_0 = null;

        EObject lv_ownedCoIterator_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;

        EObject lv_ownedType_6_0 = null;

        EObject lv_ownedCoIterator_8_0 = null;

        EObject lv_ownedInitExpression_10_0 = null;

        EObject lv_ownedType_12_0 = null;

        EObject lv_ownedCoIterator_14_0 = null;

        EObject lv_ownedInitExpression_16_0 = null;

        EObject lv_ownedType_18_0 = null;



        	enterRule();

        try {
            // InternalNML.g:4845:2: ( ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) ) )
            // InternalNML.g:4846:2: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) )
            {
            // InternalNML.g:4846:2: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( ((LA104_0>=RULE_INT && LA104_0<=RULE_SINGLE_QUOTED_STRING)||LA104_0==43||(LA104_0>=58 && LA104_0<=61)||(LA104_0>=72 && LA104_0<=86)||LA104_0==89||(LA104_0>=91 && LA104_0<=94)||LA104_0==98||(LA104_0>=103 && LA104_0<=104)) ) {
                alt104=1;
            }
            else if ( (LA104_0==23) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // InternalNML.g:4847:3: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? )
                    {
                    // InternalNML.g:4847:3: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? )
                    // InternalNML.g:4848:4: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?
                    {
                    // InternalNML.g:4848:4: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) )
                    // InternalNML.g:4849:5: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    {
                    // InternalNML.g:4849:5: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    // InternalNML.g:4850:6: lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_74);
                    lv_ownedNameExpression_0_0=ruleNavigatingArgExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedNameExpression",
                      							lv_ownedNameExpression_0_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingArgExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNML.g:4867:4: ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?
                    int alt103=4;
                    alt103 = dfa103.predict(input);
                    switch (alt103) {
                        case 1 :
                            // InternalNML.g:4868:5: (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            {
                            // InternalNML.g:4868:5: (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            // InternalNML.g:4869:6: otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            {
                            otherlv_1=(Token)match(input,90,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getLessThanSignHyphenMinusKeyword_0_1_0_0());
                              					
                            }
                            // InternalNML.g:4873:6: ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) )
                            // InternalNML.g:4874:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
                            {
                            // InternalNML.g:4874:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
                            // InternalNML.g:4875:8: lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_75);
                            lv_ownedCoIterator_2_0=ruleCoIteratorVariableCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedCoIterator",
                              									lv_ownedCoIterator_2_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CoIteratorVariableCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalNML.g:4892:6: (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            int alt98=2;
                            int LA98_0 = input.LA(1);

                            if ( (LA98_0==46) ) {
                                alt98=1;
                            }
                            switch (alt98) {
                                case 1 :
                                    // InternalNML.g:4893:7: otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    {
                                    otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_56); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_0_1_0_2_0());
                                      						
                                    }
                                    // InternalNML.g:4897:7: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    // InternalNML.g:4898:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    {
                                    // InternalNML.g:4898:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    // InternalNML.g:4899:9: lv_ownedInitExpression_4_0= ruleExpCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_0_2_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_2);
                                    lv_ownedInitExpression_4_0=ruleExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedInitExpression",
                                      										lv_ownedInitExpression_4_0,
                                      										"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalNML.g:4919:5: (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
                            {
                            // InternalNML.g:4919:5: (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
                            // InternalNML.g:4920:6: otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
                            {
                            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_48); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_0_1_1_0());
                              					
                            }
                            // InternalNML.g:4924:6: ( (lv_ownedType_6_0= ruleTypeExpCS ) )
                            // InternalNML.g:4925:7: (lv_ownedType_6_0= ruleTypeExpCS )
                            {
                            // InternalNML.g:4925:7: (lv_ownedType_6_0= ruleTypeExpCS )
                            // InternalNML.g:4926:8: lv_ownedType_6_0= ruleTypeExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_1_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_76);
                            lv_ownedType_6_0=ruleTypeExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedType",
                              									lv_ownedType_6_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalNML.g:4943:6: (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )?
                            int alt99=2;
                            int LA99_0 = input.LA(1);

                            if ( (LA99_0==90) ) {
                                alt99=1;
                            }
                            switch (alt99) {
                                case 1 :
                                    // InternalNML.g:4944:7: otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                                    {
                                    otherlv_7=(Token)match(input,90,FollowSets000.FOLLOW_3); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_7, grammarAccess.getNavigatingArgCSAccess().getLessThanSignHyphenMinusKeyword_0_1_1_2_0());
                                      						
                                    }
                                    // InternalNML.g:4948:7: ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                                    // InternalNML.g:4949:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                                    {
                                    // InternalNML.g:4949:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                                    // InternalNML.g:4950:9: lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_1_2_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_75);
                                    lv_ownedCoIterator_8_0=ruleCoIteratorVariableCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedCoIterator",
                                      										lv_ownedCoIterator_8_0,
                                      										"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CoIteratorVariableCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalNML.g:4968:6: (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
                            int alt100=2;
                            int LA100_0 = input.LA(1);

                            if ( (LA100_0==46) ) {
                                alt100=1;
                            }
                            switch (alt100) {
                                case 1 :
                                    // InternalNML.g:4969:7: otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                                    {
                                    otherlv_9=(Token)match(input,46,FollowSets000.FOLLOW_56); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_9, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_0_1_1_3_0());
                                      						
                                    }
                                    // InternalNML.g:4973:7: ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                                    // InternalNML.g:4974:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                                    {
                                    // InternalNML.g:4974:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                                    // InternalNML.g:4975:9: lv_ownedInitExpression_10_0= ruleExpCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_1_3_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_2);
                                    lv_ownedInitExpression_10_0=ruleExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedInitExpression",
                                      										lv_ownedInitExpression_10_0,
                                      										"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalNML.g:4995:5: ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
                            {
                            // InternalNML.g:4995:5: ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
                            // InternalNML.g:4996:6: (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
                            {
                            // InternalNML.g:4996:6: (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )?
                            int alt101=2;
                            int LA101_0 = input.LA(1);

                            if ( (LA101_0==23) ) {
                                alt101=1;
                            }
                            switch (alt101) {
                                case 1 :
                                    // InternalNML.g:4997:7: otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                                    {
                                    otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_48); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_11, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_0_1_2_0_0());
                                      						
                                    }
                                    // InternalNML.g:5001:7: ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                                    // InternalNML.g:5002:8: (lv_ownedType_12_0= ruleTypeExpCS )
                                    {
                                    // InternalNML.g:5002:8: (lv_ownedType_12_0= ruleTypeExpCS )
                                    // InternalNML.g:5003:9: lv_ownedType_12_0= ruleTypeExpCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_2_0_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_77);
                                    lv_ownedType_12_0=ruleTypeExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedType",
                                      										lv_ownedType_12_0,
                                      										"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalNML.g:5021:6: (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )?
                            int alt102=2;
                            int LA102_0 = input.LA(1);

                            if ( (LA102_0==90) ) {
                                alt102=1;
                            }
                            switch (alt102) {
                                case 1 :
                                    // InternalNML.g:5022:7: otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                                    {
                                    otherlv_13=(Token)match(input,90,FollowSets000.FOLLOW_3); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_13, grammarAccess.getNavigatingArgCSAccess().getLessThanSignHyphenMinusKeyword_0_1_2_1_0());
                                      						
                                    }
                                    // InternalNML.g:5026:7: ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                                    // InternalNML.g:5027:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                                    {
                                    // InternalNML.g:5027:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                                    // InternalNML.g:5028:9: lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_2_1_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_78);
                                    lv_ownedCoIterator_14_0=ruleCoIteratorVariableCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedCoIterator",
                                      										lv_ownedCoIterator_14_0,
                                      										"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CoIteratorVariableCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            otherlv_15=(Token)match(input,96,FollowSets000.FOLLOW_56); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_15, grammarAccess.getNavigatingArgCSAccess().getInKeyword_0_1_2_2());
                              					
                            }
                            // InternalNML.g:5050:6: ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
                            // InternalNML.g:5051:7: (lv_ownedInitExpression_16_0= ruleExpCS )
                            {
                            // InternalNML.g:5051:7: (lv_ownedInitExpression_16_0= ruleExpCS )
                            // InternalNML.g:5052:8: lv_ownedInitExpression_16_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_2_3_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_16_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedInitExpression",
                              									lv_ownedInitExpression_16_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNML.g:5073:3: (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) )
                    {
                    // InternalNML.g:5073:3: (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) )
                    // InternalNML.g:5074:4: otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) )
                    {
                    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalNML.g:5078:4: ( (lv_ownedType_18_0= ruleTypeExpCS ) )
                    // InternalNML.g:5079:5: (lv_ownedType_18_0= ruleTypeExpCS )
                    {
                    // InternalNML.g:5079:5: (lv_ownedType_18_0= ruleTypeExpCS )
                    // InternalNML.g:5080:6: lv_ownedType_18_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedType_18_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_18_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingArgCS"


    // $ANTLR start "entryRuleNavigatingBarArgCS"
    // InternalNML.g:5102:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // InternalNML.g:5102:59: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // InternalNML.g:5103:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingBarArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingBarArgCS=ruleNavigatingBarArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingBarArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingBarArgCS"


    // $ANTLR start "ruleNavigatingBarArgCS"
    // InternalNML.g:5109:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;



        	enterRule();

        try {
            // InternalNML.g:5115:2: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // InternalNML.g:5116:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // InternalNML.g:5116:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // InternalNML.g:5117:3: ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // InternalNML.g:5117:3: ( (lv_prefix_0_0= '|' ) )
            // InternalNML.g:5118:4: (lv_prefix_0_0= '|' )
            {
            // InternalNML.g:5118:4: (lv_prefix_0_0= '|' )
            // InternalNML.g:5119:5: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,97,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingBarArgCSAccess().getPrefixVerticalLineKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNavigatingBarArgCSRule());
              					}
              					setWithLastConsumed(current, "prefix", lv_prefix_0_0, "|");
              				
            }

            }


            }

            // InternalNML.g:5131:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalNML.g:5132:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalNML.g:5132:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalNML.g:5133:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_79);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
              					}
              					set(
              						current,
              						"ownedNameExpression",
              						lv_ownedNameExpression_1_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingArgExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:5150:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==23) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalNML.g:5151:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalNML.g:5155:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalNML.g:5156:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalNML.g:5156:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalNML.g:5157:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_75);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_3_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNML.g:5174:4: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==46) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // InternalNML.g:5175:5: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_56); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_2_2_0());
                              				
                            }
                            // InternalNML.g:5179:5: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalNML.g:5180:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalNML.g:5180:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalNML.g:5181:7: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_5_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingBarArgCS"


    // $ANTLR start "entryRuleNavigatingCommaArgCS"
    // InternalNML.g:5204:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // InternalNML.g:5204:61: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // InternalNML.g:5205:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingCommaArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingCommaArgCS=ruleNavigatingCommaArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingCommaArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingCommaArgCS"


    // $ANTLR start "ruleNavigatingCommaArgCS"
    // InternalNML.g:5211:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? ) ;
    public final EObject ruleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedCoIterator_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;

        EObject lv_ownedType_7_0 = null;

        EObject lv_ownedCoIterator_9_0 = null;

        EObject lv_ownedInitExpression_11_0 = null;

        EObject lv_ownedType_13_0 = null;

        EObject lv_ownedCoIterator_15_0 = null;

        EObject lv_ownedInitExpression_17_0 = null;



        	enterRule();

        try {
            // InternalNML.g:5217:2: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? ) )
            // InternalNML.g:5218:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? )
            {
            // InternalNML.g:5218:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? )
            // InternalNML.g:5219:3: ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?
            {
            // InternalNML.g:5219:3: ( (lv_prefix_0_0= ',' ) )
            // InternalNML.g:5220:4: (lv_prefix_0_0= ',' )
            {
            // InternalNML.g:5220:4: (lv_prefix_0_0= ',' )
            // InternalNML.g:5221:5: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,27,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingCommaArgCSAccess().getPrefixCommaKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
              					}
              					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ",");
              				
            }

            }


            }

            // InternalNML.g:5233:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalNML.g:5234:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalNML.g:5234:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalNML.g:5235:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_74);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
              					}
              					set(
              						current,
              						"ownedNameExpression",
              						lv_ownedNameExpression_1_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingArgExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:5252:3: ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?
            int alt112=4;
            alt112 = dfa112.predict(input);
            switch (alt112) {
                case 1 :
                    // InternalNML.g:5253:4: (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    {
                    // InternalNML.g:5253:4: (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    // InternalNML.g:5254:5: otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,90,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getLessThanSignHyphenMinusKeyword_2_0_0());
                      				
                    }
                    // InternalNML.g:5258:5: ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) )
                    // InternalNML.g:5259:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
                    {
                    // InternalNML.g:5259:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
                    // InternalNML.g:5260:7: lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_75);
                    lv_ownedCoIterator_3_0=ruleCoIteratorVariableCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							set(
                      								current,
                      								"ownedCoIterator",
                      								lv_ownedCoIterator_3_0,
                      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CoIteratorVariableCS");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalNML.g:5277:5: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==46) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // InternalNML.g:5278:6: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_56); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_2_0_2_0());
                              					
                            }
                            // InternalNML.g:5282:6: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalNML.g:5283:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalNML.g:5283:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalNML.g:5284:8: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_2_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedInitExpression",
                              									lv_ownedInitExpression_5_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNML.g:5304:4: (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
                    {
                    // InternalNML.g:5304:4: (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
                    // InternalNML.g:5305:5: otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_1_0());
                      				
                    }
                    // InternalNML.g:5309:5: ( (lv_ownedType_7_0= ruleTypeExpCS ) )
                    // InternalNML.g:5310:6: (lv_ownedType_7_0= ruleTypeExpCS )
                    {
                    // InternalNML.g:5310:6: (lv_ownedType_7_0= ruleTypeExpCS )
                    // InternalNML.g:5311:7: lv_ownedType_7_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_76);
                    lv_ownedType_7_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							set(
                      								current,
                      								"ownedType",
                      								lv_ownedType_7_0,
                      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalNML.g:5328:5: (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==90) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // InternalNML.g:5329:6: otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                            {
                            otherlv_8=(Token)match(input,90,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getNavigatingCommaArgCSAccess().getLessThanSignHyphenMinusKeyword_2_1_2_0());
                              					
                            }
                            // InternalNML.g:5333:6: ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                            // InternalNML.g:5334:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                            {
                            // InternalNML.g:5334:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                            // InternalNML.g:5335:8: lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_1_2_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_75);
                            lv_ownedCoIterator_9_0=ruleCoIteratorVariableCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedCoIterator",
                              									lv_ownedCoIterator_9_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CoIteratorVariableCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalNML.g:5353:5: (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==46) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // InternalNML.g:5354:6: otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                            {
                            otherlv_10=(Token)match(input,46,FollowSets000.FOLLOW_56); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_10, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_2_1_3_0());
                              					
                            }
                            // InternalNML.g:5358:6: ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                            // InternalNML.g:5359:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                            {
                            // InternalNML.g:5359:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                            // InternalNML.g:5360:8: lv_ownedInitExpression_11_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_1_3_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_11_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedInitExpression",
                              									lv_ownedInitExpression_11_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalNML.g:5380:4: ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
                    {
                    // InternalNML.g:5380:4: ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
                    // InternalNML.g:5381:5: (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
                    {
                    // InternalNML.g:5381:5: (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==23) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // InternalNML.g:5382:6: otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                            {
                            otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_48); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_12, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_2_0_0());
                              					
                            }
                            // InternalNML.g:5386:6: ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                            // InternalNML.g:5387:7: (lv_ownedType_13_0= ruleTypeExpCS )
                            {
                            // InternalNML.g:5387:7: (lv_ownedType_13_0= ruleTypeExpCS )
                            // InternalNML.g:5388:8: lv_ownedType_13_0= ruleTypeExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_2_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_77);
                            lv_ownedType_13_0=ruleTypeExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedType",
                              									lv_ownedType_13_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalNML.g:5406:5: (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==90) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // InternalNML.g:5407:6: otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                            {
                            otherlv_14=(Token)match(input,90,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_14, grammarAccess.getNavigatingCommaArgCSAccess().getLessThanSignHyphenMinusKeyword_2_2_1_0());
                              					
                            }
                            // InternalNML.g:5411:6: ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                            // InternalNML.g:5412:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                            {
                            // InternalNML.g:5412:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                            // InternalNML.g:5413:8: lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_2_1_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_78);
                            lv_ownedCoIterator_15_0=ruleCoIteratorVariableCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedCoIterator",
                              									lv_ownedCoIterator_15_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CoIteratorVariableCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,96,FollowSets000.FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_16, grammarAccess.getNavigatingCommaArgCSAccess().getInKeyword_2_2_2());
                      				
                    }
                    // InternalNML.g:5435:5: ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
                    // InternalNML.g:5436:6: (lv_ownedInitExpression_17_0= ruleExpCS )
                    {
                    // InternalNML.g:5436:6: (lv_ownedInitExpression_17_0= ruleExpCS )
                    // InternalNML.g:5437:7: lv_ownedInitExpression_17_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_3_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedInitExpression_17_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							set(
                      								current,
                      								"ownedInitExpression",
                      								lv_ownedInitExpression_17_0,
                      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingCommaArgCS"


    // $ANTLR start "entryRuleNavigatingSemiArgCS"
    // InternalNML.g:5460:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // InternalNML.g:5460:60: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // InternalNML.g:5461:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingSemiArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingSemiArgCS=ruleNavigatingSemiArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingSemiArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingSemiArgCS"


    // $ANTLR start "ruleNavigatingSemiArgCS"
    // InternalNML.g:5467:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;



        	enterRule();

        try {
            // InternalNML.g:5473:2: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // InternalNML.g:5474:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // InternalNML.g:5474:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // InternalNML.g:5475:3: ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // InternalNML.g:5475:3: ( (lv_prefix_0_0= ';' ) )
            // InternalNML.g:5476:4: (lv_prefix_0_0= ';' )
            {
            // InternalNML.g:5476:4: (lv_prefix_0_0= ';' )
            // InternalNML.g:5477:5: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,24,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingSemiArgCSAccess().getPrefixSemicolonKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNavigatingSemiArgCSRule());
              					}
              					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ";");
              				
            }

            }


            }

            // InternalNML.g:5489:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalNML.g:5490:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalNML.g:5490:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalNML.g:5491:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_79);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
              					}
              					set(
              						current,
              						"ownedNameExpression",
              						lv_ownedNameExpression_1_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingArgExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:5508:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==23) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalNML.g:5509:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalNML.g:5513:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalNML.g:5514:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalNML.g:5514:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalNML.g:5515:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_75);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_3_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNML.g:5532:4: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==46) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // InternalNML.g:5533:5: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_56); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_2_2_0());
                              				
                            }
                            // InternalNML.g:5537:5: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalNML.g:5538:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalNML.g:5538:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalNML.g:5539:7: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_5_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingSemiArgCS"


    // $ANTLR start "entryRuleNavigatingArgExpCS"
    // InternalNML.g:5562:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // InternalNML.g:5562:59: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // InternalNML.g:5563:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingArgExpCS=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingArgExpCS"


    // $ANTLR start "ruleNavigatingArgExpCS"
    // InternalNML.g:5569:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;



        	enterRule();

        try {
            // InternalNML.g:5575:2: (this_ExpCS_0= ruleExpCS )
            // InternalNML.g:5576:2: this_ExpCS_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_ExpCS_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ExpCS_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingArgExpCS"


    // $ANTLR start "entryRuleCoIteratorVariableCS"
    // InternalNML.g:5590:1: entryRuleCoIteratorVariableCS returns [EObject current=null] : iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF ;
    public final EObject entryRuleCoIteratorVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoIteratorVariableCS = null;


        try {
            // InternalNML.g:5590:61: (iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF )
            // InternalNML.g:5591:2: iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoIteratorVariableCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCoIteratorVariableCS=ruleCoIteratorVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCoIteratorVariableCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoIteratorVariableCS"


    // $ANTLR start "ruleCoIteratorVariableCS"
    // InternalNML.g:5597:1: ruleCoIteratorVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? ) ;
    public final EObject ruleCoIteratorVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalNML.g:5603:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? ) )
            // InternalNML.g:5604:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? )
            {
            // InternalNML.g:5604:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? )
            // InternalNML.g:5605:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            {
            // InternalNML.g:5605:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalNML.g:5606:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalNML.g:5606:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalNML.g:5607:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCoIteratorVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_79);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCoIteratorVariableCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:5624:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==23) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalNML.g:5625:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCoIteratorVariableCSAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalNML.g:5629:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalNML.g:5630:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalNML.g:5630:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalNML.g:5631:6: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCoIteratorVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCoIteratorVariableCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoIteratorVariableCS"


    // $ANTLR start "entryRuleIfExpCS"
    // InternalNML.g:5653:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // InternalNML.g:5653:48: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // InternalNML.g:5654:2: iv_ruleIfExpCS= ruleIfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIfExpCS=ruleIfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfExpCS"


    // $ANTLR start "ruleIfExpCS"
    // InternalNML.g:5660:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) ;
    public final EObject ruleIfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedCondition_1_1 = null;

        EObject lv_ownedCondition_1_2 = null;

        EObject lv_ownedThenExpression_3_0 = null;

        EObject lv_ownedIfThenExpressions_4_0 = null;

        EObject lv_ownedElseExpression_6_0 = null;



        	enterRule();

        try {
            // InternalNML.g:5666:2: ( (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) )
            // InternalNML.g:5667:2: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            {
            // InternalNML.g:5667:2: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            // InternalNML.g:5668:3: otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif'
            {
            otherlv_0=(Token)match(input,98,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
              		
            }
            // InternalNML.g:5672:3: ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) )
            // InternalNML.g:5673:4: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            {
            // InternalNML.g:5673:4: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            // InternalNML.g:5674:5: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            {
            // InternalNML.g:5674:5: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            int alt116=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_SINGLE_QUOTED_STRING:
            case 43:
            case 58:
            case 59:
            case 60:
            case 61:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 98:
            case 103:
            case 104:
                {
                alt116=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA116_2 = input.LA(2);

                if ( (LA116_2==17||(LA116_2>=38 && LA116_2<=39)||LA116_2==41||LA116_2==43||LA116_2==46||LA116_2==48||LA116_2==50||(LA116_2>=52 && LA116_2<=55)||(LA116_2>=57 && LA116_2<=58)||(LA116_2>=61 && LA116_2<=71)||LA116_2==95||LA116_2==99||LA116_2==108) ) {
                    alt116=1;
                }
                else if ( (LA116_2==23) ) {
                    alt116=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 116, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA116_3 = input.LA(2);

                if ( (LA116_3==17||(LA116_3>=38 && LA116_3<=39)||LA116_3==41||LA116_3==43||LA116_3==46||LA116_3==48||LA116_3==50||(LA116_3>=52 && LA116_3<=55)||(LA116_3>=57 && LA116_3<=58)||(LA116_3>=61 && LA116_3<=71)||LA116_3==95||LA116_3==99||LA116_3==108) ) {
                    alt116=1;
                }
                else if ( (LA116_3==23) ) {
                    alt116=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 116, 3, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt116=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // InternalNML.g:5675:6: lv_ownedCondition_1_1= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_80);
                    lv_ownedCondition_1_1=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedCondition",
                      							lv_ownedCondition_1_1,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:5691:6: lv_ownedCondition_1_2= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionPatternExpCSParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_80);
                    lv_ownedCondition_1_2=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedCondition",
                      							lv_ownedCondition_1_2,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,99,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
              		
            }
            // InternalNML.g:5713:3: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // InternalNML.g:5714:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // InternalNML.g:5714:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            // InternalNML.g:5715:5: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_81);
            lv_ownedThenExpression_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              					}
              					set(
              						current,
              						"ownedThenExpression",
              						lv_ownedThenExpression_3_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:5732:3: ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==102) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // InternalNML.g:5733:4: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    {
            	    // InternalNML.g:5733:4: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    // InternalNML.g:5734:5: lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedIfThenExpressionsElseIfThenExpCSParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_81);
            	    lv_ownedIfThenExpressions_4_0=ruleElseIfThenExpCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedIfThenExpressions",
            	      						lv_ownedIfThenExpressions_4_0,
            	      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ElseIfThenExpCS");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);

            otherlv_5=(Token)match(input,100,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getIfExpCSAccess().getElseKeyword_5());
              		
            }
            // InternalNML.g:5755:3: ( (lv_ownedElseExpression_6_0= ruleExpCS ) )
            // InternalNML.g:5756:4: (lv_ownedElseExpression_6_0= ruleExpCS )
            {
            // InternalNML.g:5756:4: (lv_ownedElseExpression_6_0= ruleExpCS )
            // InternalNML.g:5757:5: lv_ownedElseExpression_6_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedElseExpressionExpCSParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_82);
            lv_ownedElseExpression_6_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              					}
              					set(
              						current,
              						"ownedElseExpression",
              						lv_ownedElseExpression_6_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,101,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getIfExpCSAccess().getEndifKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfExpCS"


    // $ANTLR start "entryRuleElseIfThenExpCS"
    // InternalNML.g:5782:1: entryRuleElseIfThenExpCS returns [EObject current=null] : iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF ;
    public final EObject entryRuleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfThenExpCS = null;


        try {
            // InternalNML.g:5782:56: (iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF )
            // InternalNML.g:5783:2: iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseIfThenExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleElseIfThenExpCS=ruleElseIfThenExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseIfThenExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElseIfThenExpCS"


    // $ANTLR start "ruleElseIfThenExpCS"
    // InternalNML.g:5789:1: ruleElseIfThenExpCS returns [EObject current=null] : (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) ;
    public final EObject ruleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedCondition_1_0 = null;

        EObject lv_ownedThenExpression_3_0 = null;



        	enterRule();

        try {
            // InternalNML.g:5795:2: ( (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) )
            // InternalNML.g:5796:2: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            {
            // InternalNML.g:5796:2: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            // InternalNML.g:5797:3: otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,102,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getElseIfThenExpCSAccess().getElseifKeyword_0());
              		
            }
            // InternalNML.g:5801:3: ( (lv_ownedCondition_1_0= ruleExpCS ) )
            // InternalNML.g:5802:4: (lv_ownedCondition_1_0= ruleExpCS )
            {
            // InternalNML.g:5802:4: (lv_ownedCondition_1_0= ruleExpCS )
            // InternalNML.g:5803:5: lv_ownedCondition_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_80);
            lv_ownedCondition_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElseIfThenExpCSRule());
              					}
              					set(
              						current,
              						"ownedCondition",
              						lv_ownedCondition_1_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,99,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getElseIfThenExpCSAccess().getThenKeyword_2());
              		
            }
            // InternalNML.g:5824:3: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // InternalNML.g:5825:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // InternalNML.g:5825:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            // InternalNML.g:5826:5: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedThenExpression_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElseIfThenExpCSRule());
              					}
              					set(
              						current,
              						"ownedThenExpression",
              						lv_ownedThenExpression_3_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElseIfThenExpCS"


    // $ANTLR start "entryRuleLetExpCS"
    // InternalNML.g:5847:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // InternalNML.g:5847:49: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // InternalNML.g:5848:2: iv_ruleLetExpCS= ruleLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLetExpCS=ruleLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetExpCS"


    // $ANTLR start "ruleLetExpCS"
    // InternalNML.g:5854:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedVariables_1_0 = null;

        EObject lv_ownedVariables_3_0 = null;

        EObject lv_ownedInExpression_5_0 = null;



        	enterRule();

        try {
            // InternalNML.g:5860:2: ( (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) )
            // InternalNML.g:5861:2: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            {
            // InternalNML.g:5861:2: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            // InternalNML.g:5862:3: otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,103,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
              		
            }
            // InternalNML.g:5866:3: ( (lv_ownedVariables_1_0= ruleLetVariableCS ) )
            // InternalNML.g:5867:4: (lv_ownedVariables_1_0= ruleLetVariableCS )
            {
            // InternalNML.g:5867:4: (lv_ownedVariables_1_0= ruleLetVariableCS )
            // InternalNML.g:5868:5: lv_ownedVariables_1_0= ruleLetVariableCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_83);
            lv_ownedVariables_1_0=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              					}
              					add(
              						current,
              						"ownedVariables",
              						lv_ownedVariables_1_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.LetVariableCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:5885:3: (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==27) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // InternalNML.g:5886:4: otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalNML.g:5890:4: ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    // InternalNML.g:5891:5: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    {
            	    // InternalNML.g:5891:5: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    // InternalNML.g:5892:6: lv_ownedVariables_3_0= ruleLetVariableCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_83);
            	    lv_ownedVariables_3_0=ruleLetVariableCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLetExpCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedVariables",
            	      							lv_ownedVariables_3_0,
            	      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.LetVariableCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);

            otherlv_4=(Token)match(input,96,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
              		
            }
            // InternalNML.g:5914:3: ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            // InternalNML.g:5915:4: (lv_ownedInExpression_5_0= ruleExpCS )
            {
            // InternalNML.g:5915:4: (lv_ownedInExpression_5_0= ruleExpCS )
            // InternalNML.g:5916:5: lv_ownedInExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedInExpressionExpCSParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedInExpression_5_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              					}
              					set(
              						current,
              						"ownedInExpression",
              						lv_ownedInExpression_5_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetExpCS"


    // $ANTLR start "entryRuleLetVariableCS"
    // InternalNML.g:5937:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // InternalNML.g:5937:54: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // InternalNML.g:5938:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetVariableCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLetVariableCS=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetVariableCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetVariableCS"


    // $ANTLR start "ruleLetVariableCS"
    // InternalNML.g:5944:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedRoundBracketedClause_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;



        	enterRule();

        try {
            // InternalNML.g:5950:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) )
            // InternalNML.g:5951:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            {
            // InternalNML.g:5951:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            // InternalNML.g:5952:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            {
            // InternalNML.g:5952:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalNML.g:5953:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalNML.g:5953:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalNML.g:5954:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_84);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:5971:3: ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==43) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalNML.g:5972:4: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    {
                    // InternalNML.g:5972:4: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    // InternalNML.g:5973:5: lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_61);
                    lv_ownedRoundBracketedClause_1_0=ruleRoundBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedRoundBracketedClause",
                      						lv_ownedRoundBracketedClause_1_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.RoundBracketedClauseCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalNML.g:5990:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==23) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalNML.g:5991:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLetVariableCSAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalNML.g:5995:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalNML.g:5996:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalNML.g:5996:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalNML.g:5997:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_58);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_3_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalNML.g:6019:3: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            // InternalNML.g:6020:4: (lv_ownedInitExpression_5_0= ruleExpCS )
            {
            // InternalNML.g:6020:4: (lv_ownedInitExpression_5_0= ruleExpCS )
            // InternalNML.g:6021:5: lv_ownedInitExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedInitExpressionExpCSParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedInitExpression_5_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
              					}
              					set(
              						current,
              						"ownedInitExpression",
              						lv_ownedInitExpression_5_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetVariableCS"


    // $ANTLR start "entryRuleNestedExpCS"
    // InternalNML.g:6042:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // InternalNML.g:6042:52: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // InternalNML.g:6043:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedExpCS=ruleNestedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNestedExpCS"


    // $ANTLR start "ruleNestedExpCS"
    // InternalNML.g:6049:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedExpression_1_0 = null;



        	enterRule();

        try {
            // InternalNML.g:6055:2: ( (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // InternalNML.g:6056:2: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // InternalNML.g:6056:2: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // InternalNML.g:6057:3: otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalNML.g:6061:3: ( (lv_ownedExpression_1_0= ruleExpCS ) )
            // InternalNML.g:6062:4: (lv_ownedExpression_1_0= ruleExpCS )
            {
            // InternalNML.g:6062:4: (lv_ownedExpression_1_0= ruleExpCS )
            // InternalNML.g:6063:5: lv_ownedExpression_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedExpCSAccess().getOwnedExpressionExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_41);
            lv_ownedExpression_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedExpCSRule());
              					}
              					set(
              						current,
              						"ownedExpression",
              						lv_ownedExpression_1_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNestedExpCSAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNestedExpCS"


    // $ANTLR start "entryRuleSelfExpCS"
    // InternalNML.g:6088:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // InternalNML.g:6088:50: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // InternalNML.g:6089:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSelfExpCS=ruleSelfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelfExpCS"


    // $ANTLR start "ruleSelfExpCS"
    // InternalNML.g:6095:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalNML.g:6101:2: ( ( () otherlv_1= 'self' ) )
            // InternalNML.g:6102:2: ( () otherlv_1= 'self' )
            {
            // InternalNML.g:6102:2: ( () otherlv_1= 'self' )
            // InternalNML.g:6103:3: () otherlv_1= 'self'
            {
            // InternalNML.g:6103:3: ()
            // InternalNML.g:6104:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSelfExpCSAccess().getSelfExpCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,104,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSelfExpCSAccess().getSelfKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelfExpCS"


    // $ANTLR start "entryRuleMultiplicityBoundsCS"
    // InternalNML.g:6121:1: entryRuleMultiplicityBoundsCS returns [EObject current=null] : iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF ;
    public final EObject entryRuleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityBoundsCS = null;


        try {
            // InternalNML.g:6121:61: (iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF )
            // InternalNML.g:6122:2: iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityBoundsCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultiplicityBoundsCS=ruleMultiplicityBoundsCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityBoundsCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicityBoundsCS"


    // $ANTLR start "ruleMultiplicityBoundsCS"
    // InternalNML.g:6128:1: ruleMultiplicityBoundsCS returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) ;
    public final EObject ruleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalNML.g:6134:2: ( ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) )
            // InternalNML.g:6135:2: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            {
            // InternalNML.g:6135:2: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            // InternalNML.g:6136:3: ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            {
            // InternalNML.g:6136:3: ( (lv_lowerBound_0_0= ruleLOWER ) )
            // InternalNML.g:6137:4: (lv_lowerBound_0_0= ruleLOWER )
            {
            // InternalNML.g:6137:4: (lv_lowerBound_0_0= ruleLOWER )
            // InternalNML.g:6138:5: lv_lowerBound_0_0= ruleLOWER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getLowerBoundLOWERParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_55);
            lv_lowerBound_0_0=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMultiplicityBoundsCSRule());
              					}
              					set(
              						current,
              						"lowerBound",
              						lv_lowerBound_0_0,
              						"org.eclipse.ocl.xtext.base.Base.LOWER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:6155:3: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==87) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalNML.g:6156:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) )
                    {
                    otherlv_1=(Token)match(input,87,FollowSets000.FOLLOW_85); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMultiplicityBoundsCSAccess().getFullStopFullStopKeyword_1_0());
                      			
                    }
                    // InternalNML.g:6160:4: ( (lv_upperBound_2_0= ruleUPPER ) )
                    // InternalNML.g:6161:5: (lv_upperBound_2_0= ruleUPPER )
                    {
                    // InternalNML.g:6161:5: (lv_upperBound_2_0= ruleUPPER )
                    // InternalNML.g:6162:6: lv_upperBound_2_0= ruleUPPER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getUpperBoundUPPERParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_upperBound_2_0=ruleUPPER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMultiplicityBoundsCSRule());
                      						}
                      						set(
                      							current,
                      							"upperBound",
                      							lv_upperBound_2_0,
                      							"org.eclipse.ocl.xtext.base.Base.UPPER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicityBoundsCS"


    // $ANTLR start "entryRuleMultiplicityCS"
    // InternalNML.g:6184:1: entryRuleMultiplicityCS returns [EObject current=null] : iv_ruleMultiplicityCS= ruleMultiplicityCS EOF ;
    public final EObject entryRuleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityCS = null;


        try {
            // InternalNML.g:6184:55: (iv_ruleMultiplicityCS= ruleMultiplicityCS EOF )
            // InternalNML.g:6185:2: iv_ruleMultiplicityCS= ruleMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultiplicityCS=ruleMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicityCS"


    // $ANTLR start "ruleMultiplicityCS"
    // InternalNML.g:6191:1: ruleMultiplicityCS returns [EObject current=null] : (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' ) ;
    public final EObject ruleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_isNullFree_4_0=null;
        Token otherlv_5=null;
        EObject this_MultiplicityBoundsCS_1 = null;

        EObject this_MultiplicityStringCS_2 = null;



        	enterRule();

        try {
            // InternalNML.g:6197:2: ( (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' ) )
            // InternalNML.g:6198:2: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' )
            {
            // InternalNML.g:6198:2: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' )
            // InternalNML.g:6199:3: otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_86); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultiplicityCSAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalNML.g:6203:3: (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==RULE_INT) ) {
                alt122=1;
            }
            else if ( (LA122_0==50||LA122_0==61||LA122_0==107) ) {
                alt122=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // InternalNML.g:6204:4: this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityBoundsCSParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_87);
                    this_MultiplicityBoundsCS_1=ruleMultiplicityBoundsCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MultiplicityBoundsCS_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:6216:4: this_MultiplicityStringCS_2= ruleMultiplicityStringCS
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityStringCSParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_87);
                    this_MultiplicityStringCS_2=ruleMultiplicityStringCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MultiplicityStringCS_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalNML.g:6228:3: (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )?
            int alt123=3;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==105) ) {
                alt123=1;
            }
            else if ( (LA123_0==106) ) {
                alt123=2;
            }
            switch (alt123) {
                case 1 :
                    // InternalNML.g:6229:4: otherlv_3= '|?'
                    {
                    otherlv_3=(Token)match(input,105,FollowSets000.FOLLOW_88); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMultiplicityCSAccess().getVerticalLineQuestionMarkKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:6234:4: ( (lv_isNullFree_4_0= '|1' ) )
                    {
                    // InternalNML.g:6234:4: ( (lv_isNullFree_4_0= '|1' ) )
                    // InternalNML.g:6235:5: (lv_isNullFree_4_0= '|1' )
                    {
                    // InternalNML.g:6235:5: (lv_isNullFree_4_0= '|1' )
                    // InternalNML.g:6236:6: lv_isNullFree_4_0= '|1'
                    {
                    lv_isNullFree_4_0=(Token)match(input,106,FollowSets000.FOLLOW_88); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isNullFree_4_0, grammarAccess.getMultiplicityCSAccess().getIsNullFree1Keyword_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMultiplicityCSRule());
                      						}
                      						setWithLastConsumed(current, "isNullFree", true, "|1");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMultiplicityCSAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicityCS"


    // $ANTLR start "entryRuleMultiplicityStringCS"
    // InternalNML.g:6257:1: entryRuleMultiplicityStringCS returns [EObject current=null] : iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF ;
    public final EObject entryRuleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityStringCS = null;


        try {
            // InternalNML.g:6257:61: (iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF )
            // InternalNML.g:6258:2: iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityStringCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultiplicityStringCS=ruleMultiplicityStringCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityStringCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicityStringCS"


    // $ANTLR start "ruleMultiplicityStringCS"
    // InternalNML.g:6264:1: ruleMultiplicityStringCS returns [EObject current=null] : ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) ;
    public final EObject ruleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        Token lv_stringBounds_0_1=null;
        Token lv_stringBounds_0_2=null;
        Token lv_stringBounds_0_3=null;


        	enterRule();

        try {
            // InternalNML.g:6270:2: ( ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) )
            // InternalNML.g:6271:2: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            {
            // InternalNML.g:6271:2: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            // InternalNML.g:6272:3: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            {
            // InternalNML.g:6272:3: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            // InternalNML.g:6273:4: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            {
            // InternalNML.g:6273:4: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            int alt124=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt124=1;
                }
                break;
            case 50:
                {
                alt124=2;
                }
                break;
            case 107:
                {
                alt124=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }

            switch (alt124) {
                case 1 :
                    // InternalNML.g:6274:5: lv_stringBounds_0_1= '*'
                    {
                    lv_stringBounds_0_1=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_stringBounds_0_1, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsAsteriskKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      					}
                      					setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:6285:5: lv_stringBounds_0_2= '+'
                    {
                    lv_stringBounds_0_2=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_stringBounds_0_2, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsPlusSignKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      					}
                      					setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalNML.g:6296:5: lv_stringBounds_0_3= '?'
                    {
                    lv_stringBounds_0_3=(Token)match(input,107,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_stringBounds_0_3, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsQuestionMarkKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      					}
                      					setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_3, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicityStringCS"


    // $ANTLR start "entryRulePathNameCS"
    // InternalNML.g:6312:1: entryRulePathNameCS returns [EObject current=null] : iv_rulePathNameCS= rulePathNameCS EOF ;
    public final EObject entryRulePathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameCS = null;


        try {
            // InternalNML.g:6312:51: (iv_rulePathNameCS= rulePathNameCS EOF )
            // InternalNML.g:6313:2: iv_rulePathNameCS= rulePathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathNameCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePathNameCS=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathNameCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathNameCS"


    // $ANTLR start "rulePathNameCS"
    // InternalNML.g:6319:1: rulePathNameCS returns [EObject current=null] : ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) ;
    public final EObject rulePathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedPathElements_0_0 = null;

        EObject lv_ownedPathElements_2_0 = null;



        	enterRule();

        try {
            // InternalNML.g:6325:2: ( ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) )
            // InternalNML.g:6326:2: ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            {
            // InternalNML.g:6326:2: ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            // InternalNML.g:6327:3: ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            {
            // InternalNML.g:6327:3: ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) )
            // InternalNML.g:6328:4: (lv_ownedPathElements_0_0= ruleFirstPathElementCS )
            {
            // InternalNML.g:6328:4: (lv_ownedPathElements_0_0= ruleFirstPathElementCS )
            // InternalNML.g:6329:5: lv_ownedPathElements_0_0= ruleFirstPathElementCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPathNameCSAccess().getOwnedPathElementsFirstPathElementCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_89);
            lv_ownedPathElements_0_0=ruleFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPathNameCSRule());
              					}
              					add(
              						current,
              						"ownedPathElements",
              						lv_ownedPathElements_0_0,
              						"org.eclipse.ocl.xtext.base.Base.FirstPathElementCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:6346:3: (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==108) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // InternalNML.g:6347:4: otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,108,FollowSets000.FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    // InternalNML.g:6351:4: ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    // InternalNML.g:6352:5: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    {
            	    // InternalNML.g:6352:5: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    // InternalNML.g:6353:6: lv_ownedPathElements_2_0= ruleNextPathElementCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPathNameCSAccess().getOwnedPathElementsNextPathElementCSParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_89);
            	    lv_ownedPathElements_2_0=ruleNextPathElementCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPathNameCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedPathElements",
            	      							lv_ownedPathElements_2_0,
            	      							"org.eclipse.ocl.xtext.base.Base.NextPathElementCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathNameCS"


    // $ANTLR start "entryRuleFirstPathElementCS"
    // InternalNML.g:6375:1: entryRuleFirstPathElementCS returns [EObject current=null] : iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF ;
    public final EObject entryRuleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstPathElementCS = null;


        try {
            // InternalNML.g:6375:59: (iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF )
            // InternalNML.g:6376:2: iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFirstPathElementCS=ruleFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFirstPathElementCS"


    // $ANTLR start "ruleFirstPathElementCS"
    // InternalNML.g:6382:1: ruleFirstPathElementCS returns [EObject current=null] : ( ( ruleUnrestrictedName ) ) ;
    public final EObject ruleFirstPathElementCS() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalNML.g:6388:2: ( ( ( ruleUnrestrictedName ) ) )
            // InternalNML.g:6389:2: ( ( ruleUnrestrictedName ) )
            {
            // InternalNML.g:6389:2: ( ( ruleUnrestrictedName ) )
            // InternalNML.g:6390:3: ( ruleUnrestrictedName )
            {
            // InternalNML.g:6390:3: ( ruleUnrestrictedName )
            // InternalNML.g:6391:4: ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getFirstPathElementCSRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getFirstPathElementCSAccess().getReferredElementNamedElementCrossReference_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFirstPathElementCS"


    // $ANTLR start "entryRuleNextPathElementCS"
    // InternalNML.g:6411:1: entryRuleNextPathElementCS returns [EObject current=null] : iv_ruleNextPathElementCS= ruleNextPathElementCS EOF ;
    public final EObject entryRuleNextPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextPathElementCS = null;


        try {
            // InternalNML.g:6411:58: (iv_ruleNextPathElementCS= ruleNextPathElementCS EOF )
            // InternalNML.g:6412:2: iv_ruleNextPathElementCS= ruleNextPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNextPathElementCS=ruleNextPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNextPathElementCS"


    // $ANTLR start "ruleNextPathElementCS"
    // InternalNML.g:6418:1: ruleNextPathElementCS returns [EObject current=null] : ( ( ruleUnreservedName ) ) ;
    public final EObject ruleNextPathElementCS() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalNML.g:6424:2: ( ( ( ruleUnreservedName ) ) )
            // InternalNML.g:6425:2: ( ( ruleUnreservedName ) )
            {
            // InternalNML.g:6425:2: ( ( ruleUnreservedName ) )
            // InternalNML.g:6426:3: ( ruleUnreservedName )
            {
            // InternalNML.g:6426:3: ( ruleUnreservedName )
            // InternalNML.g:6427:4: ruleUnreservedName
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNextPathElementCSRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNextPathElementCSAccess().getReferredElementNamedElementCrossReference_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNextPathElementCS"


    // $ANTLR start "entryRuleTemplateBindingCS"
    // InternalNML.g:6447:1: entryRuleTemplateBindingCS returns [EObject current=null] : iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF ;
    public final EObject entryRuleTemplateBindingCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateBindingCS = null;


        try {
            // InternalNML.g:6447:58: (iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF )
            // InternalNML.g:6448:2: iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateBindingCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTemplateBindingCS=ruleTemplateBindingCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateBindingCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateBindingCS"


    // $ANTLR start "ruleTemplateBindingCS"
    // InternalNML.g:6454:1: ruleTemplateBindingCS returns [EObject current=null] : ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTemplateBindingCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedSubstitutions_0_0 = null;

        EObject lv_ownedSubstitutions_2_0 = null;

        EObject lv_ownedMultiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalNML.g:6460:2: ( ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) )
            // InternalNML.g:6461:2: ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            {
            // InternalNML.g:6461:2: ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            // InternalNML.g:6462:3: ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            {
            // InternalNML.g:6462:3: ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) )
            // InternalNML.g:6463:4: (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS )
            {
            // InternalNML.g:6463:4: (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS )
            // InternalNML.g:6464:5: lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedSubstitutionsTemplateParameterSubstitutionCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_90);
            lv_ownedSubstitutions_0_0=ruleTemplateParameterSubstitutionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTemplateBindingCSRule());
              					}
              					add(
              						current,
              						"ownedSubstitutions",
              						lv_ownedSubstitutions_0_0,
              						"org.eclipse.ocl.xtext.base.Base.TemplateParameterSubstitutionCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:6481:3: (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==27) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // InternalNML.g:6482:4: otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_91); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getTemplateBindingCSAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalNML.g:6486:4: ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) )
            	    // InternalNML.g:6487:5: (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS )
            	    {
            	    // InternalNML.g:6487:5: (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS )
            	    // InternalNML.g:6488:6: lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedSubstitutionsTemplateParameterSubstitutionCSParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_90);
            	    lv_ownedSubstitutions_2_0=ruleTemplateParameterSubstitutionCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTemplateBindingCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedSubstitutions",
            	      							lv_ownedSubstitutions_2_0,
            	      							"org.eclipse.ocl.xtext.base.Base.TemplateParameterSubstitutionCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop126;
                }
            } while (true);

            // InternalNML.g:6506:3: ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==41) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalNML.g:6507:4: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    {
                    // InternalNML.g:6507:4: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    // InternalNML.g:6508:5: lv_ownedMultiplicity_3_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedMultiplicity_3_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTemplateBindingCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedMultiplicity",
                      						lv_ownedMultiplicity_3_0,
                      						"org.eclipse.ocl.xtext.base.Base.MultiplicityCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateBindingCS"


    // $ANTLR start "entryRuleTemplateParameterSubstitutionCS"
    // InternalNML.g:6529:1: entryRuleTemplateParameterSubstitutionCS returns [EObject current=null] : iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF ;
    public final EObject entryRuleTemplateParameterSubstitutionCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateParameterSubstitutionCS = null;


        try {
            // InternalNML.g:6529:72: (iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF )
            // InternalNML.g:6530:2: iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateParameterSubstitutionCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTemplateParameterSubstitutionCS=ruleTemplateParameterSubstitutionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateParameterSubstitutionCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateParameterSubstitutionCS"


    // $ANTLR start "ruleTemplateParameterSubstitutionCS"
    // InternalNML.g:6536:1: ruleTemplateParameterSubstitutionCS returns [EObject current=null] : ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) ) ;
    public final EObject ruleTemplateParameterSubstitutionCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedActualParameter_0_0 = null;



        	enterRule();

        try {
            // InternalNML.g:6542:2: ( ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) ) )
            // InternalNML.g:6543:2: ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) )
            {
            // InternalNML.g:6543:2: ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) )
            // InternalNML.g:6544:3: (lv_ownedActualParameter_0_0= ruleTypeRefCS )
            {
            // InternalNML.g:6544:3: (lv_ownedActualParameter_0_0= ruleTypeRefCS )
            // InternalNML.g:6545:4: lv_ownedActualParameter_0_0= ruleTypeRefCS
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getTemplateParameterSubstitutionCSAccess().getOwnedActualParameterTypeRefCSParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedActualParameter_0_0=ruleTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getTemplateParameterSubstitutionCSRule());
              				}
              				set(
              					current,
              					"ownedActualParameter",
              					lv_ownedActualParameter_0_0,
              					"org.eclipse.ocl.xtext.base.Base.TypeRefCS");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateParameterSubstitutionCS"


    // $ANTLR start "entryRuleTypeParameterCS"
    // InternalNML.g:6565:1: entryRuleTypeParameterCS returns [EObject current=null] : iv_ruleTypeParameterCS= ruleTypeParameterCS EOF ;
    public final EObject entryRuleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeParameterCS = null;


        try {
            // InternalNML.g:6565:56: (iv_ruleTypeParameterCS= ruleTypeParameterCS EOF )
            // InternalNML.g:6566:2: iv_ruleTypeParameterCS= ruleTypeParameterCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeParameterCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeParameterCS=ruleTypeParameterCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeParameterCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeParameterCS"


    // $ANTLR start "ruleTypeParameterCS"
    // InternalNML.g:6572:1: ruleTypeParameterCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? ) ;
    public final EObject ruleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedExtends_2_0 = null;

        EObject lv_ownedExtends_4_0 = null;



        	enterRule();

        try {
            // InternalNML.g:6578:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? ) )
            // InternalNML.g:6579:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? )
            {
            // InternalNML.g:6579:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? )
            // InternalNML.g:6580:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )?
            {
            // InternalNML.g:6580:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalNML.g:6581:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalNML.g:6581:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalNML.g:6582:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeParameterCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_92);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeParameterCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:6599:3: (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==30) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalNML.g:6600:4: otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )*
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypeParameterCSAccess().getExtendsKeyword_1_0());
                      			
                    }
                    // InternalNML.g:6604:4: ( (lv_ownedExtends_2_0= ruleTypedRefCS ) )
                    // InternalNML.g:6605:5: (lv_ownedExtends_2_0= ruleTypedRefCS )
                    {
                    // InternalNML.g:6605:5: (lv_ownedExtends_2_0= ruleTypedRefCS )
                    // InternalNML.g:6606:6: lv_ownedExtends_2_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeParameterCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_93);
                    lv_ownedExtends_2_0=ruleTypedRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeParameterCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedExtends",
                      							lv_ownedExtends_2_0,
                      							"org.eclipse.ocl.xtext.base.Base.TypedRefCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNML.g:6623:4: (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==109) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // InternalNML.g:6624:5: otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,109,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getTypeParameterCSAccess().getAmpersandAmpersandKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalNML.g:6628:5: ( (lv_ownedExtends_4_0= ruleTypedRefCS ) )
                    	    // InternalNML.g:6629:6: (lv_ownedExtends_4_0= ruleTypedRefCS )
                    	    {
                    	    // InternalNML.g:6629:6: (lv_ownedExtends_4_0= ruleTypedRefCS )
                    	    // InternalNML.g:6630:7: lv_ownedExtends_4_0= ruleTypedRefCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTypeParameterCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_93);
                    	    lv_ownedExtends_4_0=ruleTypedRefCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTypeParameterCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedExtends",
                    	      								lv_ownedExtends_4_0,
                    	      								"org.eclipse.ocl.xtext.base.Base.TypedRefCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop128;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeParameterCS"


    // $ANTLR start "entryRuleTypeRefCS"
    // InternalNML.g:6653:1: entryRuleTypeRefCS returns [EObject current=null] : iv_ruleTypeRefCS= ruleTypeRefCS EOF ;
    public final EObject entryRuleTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRefCS = null;


        try {
            // InternalNML.g:6653:50: (iv_ruleTypeRefCS= ruleTypeRefCS EOF )
            // InternalNML.g:6654:2: iv_ruleTypeRefCS= ruleTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeRefCS=ruleTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeRefCS"


    // $ANTLR start "ruleTypeRefCS"
    // InternalNML.g:6660:1: ruleTypeRefCS returns [EObject current=null] : (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS ) ;
    public final EObject ruleTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypedRefCS_0 = null;

        EObject this_WildcardTypeRefCS_1 = null;



        	enterRule();

        try {
            // InternalNML.g:6666:2: ( (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS ) )
            // InternalNML.g:6667:2: (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS )
            {
            // InternalNML.g:6667:2: (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS )
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( ((LA130_0>=RULE_SIMPLE_ID && LA130_0<=RULE_ESCAPED_ID)) ) {
                alt130=1;
            }
            else if ( (LA130_0==107) ) {
                alt130=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }
            switch (alt130) {
                case 1 :
                    // InternalNML.g:6668:3: this_TypedRefCS_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeRefCSAccess().getTypedRefCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypedRefCS_0=ruleTypedRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypedRefCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:6680:3: this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeRefCSAccess().getWildcardTypeRefCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_WildcardTypeRefCS_1=ruleWildcardTypeRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WildcardTypeRefCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeRefCS"


    // $ANTLR start "entryRuleTypedRefCS"
    // InternalNML.g:6695:1: entryRuleTypedRefCS returns [EObject current=null] : iv_ruleTypedRefCS= ruleTypedRefCS EOF ;
    public final EObject entryRuleTypedRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedRefCS = null;


        try {
            // InternalNML.g:6695:51: (iv_ruleTypedRefCS= ruleTypedRefCS EOF )
            // InternalNML.g:6696:2: iv_ruleTypedRefCS= ruleTypedRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedRefCS=ruleTypedRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedRefCS"


    // $ANTLR start "ruleTypedRefCS"
    // InternalNML.g:6702:1: ruleTypedRefCS returns [EObject current=null] : this_TypedTypeRefCS_0= ruleTypedTypeRefCS ;
    public final EObject ruleTypedRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypedTypeRefCS_0 = null;



        	enterRule();

        try {
            // InternalNML.g:6708:2: (this_TypedTypeRefCS_0= ruleTypedTypeRefCS )
            // InternalNML.g:6709:2: this_TypedTypeRefCS_0= ruleTypedTypeRefCS
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getTypedRefCSAccess().getTypedTypeRefCSParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_TypedTypeRefCS_0=ruleTypedTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_TypedTypeRefCS_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedRefCS"


    // $ANTLR start "entryRuleTypedTypeRefCS"
    // InternalNML.g:6723:1: entryRuleTypedTypeRefCS returns [EObject current=null] : iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF ;
    public final EObject entryRuleTypedTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedTypeRefCS = null;


        try {
            // InternalNML.g:6723:55: (iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF )
            // InternalNML.g:6724:2: iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedTypeRefCS=ruleTypedTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedTypeRefCS"


    // $ANTLR start "ruleTypedTypeRefCS"
    // InternalNML.g:6730:1: ruleTypedTypeRefCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleTypedTypeRefCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedBinding_2_0 = null;



        	enterRule();

        try {
            // InternalNML.g:6736:2: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? ) )
            // InternalNML.g:6737:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? )
            {
            // InternalNML.g:6737:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? )
            // InternalNML.g:6738:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )?
            {
            // InternalNML.g:6738:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalNML.g:6739:4: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalNML.g:6739:4: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalNML.g:6740:5: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedTypeRefCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_47);
            lv_ownedPathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypedTypeRefCSRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_0_0,
              						"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalNML.g:6757:3: (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==43) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalNML.g:6758:4: otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_91); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypedTypeRefCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalNML.g:6762:4: ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) )
                    // InternalNML.g:6763:5: (lv_ownedBinding_2_0= ruleTemplateBindingCS )
                    {
                    // InternalNML.g:6763:5: (lv_ownedBinding_2_0= ruleTemplateBindingCS )
                    // InternalNML.g:6764:6: lv_ownedBinding_2_0= ruleTemplateBindingCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypedTypeRefCSAccess().getOwnedBindingTemplateBindingCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
                    lv_ownedBinding_2_0=ruleTemplateBindingCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypedTypeRefCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedBinding",
                      							lv_ownedBinding_2_0,
                      							"org.eclipse.ocl.xtext.base.Base.TemplateBindingCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTypedTypeRefCSAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedTypeRefCS"


    // $ANTLR start "entryRuleWildcardTypeRefCS"
    // InternalNML.g:6790:1: entryRuleWildcardTypeRefCS returns [EObject current=null] : iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF ;
    public final EObject entryRuleWildcardTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcardTypeRefCS = null;


        try {
            // InternalNML.g:6790:58: (iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF )
            // InternalNML.g:6791:2: iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWildcardTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleWildcardTypeRefCS=ruleWildcardTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWildcardTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWildcardTypeRefCS"


    // $ANTLR start "ruleWildcardTypeRefCS"
    // InternalNML.g:6797:1: ruleWildcardTypeRefCS returns [EObject current=null] : ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? ) ;
    public final EObject ruleWildcardTypeRefCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ownedExtends_3_0 = null;



        	enterRule();

        try {
            // InternalNML.g:6803:2: ( ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? ) )
            // InternalNML.g:6804:2: ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? )
            {
            // InternalNML.g:6804:2: ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? )
            // InternalNML.g:6805:3: () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )?
            {
            // InternalNML.g:6805:3: ()
            // InternalNML.g:6806:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getWildcardTypeRefCSAccess().getWildcardTypeRefCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,107,FollowSets000.FOLLOW_92); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWildcardTypeRefCSAccess().getQuestionMarkKeyword_1());
              		
            }
            // InternalNML.g:6819:3: (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==30) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalNML.g:6820:4: otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) )
                    {
                    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getWildcardTypeRefCSAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalNML.g:6824:4: ( (lv_ownedExtends_3_0= ruleTypedRefCS ) )
                    // InternalNML.g:6825:5: (lv_ownedExtends_3_0= ruleTypedRefCS )
                    {
                    // InternalNML.g:6825:5: (lv_ownedExtends_3_0= ruleTypedRefCS )
                    // InternalNML.g:6826:6: lv_ownedExtends_3_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getWildcardTypeRefCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedExtends_3_0=ruleTypedRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getWildcardTypeRefCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedExtends",
                      							lv_ownedExtends_3_0,
                      							"org.eclipse.ocl.xtext.base.Base.TypedRefCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWildcardTypeRefCS"


    // $ANTLR start "entryRuleID"
    // InternalNML.g:6848:1: entryRuleID returns [String current=null] : iv_ruleID= ruleID EOF ;
    public final String entryRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID = null;


        try {
            // InternalNML.g:6848:42: (iv_ruleID= ruleID EOF )
            // InternalNML.g:6849:2: iv_ruleID= ruleID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleID=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleID"


    // $ANTLR start "ruleID"
    // InternalNML.g:6855:1: ruleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) ;
    public final AntlrDatatypeRuleToken ruleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;
        Token this_ESCAPED_ID_1=null;


        	enterRule();

        try {
            // InternalNML.g:6861:2: ( (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) )
            // InternalNML.g:6862:2: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            {
            // InternalNML.g:6862:2: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==RULE_SIMPLE_ID) ) {
                alt133=1;
            }
            else if ( (LA133_0==RULE_ESCAPED_ID) ) {
                alt133=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }
            switch (alt133) {
                case 1 :
                    // InternalNML.g:6863:3: this_SIMPLE_ID_0= RULE_SIMPLE_ID
                    {
                    this_SIMPLE_ID_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SIMPLE_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_SIMPLE_ID_0, grammarAccess.getIDAccess().getSIMPLE_IDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:6871:3: this_ESCAPED_ID_1= RULE_ESCAPED_ID
                    {
                    this_ESCAPED_ID_1=(Token)match(input,RULE_ESCAPED_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ESCAPED_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ESCAPED_ID_1, grammarAccess.getIDAccess().getESCAPED_IDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleID"


    // $ANTLR start "entryRuleIdentifier"
    // InternalNML.g:6882:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // InternalNML.g:6882:50: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalNML.g:6883:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalNML.g:6889:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= ruleID ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ID_0 = null;



        	enterRule();

        try {
            // InternalNML.g:6895:2: (this_ID_0= ruleID )
            // InternalNML.g:6896:2: this_ID_0= ruleID
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getIdentifierAccess().getIDParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_ID_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleLOWER"
    // InternalNML.g:6909:1: entryRuleLOWER returns [String current=null] : iv_ruleLOWER= ruleLOWER EOF ;
    public final String entryRuleLOWER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOWER = null;


        try {
            // InternalNML.g:6909:45: (iv_ruleLOWER= ruleLOWER EOF )
            // InternalNML.g:6910:2: iv_ruleLOWER= ruleLOWER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLOWERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLOWER=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLOWER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLOWER"


    // $ANTLR start "ruleLOWER"
    // InternalNML.g:6916:1: ruleLOWER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLOWER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalNML.g:6922:2: (this_INT_0= RULE_INT )
            // InternalNML.g:6923:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_INT_0, grammarAccess.getLOWERAccess().getINTTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLOWER"


    // $ANTLR start "entryRuleNUMBER_LITERAL"
    // InternalNML.g:6933:1: entryRuleNUMBER_LITERAL returns [String current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final String entryRuleNUMBER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER_LITERAL = null;


        try {
            // InternalNML.g:6933:54: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // InternalNML.g:6934:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBER_LITERALRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNUMBER_LITERAL=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER_LITERAL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER_LITERAL"


    // $ANTLR start "ruleNUMBER_LITERAL"
    // InternalNML.g:6940:1: ruleNUMBER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNUMBER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalNML.g:6946:2: (this_INT_0= RULE_INT )
            // InternalNML.g:6947:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_INT_0, grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER_LITERAL"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalNML.g:6957:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalNML.g:6957:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalNML.g:6958:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalNML.g:6964:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;


        	enterRule();

        try {
            // InternalNML.g:6970:2: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // InternalNML.g:6971:2: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SINGLE_QUOTED_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_SINGLE_QUOTED_STRING_0, grammarAccess.getStringLiteralAccess().getSINGLE_QUOTED_STRINGTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleUPPER"
    // InternalNML.g:6981:1: entryRuleUPPER returns [String current=null] : iv_ruleUPPER= ruleUPPER EOF ;
    public final String entryRuleUPPER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUPPER = null;


        try {
            // InternalNML.g:6981:45: (iv_ruleUPPER= ruleUPPER EOF )
            // InternalNML.g:6982:2: iv_ruleUPPER= ruleUPPER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUPPERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUPPER=ruleUPPER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUPPER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUPPER"


    // $ANTLR start "ruleUPPER"
    // InternalNML.g:6988:1: ruleUPPER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUPPER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalNML.g:6994:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalNML.g:6995:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalNML.g:6995:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==RULE_INT) ) {
                alt134=1;
            }
            else if ( (LA134_0==61) ) {
                alt134=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }
            switch (alt134) {
                case 1 :
                    // InternalNML.g:6996:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_0, grammarAccess.getUPPERAccess().getINTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:7004:3: kw= '*'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUPPERAccess().getAsteriskKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUPPER"


    // $ANTLR start "entryRuleURI"
    // InternalNML.g:7013:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // InternalNML.g:7013:43: (iv_ruleURI= ruleURI EOF )
            // InternalNML.g:7014:2: iv_ruleURI= ruleURI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleURI=ruleURI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURI.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURI"


    // $ANTLR start "ruleURI"
    // InternalNML.g:7020:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;


        	enterRule();

        try {
            // InternalNML.g:7026:2: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // InternalNML.g:7027:2: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SINGLE_QUOTED_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_SINGLE_QUOTED_STRING_0, grammarAccess.getURIAccess().getSINGLE_QUOTED_STRINGTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURI"

    // $ANTLR start synpred29_InternalNML
    public final void synpred29_InternalNML_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_ownedConditions_14_0 = null;


        // InternalNML.g:985:5: ( (otherlv_12= 'or' | otherlv_13= 'and' )? ( (lv_ownedConditions_14_0= ruleConditionCS ) ) )
        // InternalNML.g:985:5: (otherlv_12= 'or' | otherlv_13= 'and' )? ( (lv_ownedConditions_14_0= ruleConditionCS ) )
        {
        // InternalNML.g:985:5: (otherlv_12= 'or' | otherlv_13= 'and' )?
        int alt144=3;
        int LA144_0 = input.LA(1);

        if ( (LA144_0==38) ) {
            alt144=1;
        }
        else if ( (LA144_0==39) ) {
            alt144=2;
        }
        switch (alt144) {
            case 1 :
                // InternalNML.g:986:6: otherlv_12= 'or'
                {
                otherlv_12=(Token)match(input,38,FollowSets000.FOLLOW_31); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalNML.g:991:6: otherlv_13= 'and'
                {
                otherlv_13=(Token)match(input,39,FollowSets000.FOLLOW_31); if (state.failed) return ;

                }
                break;

        }

        // InternalNML.g:996:5: ( (lv_ownedConditions_14_0= ruleConditionCS ) )
        // InternalNML.g:997:6: (lv_ownedConditions_14_0= ruleConditionCS )
        {
        // InternalNML.g:997:6: (lv_ownedConditions_14_0= ruleConditionCS )
        // InternalNML.g:998:7: lv_ownedConditions_14_0= ruleConditionCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getTransferCPAccess().getOwnedConditionsConditionCSParserRuleCall_8_1_1_0());
          						
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_ownedConditions_14_0=ruleConditionCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred29_InternalNML

    // $ANTLR start synpred41_InternalNML
    public final void synpred41_InternalNML_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_ownedElement_0_0 = null;


        // InternalNML.g:1406:4: ( (lv_ownedElement_0_0= ruleFQN ) )
        // InternalNML.g:1406:4: (lv_ownedElement_0_0= ruleFQN )
        {
        // InternalNML.g:1406:4: (lv_ownedElement_0_0= ruleFQN )
        // InternalNML.g:1407:5: lv_ownedElement_0_0= ruleFQN
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getConditionCSAccess().getOwnedElementFQNParserRuleCall_0_0());
          				
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_ownedElement_0_0=ruleFQN();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred41_InternalNML

    // $ANTLR start synpred49_InternalNML
    public final void synpred49_InternalNML_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;


        // InternalNML.g:1499:4: (this_UnrestrictedName_0= ruleUnrestrictedName )
        // InternalNML.g:1499:4: this_UnrestrictedName_0= ruleUnrestrictedName
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getFQNAccess().getUnrestrictedNameParserRuleCall_0_0());
          			
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_UnrestrictedName_0=ruleUnrestrictedName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalNML

    // $ANTLR start synpred51_InternalNML
    public final void synpred51_InternalNML_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_UnrestrictedName_4 = null;


        // InternalNML.g:1536:5: (this_UnrestrictedName_4= ruleUnrestrictedName )
        // InternalNML.g:1536:5: this_UnrestrictedName_4= ruleUnrestrictedName
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getFQNAccess().getUnrestrictedNameParserRuleCall_1_1_0());
          				
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_UnrestrictedName_4=ruleUnrestrictedName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalNML

    // $ANTLR start synpred127_InternalNML
    public final void synpred127_InternalNML_fragment() throws RecognitionException {   
        EObject this_TypeLiteralCS_1 = null;


        // InternalNML.g:3982:3: (this_TypeLiteralCS_1= ruleTypeLiteralCS )
        // InternalNML.g:3982:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_TypeLiteralCS_1=ruleTypeLiteralCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred127_InternalNML

    // $ANTLR start synpred130_InternalNML
    public final void synpred130_InternalNML_fragment() throws RecognitionException {   
        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;


        // InternalNML.g:4073:3: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) )
        // InternalNML.g:4073:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        {
        // InternalNML.g:4073:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        // InternalNML.g:4074:4: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        {
        if ( state.backtracking==0 ) {

          				/* */
          			
        }
        pushFollow(FollowSets000.FOLLOW_65);
        this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

        state._fsp--;
        if (state.failed) return ;
        // InternalNML.g:4085:4: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        int alt162=2;
        int LA162_0 = input.LA(1);

        if ( ((LA162_0>=38 && LA162_0<=39)||LA162_0==46||LA162_0==48||LA162_0==50||(LA162_0>=52 && LA162_0<=55)||(LA162_0>=57 && LA162_0<=58)||(LA162_0>=61 && LA162_0<=71)) ) {
            alt162=1;
        }
        switch (alt162) {
            case 1 :
                // InternalNML.g:4086:5: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                {
                // InternalNML.g:4086:5: ()
                // InternalNML.g:4087:6: 
                {
                if ( state.backtracking==0 ) {

                  						/* */
                  					
                }

                }

                // InternalNML.g:4096:5: ( (lv_name_2_0= ruleBinaryOperatorName ) )
                // InternalNML.g:4097:6: (lv_name_2_0= ruleBinaryOperatorName )
                {
                // InternalNML.g:4097:6: (lv_name_2_0= ruleBinaryOperatorName )
                // InternalNML.g:4098:7: lv_name_2_0= ruleBinaryOperatorName
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0());
                  						
                }
                pushFollow(FollowSets000.FOLLOW_56);
                lv_name_2_0=ruleBinaryOperatorName();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalNML.g:4115:5: ( (lv_ownedRight_3_0= ruleExpCS ) )
                // InternalNML.g:4116:6: (lv_ownedRight_3_0= ruleExpCS )
                {
                // InternalNML.g:4116:6: (lv_ownedRight_3_0= ruleExpCS )
                // InternalNML.g:4117:7: lv_ownedRight_3_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0());
                  						
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_ownedRight_3_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred130_InternalNML

    // $ANTLR start synpred137_InternalNML
    public final void synpred137_InternalNML_fragment() throws RecognitionException {   
        EObject this_TupleLiteralExpCS_4 = null;


        // InternalNML.g:4377:3: (this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS )
        // InternalNML.g:4377:3: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_TupleLiteralExpCS_4=ruleTupleLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred137_InternalNML

    // $ANTLR start synpred138_InternalNML
    public final void synpred138_InternalNML_fragment() throws RecognitionException {   
        EObject this_MapLiteralExpCS_5 = null;


        // InternalNML.g:4389:3: (this_MapLiteralExpCS_5= ruleMapLiteralExpCS )
        // InternalNML.g:4389:3: this_MapLiteralExpCS_5= ruleMapLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_MapLiteralExpCS_5=ruleMapLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred138_InternalNML

    // $ANTLR start synpred139_InternalNML
    public final void synpred139_InternalNML_fragment() throws RecognitionException {   
        EObject this_CollectionLiteralExpCS_6 = null;


        // InternalNML.g:4401:3: (this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS )
        // InternalNML.g:4401:3: this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_CollectionLiteralExpCS_6=ruleCollectionLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred139_InternalNML

    // $ANTLR start synpred141_InternalNML
    public final void synpred141_InternalNML_fragment() throws RecognitionException {   
        EObject this_TypeLiteralExpCS_8 = null;


        // InternalNML.g:4425:3: (this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS )
        // InternalNML.g:4425:3: this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_TypeLiteralExpCS_8=ruleTypeLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred141_InternalNML

    // $ANTLR start synpred154_InternalNML
    public final void synpred154_InternalNML_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedCoIterator_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;


        // InternalNML.g:4868:5: ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) )
        // InternalNML.g:4868:5: (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
        {
        // InternalNML.g:4868:5: (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
        // InternalNML.g:4869:6: otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
        {
        otherlv_1=(Token)match(input,90,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalNML.g:4873:6: ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) )
        // InternalNML.g:4874:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
        {
        // InternalNML.g:4874:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
        // InternalNML.g:4875:8: lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_0_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_75);
        lv_ownedCoIterator_2_0=ruleCoIteratorVariableCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalNML.g:4892:6: (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
        int alt167=2;
        int LA167_0 = input.LA(1);

        if ( (LA167_0==46) ) {
            alt167=1;
        }
        switch (alt167) {
            case 1 :
                // InternalNML.g:4893:7: otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                {
                otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_56); if (state.failed) return ;
                // InternalNML.g:4897:7: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                // InternalNML.g:4898:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                {
                // InternalNML.g:4898:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                // InternalNML.g:4899:9: lv_ownedInitExpression_4_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_0_2_1_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_ownedInitExpression_4_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred154_InternalNML

    // $ANTLR start synpred157_InternalNML
    public final void synpred157_InternalNML_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_ownedType_6_0 = null;

        EObject lv_ownedCoIterator_8_0 = null;

        EObject lv_ownedInitExpression_10_0 = null;


        // InternalNML.g:4919:5: ( (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) )
        // InternalNML.g:4919:5: (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
        {
        // InternalNML.g:4919:5: (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
        // InternalNML.g:4920:6: otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
        {
        otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_48); if (state.failed) return ;
        // InternalNML.g:4924:6: ( (lv_ownedType_6_0= ruleTypeExpCS ) )
        // InternalNML.g:4925:7: (lv_ownedType_6_0= ruleTypeExpCS )
        {
        // InternalNML.g:4925:7: (lv_ownedType_6_0= ruleTypeExpCS )
        // InternalNML.g:4926:8: lv_ownedType_6_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_1_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_76);
        lv_ownedType_6_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalNML.g:4943:6: (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )?
        int alt168=2;
        int LA168_0 = input.LA(1);

        if ( (LA168_0==90) ) {
            alt168=1;
        }
        switch (alt168) {
            case 1 :
                // InternalNML.g:4944:7: otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                {
                otherlv_7=(Token)match(input,90,FollowSets000.FOLLOW_3); if (state.failed) return ;
                // InternalNML.g:4948:7: ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                // InternalNML.g:4949:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                {
                // InternalNML.g:4949:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                // InternalNML.g:4950:9: lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_1_2_1_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_75);
                lv_ownedCoIterator_8_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalNML.g:4968:6: (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
        int alt169=2;
        int LA169_0 = input.LA(1);

        if ( (LA169_0==46) ) {
            alt169=1;
        }
        switch (alt169) {
            case 1 :
                // InternalNML.g:4969:7: otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                {
                otherlv_9=(Token)match(input,46,FollowSets000.FOLLOW_56); if (state.failed) return ;
                // InternalNML.g:4973:7: ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                // InternalNML.g:4974:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                {
                // InternalNML.g:4974:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                // InternalNML.g:4975:9: lv_ownedInitExpression_10_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_1_3_1_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_ownedInitExpression_10_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred157_InternalNML

    // $ANTLR start synpred160_InternalNML
    public final void synpred160_InternalNML_fragment() throws RecognitionException {   
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_ownedType_12_0 = null;

        EObject lv_ownedCoIterator_14_0 = null;

        EObject lv_ownedInitExpression_16_0 = null;


        // InternalNML.g:4995:5: ( ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )
        // InternalNML.g:4995:5: ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
        {
        // InternalNML.g:4995:5: ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
        // InternalNML.g:4996:6: (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
        {
        // InternalNML.g:4996:6: (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )?
        int alt170=2;
        int LA170_0 = input.LA(1);

        if ( (LA170_0==23) ) {
            alt170=1;
        }
        switch (alt170) {
            case 1 :
                // InternalNML.g:4997:7: otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                {
                otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_48); if (state.failed) return ;
                // InternalNML.g:5001:7: ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                // InternalNML.g:5002:8: (lv_ownedType_12_0= ruleTypeExpCS )
                {
                // InternalNML.g:5002:8: (lv_ownedType_12_0= ruleTypeExpCS )
                // InternalNML.g:5003:9: lv_ownedType_12_0= ruleTypeExpCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_2_0_1_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_77);
                lv_ownedType_12_0=ruleTypeExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalNML.g:5021:6: (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )?
        int alt171=2;
        int LA171_0 = input.LA(1);

        if ( (LA171_0==90) ) {
            alt171=1;
        }
        switch (alt171) {
            case 1 :
                // InternalNML.g:5022:7: otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                {
                otherlv_13=(Token)match(input,90,FollowSets000.FOLLOW_3); if (state.failed) return ;
                // InternalNML.g:5026:7: ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                // InternalNML.g:5027:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                {
                // InternalNML.g:5027:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                // InternalNML.g:5028:9: lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_2_1_1_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_78);
                lv_ownedCoIterator_14_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        otherlv_15=(Token)match(input,96,FollowSets000.FOLLOW_56); if (state.failed) return ;
        // InternalNML.g:5050:6: ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
        // InternalNML.g:5051:7: (lv_ownedInitExpression_16_0= ruleExpCS )
        {
        // InternalNML.g:5051:7: (lv_ownedInitExpression_16_0= ruleExpCS )
        // InternalNML.g:5052:8: lv_ownedInitExpression_16_0= ruleExpCS
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_2_3_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_ownedInitExpression_16_0=ruleExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred160_InternalNML

    // $ANTLR start synpred165_InternalNML
    public final void synpred165_InternalNML_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedCoIterator_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;


        // InternalNML.g:5253:4: ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) )
        // InternalNML.g:5253:4: (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
        {
        // InternalNML.g:5253:4: (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
        // InternalNML.g:5254:5: otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
        {
        otherlv_2=(Token)match(input,90,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalNML.g:5258:5: ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) )
        // InternalNML.g:5259:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
        {
        // InternalNML.g:5259:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
        // InternalNML.g:5260:7: lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_0_1_0());
          						
        }
        pushFollow(FollowSets000.FOLLOW_75);
        lv_ownedCoIterator_3_0=ruleCoIteratorVariableCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalNML.g:5277:5: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
        int alt179=2;
        int LA179_0 = input.LA(1);

        if ( (LA179_0==46) ) {
            alt179=1;
        }
        switch (alt179) {
            case 1 :
                // InternalNML.g:5278:6: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                {
                otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_56); if (state.failed) return ;
                // InternalNML.g:5282:6: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                // InternalNML.g:5283:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                {
                // InternalNML.g:5283:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                // InternalNML.g:5284:8: lv_ownedInitExpression_5_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_2_1_0());
                  							
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_ownedInitExpression_5_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred165_InternalNML

    // $ANTLR start synpred168_InternalNML
    public final void synpred168_InternalNML_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_ownedType_7_0 = null;

        EObject lv_ownedCoIterator_9_0 = null;

        EObject lv_ownedInitExpression_11_0 = null;


        // InternalNML.g:5304:4: ( (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) )
        // InternalNML.g:5304:4: (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
        {
        // InternalNML.g:5304:4: (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
        // InternalNML.g:5305:5: otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
        {
        otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_48); if (state.failed) return ;
        // InternalNML.g:5309:5: ( (lv_ownedType_7_0= ruleTypeExpCS ) )
        // InternalNML.g:5310:6: (lv_ownedType_7_0= ruleTypeExpCS )
        {
        // InternalNML.g:5310:6: (lv_ownedType_7_0= ruleTypeExpCS )
        // InternalNML.g:5311:7: lv_ownedType_7_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_1_0());
          						
        }
        pushFollow(FollowSets000.FOLLOW_76);
        lv_ownedType_7_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalNML.g:5328:5: (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )?
        int alt180=2;
        int LA180_0 = input.LA(1);

        if ( (LA180_0==90) ) {
            alt180=1;
        }
        switch (alt180) {
            case 1 :
                // InternalNML.g:5329:6: otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                {
                otherlv_8=(Token)match(input,90,FollowSets000.FOLLOW_3); if (state.failed) return ;
                // InternalNML.g:5333:6: ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                // InternalNML.g:5334:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                {
                // InternalNML.g:5334:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                // InternalNML.g:5335:8: lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_1_2_1_0());
                  							
                }
                pushFollow(FollowSets000.FOLLOW_75);
                lv_ownedCoIterator_9_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalNML.g:5353:5: (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
        int alt181=2;
        int LA181_0 = input.LA(1);

        if ( (LA181_0==46) ) {
            alt181=1;
        }
        switch (alt181) {
            case 1 :
                // InternalNML.g:5354:6: otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                {
                otherlv_10=(Token)match(input,46,FollowSets000.FOLLOW_56); if (state.failed) return ;
                // InternalNML.g:5358:6: ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                // InternalNML.g:5359:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                {
                // InternalNML.g:5359:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                // InternalNML.g:5360:8: lv_ownedInitExpression_11_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_1_3_1_0());
                  							
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_ownedInitExpression_11_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred168_InternalNML

    // $ANTLR start synpred171_InternalNML
    public final void synpred171_InternalNML_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_ownedType_13_0 = null;

        EObject lv_ownedCoIterator_15_0 = null;

        EObject lv_ownedInitExpression_17_0 = null;


        // InternalNML.g:5380:4: ( ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )
        // InternalNML.g:5380:4: ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
        {
        // InternalNML.g:5380:4: ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
        // InternalNML.g:5381:5: (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
        {
        // InternalNML.g:5381:5: (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )?
        int alt182=2;
        int LA182_0 = input.LA(1);

        if ( (LA182_0==23) ) {
            alt182=1;
        }
        switch (alt182) {
            case 1 :
                // InternalNML.g:5382:6: otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                {
                otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_48); if (state.failed) return ;
                // InternalNML.g:5386:6: ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                // InternalNML.g:5387:7: (lv_ownedType_13_0= ruleTypeExpCS )
                {
                // InternalNML.g:5387:7: (lv_ownedType_13_0= ruleTypeExpCS )
                // InternalNML.g:5388:8: lv_ownedType_13_0= ruleTypeExpCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_2_0_1_0());
                  							
                }
                pushFollow(FollowSets000.FOLLOW_77);
                lv_ownedType_13_0=ruleTypeExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalNML.g:5406:5: (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )?
        int alt183=2;
        int LA183_0 = input.LA(1);

        if ( (LA183_0==90) ) {
            alt183=1;
        }
        switch (alt183) {
            case 1 :
                // InternalNML.g:5407:6: otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                {
                otherlv_14=(Token)match(input,90,FollowSets000.FOLLOW_3); if (state.failed) return ;
                // InternalNML.g:5411:6: ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                // InternalNML.g:5412:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                {
                // InternalNML.g:5412:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                // InternalNML.g:5413:8: lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_2_1_1_0());
                  							
                }
                pushFollow(FollowSets000.FOLLOW_78);
                lv_ownedCoIterator_15_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        otherlv_16=(Token)match(input,96,FollowSets000.FOLLOW_56); if (state.failed) return ;
        // InternalNML.g:5435:5: ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
        // InternalNML.g:5436:6: (lv_ownedInitExpression_17_0= ruleExpCS )
        {
        // InternalNML.g:5436:6: (lv_ownedInitExpression_17_0= ruleExpCS )
        // InternalNML.g:5437:7: lv_ownedInitExpression_17_0= ruleExpCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_3_0());
          						
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_ownedInitExpression_17_0=ruleExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred171_InternalNML

    // Delegated rules

    public final boolean synpred171_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred171_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred160_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred160_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred139_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred139_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred127_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred127_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred130_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred130_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred141_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred141_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred138_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred138_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred168_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred168_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred157_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred157_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred137_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred137_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred154_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred154_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred165_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred165_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA28 dfa28 = new DFA28(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA87 dfa87 = new DFA87(this);
    protected DFA103 dfa103 = new DFA103(this);
    protected DFA112 dfa112 = new DFA112(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\5\1\uffff\2\0\1\5\1\uffff\10\5";
    static final String dfa_3s = "\1\70\1\uffff\2\0\1\6\1\uffff\2\71\1\61\1\6\4\71";
    static final String dfa_4s = "\1\uffff\1\2\3\uffff\1\1\10\uffff";
    static final String dfa_5s = "\2\uffff\1\1\1\0\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\37\uffff\3\5\4\uffff\1\1\1\4\1\1\4\uffff\5\5",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\6\1\7",
            "",
            "\2\5\21\uffff\1\1\15\uffff\3\5\4\uffff\3\5\1\10\1\uffff\2\1\5\5\1\11",
            "\2\5\21\uffff\1\1\15\uffff\3\5\4\uffff\3\5\1\10\1\uffff\2\1\5\5\1\11",
            "\1\12\1\13\52\uffff\1\1",
            "\1\12\1\13",
            "\2\5\21\uffff\1\1\15\uffff\3\5\2\uffff\1\14\1\15\3\5\1\10\1\uffff\2\1\5\5\1\11",
            "\2\5\21\uffff\1\1\15\uffff\3\5\2\uffff\1\14\1\15\3\5\1\10\1\uffff\2\1\5\5\1\11",
            "\2\5\21\uffff\1\1\15\uffff\3\5\3\uffff\1\15\3\5\1\10\1\uffff\2\1\5\5\1\11",
            "\2\5\21\uffff\1\1\15\uffff\3\5\4\uffff\3\5\1\10\1\uffff\2\1\5\5\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()+ loopback of 984:4: ( (otherlv_12= 'or' | otherlv_13= 'and' )? ( (lv_ownedConditions_14_0= ruleConditionCS ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_3 = input.LA(1);

                         
                        int index28_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalNML()) ) {s = 5;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index28_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalNML()) ) {s = 5;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index28_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\3\5\1\uffff\2\5\1\uffff\4\5";
    static final String dfa_9s = "\1\57\2\71\1\uffff\1\61\1\6\1\uffff\4\71";
    static final String dfa_10s = "\3\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\2\47\uffff\2\3",
            "\2\6\21\uffff\1\3\25\uffff\2\6\1\4\1\uffff\2\3\5\uffff\1\5",
            "\2\6\21\uffff\1\3\25\uffff\2\6\1\4\1\uffff\2\3\5\uffff\1\5",
            "",
            "\1\7\1\10\52\uffff\1\3",
            "\1\7\1\10",
            "",
            "\2\6\21\uffff\1\3\22\uffff\1\11\1\12\1\uffff\2\6\1\4\1\uffff\2\3\5\uffff\1\5",
            "\2\6\21\uffff\1\3\22\uffff\1\11\1\12\1\uffff\2\6\1\4\1\uffff\2\3\5\uffff\1\5",
            "\2\6\21\uffff\1\3\23\uffff\1\12\1\uffff\2\6\1\4\1\uffff\2\3\5\uffff\1\5",
            "\2\6\21\uffff\1\3\25\uffff\2\6\1\4\1\uffff\2\3\5\uffff\1\5"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1283:3: ( (lv_ownedElement_1_0= ruleFQN ) )?";
        }
    }
    static final String dfa_13s = "\23\uffff";
    static final String dfa_14s = "\1\5\12\uffff\5\0\3\uffff";
    static final String dfa_15s = "\1\126\12\uffff\5\0\3\uffff";
    static final String dfa_16s = "\1\uffff\1\1\1\uffff\1\2\16\uffff\1\3";
    static final String dfa_17s = "\13\uffff\1\0\1\1\1\2\1\3\1\4\3\uffff}>";
    static final String[] dfa_18s = {
            "\2\1\101\uffff\12\3\1\13\1\14\1\15\1\16\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "3969:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_11 = input.LA(1);

                         
                        int index81_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_InternalNML()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index81_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA81_12 = input.LA(1);

                         
                        int index81_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_InternalNML()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index81_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA81_13 = input.LA(1);

                         
                        int index81_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_InternalNML()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index81_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA81_14 = input.LA(1);

                         
                        int index81_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_InternalNML()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index81_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA81_15 = input.LA(1);

                         
                        int index81_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_InternalNML()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index81_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\41\uffff";
    static final String dfa_20s = "\1\4\3\0\35\uffff";
    static final String dfa_21s = "\1\150\3\0\35\uffff";
    static final String dfa_22s = "\4\uffff\1\1\33\uffff\1\2";
    static final String dfa_23s = "\1\uffff\1\0\1\1\1\2\35\uffff}>";
    static final String[] dfa_24s = {
            "\4\4\43\uffff\1\4\16\uffff\1\1\1\2\1\3\1\4\12\uffff\17\4\2\uffff\1\4\1\uffff\4\4\3\uffff\1\4\4\uffff\1\40\1\4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "4072:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA84_1 = input.LA(1);

                         
                        int index84_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred130_InternalNML()) ) {s = 4;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index84_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA84_2 = input.LA(1);

                         
                        int index84_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred130_InternalNML()) ) {s = 4;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index84_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA84_3 = input.LA(1);

                         
                        int index84_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred130_InternalNML()) ) {s = 4;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index84_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 84, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_25s = "\40\uffff";
    static final String dfa_26s = "\1\4\12\uffff\7\0\16\uffff";
    static final String dfa_27s = "\1\150\12\uffff\7\0\16\uffff";
    static final String dfa_28s = "\1\uffff\1\1\1\2\1\3\1\4\15\uffff\1\10\1\11\7\uffff\1\12\1\uffff\1\5\1\6\1\7";
    static final String dfa_29s = "\13\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\16\uffff}>";
    static final String[] dfa_30s = {
            "\1\4\2\33\1\4\43\uffff\1\1\21\uffff\1\4\12\uffff\1\14\1\13\10\23\1\15\1\16\1\17\1\20\1\21\2\uffff\1\22\1\uffff\4\4\3\uffff\1\2\5\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA87 extends DFA {

        public DFA87(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 87;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "4328:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA87_11 = input.LA(1);

                         
                        int index87_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_InternalNML()) ) {s = 29;}

                        else if ( (synpred141_InternalNML()) ) {s = 19;}

                         
                        input.seek(index87_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA87_12 = input.LA(1);

                         
                        int index87_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNML()) ) {s = 30;}

                        else if ( (synpred141_InternalNML()) ) {s = 19;}

                         
                        input.seek(index87_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA87_13 = input.LA(1);

                         
                        int index87_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred139_InternalNML()) ) {s = 31;}

                        else if ( (synpred141_InternalNML()) ) {s = 19;}

                         
                        input.seek(index87_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA87_14 = input.LA(1);

                         
                        int index87_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred139_InternalNML()) ) {s = 31;}

                        else if ( (synpred141_InternalNML()) ) {s = 19;}

                         
                        input.seek(index87_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA87_15 = input.LA(1);

                         
                        int index87_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred139_InternalNML()) ) {s = 31;}

                        else if ( (synpred141_InternalNML()) ) {s = 19;}

                         
                        input.seek(index87_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA87_16 = input.LA(1);

                         
                        int index87_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred139_InternalNML()) ) {s = 31;}

                        else if ( (synpred141_InternalNML()) ) {s = 19;}

                         
                        input.seek(index87_16);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA87_17 = input.LA(1);

                         
                        int index87_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred139_InternalNML()) ) {s = 31;}

                        else if ( (synpred141_InternalNML()) ) {s = 19;}

                         
                        input.seek(index87_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 87, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_31s = "\1\4\12\uffff";
    static final String dfa_32s = "\1\27\2\0\10\uffff";
    static final String dfa_33s = "\1\141\2\0\10\uffff";
    static final String dfa_34s = "\3\uffff\1\3\1\4\4\uffff\1\1\1\2";
    static final String dfa_35s = "\1\uffff\1\0\1\1\10\uffff}>";
    static final String[] dfa_36s = {
            "\1\2\1\4\2\uffff\1\4\20\uffff\1\4\55\uffff\1\1\5\uffff\1\3\1\4",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[][] dfa_36 = unpackEncodedStringArray(dfa_36s);

    class DFA103 extends DFA {

        public DFA103(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 103;
            this.eot = dfa_7;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "4867:4: ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA103_1 = input.LA(1);

                         
                        int index103_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalNML()) ) {s = 9;}

                        else if ( (synpred160_InternalNML()) ) {s = 3;}

                         
                        input.seek(index103_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA103_2 = input.LA(1);

                         
                        int index103_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred157_InternalNML()) ) {s = 10;}

                        else if ( (synpred160_InternalNML()) ) {s = 3;}

                         
                        input.seek(index103_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 103, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA112 extends DFA {

        public DFA112(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 112;
            this.eot = dfa_7;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "5252:3: ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA112_1 = input.LA(1);

                         
                        int index112_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred165_InternalNML()) ) {s = 9;}

                        else if ( (synpred171_InternalNML()) ) {s = 3;}

                         
                        input.seek(index112_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA112_2 = input.LA(1);

                         
                        int index112_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred168_InternalNML()) ) {s = 10;}

                        else if ( (synpred171_InternalNML()) ) {s = 3;}

                         
                        input.seek(index112_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 112, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000007C0000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020060L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000E00000080060L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000380000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000000E0L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000038000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040020000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008020000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000E00000000060L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000238000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000320000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000220000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000028000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000E02000000060L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x01F041C000000060L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x01F0E1C000000060L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040008000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100008000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000C00000000060L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000D000001000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000C000001000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x01F0410000000060L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0201000000000002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0201180000000002L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0201100000000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000060L,0x00000000007FFF00L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000120000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000100000000060L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x3C000800008800F0L,0x000001847A7FFF00L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x3C000800008000F0L,0x000001847A7FFF00L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x3C000800000000F0L,0x000001847A7FFF00L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000008000000L,0x0000000001000000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x3C000800000800F0L,0x000001847A7FFF00L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000400000800000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0xE6F540C000000002L,0x00000000000000FFL});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x3C000800000000F0L,0x000001047A7FFF00L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x00000A0000020002L,0x0000000080000000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000020002L,0x0000000080000000L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x00000000000800E0L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x3C001800008000F0L,0x000001847A7FFF00L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000100009000000L,0x0000000200000000L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000800002L,0x0000000104000000L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000400000000002L,0x0000000004000000L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000104000000L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000005000000000L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000008000000L,0x0000000100000000L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000480000800000L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x2000000000000010L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x2004000000000010L,0x0000080000000000L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000040000000000L,0x0000060000000000L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000020008000002L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000060L,0x0000080000000000L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    }


}
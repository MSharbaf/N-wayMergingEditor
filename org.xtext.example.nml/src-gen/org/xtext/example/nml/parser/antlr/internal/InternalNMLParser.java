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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_SIMPLE_ID", "RULE_ESCAPED_ID", "RULE_SINGLE_QUOTED_STRING", "RULE_ESCAPED_CHARACTER", "RULE_LETTER_CHARACTER", "RULE_DOUBLE_QUOTED_STRING", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'pre'", "'}'", "'rule'", "'post'", "'import'", "':'", "';'", "'mergeOctopus'", "'with'", "','", "'withBase'", "'into'", "'extends'", "'mergeOurs'", "'exists_in'", "'priority'", "'transform'", "'to'", "'guard'", "'or'", "'and'", "'!'", "'['", "']'", "'var'", "'='", "'::='", "'.'", "'equivalent'", "'('", "')'", "'+'", "'new'", "'>'", "'<'", "'<>'", "'>='", "'=<'", "'->'", "'-'", "'not'", "'not2'", "'*'", "'/'", "'<='", "'and2'", "'implies'", "'implies2'", "'or2'", "'xor'", "'xor2'", "'?.'", "'?->'", "'Map'", "'Tuple'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'..'", "'++'", "'Lambda'", "'<-'", "'true'", "'false'", "'invalid'", "'null'", "'@'", "'in'", "'|'", "'if'", "'then'", "'else'", "'endif'", "'elseif'", "'let'", "'self'", "'|?'", "'|1'", "'?'", "'::'", "'&&'"
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
    // InternalNML.g:77:1: ruleTopLevelCP returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedDomains_3_0= ruleDomainCP ) )+ (otherlv_4= 'pre' ( ruleUnrestrictedName )? otherlv_6= '{' ( (lv_ownedPre_7_0= ruleStatementCS ) )* otherlv_8= '}' )? (otherlv_9= 'rule' ruleUnrestrictedName ( (lv_ownedOctopus_11_0= ruleOctopusCP ) ) )* (otherlv_12= 'rule' ruleUnrestrictedName ( (lv_ownedOurs_14_0= ruleOursCP ) ) )* (otherlv_15= 'rule' ruleUnrestrictedName ( (lv_ownedTransformation_17_0= ruleTransformationCP ) ) )* (otherlv_18= 'post' ( ruleUnrestrictedName )? otherlv_20= '{' ( (lv_ownedPre_21_0= ruleStatementCS ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
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
            // InternalNML.g:83:2: ( (otherlv_0= 'module' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedDomains_3_0= ruleDomainCP ) )+ (otherlv_4= 'pre' ( ruleUnrestrictedName )? otherlv_6= '{' ( (lv_ownedPre_7_0= ruleStatementCS ) )* otherlv_8= '}' )? (otherlv_9= 'rule' ruleUnrestrictedName ( (lv_ownedOctopus_11_0= ruleOctopusCP ) ) )* (otherlv_12= 'rule' ruleUnrestrictedName ( (lv_ownedOurs_14_0= ruleOursCP ) ) )* (otherlv_15= 'rule' ruleUnrestrictedName ( (lv_ownedTransformation_17_0= ruleTransformationCP ) ) )* (otherlv_18= 'post' ( ruleUnrestrictedName )? otherlv_20= '{' ( (lv_ownedPre_21_0= ruleStatementCS ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // InternalNML.g:84:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedDomains_3_0= ruleDomainCP ) )+ (otherlv_4= 'pre' ( ruleUnrestrictedName )? otherlv_6= '{' ( (lv_ownedPre_7_0= ruleStatementCS ) )* otherlv_8= '}' )? (otherlv_9= 'rule' ruleUnrestrictedName ( (lv_ownedOctopus_11_0= ruleOctopusCP ) ) )* (otherlv_12= 'rule' ruleUnrestrictedName ( (lv_ownedOurs_14_0= ruleOursCP ) ) )* (otherlv_15= 'rule' ruleUnrestrictedName ( (lv_ownedTransformation_17_0= ruleTransformationCP ) ) )* (otherlv_18= 'post' ( ruleUnrestrictedName )? otherlv_20= '{' ( (lv_ownedPre_21_0= ruleStatementCS ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // InternalNML.g:84:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedDomains_3_0= ruleDomainCP ) )+ (otherlv_4= 'pre' ( ruleUnrestrictedName )? otherlv_6= '{' ( (lv_ownedPre_7_0= ruleStatementCS ) )* otherlv_8= '}' )? (otherlv_9= 'rule' ruleUnrestrictedName ( (lv_ownedOctopus_11_0= ruleOctopusCP ) ) )* (otherlv_12= 'rule' ruleUnrestrictedName ( (lv_ownedOurs_14_0= ruleOursCP ) ) )* (otherlv_15= 'rule' ruleUnrestrictedName ( (lv_ownedTransformation_17_0= ruleTransformationCP ) ) )* (otherlv_18= 'post' ( ruleUnrestrictedName )? otherlv_20= '{' ( (lv_ownedPre_21_0= ruleStatementCS ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // InternalNML.g:85:3: otherlv_0= 'module' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedDomains_3_0= ruleDomainCP ) )+ (otherlv_4= 'pre' ( ruleUnrestrictedName )? otherlv_6= '{' ( (lv_ownedPre_7_0= ruleStatementCS ) )* otherlv_8= '}' )? (otherlv_9= 'rule' ruleUnrestrictedName ( (lv_ownedOctopus_11_0= ruleOctopusCP ) ) )* (otherlv_12= 'rule' ruleUnrestrictedName ( (lv_ownedOurs_14_0= ruleOursCP ) ) )* (otherlv_15= 'rule' ruleUnrestrictedName ( (lv_ownedTransformation_17_0= ruleTransformationCP ) ) )* (otherlv_18= 'post' ( ruleUnrestrictedName )? otherlv_20= '{' ( (lv_ownedPre_21_0= ruleStatementCS ) )* otherlv_22= '}' )? otherlv_23= '}'
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

                        if ( ((LA3_0>=RULE_SIMPLE_ID && LA3_0<=RULE_ESCAPED_ID)||(LA3_0>=42 && LA3_0<=44)) ) {
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

            // InternalNML.g:246:3: (otherlv_15= 'rule' ruleUnrestrictedName ( (lv_ownedTransformation_17_0= ruleTransformationCP ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalNML.g:247:4: otherlv_15= 'rule' ruleUnrestrictedName ( (lv_ownedTransformation_17_0= ruleTransformationCP ) )
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
            	    // InternalNML.g:261:4: ( (lv_ownedTransformation_17_0= ruleTransformationCP ) )
            	    // InternalNML.g:262:5: (lv_ownedTransformation_17_0= ruleTransformationCP )
            	    {
            	    // InternalNML.g:262:5: (lv_ownedTransformation_17_0= ruleTransformationCP )
            	    // InternalNML.g:263:6: lv_ownedTransformation_17_0= ruleTransformationCP
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTopLevelCPAccess().getOwnedTransformationTransformationCPParserRuleCall_7_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_ownedTransformation_17_0=ruleTransformationCP();

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
            	      							"org.xtext.example.nml.NML.TransformationCP");
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

                        if ( ((LA9_0>=RULE_SIMPLE_ID && LA9_0<=RULE_ESCAPED_ID)||(LA9_0>=42 && LA9_0<=44)) ) {
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

                if ( ((LA16_0>=RULE_SIMPLE_ID && LA16_0<=RULE_ESCAPED_ID)||(LA16_0>=42 && LA16_0<=44)) ) {
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

                if ( ((LA24_0>=RULE_SIMPLE_ID && LA24_0<=RULE_ESCAPED_ID)||(LA24_0>=42 && LA24_0<=44)) ) {
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


    // $ANTLR start "entryRuleTransformationCP"
    // InternalNML.g:859:1: entryRuleTransformationCP returns [EObject current=null] : iv_ruleTransformationCP= ruleTransformationCP EOF ;
    public final EObject entryRuleTransformationCP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationCP = null;


        try {
            // InternalNML.g:859:57: (iv_ruleTransformationCP= ruleTransformationCP EOF )
            // InternalNML.g:860:2: iv_ruleTransformationCP= ruleTransformationCP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransformationCPRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTransformationCP=ruleTransformationCP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransformationCP; 
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
    // $ANTLR end "entryRuleTransformationCP"


    // $ANTLR start "ruleTransformationCP"
    // InternalNML.g:866:1: ruleTransformationCP returns [EObject current=null] : (otherlv_0= 'transform' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'to' ( (lv_ownedModels_3_0= rulemodelTypeCS ) ) (otherlv_4= 'extends' ruleUnrestrictedName (otherlv_6= ',' ruleUnrestrictedName )* )? otherlv_8= '{' (otherlv_9= 'guard' ( (otherlv_10= 'or' | otherlv_11= 'and' )? ( (lv_ownedConditions_12_0= ruleConditionCS ) ) )+ )? ( (lv_ownedStatement_13_0= ruleStatementCS ) )+ otherlv_14= '}' ) ;
    public final EObject ruleTransformationCP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        EObject lv_ownedModels_1_0 = null;

        EObject lv_ownedModels_3_0 = null;

        EObject lv_ownedConditions_12_0 = null;

        EObject lv_ownedStatement_13_0 = null;



        	enterRule();

        try {
            // InternalNML.g:872:2: ( (otherlv_0= 'transform' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'to' ( (lv_ownedModels_3_0= rulemodelTypeCS ) ) (otherlv_4= 'extends' ruleUnrestrictedName (otherlv_6= ',' ruleUnrestrictedName )* )? otherlv_8= '{' (otherlv_9= 'guard' ( (otherlv_10= 'or' | otherlv_11= 'and' )? ( (lv_ownedConditions_12_0= ruleConditionCS ) ) )+ )? ( (lv_ownedStatement_13_0= ruleStatementCS ) )+ otherlv_14= '}' ) )
            // InternalNML.g:873:2: (otherlv_0= 'transform' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'to' ( (lv_ownedModels_3_0= rulemodelTypeCS ) ) (otherlv_4= 'extends' ruleUnrestrictedName (otherlv_6= ',' ruleUnrestrictedName )* )? otherlv_8= '{' (otherlv_9= 'guard' ( (otherlv_10= 'or' | otherlv_11= 'and' )? ( (lv_ownedConditions_12_0= ruleConditionCS ) ) )+ )? ( (lv_ownedStatement_13_0= ruleStatementCS ) )+ otherlv_14= '}' )
            {
            // InternalNML.g:873:2: (otherlv_0= 'transform' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'to' ( (lv_ownedModels_3_0= rulemodelTypeCS ) ) (otherlv_4= 'extends' ruleUnrestrictedName (otherlv_6= ',' ruleUnrestrictedName )* )? otherlv_8= '{' (otherlv_9= 'guard' ( (otherlv_10= 'or' | otherlv_11= 'and' )? ( (lv_ownedConditions_12_0= ruleConditionCS ) ) )+ )? ( (lv_ownedStatement_13_0= ruleStatementCS ) )+ otherlv_14= '}' )
            // InternalNML.g:874:3: otherlv_0= 'transform' ( (lv_ownedModels_1_0= rulemodelTypeCS ) ) otherlv_2= 'to' ( (lv_ownedModels_3_0= rulemodelTypeCS ) ) (otherlv_4= 'extends' ruleUnrestrictedName (otherlv_6= ',' ruleUnrestrictedName )* )? otherlv_8= '{' (otherlv_9= 'guard' ( (otherlv_10= 'or' | otherlv_11= 'and' )? ( (lv_ownedConditions_12_0= ruleConditionCS ) ) )+ )? ( (lv_ownedStatement_13_0= ruleStatementCS ) )+ otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTransformationCPAccess().getTransformKeyword_0());
              		
            }
            // InternalNML.g:878:3: ( (lv_ownedModels_1_0= rulemodelTypeCS ) )
            // InternalNML.g:879:4: (lv_ownedModels_1_0= rulemodelTypeCS )
            {
            // InternalNML.g:879:4: (lv_ownedModels_1_0= rulemodelTypeCS )
            // InternalNML.g:880:5: lv_ownedModels_1_0= rulemodelTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTransformationCPAccess().getOwnedModelsModelTypeCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_28);
            lv_ownedModels_1_0=rulemodelTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTransformationCPRule());
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

              			newLeafNode(otherlv_2, grammarAccess.getTransformationCPAccess().getToKeyword_2());
              		
            }
            // InternalNML.g:901:3: ( (lv_ownedModels_3_0= rulemodelTypeCS ) )
            // InternalNML.g:902:4: (lv_ownedModels_3_0= rulemodelTypeCS )
            {
            // InternalNML.g:902:4: (lv_ownedModels_3_0= rulemodelTypeCS )
            // InternalNML.g:903:5: lv_ownedModels_3_0= rulemodelTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTransformationCPAccess().getOwnedModelsModelTypeCSParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_20);
            lv_ownedModels_3_0=rulemodelTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTransformationCPRule());
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

            // InternalNML.g:920:3: (otherlv_4= 'extends' ruleUnrestrictedName (otherlv_6= ',' ruleUnrestrictedName )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalNML.g:921:4: otherlv_4= 'extends' ruleUnrestrictedName (otherlv_6= ',' ruleUnrestrictedName )*
                    {
                    otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTransformationCPAccess().getExtendsKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTransformationCPAccess().getUnrestrictedNameParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalNML.g:935:4: (otherlv_6= ',' ruleUnrestrictedName )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==27) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalNML.g:936:5: otherlv_6= ',' ruleUnrestrictedName
                    	    {
                    	    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getTransformationCPAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					/* */
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getTransformationCPAccess().getUnrestrictedNameParserRuleCall_4_2_1());
                    	      				
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

            otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getTransformationCPAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalNML.g:956:3: (otherlv_9= 'guard' ( (otherlv_10= 'or' | otherlv_11= 'and' )? ( (lv_ownedConditions_12_0= ruleConditionCS ) ) )+ )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalNML.g:957:4: otherlv_9= 'guard' ( (otherlv_10= 'or' | otherlv_11= 'and' )? ( (lv_ownedConditions_12_0= ruleConditionCS ) ) )+
                    {
                    otherlv_9=(Token)match(input,36,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getTransformationCPAccess().getGuardKeyword_6_0());
                      			
                    }
                    // InternalNML.g:961:4: ( (otherlv_10= 'or' | otherlv_11= 'and' )? ( (lv_ownedConditions_12_0= ruleConditionCS ) ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        alt28 = dfa28.predict(input);
                        switch (alt28) {
                    	case 1 :
                    	    // InternalNML.g:962:5: (otherlv_10= 'or' | otherlv_11= 'and' )? ( (lv_ownedConditions_12_0= ruleConditionCS ) )
                    	    {
                    	    // InternalNML.g:962:5: (otherlv_10= 'or' | otherlv_11= 'and' )?
                    	    int alt27=3;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==37) ) {
                    	        alt27=1;
                    	    }
                    	    else if ( (LA27_0==38) ) {
                    	        alt27=2;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // InternalNML.g:963:6: otherlv_10= 'or'
                    	            {
                    	            otherlv_10=(Token)match(input,37,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_10, grammarAccess.getTransformationCPAccess().getOrKeyword_6_1_0_0());
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalNML.g:968:6: otherlv_11= 'and'
                    	            {
                    	            otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_11, grammarAccess.getTransformationCPAccess().getAndKeyword_6_1_0_1());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // InternalNML.g:973:5: ( (lv_ownedConditions_12_0= ruleConditionCS ) )
                    	    // InternalNML.g:974:6: (lv_ownedConditions_12_0= ruleConditionCS )
                    	    {
                    	    // InternalNML.g:974:6: (lv_ownedConditions_12_0= ruleConditionCS )
                    	    // InternalNML.g:975:7: lv_ownedConditions_12_0= ruleConditionCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTransformationCPAccess().getOwnedConditionsConditionCSParserRuleCall_6_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_31);
                    	    lv_ownedConditions_12_0=ruleConditionCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTransformationCPRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedConditions",
                    	      								lv_ownedConditions_12_0,
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

            // InternalNML.g:994:3: ( (lv_ownedStatement_13_0= ruleStatementCS ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_SIMPLE_ID && LA30_0<=RULE_ESCAPED_ID)||(LA30_0>=42 && LA30_0<=44)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalNML.g:995:4: (lv_ownedStatement_13_0= ruleStatementCS )
            	    {
            	    // InternalNML.g:995:4: (lv_ownedStatement_13_0= ruleStatementCS )
            	    // InternalNML.g:996:5: lv_ownedStatement_13_0= ruleStatementCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTransformationCPAccess().getOwnedStatementStatementCSParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_ownedStatement_13_0=ruleStatementCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTransformationCPRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedStatement",
            	      						lv_ownedStatement_13_0,
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

            otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getTransformationCPAccess().getRightCurlyBracketKeyword_8());
              		
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
    // $ANTLR end "ruleTransformationCP"


    // $ANTLR start "entryRulemodelTypeCS"
    // InternalNML.g:1021:1: entryRulemodelTypeCS returns [EObject current=null] : iv_rulemodelTypeCS= rulemodelTypeCS EOF ;
    public final EObject entryRulemodelTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemodelTypeCS = null;


        try {
            // InternalNML.g:1021:52: (iv_rulemodelTypeCS= rulemodelTypeCS EOF )
            // InternalNML.g:1022:2: iv_rulemodelTypeCS= rulemodelTypeCS EOF
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
    // InternalNML.g:1028:1: rulemodelTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ruleUnrestrictedName otherlv_3= '!' ruleUnrestrictedName ) ;
    public final EObject rulemodelTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalNML.g:1034:2: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ruleUnrestrictedName otherlv_3= '!' ruleUnrestrictedName ) )
            // InternalNML.g:1035:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ruleUnrestrictedName otherlv_3= '!' ruleUnrestrictedName )
            {
            // InternalNML.g:1035:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ruleUnrestrictedName otherlv_3= '!' ruleUnrestrictedName )
            // InternalNML.g:1036:3: ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ruleUnrestrictedName otherlv_3= '!' ruleUnrestrictedName
            {
            // InternalNML.g:1036:3: ( (lv_name_0_0= ruleIdentifier ) )
            // InternalNML.g:1037:4: (lv_name_0_0= ruleIdentifier )
            {
            // InternalNML.g:1037:4: (lv_name_0_0= ruleIdentifier )
            // InternalNML.g:1038:5: lv_name_0_0= ruleIdentifier
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
            pushFollow(FollowSets000.FOLLOW_32);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_3); if (state.failed) return current;
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
    // InternalNML.g:1087:1: entryRulemodelOrderCS returns [EObject current=null] : iv_rulemodelOrderCS= rulemodelOrderCS EOF ;
    public final EObject entryRulemodelOrderCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemodelOrderCS = null;


        try {
            // InternalNML.g:1087:53: (iv_rulemodelOrderCS= rulemodelOrderCS EOF )
            // InternalNML.g:1088:2: iv_rulemodelOrderCS= rulemodelOrderCS EOF
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
    // InternalNML.g:1094:1: rulemodelOrderCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' otherlv_2= '[' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* otherlv_6= ']' ) ;
    public final EObject rulemodelOrderCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalNML.g:1100:2: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' otherlv_2= '[' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* otherlv_6= ']' ) )
            // InternalNML.g:1101:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' otherlv_2= '[' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* otherlv_6= ']' )
            {
            // InternalNML.g:1101:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' otherlv_2= '[' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* otherlv_6= ']' )
            // InternalNML.g:1102:3: ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' otherlv_2= '[' ruleUnrestrictedName (otherlv_4= ',' ruleUnrestrictedName )* otherlv_6= ']'
            {
            // InternalNML.g:1102:3: ( (lv_name_0_0= ruleIdentifier ) )
            // InternalNML.g:1103:4: (lv_name_0_0= ruleIdentifier )
            {
            // InternalNML.g:1103:4: (lv_name_0_0= ruleIdentifier )
            // InternalNML.g:1104:5: lv_name_0_0= ruleIdentifier
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

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getModelOrderCSAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getModelOrderCSAccess().getLeftSquareBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getModelOrderCSAccess().getUnrestrictedNameParserRuleCall_3());
              		
            }
            pushFollow(FollowSets000.FOLLOW_34);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalNML.g:1139:3: (otherlv_4= ',' ruleUnrestrictedName )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==27) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalNML.g:1140:4: otherlv_4= ',' ruleUnrestrictedName
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
            	    pushFollow(FollowSets000.FOLLOW_34);
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

            otherlv_6=(Token)match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleStatementCS"
    // InternalNML.g:1163:1: entryRuleStatementCS returns [EObject current=null] : iv_ruleStatementCS= ruleStatementCS EOF ;
    public final EObject entryRuleStatementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementCS = null;


        try {
            // InternalNML.g:1163:52: (iv_ruleStatementCS= ruleStatementCS EOF )
            // InternalNML.g:1164:2: iv_ruleStatementCS= ruleStatementCS EOF
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
    // InternalNML.g:1170:1: ruleStatementCS returns [EObject current=null] : ( (otherlv_0= 'var' )? ( (lv_ownedElement_1_0= ruleFQN ) )? (otherlv_2= '=' | otherlv_3= '::=' )? ( (lv_ownedElement_4_0= ruleFQN ) ) (otherlv_5= '.' otherlv_6= 'equivalent' otherlv_7= '(' otherlv_8= ')' )? ( (otherlv_9= '+' | otherlv_10= 'new' ) ( (lv_ownedElement_11_0= ruleFQN ) ) )* otherlv_12= ';' ) ;
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
            // InternalNML.g:1176:2: ( ( (otherlv_0= 'var' )? ( (lv_ownedElement_1_0= ruleFQN ) )? (otherlv_2= '=' | otherlv_3= '::=' )? ( (lv_ownedElement_4_0= ruleFQN ) ) (otherlv_5= '.' otherlv_6= 'equivalent' otherlv_7= '(' otherlv_8= ')' )? ( (otherlv_9= '+' | otherlv_10= 'new' ) ( (lv_ownedElement_11_0= ruleFQN ) ) )* otherlv_12= ';' ) )
            // InternalNML.g:1177:2: ( (otherlv_0= 'var' )? ( (lv_ownedElement_1_0= ruleFQN ) )? (otherlv_2= '=' | otherlv_3= '::=' )? ( (lv_ownedElement_4_0= ruleFQN ) ) (otherlv_5= '.' otherlv_6= 'equivalent' otherlv_7= '(' otherlv_8= ')' )? ( (otherlv_9= '+' | otherlv_10= 'new' ) ( (lv_ownedElement_11_0= ruleFQN ) ) )* otherlv_12= ';' )
            {
            // InternalNML.g:1177:2: ( (otherlv_0= 'var' )? ( (lv_ownedElement_1_0= ruleFQN ) )? (otherlv_2= '=' | otherlv_3= '::=' )? ( (lv_ownedElement_4_0= ruleFQN ) ) (otherlv_5= '.' otherlv_6= 'equivalent' otherlv_7= '(' otherlv_8= ')' )? ( (otherlv_9= '+' | otherlv_10= 'new' ) ( (lv_ownedElement_11_0= ruleFQN ) ) )* otherlv_12= ';' )
            // InternalNML.g:1178:3: (otherlv_0= 'var' )? ( (lv_ownedElement_1_0= ruleFQN ) )? (otherlv_2= '=' | otherlv_3= '::=' )? ( (lv_ownedElement_4_0= ruleFQN ) ) (otherlv_5= '.' otherlv_6= 'equivalent' otherlv_7= '(' otherlv_8= ')' )? ( (otherlv_9= '+' | otherlv_10= 'new' ) ( (lv_ownedElement_11_0= ruleFQN ) ) )* otherlv_12= ';'
            {
            // InternalNML.g:1178:3: (otherlv_0= 'var' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalNML.g:1179:4: otherlv_0= 'var'
                    {
                    otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getStatementCSAccess().getVarKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalNML.g:1184:3: ( (lv_ownedElement_1_0= ruleFQN ) )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalNML.g:1185:4: (lv_ownedElement_1_0= ruleFQN )
                    {
                    // InternalNML.g:1185:4: (lv_ownedElement_1_0= ruleFQN )
                    // InternalNML.g:1186:5: lv_ownedElement_1_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStatementCSAccess().getOwnedElementFQNParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
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

            // InternalNML.g:1203:3: (otherlv_2= '=' | otherlv_3= '::=' )?
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==43) ) {
                alt34=1;
            }
            else if ( (LA34_0==44) ) {
                alt34=2;
            }
            switch (alt34) {
                case 1 :
                    // InternalNML.g:1204:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getStatementCSAccess().getEqualsSignKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:1209:4: otherlv_3= '::='
                    {
                    otherlv_3=(Token)match(input,44,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStatementCSAccess().getColonColonEqualsSignKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalNML.g:1214:3: ( (lv_ownedElement_4_0= ruleFQN ) )
            // InternalNML.g:1215:4: (lv_ownedElement_4_0= ruleFQN )
            {
            // InternalNML.g:1215:4: (lv_ownedElement_4_0= ruleFQN )
            // InternalNML.g:1216:5: lv_ownedElement_4_0= ruleFQN
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStatementCSAccess().getOwnedElementFQNParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_36);
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

            // InternalNML.g:1233:3: (otherlv_5= '.' otherlv_6= 'equivalent' otherlv_7= '(' otherlv_8= ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalNML.g:1234:4: otherlv_5= '.' otherlv_6= 'equivalent' otherlv_7= '(' otherlv_8= ')'
                    {
                    otherlv_5=(Token)match(input,45,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getStatementCSAccess().getFullStopKeyword_4_0());
                      			
                    }
                    otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getStatementCSAccess().getEquivalentKeyword_4_1());
                      			
                    }
                    otherlv_7=(Token)match(input,47,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getStatementCSAccess().getLeftParenthesisKeyword_4_2());
                      			
                    }
                    otherlv_8=(Token)match(input,48,FollowSets000.FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getStatementCSAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }
                    break;

            }

            // InternalNML.g:1251:3: ( (otherlv_9= '+' | otherlv_10= 'new' ) ( (lv_ownedElement_11_0= ruleFQN ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=49 && LA37_0<=50)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalNML.g:1252:4: (otherlv_9= '+' | otherlv_10= 'new' ) ( (lv_ownedElement_11_0= ruleFQN ) )
            	    {
            	    // InternalNML.g:1252:4: (otherlv_9= '+' | otherlv_10= 'new' )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==49) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==50) ) {
            	        alt36=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalNML.g:1253:5: otherlv_9= '+'
            	            {
            	            otherlv_9=(Token)match(input,49,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_9, grammarAccess.getStatementCSAccess().getPlusSignKeyword_5_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalNML.g:1258:5: otherlv_10= 'new'
            	            {
            	            otherlv_10=(Token)match(input,50,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_10, grammarAccess.getStatementCSAccess().getNewKeyword_5_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalNML.g:1263:4: ( (lv_ownedElement_11_0= ruleFQN ) )
            	    // InternalNML.g:1264:5: (lv_ownedElement_11_0= ruleFQN )
            	    {
            	    // InternalNML.g:1264:5: (lv_ownedElement_11_0= ruleFQN )
            	    // InternalNML.g:1265:6: lv_ownedElement_11_0= ruleFQN
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStatementCSAccess().getOwnedElementFQNParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_40);
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
            	    break loop37;
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
    // InternalNML.g:1291:1: entryRuleConditionCS returns [EObject current=null] : iv_ruleConditionCS= ruleConditionCS EOF ;
    public final EObject entryRuleConditionCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionCS = null;


        try {
            // InternalNML.g:1291:52: (iv_ruleConditionCS= ruleConditionCS EOF )
            // InternalNML.g:1292:2: iv_ruleConditionCS= ruleConditionCS EOF
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
    // InternalNML.g:1298:1: ruleConditionCS returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleFQN ) )? (otherlv_1= '>' | otherlv_2= '<' | otherlv_3= '=' | otherlv_4= '<>' | otherlv_5= '!' | otherlv_6= '>=' | otherlv_7= '=<' )? ( (lv_ownedElement_8_0= ruleFQN ) ) ) ;
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
            // InternalNML.g:1304:2: ( ( ( (lv_ownedElement_0_0= ruleFQN ) )? (otherlv_1= '>' | otherlv_2= '<' | otherlv_3= '=' | otherlv_4= '<>' | otherlv_5= '!' | otherlv_6= '>=' | otherlv_7= '=<' )? ( (lv_ownedElement_8_0= ruleFQN ) ) ) )
            // InternalNML.g:1305:2: ( ( (lv_ownedElement_0_0= ruleFQN ) )? (otherlv_1= '>' | otherlv_2= '<' | otherlv_3= '=' | otherlv_4= '<>' | otherlv_5= '!' | otherlv_6= '>=' | otherlv_7= '=<' )? ( (lv_ownedElement_8_0= ruleFQN ) ) )
            {
            // InternalNML.g:1305:2: ( ( (lv_ownedElement_0_0= ruleFQN ) )? (otherlv_1= '>' | otherlv_2= '<' | otherlv_3= '=' | otherlv_4= '<>' | otherlv_5= '!' | otherlv_6= '>=' | otherlv_7= '=<' )? ( (lv_ownedElement_8_0= ruleFQN ) ) )
            // InternalNML.g:1306:3: ( (lv_ownedElement_0_0= ruleFQN ) )? (otherlv_1= '>' | otherlv_2= '<' | otherlv_3= '=' | otherlv_4= '<>' | otherlv_5= '!' | otherlv_6= '>=' | otherlv_7= '=<' )? ( (lv_ownedElement_8_0= ruleFQN ) )
            {
            // InternalNML.g:1306:3: ( (lv_ownedElement_0_0= ruleFQN ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_SIMPLE_ID) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred40_InternalNML()) ) {
                    alt38=1;
                }
            }
            else if ( (LA38_0==RULE_ESCAPED_ID) ) {
                int LA38_2 = input.LA(2);

                if ( (synpred40_InternalNML()) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // InternalNML.g:1307:4: (lv_ownedElement_0_0= ruleFQN )
                    {
                    // InternalNML.g:1307:4: (lv_ownedElement_0_0= ruleFQN )
                    // InternalNML.g:1308:5: lv_ownedElement_0_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConditionCSAccess().getOwnedElementFQNParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
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

            // InternalNML.g:1325:3: (otherlv_1= '>' | otherlv_2= '<' | otherlv_3= '=' | otherlv_4= '<>' | otherlv_5= '!' | otherlv_6= '>=' | otherlv_7= '=<' )?
            int alt39=8;
            switch ( input.LA(1) ) {
                case 51:
                    {
                    alt39=1;
                    }
                    break;
                case 52:
                    {
                    alt39=2;
                    }
                    break;
                case 43:
                    {
                    alt39=3;
                    }
                    break;
                case 53:
                    {
                    alt39=4;
                    }
                    break;
                case 39:
                    {
                    alt39=5;
                    }
                    break;
                case 54:
                    {
                    alt39=6;
                    }
                    break;
                case 55:
                    {
                    alt39=7;
                    }
                    break;
            }

            switch (alt39) {
                case 1 :
                    // InternalNML.g:1326:4: otherlv_1= '>'
                    {
                    otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getConditionCSAccess().getGreaterThanSignKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:1331:4: otherlv_2= '<'
                    {
                    otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getConditionCSAccess().getLessThanSignKeyword_1_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalNML.g:1336:4: otherlv_3= '='
                    {
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getConditionCSAccess().getEqualsSignKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalNML.g:1341:4: otherlv_4= '<>'
                    {
                    otherlv_4=(Token)match(input,53,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getConditionCSAccess().getLessThanSignGreaterThanSignKeyword_1_3());
                      			
                    }

                    }
                    break;
                case 5 :
                    // InternalNML.g:1346:4: otherlv_5= '!'
                    {
                    otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getConditionCSAccess().getExclamationMarkKeyword_1_4());
                      			
                    }

                    }
                    break;
                case 6 :
                    // InternalNML.g:1351:4: otherlv_6= '>='
                    {
                    otherlv_6=(Token)match(input,54,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getConditionCSAccess().getGreaterThanSignEqualsSignKeyword_1_5());
                      			
                    }

                    }
                    break;
                case 7 :
                    // InternalNML.g:1356:4: otherlv_7= '=<'
                    {
                    otherlv_7=(Token)match(input,55,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getConditionCSAccess().getEqualsSignLessThanSignKeyword_1_6());
                      			
                    }

                    }
                    break;

            }

            // InternalNML.g:1361:3: ( (lv_ownedElement_8_0= ruleFQN ) )
            // InternalNML.g:1362:4: (lv_ownedElement_8_0= ruleFQN )
            {
            // InternalNML.g:1362:4: (lv_ownedElement_8_0= ruleFQN )
            // InternalNML.g:1363:5: lv_ownedElement_8_0= ruleFQN
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
    // InternalNML.g:1384:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalNML.g:1384:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalNML.g:1385:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalNML.g:1391:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_ID_1 = null;

        AntlrDatatypeRuleToken this_UnrestrictedName_4 = null;

        AntlrDatatypeRuleToken this_ID_5 = null;



        	enterRule();

        try {
            // InternalNML.g:1397:2: ( ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )* ) )
            // InternalNML.g:1398:2: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )* )
            {
            // InternalNML.g:1398:2: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )* )
            // InternalNML.g:1399:3: (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )*
            {
            // InternalNML.g:1399:3: (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_SIMPLE_ID) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred48_InternalNML()) ) {
                    alt40=1;
                }
                else if ( (true) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA40_0==RULE_ESCAPED_ID) ) {
                int LA40_2 = input.LA(2);

                if ( (synpred48_InternalNML()) ) {
                    alt40=1;
                }
                else if ( (true) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalNML.g:1400:4: this_UnrestrictedName_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFQNAccess().getUnrestrictedNameParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
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
                    // InternalNML.g:1411:4: this_ID_1= ruleID
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFQNAccess().getIDParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
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

            // InternalNML.g:1422:3: ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==45) ) {
                    int LA45_2 = input.LA(2);

                    if ( ((LA45_2>=RULE_SIMPLE_ID && LA45_2<=RULE_ESCAPED_ID)) ) {
                        alt45=1;
                    }


                }
                else if ( (LA45_0==56) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalNML.g:1423:4: (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )?
            	    {
            	    // InternalNML.g:1423:4: (kw= '.' | kw= '->' )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==45) ) {
            	        alt41=1;
            	    }
            	    else if ( (LA41_0==56) ) {
            	        alt41=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // InternalNML.g:1424:5: kw= '.'
            	            {
            	            kw=(Token)match(input,45,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalNML.g:1430:5: kw= '->'
            	            {
            	            kw=(Token)match(input,56,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getFQNAccess().getHyphenMinusGreaterThanSignKeyword_1_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalNML.g:1436:4: (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==RULE_SIMPLE_ID) ) {
            	        int LA42_1 = input.LA(2);

            	        if ( (synpred50_InternalNML()) ) {
            	            alt42=1;
            	        }
            	        else if ( (true) ) {
            	            alt42=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 42, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA42_0==RULE_ESCAPED_ID) ) {
            	        int LA42_2 = input.LA(2);

            	        if ( (synpred50_InternalNML()) ) {
            	            alt42=1;
            	        }
            	        else if ( (true) ) {
            	            alt42=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 42, 2, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalNML.g:1437:5: this_UnrestrictedName_4= ruleUnrestrictedName
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getFQNAccess().getUnrestrictedNameParserRuleCall_1_1_0());
            	              				
            	            }
            	            pushFollow(FollowSets000.FOLLOW_43);
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
            	            // InternalNML.g:1448:5: this_ID_5= ruleID
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getFQNAccess().getIDParserRuleCall_1_1_1());
            	              				
            	            }
            	            pushFollow(FollowSets000.FOLLOW_43);
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

            	    // InternalNML.g:1459:4: (kw= '(' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==47) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalNML.g:1460:5: kw= '('
            	            {
            	            kw=(Token)match(input,47,FollowSets000.FOLLOW_44); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getFQNAccess().getLeftParenthesisKeyword_1_2());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalNML.g:1466:4: (kw= ')' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==48) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalNML.g:1467:5: kw= ')'
            	            {
            	            kw=(Token)match(input,48,FollowSets000.FOLLOW_42); if (state.failed) return current;
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
            	    break loop45;
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
    // InternalNML.g:1478:1: entryRuleEssentialOCLUnaryOperatorName returns [String current=null] : iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF ;
    public final String entryRuleEssentialOCLUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnaryOperatorName = null;


        try {
            // InternalNML.g:1478:69: (iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF )
            // InternalNML.g:1479:2: iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF
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
    // InternalNML.g:1485:1: ruleEssentialOCLUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' | kw= 'not2' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNML.g:1491:2: ( (kw= '-' | kw= 'not' | kw= 'not2' ) )
            // InternalNML.g:1492:2: (kw= '-' | kw= 'not' | kw= 'not2' )
            {
            // InternalNML.g:1492:2: (kw= '-' | kw= 'not' | kw= 'not2' )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt46=1;
                }
                break;
            case 58:
                {
                alt46=2;
                }
                break;
            case 59:
                {
                alt46=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalNML.g:1493:3: kw= '-'
                    {
                    kw=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getHyphenMinusKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:1499:3: kw= 'not'
                    {
                    kw=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getNotKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNML.g:1505:3: kw= 'not2'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:1514:1: entryRuleEssentialOCLInfixOperatorName returns [String current=null] : iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF ;
    public final String entryRuleEssentialOCLInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperatorName = null;


        try {
            // InternalNML.g:1514:69: (iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF )
            // InternalNML.g:1515:2: iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF
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
    // InternalNML.g:1521:1: ruleEssentialOCLInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNML.g:1527:2: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' ) )
            // InternalNML.g:1528:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' )
            {
            // InternalNML.g:1528:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' )
            int alt47=18;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt47=1;
                }
                break;
            case 61:
                {
                alt47=2;
                }
                break;
            case 49:
                {
                alt47=3;
                }
                break;
            case 57:
                {
                alt47=4;
                }
                break;
            case 51:
                {
                alt47=5;
                }
                break;
            case 52:
                {
                alt47=6;
                }
                break;
            case 54:
                {
                alt47=7;
                }
                break;
            case 62:
                {
                alt47=8;
                }
                break;
            case 43:
                {
                alt47=9;
                }
                break;
            case 53:
                {
                alt47=10;
                }
                break;
            case 38:
                {
                alt47=11;
                }
                break;
            case 63:
                {
                alt47=12;
                }
                break;
            case 64:
                {
                alt47=13;
                }
                break;
            case 65:
                {
                alt47=14;
                }
                break;
            case 37:
                {
                alt47=15;
                }
                break;
            case 66:
                {
                alt47=16;
                }
                break;
            case 67:
                {
                alt47=17;
                }
                break;
            case 68:
                {
                alt47=18;
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
                    // InternalNML.g:1529:3: kw= '*'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:1535:3: kw= '/'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getSolidusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNML.g:1541:3: kw= '+'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getPlusSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNML.g:1547:3: kw= '-'
                    {
                    kw=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getHyphenMinusKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNML.g:1553:3: kw= '>'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNML.g:1559:3: kw= '<'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalNML.g:1565:3: kw= '>='
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignEqualsSignKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalNML.g:1571:3: kw= '<='
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignEqualsSignKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalNML.g:1577:3: kw= '='
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getEqualsSignKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalNML.g:1583:3: kw= '<>'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignGreaterThanSignKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalNML.g:1589:3: kw= 'and'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAndKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalNML.g:1595:3: kw= 'and2'
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAnd2Keyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalNML.g:1601:3: kw= 'implies'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getImpliesKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalNML.g:1607:3: kw= 'implies2'
                    {
                    kw=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getImplies2Keyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalNML.g:1613:3: kw= 'or'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getOrKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalNML.g:1619:3: kw= 'or2'
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getOr2Keyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalNML.g:1625:3: kw= 'xor'
                    {
                    kw=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getXorKeyword_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalNML.g:1631:3: kw= 'xor2'
                    {
                    kw=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:1640:1: entryRuleEssentialOCLNavigationOperatorName returns [String current=null] : iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF ;
    public final String entryRuleEssentialOCLNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperatorName = null;


        try {
            // InternalNML.g:1640:74: (iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF )
            // InternalNML.g:1641:2: iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF
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
    // InternalNML.g:1647:1: ruleEssentialOCLNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNML.g:1653:2: ( (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) )
            // InternalNML.g:1654:2: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            {
            // InternalNML.g:1654:2: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            int alt48=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt48=1;
                }
                break;
            case 56:
                {
                alt48=2;
                }
                break;
            case 69:
                {
                alt48=3;
                }
                break;
            case 70:
                {
                alt48=4;
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
                    // InternalNML.g:1655:3: kw= '.'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getFullStopKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:1661:3: kw= '->'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getHyphenMinusGreaterThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNML.g:1667:3: kw= '?.'
                    {
                    kw=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getQuestionMarkFullStopKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNML.g:1673:3: kw= '?->'
                    {
                    kw=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:1682:1: entryRuleBinaryOperatorName returns [String current=null] : iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF ;
    public final String entryRuleBinaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperatorName = null;


        try {
            // InternalNML.g:1682:58: (iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF )
            // InternalNML.g:1683:2: iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF
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
    // InternalNML.g:1689:1: ruleBinaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_InfixOperatorName_0 = null;

        AntlrDatatypeRuleToken this_NavigationOperatorName_1 = null;



        	enterRule();

        try {
            // InternalNML.g:1695:2: ( (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName ) )
            // InternalNML.g:1696:2: (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName )
            {
            // InternalNML.g:1696:2: (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=37 && LA49_0<=38)||LA49_0==43||LA49_0==49||(LA49_0>=51 && LA49_0<=54)||LA49_0==57||(LA49_0>=60 && LA49_0<=68)) ) {
                alt49=1;
            }
            else if ( (LA49_0==45||LA49_0==56||(LA49_0>=69 && LA49_0<=70)) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalNML.g:1697:3: this_InfixOperatorName_0= ruleInfixOperatorName
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
                    // InternalNML.g:1708:3: this_NavigationOperatorName_1= ruleNavigationOperatorName
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
    // InternalNML.g:1722:1: entryRuleInfixOperatorName returns [String current=null] : iv_ruleInfixOperatorName= ruleInfixOperatorName EOF ;
    public final String entryRuleInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperatorName = null;


        try {
            // InternalNML.g:1722:57: (iv_ruleInfixOperatorName= ruleInfixOperatorName EOF )
            // InternalNML.g:1723:2: iv_ruleInfixOperatorName= ruleInfixOperatorName EOF
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
    // InternalNML.g:1729:1: ruleInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName ;
    public final AntlrDatatypeRuleToken ruleInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperatorName_0 = null;



        	enterRule();

        try {
            // InternalNML.g:1735:2: (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName )
            // InternalNML.g:1736:2: this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName
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
    // InternalNML.g:1749:1: entryRuleNavigationOperatorName returns [String current=null] : iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF ;
    public final String entryRuleNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperatorName = null;


        try {
            // InternalNML.g:1749:62: (iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF )
            // InternalNML.g:1750:2: iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF
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
    // InternalNML.g:1756:1: ruleNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName ;
    public final AntlrDatatypeRuleToken ruleNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperatorName_0 = null;



        	enterRule();

        try {
            // InternalNML.g:1762:2: (this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName )
            // InternalNML.g:1763:2: this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName
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
    // InternalNML.g:1776:1: entryRuleUnaryOperatorName returns [String current=null] : iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF ;
    public final String entryRuleUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperatorName = null;


        try {
            // InternalNML.g:1776:57: (iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF )
            // InternalNML.g:1777:2: iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF
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
    // InternalNML.g:1783:1: ruleUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName ;
    public final AntlrDatatypeRuleToken ruleUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnaryOperatorName_0 = null;



        	enterRule();

        try {
            // InternalNML.g:1789:2: (this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName )
            // InternalNML.g:1790:2: this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName
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
    // InternalNML.g:1803:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // InternalNML.g:1803:68: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // InternalNML.g:1804:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
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
    // InternalNML.g:1810:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;



        	enterRule();

        try {
            // InternalNML.g:1816:2: (this_Identifier_0= ruleIdentifier )
            // InternalNML.g:1817:2: this_Identifier_0= ruleIdentifier
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
    // InternalNML.g:1830:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // InternalNML.g:1830:56: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // InternalNML.g:1831:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
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
    // InternalNML.g:1837:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;



        	enterRule();

        try {
            // InternalNML.g:1843:2: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // InternalNML.g:1844:2: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
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
    // InternalNML.g:1857:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // InternalNML.g:1857:66: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // InternalNML.g:1858:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
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
    // InternalNML.g:1864:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;



        	enterRule();

        try {
            // InternalNML.g:1870:2: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' ) )
            // InternalNML.g:1871:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' )
            {
            // InternalNML.g:1871:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' )
            int alt50=5;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
            case RULE_ESCAPED_ID:
                {
                alt50=1;
                }
                break;
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
                {
                alt50=2;
                }
                break;
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
                {
                alt50=3;
                }
                break;
            case 71:
                {
                alt50=4;
                }
                break;
            case 72:
                {
                alt50=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalNML.g:1872:3: this_UnrestrictedName_0= ruleUnrestrictedName
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
                    // InternalNML.g:1883:3: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
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
                    // InternalNML.g:1894:3: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
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
                    // InternalNML.g:1905:3: kw= 'Map'
                    {
                    kw=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnreservedNameAccess().getMapKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNML.g:1911:3: kw= 'Tuple'
                    {
                    kw=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:1920:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // InternalNML.g:1920:54: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // InternalNML.g:1921:2: iv_ruleUnreservedName= ruleUnreservedName EOF
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
    // InternalNML.g:1927:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;



        	enterRule();

        try {
            // InternalNML.g:1933:2: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // InternalNML.g:1934:2: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
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
    // InternalNML.g:1947:1: entryRuleURIFirstPathElementCS returns [EObject current=null] : iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF ;
    public final EObject entryRuleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIFirstPathElementCS = null;


        try {
            // InternalNML.g:1947:62: (iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF )
            // InternalNML.g:1948:2: iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF
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
    // InternalNML.g:1954:1: ruleURIFirstPathElementCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) ;
    public final EObject ruleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalNML.g:1960:2: ( ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) )
            // InternalNML.g:1961:2: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            {
            // InternalNML.g:1961:2: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_SIMPLE_ID && LA51_0<=RULE_ESCAPED_ID)) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalNML.g:1962:3: ( ( ruleUnrestrictedName ) )
                    {
                    // InternalNML.g:1962:3: ( ( ruleUnrestrictedName ) )
                    // InternalNML.g:1963:4: ( ruleUnrestrictedName )
                    {
                    // InternalNML.g:1963:4: ( ruleUnrestrictedName )
                    // InternalNML.g:1964:5: ruleUnrestrictedName
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
                    // InternalNML.g:1982:3: ( () ( ( ruleURI ) ) )
                    {
                    // InternalNML.g:1982:3: ( () ( ( ruleURI ) ) )
                    // InternalNML.g:1983:4: () ( ( ruleURI ) )
                    {
                    // InternalNML.g:1983:4: ()
                    // InternalNML.g:1984:5: 
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

                    // InternalNML.g:1993:4: ( ( ruleURI ) )
                    // InternalNML.g:1994:5: ( ruleURI )
                    {
                    // InternalNML.g:1994:5: ( ruleURI )
                    // InternalNML.g:1995:6: ruleURI
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
    // InternalNML.g:2017:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // InternalNML.g:2017:63: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // InternalNML.g:2018:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
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
    // InternalNML.g:2024:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNML.g:2030:2: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // InternalNML.g:2031:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // InternalNML.g:2031:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt52=8;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt52=1;
                }
                break;
            case 74:
                {
                alt52=2;
                }
                break;
            case 75:
                {
                alt52=3;
                }
                break;
            case 76:
                {
                alt52=4;
                }
                break;
            case 77:
                {
                alt52=5;
                }
                break;
            case 78:
                {
                alt52=6;
                }
                break;
            case 79:
                {
                alt52=7;
                }
                break;
            case 80:
                {
                alt52=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalNML.g:2032:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:2038:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNML.g:2044:3: kw= 'Real'
                    {
                    kw=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNML.g:2050:3: kw= 'String'
                    {
                    kw=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNML.g:2056:3: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNML.g:2062:3: kw= 'OclAny'
                    {
                    kw=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalNML.g:2068:3: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,79,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalNML.g:2074:3: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,80,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:2083:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // InternalNML.g:2083:56: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // InternalNML.g:2084:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
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
    // InternalNML.g:2090:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalNML.g:2096:2: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // InternalNML.g:2097:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // InternalNML.g:2097:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // InternalNML.g:2098:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // InternalNML.g:2098:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // InternalNML.g:2099:4: lv_name_0_0= rulePrimitiveTypeIdentifier
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
    // InternalNML.g:2119:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // InternalNML.g:2119:64: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // InternalNML.g:2120:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
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
    // InternalNML.g:2126:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNML.g:2132:2: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // InternalNML.g:2133:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // InternalNML.g:2133:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt53=5;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt53=1;
                }
                break;
            case 82:
                {
                alt53=2;
                }
                break;
            case 83:
                {
                alt53=3;
                }
                break;
            case 84:
                {
                alt53=4;
                }
                break;
            case 85:
                {
                alt53=5;
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
                    // InternalNML.g:2134:3: kw= 'Set'
                    {
                    kw=(Token)match(input,81,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:2140:3: kw= 'Bag'
                    {
                    kw=(Token)match(input,82,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNML.g:2146:3: kw= 'Sequence'
                    {
                    kw=(Token)match(input,83,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNML.g:2152:3: kw= 'Collection'
                    {
                    kw=(Token)match(input,84,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNML.g:2158:3: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,85,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:2167:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // InternalNML.g:2167:57: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // InternalNML.g:2168:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
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
    // InternalNML.g:2174:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedCollectionMultiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalNML.g:2180:2: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? ) )
            // InternalNML.g:2181:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? )
            {
            // InternalNML.g:2181:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? )
            // InternalNML.g:2182:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )?
            {
            // InternalNML.g:2182:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // InternalNML.g:2183:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // InternalNML.g:2183:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // InternalNML.g:2184:5: lv_name_0_0= ruleCollectionTypeIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_45);
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

            // InternalNML.g:2201:3: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==47) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalNML.g:2202:4: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalNML.g:2206:4: ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) )
                    // InternalNML.g:2207:5: (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS )
                    {
                    // InternalNML.g:2207:5: (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS )
                    // InternalNML.g:2208:6: lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpWithoutMultiplicityCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_47);
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

                    // InternalNML.g:2225:4: ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==40) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalNML.g:2226:5: (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS )
                            {
                            // InternalNML.g:2226:5: (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS )
                            // InternalNML.g:2227:6: lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedCollectionMultiplicityMultiplicityCSParserRuleCall_1_2_0());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_39);
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

                    otherlv_4=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:2253:1: entryRuleMapTypeCS returns [EObject current=null] : iv_ruleMapTypeCS= ruleMapTypeCS EOF ;
    public final EObject entryRuleMapTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapTypeCS = null;


        try {
            // InternalNML.g:2253:50: (iv_ruleMapTypeCS= ruleMapTypeCS EOF )
            // InternalNML.g:2254:2: iv_ruleMapTypeCS= ruleMapTypeCS EOF
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
    // InternalNML.g:2260:1: ruleMapTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) ;
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
            // InternalNML.g:2266:2: ( ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) )
            // InternalNML.g:2267:2: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            {
            // InternalNML.g:2267:2: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            // InternalNML.g:2268:3: ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            {
            // InternalNML.g:2268:3: ( (lv_name_0_0= 'Map' ) )
            // InternalNML.g:2269:4: (lv_name_0_0= 'Map' )
            {
            // InternalNML.g:2269:4: (lv_name_0_0= 'Map' )
            // InternalNML.g:2270:5: lv_name_0_0= 'Map'
            {
            lv_name_0_0=(Token)match(input,71,FollowSets000.FOLLOW_45); if (state.failed) return current;
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

            // InternalNML.g:2282:3: (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==47) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalNML.g:2283:4: otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMapTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalNML.g:2287:4: ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) )
                    // InternalNML.g:2288:5: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    {
                    // InternalNML.g:2288:5: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    // InternalNML.g:2289:6: lv_ownedKeyType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedKeyTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
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

                    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMapTypeCSAccess().getCommaKeyword_1_2());
                      			
                    }
                    // InternalNML.g:2310:4: ( (lv_ownedValueType_4_0= ruleTypeExpCS ) )
                    // InternalNML.g:2311:5: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    {
                    // InternalNML.g:2311:5: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    // InternalNML.g:2312:6: lv_ownedValueType_4_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedValueTypeTypeExpCSParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_39);
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

                    otherlv_5=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:2338:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // InternalNML.g:2338:52: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // InternalNML.g:2339:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
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
    // InternalNML.g:2345:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) ;
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
            // InternalNML.g:2351:2: ( ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) )
            // InternalNML.g:2352:2: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            {
            // InternalNML.g:2352:2: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            // InternalNML.g:2353:3: ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            {
            // InternalNML.g:2353:3: ( (lv_name_0_0= 'Tuple' ) )
            // InternalNML.g:2354:4: (lv_name_0_0= 'Tuple' )
            {
            // InternalNML.g:2354:4: (lv_name_0_0= 'Tuple' )
            // InternalNML.g:2355:5: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,72,FollowSets000.FOLLOW_45); if (state.failed) return current;
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

            // InternalNML.g:2367:3: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==47) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalNML.g:2368:4: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalNML.g:2372:4: ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( ((LA58_0>=RULE_SIMPLE_ID && LA58_0<=RULE_ESCAPED_ID)) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalNML.g:2373:5: ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            {
                            // InternalNML.g:2373:5: ( (lv_ownedParts_2_0= ruleTuplePartCS ) )
                            // InternalNML.g:2374:6: (lv_ownedParts_2_0= ruleTuplePartCS )
                            {
                            // InternalNML.g:2374:6: (lv_ownedParts_2_0= ruleTuplePartCS )
                            // InternalNML.g:2375:7: lv_ownedParts_2_0= ruleTuplePartCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_50);
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

                            // InternalNML.g:2392:5: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            loop57:
                            do {
                                int alt57=2;
                                int LA57_0 = input.LA(1);

                                if ( (LA57_0==27) ) {
                                    alt57=1;
                                }


                                switch (alt57) {
                            	case 1 :
                            	    // InternalNML.g:2393:6: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_0());
                            	      					
                            	    }
                            	    // InternalNML.g:2397:6: ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    // InternalNML.g:2398:7: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    {
                            	    // InternalNML.g:2398:7: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    // InternalNML.g:2399:8: lv_ownedParts_4_0= ruleTuplePartCS
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_50);
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
                            	    break loop57;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:2427:1: entryRuleTuplePartCS returns [EObject current=null] : iv_ruleTuplePartCS= ruleTuplePartCS EOF ;
    public final EObject entryRuleTuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePartCS = null;


        try {
            // InternalNML.g:2427:52: (iv_ruleTuplePartCS= ruleTuplePartCS EOF )
            // InternalNML.g:2428:2: iv_ruleTuplePartCS= ruleTuplePartCS EOF
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
    // InternalNML.g:2434:1: ruleTuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleTuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalNML.g:2440:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // InternalNML.g:2441:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalNML.g:2441:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // InternalNML.g:2442:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // InternalNML.g:2442:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalNML.g:2443:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalNML.g:2443:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalNML.g:2444:5: lv_name_0_0= ruleUnrestrictedName
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

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
              		
            }
            // InternalNML.g:2465:3: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // InternalNML.g:2466:4: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // InternalNML.g:2466:4: (lv_ownedType_2_0= ruleTypeExpCS )
            // InternalNML.g:2467:5: lv_ownedType_2_0= ruleTypeExpCS
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
    // InternalNML.g:2488:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // InternalNML.g:2488:63: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // InternalNML.g:2489:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
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
    // InternalNML.g:2495:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
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
            // InternalNML.g:2501:2: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalNML.g:2502:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalNML.g:2502:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // InternalNML.g:2503:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalNML.g:2503:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // InternalNML.g:2504:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // InternalNML.g:2504:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // InternalNML.g:2505:5: lv_ownedType_0_0= ruleCollectionTypeCS
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

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNML.g:2526:3: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_INT && LA61_0<=RULE_SINGLE_QUOTED_STRING)||LA61_0==23||LA61_0==47||(LA61_0>=57 && LA61_0<=60)||(LA61_0>=71 && LA61_0<=85)||LA61_0==88||(LA61_0>=90 && LA61_0<=93)||LA61_0==97||(LA61_0>=102 && LA61_0<=103)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalNML.g:2527:4: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // InternalNML.g:2527:4: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // InternalNML.g:2528:5: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // InternalNML.g:2528:5: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // InternalNML.g:2529:6: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_52);
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

                    // InternalNML.g:2546:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==27) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalNML.g:2547:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNML.g:2551:5: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // InternalNML.g:2552:6: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // InternalNML.g:2552:6: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // InternalNML.g:2553:7: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_52);
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
                    	    break loop60;
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
    // InternalNML.g:2580:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // InternalNML.g:2580:64: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // InternalNML.g:2581:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
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
    // InternalNML.g:2587:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedExpression_0_0 = null;

        EObject lv_ownedLastExpression_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;



        	enterRule();

        try {
            // InternalNML.g:2593:2: ( ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) )
            // InternalNML.g:2594:2: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            {
            // InternalNML.g:2594:2: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            int alt63=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_SINGLE_QUOTED_STRING:
            case 47:
            case 57:
            case 58:
            case 59:
            case 60:
            case 71:
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
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 97:
            case 102:
            case 103:
                {
                alt63=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA63_2 = input.LA(2);

                if ( (LA63_2==23) ) {
                    alt63=2;
                }
                else if ( (LA63_2==EOF||LA63_2==17||LA63_2==19||LA63_2==27||(LA63_2>=37 && LA63_2<=38)||LA63_2==40||LA63_2==43||LA63_2==45||LA63_2==47||LA63_2==49||(LA63_2>=51 && LA63_2<=54)||(LA63_2>=56 && LA63_2<=57)||(LA63_2>=60 && LA63_2<=70)||LA63_2==86||LA63_2==94||LA63_2==107) ) {
                    alt63=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA63_3 = input.LA(2);

                if ( (LA63_3==EOF||LA63_3==17||LA63_3==19||LA63_3==27||(LA63_3>=37 && LA63_3<=38)||LA63_3==40||LA63_3==43||LA63_3==45||LA63_3==47||LA63_3==49||(LA63_3>=51 && LA63_3<=54)||(LA63_3>=56 && LA63_3<=57)||(LA63_3>=60 && LA63_3<=70)||LA63_3==86||LA63_3==94||LA63_3==107) ) {
                    alt63=1;
                }
                else if ( (LA63_3==23) ) {
                    alt63=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 3, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt63=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalNML.g:2595:3: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    {
                    // InternalNML.g:2595:3: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    // InternalNML.g:2596:4: ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    {
                    // InternalNML.g:2596:4: ( (lv_ownedExpression_0_0= ruleExpCS ) )
                    // InternalNML.g:2597:5: (lv_ownedExpression_0_0= ruleExpCS )
                    {
                    // InternalNML.g:2597:5: (lv_ownedExpression_0_0= ruleExpCS )
                    // InternalNML.g:2598:6: lv_ownedExpression_0_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionExpCSParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_54);
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

                    // InternalNML.g:2615:4: (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==86) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalNML.g:2616:5: otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            {
                            otherlv_1=(Token)match(input,86,FollowSets000.FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_0_1_0());
                              				
                            }
                            // InternalNML.g:2620:5: ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            // InternalNML.g:2621:6: (lv_ownedLastExpression_2_0= ruleExpCS )
                            {
                            // InternalNML.g:2621:6: (lv_ownedLastExpression_2_0= ruleExpCS )
                            // InternalNML.g:2622:7: lv_ownedLastExpression_2_0= ruleExpCS
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
                    // InternalNML.g:2642:3: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    {
                    // InternalNML.g:2642:3: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    // InternalNML.g:2643:4: (lv_ownedExpression_3_0= rulePatternExpCS )
                    {
                    // InternalNML.g:2643:4: (lv_ownedExpression_3_0= rulePatternExpCS )
                    // InternalNML.g:2644:5: lv_ownedExpression_3_0= rulePatternExpCS
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
    // InternalNML.g:2665:1: entryRuleCollectionPatternCS returns [EObject current=null] : iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF ;
    public final EObject entryRuleCollectionPatternCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionPatternCS = null;


        try {
            // InternalNML.g:2665:60: (iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF )
            // InternalNML.g:2666:2: iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF
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
    // InternalNML.g:2672:1: ruleCollectionPatternCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' ) ;
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
            // InternalNML.g:2678:2: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' ) )
            // InternalNML.g:2679:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' )
            {
            // InternalNML.g:2679:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' )
            // InternalNML.g:2680:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}'
            {
            // InternalNML.g:2680:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // InternalNML.g:2681:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // InternalNML.g:2681:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // InternalNML.g:2682:5: lv_ownedType_0_0= ruleCollectionTypeCS
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

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionPatternCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNML.g:2703:3: ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_SIMPLE_ID && LA65_0<=RULE_ESCAPED_ID)||LA65_0==23) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalNML.g:2704:4: ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) )
                    {
                    // InternalNML.g:2704:4: ( (lv_ownedParts_2_0= rulePatternExpCS ) )
                    // InternalNML.g:2705:5: (lv_ownedParts_2_0= rulePatternExpCS )
                    {
                    // InternalNML.g:2705:5: (lv_ownedParts_2_0= rulePatternExpCS )
                    // InternalNML.g:2706:6: lv_ownedParts_2_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
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

                    // InternalNML.g:2723:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==27) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalNML.g:2724:5: otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCollectionPatternCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNML.g:2728:5: ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    // InternalNML.g:2729:6: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    {
                    	    // InternalNML.g:2729:6: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    // InternalNML.g:2730:7: lv_ownedParts_4_0= rulePatternExpCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_56);
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
                    	    break loop64;
                        }
                    } while (true);

                    // InternalNML.g:2748:4: (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) )
                    // InternalNML.g:2749:5: otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) )
                    {
                    otherlv_5=(Token)match(input,87,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getCollectionPatternCSAccess().getPlusSignPlusSignKeyword_2_2_0());
                      				
                    }
                    // InternalNML.g:2753:5: ( (lv_restVariableName_6_0= ruleIdentifier ) )
                    // InternalNML.g:2754:6: (lv_restVariableName_6_0= ruleIdentifier )
                    {
                    // InternalNML.g:2754:6: (lv_restVariableName_6_0= ruleIdentifier )
                    // InternalNML.g:2755:7: lv_restVariableName_6_0= ruleIdentifier
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
    // InternalNML.g:2782:1: entryRuleShadowPartCS returns [EObject current=null] : iv_ruleShadowPartCS= ruleShadowPartCS EOF ;
    public final EObject entryRuleShadowPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShadowPartCS = null;


        try {
            // InternalNML.g:2782:53: (iv_ruleShadowPartCS= ruleShadowPartCS EOF )
            // InternalNML.g:2783:2: iv_ruleShadowPartCS= ruleShadowPartCS EOF
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
    // InternalNML.g:2789:1: ruleShadowPartCS returns [EObject current=null] : ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) ) ;
    public final EObject ruleShadowPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedInitExpression_2_1 = null;

        EObject lv_ownedInitExpression_2_2 = null;

        EObject lv_ownedInitExpression_3_0 = null;



        	enterRule();

        try {
            // InternalNML.g:2795:2: ( ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) ) )
            // InternalNML.g:2796:2: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) )
            {
            // InternalNML.g:2796:2: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=RULE_SIMPLE_ID && LA67_0<=RULE_ESCAPED_ID)) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalNML.g:2797:3: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
                    {
                    // InternalNML.g:2797:3: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
                    // InternalNML.g:2798:4: ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
                    {
                    // InternalNML.g:2798:4: ( ( ruleUnrestrictedName ) )
                    // InternalNML.g:2799:5: ( ruleUnrestrictedName )
                    {
                    // InternalNML.g:2799:5: ( ruleUnrestrictedName )
                    // InternalNML.g:2800:6: ruleUnrestrictedName
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
                    pushFollow(FollowSets000.FOLLOW_57);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getShadowPartCSAccess().getEqualsSignKeyword_0_1());
                      			
                    }
                    // InternalNML.g:2821:4: ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
                    // InternalNML.g:2822:5: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
                    {
                    // InternalNML.g:2822:5: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
                    // InternalNML.g:2823:6: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
                    {
                    // InternalNML.g:2823:6: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
                    int alt66=2;
                    switch ( input.LA(1) ) {
                    case RULE_INT:
                    case RULE_SINGLE_QUOTED_STRING:
                    case 47:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 71:
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
                    case 88:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 97:
                    case 102:
                    case 103:
                        {
                        alt66=1;
                        }
                        break;
                    case RULE_SIMPLE_ID:
                        {
                        int LA66_2 = input.LA(2);

                        if ( (LA66_2==23) ) {
                            alt66=2;
                        }
                        else if ( (LA66_2==EOF||LA66_2==17||LA66_2==19||LA66_2==27||(LA66_2>=37 && LA66_2<=38)||LA66_2==40||LA66_2==43||LA66_2==45||LA66_2==47||LA66_2==49||(LA66_2>=51 && LA66_2<=54)||(LA66_2>=56 && LA66_2<=57)||(LA66_2>=60 && LA66_2<=70)||LA66_2==94||LA66_2==107) ) {
                            alt66=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 66, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ESCAPED_ID:
                        {
                        int LA66_3 = input.LA(2);

                        if ( (LA66_3==23) ) {
                            alt66=2;
                        }
                        else if ( (LA66_3==EOF||LA66_3==17||LA66_3==19||LA66_3==27||(LA66_3>=37 && LA66_3<=38)||LA66_3==40||LA66_3==43||LA66_3==45||LA66_3==47||LA66_3==49||(LA66_3>=51 && LA66_3<=54)||(LA66_3>=56 && LA66_3<=57)||(LA66_3>=60 && LA66_3<=70)||LA66_3==94||LA66_3==107) ) {
                            alt66=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 66, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 23:
                        {
                        alt66=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }

                    switch (alt66) {
                        case 1 :
                            // InternalNML.g:2824:7: lv_ownedInitExpression_2_1= ruleExpCS
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
                            // InternalNML.g:2840:7: lv_ownedInitExpression_2_2= rulePatternExpCS
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
                    // InternalNML.g:2860:3: ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) )
                    {
                    // InternalNML.g:2860:3: ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) )
                    // InternalNML.g:2861:4: (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS )
                    {
                    // InternalNML.g:2861:4: (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS )
                    // InternalNML.g:2862:5: lv_ownedInitExpression_3_0= ruleStringLiteralExpCS
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
    // InternalNML.g:2883:1: entryRulePatternExpCS returns [EObject current=null] : iv_rulePatternExpCS= rulePatternExpCS EOF ;
    public final EObject entryRulePatternExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternExpCS = null;


        try {
            // InternalNML.g:2883:53: (iv_rulePatternExpCS= rulePatternExpCS EOF )
            // InternalNML.g:2884:2: iv_rulePatternExpCS= rulePatternExpCS EOF
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
    // InternalNML.g:2890:1: rulePatternExpCS returns [EObject current=null] : ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject rulePatternExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_patternVariableName_0_0 = null;

        EObject lv_ownedPatternType_2_0 = null;



        	enterRule();

        try {
            // InternalNML.g:2896:2: ( ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) )
            // InternalNML.g:2897:2: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalNML.g:2897:2: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            // InternalNML.g:2898:3: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            {
            // InternalNML.g:2898:3: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=RULE_SIMPLE_ID && LA68_0<=RULE_ESCAPED_ID)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalNML.g:2899:4: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    {
                    // InternalNML.g:2899:4: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    // InternalNML.g:2900:5: lv_patternVariableName_0_0= ruleUnrestrictedName
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

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPatternExpCSAccess().getColonKeyword_1());
              		
            }
            // InternalNML.g:2921:3: ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            // InternalNML.g:2922:4: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            {
            // InternalNML.g:2922:4: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            // InternalNML.g:2923:5: lv_ownedPatternType_2_0= ruleTypeExpCS
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
    // InternalNML.g:2944:1: entryRuleLambdaLiteralExpCS returns [EObject current=null] : iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF ;
    public final EObject entryRuleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambdaLiteralExpCS = null;


        try {
            // InternalNML.g:2944:59: (iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF )
            // InternalNML.g:2945:2: iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF
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
    // InternalNML.g:2951:1: ruleLambdaLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) ;
    public final EObject ruleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedExpressionCS_2_0 = null;



        	enterRule();

        try {
            // InternalNML.g:2957:2: ( (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) )
            // InternalNML.g:2958:2: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            {
            // InternalNML.g:2958:2: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            // InternalNML.g:2959:3: otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,88,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLambdaLiteralExpCSAccess().getLambdaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLambdaLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNML.g:2967:3: ( (lv_ownedExpressionCS_2_0= ruleExpCS ) )
            // InternalNML.g:2968:4: (lv_ownedExpressionCS_2_0= ruleExpCS )
            {
            // InternalNML.g:2968:4: (lv_ownedExpressionCS_2_0= ruleExpCS )
            // InternalNML.g:2969:5: lv_ownedExpressionCS_2_0= ruleExpCS
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
    // InternalNML.g:2994:1: entryRuleMapLiteralExpCS returns [EObject current=null] : iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF ;
    public final EObject entryRuleMapLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralExpCS = null;


        try {
            // InternalNML.g:2994:56: (iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF )
            // InternalNML.g:2995:2: iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF
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
    // InternalNML.g:3001:1: ruleMapLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
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
            // InternalNML.g:3007:2: ( ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalNML.g:3008:2: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalNML.g:3008:2: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // InternalNML.g:3009:3: ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalNML.g:3009:3: ( (lv_ownedType_0_0= ruleMapTypeCS ) )
            // InternalNML.g:3010:4: (lv_ownedType_0_0= ruleMapTypeCS )
            {
            // InternalNML.g:3010:4: (lv_ownedType_0_0= ruleMapTypeCS )
            // InternalNML.g:3011:5: lv_ownedType_0_0= ruleMapTypeCS
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

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNML.g:3032:3: ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=RULE_INT && LA70_0<=RULE_SINGLE_QUOTED_STRING)||LA70_0==47||(LA70_0>=57 && LA70_0<=60)||(LA70_0>=71 && LA70_0<=85)||LA70_0==88||(LA70_0>=90 && LA70_0<=93)||LA70_0==97||(LA70_0>=102 && LA70_0<=103)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalNML.g:3033:4: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    {
                    // InternalNML.g:3033:4: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) )
                    // InternalNML.g:3034:5: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    {
                    // InternalNML.g:3034:5: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    // InternalNML.g:3035:6: lv_ownedParts_2_0= ruleMapLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_52);
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

                    // InternalNML.g:3052:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==27) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalNML.g:3053:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getMapLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNML.g:3057:5: ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    // InternalNML.g:3058:6: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    {
                    	    // InternalNML.g:3058:6: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    // InternalNML.g:3059:7: lv_ownedParts_4_0= ruleMapLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_52);
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
                    	    break loop69;
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
    // InternalNML.g:3086:1: entryRuleMapLiteralPartCS returns [EObject current=null] : iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF ;
    public final EObject entryRuleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralPartCS = null;


        try {
            // InternalNML.g:3086:57: (iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF )
            // InternalNML.g:3087:2: iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF
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
    // InternalNML.g:3093:1: ruleMapLiteralPartCS returns [EObject current=null] : ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedKey_0_0 = null;

        EObject lv_ownedValue_2_0 = null;



        	enterRule();

        try {
            // InternalNML.g:3099:2: ( ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) )
            // InternalNML.g:3100:2: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            {
            // InternalNML.g:3100:2: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            // InternalNML.g:3101:3: ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) )
            {
            // InternalNML.g:3101:3: ( (lv_ownedKey_0_0= ruleExpCS ) )
            // InternalNML.g:3102:4: (lv_ownedKey_0_0= ruleExpCS )
            {
            // InternalNML.g:3102:4: (lv_ownedKey_0_0= ruleExpCS )
            // InternalNML.g:3103:5: lv_ownedKey_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedKeyExpCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_59);
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

            otherlv_1=(Token)match(input,89,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapLiteralPartCSAccess().getLessThanSignHyphenMinusKeyword_1());
              		
            }
            // InternalNML.g:3124:3: ( (lv_ownedValue_2_0= ruleExpCS ) )
            // InternalNML.g:3125:4: (lv_ownedValue_2_0= ruleExpCS )
            {
            // InternalNML.g:3125:4: (lv_ownedValue_2_0= ruleExpCS )
            // InternalNML.g:3126:5: lv_ownedValue_2_0= ruleExpCS
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
    // InternalNML.g:3147:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // InternalNML.g:3147:62: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // InternalNML.g:3148:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
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
    // InternalNML.g:3154:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
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
            // InternalNML.g:3160:2: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // InternalNML.g:3161:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // InternalNML.g:3161:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt71=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt71=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt71=2;
                }
                break;
            case 90:
            case 91:
                {
                alt71=3;
                }
                break;
            case 60:
                {
                alt71=4;
                }
                break;
            case 92:
                {
                alt71=5;
                }
                break;
            case 93:
                {
                alt71=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalNML.g:3162:3: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
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
                    // InternalNML.g:3174:3: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
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
                    // InternalNML.g:3186:3: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
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
                    // InternalNML.g:3198:3: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
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
                    // InternalNML.g:3210:3: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
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
                    // InternalNML.g:3222:3: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
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
    // InternalNML.g:3237:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // InternalNML.g:3237:58: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // InternalNML.g:3238:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
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
    // InternalNML.g:3244:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
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
            // InternalNML.g:3250:2: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // InternalNML.g:3251:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // InternalNML.g:3251:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // InternalNML.g:3252:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,72,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNML.g:3260:3: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // InternalNML.g:3261:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // InternalNML.g:3261:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // InternalNML.g:3262:5: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_52);
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

            // InternalNML.g:3279:3: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==27) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalNML.g:3280:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalNML.g:3284:4: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // InternalNML.g:3285:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // InternalNML.g:3285:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // InternalNML.g:3286:6: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_52);
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
            	    break loop72;
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
    // InternalNML.g:3312:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // InternalNML.g:3312:59: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // InternalNML.g:3313:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
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
    // InternalNML.g:3319:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;



        	enterRule();

        try {
            // InternalNML.g:3325:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) )
            // InternalNML.g:3326:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            {
            // InternalNML.g:3326:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            // InternalNML.g:3327:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            {
            // InternalNML.g:3327:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalNML.g:3328:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalNML.g:3328:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalNML.g:3329:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_60);
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

            // InternalNML.g:3346:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==23) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalNML.g:3347:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalNML.g:3351:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalNML.g:3352:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalNML.g:3352:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalNML.g:3353:6: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_57);
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

            otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalNML.g:3375:3: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            // InternalNML.g:3376:4: (lv_ownedInitExpression_4_0= ruleExpCS )
            {
            // InternalNML.g:3376:4: (lv_ownedInitExpression_4_0= ruleExpCS )
            // InternalNML.g:3377:5: lv_ownedInitExpression_4_0= ruleExpCS
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
    // InternalNML.g:3398:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // InternalNML.g:3398:59: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // InternalNML.g:3399:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
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
    // InternalNML.g:3405:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_symbol_0_0 = null;



        	enterRule();

        try {
            // InternalNML.g:3411:2: ( ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) ) )
            // InternalNML.g:3412:2: ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) )
            {
            // InternalNML.g:3412:2: ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) )
            // InternalNML.g:3413:3: (lv_symbol_0_0= ruleNUMBER_LITERAL )
            {
            // InternalNML.g:3413:3: (lv_symbol_0_0= ruleNUMBER_LITERAL )
            // InternalNML.g:3414:4: lv_symbol_0_0= ruleNUMBER_LITERAL
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
    // InternalNML.g:3434:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // InternalNML.g:3434:59: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // InternalNML.g:3435:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
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
    // InternalNML.g:3441:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_segments_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_segments_0_0 = null;



        	enterRule();

        try {
            // InternalNML.g:3447:2: ( ( (lv_segments_0_0= ruleStringLiteral ) )+ )
            // InternalNML.g:3448:2: ( (lv_segments_0_0= ruleStringLiteral ) )+
            {
            // InternalNML.g:3448:2: ( (lv_segments_0_0= ruleStringLiteral ) )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==RULE_SINGLE_QUOTED_STRING) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalNML.g:3449:3: (lv_segments_0_0= ruleStringLiteral )
            	    {
            	    // InternalNML.g:3449:3: (lv_segments_0_0= ruleStringLiteral )
            	    // InternalNML.g:3450:4: lv_segments_0_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getSegmentsStringLiteralParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_61);
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
            	    if ( cnt74 >= 1 ) break loop74;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
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
    // InternalNML.g:3470:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // InternalNML.g:3470:60: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // InternalNML.g:3471:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
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
    // InternalNML.g:3477:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token lv_symbol_1_0=null;


        	enterRule();

        try {
            // InternalNML.g:3483:2: ( ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) )
            // InternalNML.g:3484:2: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            {
            // InternalNML.g:3484:2: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==90) ) {
                alt75=1;
            }
            else if ( (LA75_0==91) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalNML.g:3485:3: ( (lv_symbol_0_0= 'true' ) )
                    {
                    // InternalNML.g:3485:3: ( (lv_symbol_0_0= 'true' ) )
                    // InternalNML.g:3486:4: (lv_symbol_0_0= 'true' )
                    {
                    // InternalNML.g:3486:4: (lv_symbol_0_0= 'true' )
                    // InternalNML.g:3487:5: lv_symbol_0_0= 'true'
                    {
                    lv_symbol_0_0=(Token)match(input,90,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                    // InternalNML.g:3500:3: ( (lv_symbol_1_0= 'false' ) )
                    {
                    // InternalNML.g:3500:3: ( (lv_symbol_1_0= 'false' ) )
                    // InternalNML.g:3501:4: (lv_symbol_1_0= 'false' )
                    {
                    // InternalNML.g:3501:4: (lv_symbol_1_0= 'false' )
                    // InternalNML.g:3502:5: lv_symbol_1_0= 'false'
                    {
                    lv_symbol_1_0=(Token)match(input,91,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:3518:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // InternalNML.g:3518:69: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // InternalNML.g:3519:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
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
    // InternalNML.g:3525:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalNML.g:3531:2: ( ( () otherlv_1= '*' ) )
            // InternalNML.g:3532:2: ( () otherlv_1= '*' )
            {
            // InternalNML.g:3532:2: ( () otherlv_1= '*' )
            // InternalNML.g:3533:3: () otherlv_1= '*'
            {
            // InternalNML.g:3533:3: ()
            // InternalNML.g:3534:4: 
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

            otherlv_1=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:3551:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // InternalNML.g:3551:60: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // InternalNML.g:3552:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
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
    // InternalNML.g:3558:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalNML.g:3564:2: ( ( () otherlv_1= 'invalid' ) )
            // InternalNML.g:3565:2: ( () otherlv_1= 'invalid' )
            {
            // InternalNML.g:3565:2: ( () otherlv_1= 'invalid' )
            // InternalNML.g:3566:3: () otherlv_1= 'invalid'
            {
            // InternalNML.g:3566:3: ()
            // InternalNML.g:3567:4: 
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

            otherlv_1=(Token)match(input,92,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:3584:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // InternalNML.g:3584:57: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // InternalNML.g:3585:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
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
    // InternalNML.g:3591:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalNML.g:3597:2: ( ( () otherlv_1= 'null' ) )
            // InternalNML.g:3598:2: ( () otherlv_1= 'null' )
            {
            // InternalNML.g:3598:2: ( () otherlv_1= 'null' )
            // InternalNML.g:3599:3: () otherlv_1= 'null'
            {
            // InternalNML.g:3599:3: ()
            // InternalNML.g:3600:4: 
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

            otherlv_1=(Token)match(input,93,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:3617:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // InternalNML.g:3617:54: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // InternalNML.g:3618:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
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
    // InternalNML.g:3624:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_CollectionTypeCS_1 = null;

        EObject this_MapTypeCS_2 = null;

        EObject this_TupleTypeCS_3 = null;



        	enterRule();

        try {
            // InternalNML.g:3630:2: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) )
            // InternalNML.g:3631:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            {
            // InternalNML.g:3631:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            int alt76=4;
            switch ( input.LA(1) ) {
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
                {
                alt76=1;
                }
                break;
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
                {
                alt76=2;
                }
                break;
            case 71:
                {
                alt76=3;
                }
                break;
            case 72:
                {
                alt76=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalNML.g:3632:3: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
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
                    // InternalNML.g:3644:3: this_CollectionTypeCS_1= ruleCollectionTypeCS
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
                    // InternalNML.g:3656:3: this_MapTypeCS_2= ruleMapTypeCS
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
                    // InternalNML.g:3668:3: this_TupleTypeCS_3= ruleTupleTypeCS
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
    // InternalNML.g:3683:1: entryRuleTypeLiteralWithMultiplicityCS returns [EObject current=null] : iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF ;
    public final EObject entryRuleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralWithMultiplicityCS = null;


        try {
            // InternalNML.g:3683:70: (iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF )
            // InternalNML.g:3684:2: iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF
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
    // InternalNML.g:3690:1: ruleTypeLiteralWithMultiplicityCS returns [EObject current=null] : (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeLiteralCS_0 = null;

        EObject lv_ownedMultiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalNML.g:3696:2: ( (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // InternalNML.g:3697:2: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // InternalNML.g:3697:2: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            // InternalNML.g:3698:3: this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_62);
            this_TypeLiteralCS_0=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TypeLiteralCS_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalNML.g:3709:3: ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==40) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalNML.g:3710:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    {
                    // InternalNML.g:3710:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    // InternalNML.g:3711:5: lv_ownedMultiplicity_1_0= ruleMultiplicityCS
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
    // InternalNML.g:3732:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // InternalNML.g:3732:57: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // InternalNML.g:3733:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
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
    // InternalNML.g:3739:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;



        	enterRule();

        try {
            // InternalNML.g:3745:2: ( ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) )
            // InternalNML.g:3746:2: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            {
            // InternalNML.g:3746:2: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            // InternalNML.g:3747:3: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            {
            // InternalNML.g:3747:3: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            // InternalNML.g:3748:4: lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS
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
    // InternalNML.g:3768:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // InternalNML.g:3768:54: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // InternalNML.g:3769:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
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
    // InternalNML.g:3775:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedCurlyBracketedClause_1_0 = null;

        EObject lv_ownedPatternGuard_3_0 = null;



        	enterRule();

        try {
            // InternalNML.g:3781:2: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) )
            // InternalNML.g:3782:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            {
            // InternalNML.g:3782:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            // InternalNML.g:3783:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            {
            // InternalNML.g:3783:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalNML.g:3784:4: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalNML.g:3784:4: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalNML.g:3785:5: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_63);
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

            // InternalNML.g:3802:3: ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==17) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalNML.g:3803:4: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    {
                    // InternalNML.g:3803:4: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) )
                    // InternalNML.g:3804:5: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    {
                    // InternalNML.g:3804:5: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    // InternalNML.g:3805:6: lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_63);
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

                    // InternalNML.g:3822:4: (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==17) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalNML.g:3823:5: otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}'
                            {
                            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getTypeNameExpCSAccess().getLeftCurlyBracketKeyword_1_1_0());
                              				
                            }
                            // InternalNML.g:3827:5: ( (lv_ownedPatternGuard_3_0= ruleExpCS ) )
                            // InternalNML.g:3828:6: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            {
                            // InternalNML.g:3828:6: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            // InternalNML.g:3829:7: lv_ownedPatternGuard_3_0= ruleExpCS
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
    // InternalNML.g:3856:1: entryRuleTypeExpWithoutMultiplicityCS returns [EObject current=null] : iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF ;
    public final EObject entryRuleTypeExpWithoutMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpWithoutMultiplicityCS = null;


        try {
            // InternalNML.g:3856:69: (iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF )
            // InternalNML.g:3857:2: iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF
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
    // InternalNML.g:3863:1: ruleTypeExpWithoutMultiplicityCS returns [EObject current=null] : (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ;
    public final EObject ruleTypeExpWithoutMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;

        EObject this_CollectionPatternCS_2 = null;



        	enterRule();

        try {
            // InternalNML.g:3869:2: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) )
            // InternalNML.g:3870:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )
            {
            // InternalNML.g:3870:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )
            int alt80=3;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // InternalNML.g:3871:3: this_TypeNameExpCS_0= ruleTypeNameExpCS
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
                    // InternalNML.g:3883:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
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
                    // InternalNML.g:3895:3: this_CollectionPatternCS_2= ruleCollectionPatternCS
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
    // InternalNML.g:3910:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // InternalNML.g:3910:50: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // InternalNML.g:3911:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
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
    // InternalNML.g:3917:1: ruleTypeExpCS returns [EObject current=null] : (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeExpWithoutMultiplicityCS_0 = null;

        EObject lv_ownedMultiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalNML.g:3923:2: ( (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // InternalNML.g:3924:2: (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // InternalNML.g:3924:2: (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            // InternalNML.g:3925:3: this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeExpWithoutMultiplicityCSParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_62);
            this_TypeExpWithoutMultiplicityCS_0=ruleTypeExpWithoutMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TypeExpWithoutMultiplicityCS_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalNML.g:3936:3: ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==40) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalNML.g:3937:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    {
                    // InternalNML.g:3937:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    // InternalNML.g:3938:5: lv_ownedMultiplicity_1_0= ruleMultiplicityCS
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
    // InternalNML.g:3959:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // InternalNML.g:3959:46: (iv_ruleExpCS= ruleExpCS EOF )
            // InternalNML.g:3960:2: iv_ruleExpCS= ruleExpCS EOF
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
    // InternalNML.g:3966:1: ruleExpCS returns [EObject current=null] : ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;

        EObject this_PrefixedLetExpCS_4 = null;



        	enterRule();

        try {
            // InternalNML.g:3972:2: ( ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) )
            // InternalNML.g:3973:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            {
            // InternalNML.g:3973:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            int alt83=2;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // InternalNML.g:3974:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    {
                    // InternalNML.g:3974:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    // InternalNML.g:3975:4: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedPrimaryExpCSParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_64);
                    this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PrefixedPrimaryExpCS_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalNML.g:3986:4: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( ((LA82_0>=37 && LA82_0<=38)||LA82_0==43||LA82_0==45||LA82_0==49||(LA82_0>=51 && LA82_0<=54)||(LA82_0>=56 && LA82_0<=57)||(LA82_0>=60 && LA82_0<=70)) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalNML.g:3987:5: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                            {
                            // InternalNML.g:3987:5: ()
                            // InternalNML.g:3988:6: 
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

                            // InternalNML.g:3997:5: ( (lv_name_2_0= ruleBinaryOperatorName ) )
                            // InternalNML.g:3998:6: (lv_name_2_0= ruleBinaryOperatorName )
                            {
                            // InternalNML.g:3998:6: (lv_name_2_0= ruleBinaryOperatorName )
                            // InternalNML.g:3999:7: lv_name_2_0= ruleBinaryOperatorName
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_55);
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

                            // InternalNML.g:4016:5: ( (lv_ownedRight_3_0= ruleExpCS ) )
                            // InternalNML.g:4017:6: (lv_ownedRight_3_0= ruleExpCS )
                            {
                            // InternalNML.g:4017:6: (lv_ownedRight_3_0= ruleExpCS )
                            // InternalNML.g:4018:7: lv_ownedRight_3_0= ruleExpCS
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
                    // InternalNML.g:4038:3: this_PrefixedLetExpCS_4= rulePrefixedLetExpCS
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
    // InternalNML.g:4053:1: entryRulePrefixedLetExpCS returns [EObject current=null] : iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF ;
    public final EObject entryRulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedLetExpCS = null;


        try {
            // InternalNML.g:4053:57: (iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF )
            // InternalNML.g:4054:2: iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF
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
    // InternalNML.g:4060:1: rulePrefixedLetExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) ;
    public final EObject rulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_LetExpCS_3 = null;



        	enterRule();

        try {
            // InternalNML.g:4066:2: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) )
            // InternalNML.g:4067:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            {
            // InternalNML.g:4067:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=57 && LA84_0<=59)) ) {
                alt84=1;
            }
            else if ( (LA84_0==102) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalNML.g:4068:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    {
                    // InternalNML.g:4068:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    // InternalNML.g:4069:4: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    {
                    // InternalNML.g:4069:4: ()
                    // InternalNML.g:4070:5: 
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

                    // InternalNML.g:4079:4: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // InternalNML.g:4080:5: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // InternalNML.g:4080:5: (lv_name_1_0= ruleUnaryOperatorName )
                    // InternalNML.g:4081:6: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_55);
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

                    // InternalNML.g:4098:4: ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    // InternalNML.g:4099:5: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    {
                    // InternalNML.g:4099:5: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    // InternalNML.g:4100:6: lv_ownedRight_2_0= rulePrefixedLetExpCS
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
                    // InternalNML.g:4119:3: this_LetExpCS_3= ruleLetExpCS
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
    // InternalNML.g:4134:1: entryRulePrefixedPrimaryExpCS returns [EObject current=null] : iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF ;
    public final EObject entryRulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedPrimaryExpCS = null;


        try {
            // InternalNML.g:4134:61: (iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF )
            // InternalNML.g:4135:2: iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF
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
    // InternalNML.g:4141:1: rulePrefixedPrimaryExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) ;
    public final EObject rulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_PrimaryExpCS_3 = null;



        	enterRule();

        try {
            // InternalNML.g:4147:2: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) )
            // InternalNML.g:4148:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            {
            // InternalNML.g:4148:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=57 && LA85_0<=59)) ) {
                alt85=1;
            }
            else if ( ((LA85_0>=RULE_INT && LA85_0<=RULE_SINGLE_QUOTED_STRING)||LA85_0==47||LA85_0==60||(LA85_0>=71 && LA85_0<=85)||LA85_0==88||(LA85_0>=90 && LA85_0<=93)||LA85_0==97||LA85_0==103) ) {
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
                    // InternalNML.g:4149:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    {
                    // InternalNML.g:4149:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    // InternalNML.g:4150:4: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    {
                    // InternalNML.g:4150:4: ()
                    // InternalNML.g:4151:5: 
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

                    // InternalNML.g:4160:4: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // InternalNML.g:4161:5: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // InternalNML.g:4161:5: (lv_name_1_0= ruleUnaryOperatorName )
                    // InternalNML.g:4162:6: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_65);
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

                    // InternalNML.g:4179:4: ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    // InternalNML.g:4180:5: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    {
                    // InternalNML.g:4180:5: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    // InternalNML.g:4181:6: lv_ownedRight_2_0= rulePrefixedPrimaryExpCS
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
                    // InternalNML.g:4200:3: this_PrimaryExpCS_3= rulePrimaryExpCS
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
    // InternalNML.g:4215:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // InternalNML.g:4215:53: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // InternalNML.g:4216:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
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
    // InternalNML.g:4222:1: rulePrimaryExpCS returns [EObject current=null] : (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS ) ;
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
            // InternalNML.g:4228:2: ( (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS ) )
            // InternalNML.g:4229:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS )
            {
            // InternalNML.g:4229:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS )
            int alt86=10;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // InternalNML.g:4230:3: this_NestedExpCS_0= ruleNestedExpCS
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
                    // InternalNML.g:4242:3: this_IfExpCS_1= ruleIfExpCS
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
                    // InternalNML.g:4254:3: this_SelfExpCS_2= ruleSelfExpCS
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
                    // InternalNML.g:4266:3: this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS
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
                    // InternalNML.g:4278:3: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
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
                    // InternalNML.g:4290:3: this_MapLiteralExpCS_5= ruleMapLiteralExpCS
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
                    // InternalNML.g:4302:3: this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS
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
                    // InternalNML.g:4314:3: this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS
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
                    // InternalNML.g:4326:3: this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS
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
                    // InternalNML.g:4338:3: this_NameExpCS_9= ruleNameExpCS
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
    // InternalNML.g:4353:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // InternalNML.g:4353:50: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // InternalNML.g:4354:2: iv_ruleNameExpCS= ruleNameExpCS EOF
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
    // InternalNML.g:4360:1: ruleNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? ) ;
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
            // InternalNML.g:4366:2: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? ) )
            // InternalNML.g:4367:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? )
            {
            // InternalNML.g:4367:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? )
            // InternalNML.g:4368:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )?
            {
            // InternalNML.g:4368:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalNML.g:4369:4: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalNML.g:4369:4: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalNML.g:4370:5: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_66);
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

            // InternalNML.g:4387:3: ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==40) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalNML.g:4388:4: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    {
            	    // InternalNML.g:4388:4: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    // InternalNML.g:4389:5: lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedSquareBracketedClausesSquareBracketedClauseCSParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_66);
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
            	    break loop87;
                }
            } while (true);

            // InternalNML.g:4406:3: ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==47) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalNML.g:4407:4: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    {
                    // InternalNML.g:4407:4: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    // InternalNML.g:4408:5: lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_67);
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

            // InternalNML.g:4425:3: ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==17) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalNML.g:4426:4: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    {
                    // InternalNML.g:4426:4: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    // InternalNML.g:4427:5: lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_68);
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

            // InternalNML.g:4444:3: ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==94) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalNML.g:4445:4: ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre'
                    {
                    // InternalNML.g:4445:4: ( (lv_isPre_4_0= '@' ) )
                    // InternalNML.g:4446:5: (lv_isPre_4_0= '@' )
                    {
                    // InternalNML.g:4446:5: (lv_isPre_4_0= '@' )
                    // InternalNML.g:4447:6: lv_isPre_4_0= '@'
                    {
                    lv_isPre_4_0=(Token)match(input,94,FollowSets000.FOLLOW_69); if (state.failed) return current;
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
    // InternalNML.g:4468:1: entryRuleCurlyBracketedClauseCS returns [EObject current=null] : iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF ;
    public final EObject entryRuleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurlyBracketedClauseCS = null;


        try {
            // InternalNML.g:4468:63: (iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF )
            // InternalNML.g:4469:2: iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF
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
    // InternalNML.g:4475:1: ruleCurlyBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalNML.g:4481:2: ( ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalNML.g:4482:2: ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalNML.g:4482:2: ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' )
            // InternalNML.g:4483:3: () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalNML.g:4483:3: ()
            // InternalNML.g:4484:4: 
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

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCurlyBracketedClauseCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNML.g:4497:3: ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( ((LA92_0>=RULE_SIMPLE_ID && LA92_0<=RULE_SINGLE_QUOTED_STRING)) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalNML.g:4498:4: ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                    {
                    // InternalNML.g:4498:4: ( (lv_ownedParts_2_0= ruleShadowPartCS ) )
                    // InternalNML.g:4499:5: (lv_ownedParts_2_0= ruleShadowPartCS )
                    {
                    // InternalNML.g:4499:5: (lv_ownedParts_2_0= ruleShadowPartCS )
                    // InternalNML.g:4500:6: lv_ownedParts_2_0= ruleShadowPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_52);
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

                    // InternalNML.g:4517:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==27) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalNML.g:4518:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCurlyBracketedClauseCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNML.g:4522:5: ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                    	    // InternalNML.g:4523:6: (lv_ownedParts_4_0= ruleShadowPartCS )
                    	    {
                    	    // InternalNML.g:4523:6: (lv_ownedParts_4_0= ruleShadowPartCS )
                    	    // InternalNML.g:4524:7: lv_ownedParts_4_0= ruleShadowPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_52);
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
                    	    break loop91;
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
    // InternalNML.g:4551:1: entryRuleRoundBracketedClauseCS returns [EObject current=null] : iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF ;
    public final EObject entryRuleRoundBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundBracketedClauseCS = null;


        try {
            // InternalNML.g:4551:63: (iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF )
            // InternalNML.g:4552:2: iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF
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
    // InternalNML.g:4558:1: ruleRoundBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' ) ;
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
            // InternalNML.g:4564:2: ( ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' ) )
            // InternalNML.g:4565:2: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' )
            {
            // InternalNML.g:4565:2: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' )
            // InternalNML.g:4566:3: () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')'
            {
            // InternalNML.g:4566:3: ()
            // InternalNML.g:4567:4: 
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

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRoundBracketedClauseCSAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalNML.g:4580:3: ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( ((LA95_0>=RULE_INT && LA95_0<=RULE_SINGLE_QUOTED_STRING)||LA95_0==23||LA95_0==47||(LA95_0>=57 && LA95_0<=60)||(LA95_0>=71 && LA95_0<=85)||LA95_0==88||(LA95_0>=90 && LA95_0<=93)||LA95_0==97||(LA95_0>=102 && LA95_0<=103)) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalNML.g:4581:4: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )*
                    {
                    // InternalNML.g:4581:4: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) )
                    // InternalNML.g:4582:5: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    {
                    // InternalNML.g:4582:5: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    // InternalNML.g:4583:6: lv_ownedArguments_2_0= ruleNavigatingArgCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingArgCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_72);
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

                    // InternalNML.g:4600:4: ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==24||LA94_0==27||LA94_0==96) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // InternalNML.g:4601:5: ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) )
                    	    {
                    	    // InternalNML.g:4601:5: ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) )
                    	    // InternalNML.g:4602:6: (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS )
                    	    {
                    	    // InternalNML.g:4602:6: (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS )
                    	    int alt93=3;
                    	    switch ( input.LA(1) ) {
                    	    case 27:
                    	        {
                    	        alt93=1;
                    	        }
                    	        break;
                    	    case 24:
                    	        {
                    	        alt93=2;
                    	        }
                    	        break;
                    	    case 96:
                    	        {
                    	        alt93=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 93, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt93) {
                    	        case 1 :
                    	            // InternalNML.g:4603:7: lv_ownedArguments_3_1= ruleNavigatingCommaArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_1_0_0());
                    	              						
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_72);
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
                    	            // InternalNML.g:4619:7: lv_ownedArguments_3_2= ruleNavigatingSemiArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingSemiArgCSParserRuleCall_2_1_0_1());
                    	              						
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_72);
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
                    	            // InternalNML.g:4635:7: lv_ownedArguments_3_3= ruleNavigatingBarArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingBarArgCSParserRuleCall_2_1_0_2());
                    	              						
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_72);
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
                    	    break loop94;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:4662:1: entryRuleSquareBracketedClauseCS returns [EObject current=null] : iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF ;
    public final EObject entryRuleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquareBracketedClauseCS = null;


        try {
            // InternalNML.g:4662:64: (iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF )
            // InternalNML.g:4663:2: iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF
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
    // InternalNML.g:4669:1: ruleSquareBracketedClauseCS returns [EObject current=null] : (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedTerms_1_0 = null;

        EObject lv_ownedTerms_3_0 = null;



        	enterRule();

        try {
            // InternalNML.g:4675:2: ( (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) )
            // InternalNML.g:4676:2: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            {
            // InternalNML.g:4676:2: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            // InternalNML.g:4677:3: otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSquareBracketedClauseCSAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalNML.g:4681:3: ( (lv_ownedTerms_1_0= ruleExpCS ) )
            // InternalNML.g:4682:4: (lv_ownedTerms_1_0= ruleExpCS )
            {
            // InternalNML.g:4682:4: (lv_ownedTerms_1_0= ruleExpCS )
            // InternalNML.g:4683:5: lv_ownedTerms_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_34);
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

            // InternalNML.g:4700:3: (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==27) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalNML.g:4701:4: otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSquareBracketedClauseCSAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalNML.g:4705:4: ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    // InternalNML.g:4706:5: (lv_ownedTerms_3_0= ruleExpCS )
            	    {
            	    // InternalNML.g:4706:5: (lv_ownedTerms_3_0= ruleExpCS )
            	    // InternalNML.g:4707:6: lv_ownedTerms_3_0= ruleExpCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_34);
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
            	    break loop96;
                }
            } while (true);

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:4733:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // InternalNML.g:4733:56: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // InternalNML.g:4734:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
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
    // InternalNML.g:4740:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) ) ;
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
            // InternalNML.g:4746:2: ( ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) ) )
            // InternalNML.g:4747:2: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) )
            {
            // InternalNML.g:4747:2: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( ((LA103_0>=RULE_INT && LA103_0<=RULE_SINGLE_QUOTED_STRING)||LA103_0==47||(LA103_0>=57 && LA103_0<=60)||(LA103_0>=71 && LA103_0<=85)||LA103_0==88||(LA103_0>=90 && LA103_0<=93)||LA103_0==97||(LA103_0>=102 && LA103_0<=103)) ) {
                alt103=1;
            }
            else if ( (LA103_0==23) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // InternalNML.g:4748:3: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? )
                    {
                    // InternalNML.g:4748:3: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? )
                    // InternalNML.g:4749:4: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?
                    {
                    // InternalNML.g:4749:4: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) )
                    // InternalNML.g:4750:5: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    {
                    // InternalNML.g:4750:5: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    // InternalNML.g:4751:6: lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_73);
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

                    // InternalNML.g:4768:4: ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?
                    int alt102=4;
                    alt102 = dfa102.predict(input);
                    switch (alt102) {
                        case 1 :
                            // InternalNML.g:4769:5: (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            {
                            // InternalNML.g:4769:5: (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            // InternalNML.g:4770:6: otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            {
                            otherlv_1=(Token)match(input,89,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getLessThanSignHyphenMinusKeyword_0_1_0_0());
                              					
                            }
                            // InternalNML.g:4774:6: ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) )
                            // InternalNML.g:4775:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
                            {
                            // InternalNML.g:4775:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
                            // InternalNML.g:4776:8: lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_74);
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

                            // InternalNML.g:4793:6: (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            int alt97=2;
                            int LA97_0 = input.LA(1);

                            if ( (LA97_0==43) ) {
                                alt97=1;
                            }
                            switch (alt97) {
                                case 1 :
                                    // InternalNML.g:4794:7: otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    {
                                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_55); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_0_1_0_2_0());
                                      						
                                    }
                                    // InternalNML.g:4798:7: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    // InternalNML.g:4799:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    {
                                    // InternalNML.g:4799:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    // InternalNML.g:4800:9: lv_ownedInitExpression_4_0= ruleExpCS
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
                            // InternalNML.g:4820:5: (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
                            {
                            // InternalNML.g:4820:5: (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
                            // InternalNML.g:4821:6: otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
                            {
                            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_46); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_0_1_1_0());
                              					
                            }
                            // InternalNML.g:4825:6: ( (lv_ownedType_6_0= ruleTypeExpCS ) )
                            // InternalNML.g:4826:7: (lv_ownedType_6_0= ruleTypeExpCS )
                            {
                            // InternalNML.g:4826:7: (lv_ownedType_6_0= ruleTypeExpCS )
                            // InternalNML.g:4827:8: lv_ownedType_6_0= ruleTypeExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_1_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_75);
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

                            // InternalNML.g:4844:6: (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )?
                            int alt98=2;
                            int LA98_0 = input.LA(1);

                            if ( (LA98_0==89) ) {
                                alt98=1;
                            }
                            switch (alt98) {
                                case 1 :
                                    // InternalNML.g:4845:7: otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                                    {
                                    otherlv_7=(Token)match(input,89,FollowSets000.FOLLOW_3); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_7, grammarAccess.getNavigatingArgCSAccess().getLessThanSignHyphenMinusKeyword_0_1_1_2_0());
                                      						
                                    }
                                    // InternalNML.g:4849:7: ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                                    // InternalNML.g:4850:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                                    {
                                    // InternalNML.g:4850:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                                    // InternalNML.g:4851:9: lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_1_2_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_74);
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

                            // InternalNML.g:4869:6: (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
                            int alt99=2;
                            int LA99_0 = input.LA(1);

                            if ( (LA99_0==43) ) {
                                alt99=1;
                            }
                            switch (alt99) {
                                case 1 :
                                    // InternalNML.g:4870:7: otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                                    {
                                    otherlv_9=(Token)match(input,43,FollowSets000.FOLLOW_55); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_9, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_0_1_1_3_0());
                                      						
                                    }
                                    // InternalNML.g:4874:7: ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                                    // InternalNML.g:4875:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                                    {
                                    // InternalNML.g:4875:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                                    // InternalNML.g:4876:9: lv_ownedInitExpression_10_0= ruleExpCS
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
                            // InternalNML.g:4896:5: ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
                            {
                            // InternalNML.g:4896:5: ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
                            // InternalNML.g:4897:6: (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
                            {
                            // InternalNML.g:4897:6: (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )?
                            int alt100=2;
                            int LA100_0 = input.LA(1);

                            if ( (LA100_0==23) ) {
                                alt100=1;
                            }
                            switch (alt100) {
                                case 1 :
                                    // InternalNML.g:4898:7: otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                                    {
                                    otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_46); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_11, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_0_1_2_0_0());
                                      						
                                    }
                                    // InternalNML.g:4902:7: ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                                    // InternalNML.g:4903:8: (lv_ownedType_12_0= ruleTypeExpCS )
                                    {
                                    // InternalNML.g:4903:8: (lv_ownedType_12_0= ruleTypeExpCS )
                                    // InternalNML.g:4904:9: lv_ownedType_12_0= ruleTypeExpCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_2_0_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_76);
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

                            // InternalNML.g:4922:6: (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )?
                            int alt101=2;
                            int LA101_0 = input.LA(1);

                            if ( (LA101_0==89) ) {
                                alt101=1;
                            }
                            switch (alt101) {
                                case 1 :
                                    // InternalNML.g:4923:7: otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                                    {
                                    otherlv_13=(Token)match(input,89,FollowSets000.FOLLOW_3); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_13, grammarAccess.getNavigatingArgCSAccess().getLessThanSignHyphenMinusKeyword_0_1_2_1_0());
                                      						
                                    }
                                    // InternalNML.g:4927:7: ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                                    // InternalNML.g:4928:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                                    {
                                    // InternalNML.g:4928:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                                    // InternalNML.g:4929:9: lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_2_1_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_77);
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

                            otherlv_15=(Token)match(input,95,FollowSets000.FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_15, grammarAccess.getNavigatingArgCSAccess().getInKeyword_0_1_2_2());
                              					
                            }
                            // InternalNML.g:4951:6: ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
                            // InternalNML.g:4952:7: (lv_ownedInitExpression_16_0= ruleExpCS )
                            {
                            // InternalNML.g:4952:7: (lv_ownedInitExpression_16_0= ruleExpCS )
                            // InternalNML.g:4953:8: lv_ownedInitExpression_16_0= ruleExpCS
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
                    // InternalNML.g:4974:3: (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) )
                    {
                    // InternalNML.g:4974:3: (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) )
                    // InternalNML.g:4975:4: otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) )
                    {
                    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalNML.g:4979:4: ( (lv_ownedType_18_0= ruleTypeExpCS ) )
                    // InternalNML.g:4980:5: (lv_ownedType_18_0= ruleTypeExpCS )
                    {
                    // InternalNML.g:4980:5: (lv_ownedType_18_0= ruleTypeExpCS )
                    // InternalNML.g:4981:6: lv_ownedType_18_0= ruleTypeExpCS
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
    // InternalNML.g:5003:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // InternalNML.g:5003:59: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // InternalNML.g:5004:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
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
    // InternalNML.g:5010:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
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
            // InternalNML.g:5016:2: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // InternalNML.g:5017:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // InternalNML.g:5017:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // InternalNML.g:5018:3: ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // InternalNML.g:5018:3: ( (lv_prefix_0_0= '|' ) )
            // InternalNML.g:5019:4: (lv_prefix_0_0= '|' )
            {
            // InternalNML.g:5019:4: (lv_prefix_0_0= '|' )
            // InternalNML.g:5020:5: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,96,FollowSets000.FOLLOW_55); if (state.failed) return current;
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

            // InternalNML.g:5032:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalNML.g:5033:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalNML.g:5033:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalNML.g:5034:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_78);
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

            // InternalNML.g:5051:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==23) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalNML.g:5052:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalNML.g:5056:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalNML.g:5057:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalNML.g:5057:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalNML.g:5058:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_74);
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

                    // InternalNML.g:5075:4: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==43) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // InternalNML.g:5076:5: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_2_2_0());
                              				
                            }
                            // InternalNML.g:5080:5: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalNML.g:5081:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalNML.g:5081:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalNML.g:5082:7: lv_ownedInitExpression_5_0= ruleExpCS
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
    // InternalNML.g:5105:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // InternalNML.g:5105:61: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // InternalNML.g:5106:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
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
    // InternalNML.g:5112:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? ) ;
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
            // InternalNML.g:5118:2: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? ) )
            // InternalNML.g:5119:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? )
            {
            // InternalNML.g:5119:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? )
            // InternalNML.g:5120:3: ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?
            {
            // InternalNML.g:5120:3: ( (lv_prefix_0_0= ',' ) )
            // InternalNML.g:5121:4: (lv_prefix_0_0= ',' )
            {
            // InternalNML.g:5121:4: (lv_prefix_0_0= ',' )
            // InternalNML.g:5122:5: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,27,FollowSets000.FOLLOW_55); if (state.failed) return current;
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

            // InternalNML.g:5134:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalNML.g:5135:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalNML.g:5135:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalNML.g:5136:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_73);
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

            // InternalNML.g:5153:3: ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?
            int alt111=4;
            alt111 = dfa111.predict(input);
            switch (alt111) {
                case 1 :
                    // InternalNML.g:5154:4: (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    {
                    // InternalNML.g:5154:4: (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    // InternalNML.g:5155:5: otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,89,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getLessThanSignHyphenMinusKeyword_2_0_0());
                      				
                    }
                    // InternalNML.g:5159:5: ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) )
                    // InternalNML.g:5160:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
                    {
                    // InternalNML.g:5160:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
                    // InternalNML.g:5161:7: lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_74);
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

                    // InternalNML.g:5178:5: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==43) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // InternalNML.g:5179:6: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_2_0_2_0());
                              					
                            }
                            // InternalNML.g:5183:6: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalNML.g:5184:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalNML.g:5184:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalNML.g:5185:8: lv_ownedInitExpression_5_0= ruleExpCS
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
                    // InternalNML.g:5205:4: (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
                    {
                    // InternalNML.g:5205:4: (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
                    // InternalNML.g:5206:5: otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_1_0());
                      				
                    }
                    // InternalNML.g:5210:5: ( (lv_ownedType_7_0= ruleTypeExpCS ) )
                    // InternalNML.g:5211:6: (lv_ownedType_7_0= ruleTypeExpCS )
                    {
                    // InternalNML.g:5211:6: (lv_ownedType_7_0= ruleTypeExpCS )
                    // InternalNML.g:5212:7: lv_ownedType_7_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_75);
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

                    // InternalNML.g:5229:5: (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==89) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // InternalNML.g:5230:6: otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                            {
                            otherlv_8=(Token)match(input,89,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getNavigatingCommaArgCSAccess().getLessThanSignHyphenMinusKeyword_2_1_2_0());
                              					
                            }
                            // InternalNML.g:5234:6: ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                            // InternalNML.g:5235:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                            {
                            // InternalNML.g:5235:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                            // InternalNML.g:5236:8: lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_1_2_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_74);
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

                    // InternalNML.g:5254:5: (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==43) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // InternalNML.g:5255:6: otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                            {
                            otherlv_10=(Token)match(input,43,FollowSets000.FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_10, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_2_1_3_0());
                              					
                            }
                            // InternalNML.g:5259:6: ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                            // InternalNML.g:5260:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                            {
                            // InternalNML.g:5260:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                            // InternalNML.g:5261:8: lv_ownedInitExpression_11_0= ruleExpCS
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
                    // InternalNML.g:5281:4: ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
                    {
                    // InternalNML.g:5281:4: ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
                    // InternalNML.g:5282:5: (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
                    {
                    // InternalNML.g:5282:5: (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==23) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // InternalNML.g:5283:6: otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                            {
                            otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_46); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_12, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_2_0_0());
                              					
                            }
                            // InternalNML.g:5287:6: ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                            // InternalNML.g:5288:7: (lv_ownedType_13_0= ruleTypeExpCS )
                            {
                            // InternalNML.g:5288:7: (lv_ownedType_13_0= ruleTypeExpCS )
                            // InternalNML.g:5289:8: lv_ownedType_13_0= ruleTypeExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_2_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_76);
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

                    // InternalNML.g:5307:5: (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==89) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // InternalNML.g:5308:6: otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                            {
                            otherlv_14=(Token)match(input,89,FollowSets000.FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_14, grammarAccess.getNavigatingCommaArgCSAccess().getLessThanSignHyphenMinusKeyword_2_2_1_0());
                              					
                            }
                            // InternalNML.g:5312:6: ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                            // InternalNML.g:5313:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                            {
                            // InternalNML.g:5313:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                            // InternalNML.g:5314:8: lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_2_1_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_77);
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

                    otherlv_16=(Token)match(input,95,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_16, grammarAccess.getNavigatingCommaArgCSAccess().getInKeyword_2_2_2());
                      				
                    }
                    // InternalNML.g:5336:5: ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
                    // InternalNML.g:5337:6: (lv_ownedInitExpression_17_0= ruleExpCS )
                    {
                    // InternalNML.g:5337:6: (lv_ownedInitExpression_17_0= ruleExpCS )
                    // InternalNML.g:5338:7: lv_ownedInitExpression_17_0= ruleExpCS
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
    // InternalNML.g:5361:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // InternalNML.g:5361:60: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // InternalNML.g:5362:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
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
    // InternalNML.g:5368:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
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
            // InternalNML.g:5374:2: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // InternalNML.g:5375:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // InternalNML.g:5375:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // InternalNML.g:5376:3: ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // InternalNML.g:5376:3: ( (lv_prefix_0_0= ';' ) )
            // InternalNML.g:5377:4: (lv_prefix_0_0= ';' )
            {
            // InternalNML.g:5377:4: (lv_prefix_0_0= ';' )
            // InternalNML.g:5378:5: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,24,FollowSets000.FOLLOW_55); if (state.failed) return current;
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

            // InternalNML.g:5390:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalNML.g:5391:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalNML.g:5391:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalNML.g:5392:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_78);
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

            // InternalNML.g:5409:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==23) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalNML.g:5410:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalNML.g:5414:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalNML.g:5415:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalNML.g:5415:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalNML.g:5416:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_74);
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

                    // InternalNML.g:5433:4: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==43) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // InternalNML.g:5434:5: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_2_2_0());
                              				
                            }
                            // InternalNML.g:5438:5: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalNML.g:5439:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalNML.g:5439:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalNML.g:5440:7: lv_ownedInitExpression_5_0= ruleExpCS
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
    // InternalNML.g:5463:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // InternalNML.g:5463:59: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // InternalNML.g:5464:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
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
    // InternalNML.g:5470:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;



        	enterRule();

        try {
            // InternalNML.g:5476:2: (this_ExpCS_0= ruleExpCS )
            // InternalNML.g:5477:2: this_ExpCS_0= ruleExpCS
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
    // InternalNML.g:5491:1: entryRuleCoIteratorVariableCS returns [EObject current=null] : iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF ;
    public final EObject entryRuleCoIteratorVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoIteratorVariableCS = null;


        try {
            // InternalNML.g:5491:61: (iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF )
            // InternalNML.g:5492:2: iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF
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
    // InternalNML.g:5498:1: ruleCoIteratorVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? ) ;
    public final EObject ruleCoIteratorVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalNML.g:5504:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? ) )
            // InternalNML.g:5505:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? )
            {
            // InternalNML.g:5505:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? )
            // InternalNML.g:5506:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            {
            // InternalNML.g:5506:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalNML.g:5507:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalNML.g:5507:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalNML.g:5508:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCoIteratorVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_78);
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

            // InternalNML.g:5525:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==23) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalNML.g:5526:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCoIteratorVariableCSAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalNML.g:5530:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalNML.g:5531:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalNML.g:5531:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalNML.g:5532:6: lv_ownedType_2_0= ruleTypeExpCS
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
    // InternalNML.g:5554:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // InternalNML.g:5554:48: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // InternalNML.g:5555:2: iv_ruleIfExpCS= ruleIfExpCS EOF
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
    // InternalNML.g:5561:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) ;
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
            // InternalNML.g:5567:2: ( (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) )
            // InternalNML.g:5568:2: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            {
            // InternalNML.g:5568:2: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            // InternalNML.g:5569:3: otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif'
            {
            otherlv_0=(Token)match(input,97,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
              		
            }
            // InternalNML.g:5573:3: ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) )
            // InternalNML.g:5574:4: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            {
            // InternalNML.g:5574:4: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            // InternalNML.g:5575:5: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            {
            // InternalNML.g:5575:5: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            int alt115=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_SINGLE_QUOTED_STRING:
            case 47:
            case 57:
            case 58:
            case 59:
            case 60:
            case 71:
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
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 97:
            case 102:
            case 103:
                {
                alt115=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA115_2 = input.LA(2);

                if ( (LA115_2==23) ) {
                    alt115=2;
                }
                else if ( (LA115_2==17||(LA115_2>=37 && LA115_2<=38)||LA115_2==40||LA115_2==43||LA115_2==45||LA115_2==47||LA115_2==49||(LA115_2>=51 && LA115_2<=54)||(LA115_2>=56 && LA115_2<=57)||(LA115_2>=60 && LA115_2<=70)||LA115_2==94||LA115_2==98||LA115_2==107) ) {
                    alt115=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 115, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA115_3 = input.LA(2);

                if ( (LA115_3==23) ) {
                    alt115=2;
                }
                else if ( (LA115_3==17||(LA115_3>=37 && LA115_3<=38)||LA115_3==40||LA115_3==43||LA115_3==45||LA115_3==47||LA115_3==49||(LA115_3>=51 && LA115_3<=54)||(LA115_3>=56 && LA115_3<=57)||(LA115_3>=60 && LA115_3<=70)||LA115_3==94||LA115_3==98||LA115_3==107) ) {
                    alt115=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 115, 3, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt115=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // InternalNML.g:5576:6: lv_ownedCondition_1_1= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_79);
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
                    // InternalNML.g:5592:6: lv_ownedCondition_1_2= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionPatternExpCSParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_79);
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

            otherlv_2=(Token)match(input,98,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
              		
            }
            // InternalNML.g:5614:3: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // InternalNML.g:5615:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // InternalNML.g:5615:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            // InternalNML.g:5616:5: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_80);
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

            // InternalNML.g:5633:3: ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==101) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // InternalNML.g:5634:4: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    {
            	    // InternalNML.g:5634:4: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    // InternalNML.g:5635:5: lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedIfThenExpressionsElseIfThenExpCSParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_80);
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
            	    break loop116;
                }
            } while (true);

            otherlv_5=(Token)match(input,99,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getIfExpCSAccess().getElseKeyword_5());
              		
            }
            // InternalNML.g:5656:3: ( (lv_ownedElseExpression_6_0= ruleExpCS ) )
            // InternalNML.g:5657:4: (lv_ownedElseExpression_6_0= ruleExpCS )
            {
            // InternalNML.g:5657:4: (lv_ownedElseExpression_6_0= ruleExpCS )
            // InternalNML.g:5658:5: lv_ownedElseExpression_6_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedElseExpressionExpCSParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_81);
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

            otherlv_7=(Token)match(input,100,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:5683:1: entryRuleElseIfThenExpCS returns [EObject current=null] : iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF ;
    public final EObject entryRuleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfThenExpCS = null;


        try {
            // InternalNML.g:5683:56: (iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF )
            // InternalNML.g:5684:2: iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF
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
    // InternalNML.g:5690:1: ruleElseIfThenExpCS returns [EObject current=null] : (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) ;
    public final EObject ruleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedCondition_1_0 = null;

        EObject lv_ownedThenExpression_3_0 = null;



        	enterRule();

        try {
            // InternalNML.g:5696:2: ( (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) )
            // InternalNML.g:5697:2: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            {
            // InternalNML.g:5697:2: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            // InternalNML.g:5698:3: otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,101,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getElseIfThenExpCSAccess().getElseifKeyword_0());
              		
            }
            // InternalNML.g:5702:3: ( (lv_ownedCondition_1_0= ruleExpCS ) )
            // InternalNML.g:5703:4: (lv_ownedCondition_1_0= ruleExpCS )
            {
            // InternalNML.g:5703:4: (lv_ownedCondition_1_0= ruleExpCS )
            // InternalNML.g:5704:5: lv_ownedCondition_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_79);
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

            otherlv_2=(Token)match(input,98,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getElseIfThenExpCSAccess().getThenKeyword_2());
              		
            }
            // InternalNML.g:5725:3: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // InternalNML.g:5726:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // InternalNML.g:5726:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            // InternalNML.g:5727:5: lv_ownedThenExpression_3_0= ruleExpCS
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
    // InternalNML.g:5748:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // InternalNML.g:5748:49: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // InternalNML.g:5749:2: iv_ruleLetExpCS= ruleLetExpCS EOF
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
    // InternalNML.g:5755:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) ;
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
            // InternalNML.g:5761:2: ( (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) )
            // InternalNML.g:5762:2: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            {
            // InternalNML.g:5762:2: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            // InternalNML.g:5763:3: otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,102,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
              		
            }
            // InternalNML.g:5767:3: ( (lv_ownedVariables_1_0= ruleLetVariableCS ) )
            // InternalNML.g:5768:4: (lv_ownedVariables_1_0= ruleLetVariableCS )
            {
            // InternalNML.g:5768:4: (lv_ownedVariables_1_0= ruleLetVariableCS )
            // InternalNML.g:5769:5: lv_ownedVariables_1_0= ruleLetVariableCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_82);
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

            // InternalNML.g:5786:3: (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==27) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // InternalNML.g:5787:4: otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalNML.g:5791:4: ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    // InternalNML.g:5792:5: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    {
            	    // InternalNML.g:5792:5: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    // InternalNML.g:5793:6: lv_ownedVariables_3_0= ruleLetVariableCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_82);
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
            	    break loop117;
                }
            } while (true);

            otherlv_4=(Token)match(input,95,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
              		
            }
            // InternalNML.g:5815:3: ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            // InternalNML.g:5816:4: (lv_ownedInExpression_5_0= ruleExpCS )
            {
            // InternalNML.g:5816:4: (lv_ownedInExpression_5_0= ruleExpCS )
            // InternalNML.g:5817:5: lv_ownedInExpression_5_0= ruleExpCS
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
    // InternalNML.g:5838:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // InternalNML.g:5838:54: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // InternalNML.g:5839:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
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
    // InternalNML.g:5845:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) ;
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
            // InternalNML.g:5851:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) )
            // InternalNML.g:5852:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            {
            // InternalNML.g:5852:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            // InternalNML.g:5853:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            {
            // InternalNML.g:5853:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalNML.g:5854:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalNML.g:5854:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalNML.g:5855:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_83);
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

            // InternalNML.g:5872:3: ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==47) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalNML.g:5873:4: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    {
                    // InternalNML.g:5873:4: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    // InternalNML.g:5874:5: lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_60);
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

            // InternalNML.g:5891:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==23) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalNML.g:5892:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLetVariableCSAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalNML.g:5896:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalNML.g:5897:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalNML.g:5897:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalNML.g:5898:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_57);
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

            otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalNML.g:5920:3: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            // InternalNML.g:5921:4: (lv_ownedInitExpression_5_0= ruleExpCS )
            {
            // InternalNML.g:5921:4: (lv_ownedInitExpression_5_0= ruleExpCS )
            // InternalNML.g:5922:5: lv_ownedInitExpression_5_0= ruleExpCS
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
    // InternalNML.g:5943:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // InternalNML.g:5943:52: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // InternalNML.g:5944:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
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
    // InternalNML.g:5950:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedExpression_1_0 = null;



        	enterRule();

        try {
            // InternalNML.g:5956:2: ( (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // InternalNML.g:5957:2: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // InternalNML.g:5957:2: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // InternalNML.g:5958:3: otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalNML.g:5962:3: ( (lv_ownedExpression_1_0= ruleExpCS ) )
            // InternalNML.g:5963:4: (lv_ownedExpression_1_0= ruleExpCS )
            {
            // InternalNML.g:5963:4: (lv_ownedExpression_1_0= ruleExpCS )
            // InternalNML.g:5964:5: lv_ownedExpression_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedExpCSAccess().getOwnedExpressionExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_39);
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

            otherlv_2=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:5989:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // InternalNML.g:5989:50: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // InternalNML.g:5990:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
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
    // InternalNML.g:5996:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalNML.g:6002:2: ( ( () otherlv_1= 'self' ) )
            // InternalNML.g:6003:2: ( () otherlv_1= 'self' )
            {
            // InternalNML.g:6003:2: ( () otherlv_1= 'self' )
            // InternalNML.g:6004:3: () otherlv_1= 'self'
            {
            // InternalNML.g:6004:3: ()
            // InternalNML.g:6005:4: 
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

            otherlv_1=(Token)match(input,103,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:6022:1: entryRuleMultiplicityBoundsCS returns [EObject current=null] : iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF ;
    public final EObject entryRuleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityBoundsCS = null;


        try {
            // InternalNML.g:6022:61: (iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF )
            // InternalNML.g:6023:2: iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF
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
    // InternalNML.g:6029:1: ruleMultiplicityBoundsCS returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) ;
    public final EObject ruleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalNML.g:6035:2: ( ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) )
            // InternalNML.g:6036:2: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            {
            // InternalNML.g:6036:2: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            // InternalNML.g:6037:3: ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            {
            // InternalNML.g:6037:3: ( (lv_lowerBound_0_0= ruleLOWER ) )
            // InternalNML.g:6038:4: (lv_lowerBound_0_0= ruleLOWER )
            {
            // InternalNML.g:6038:4: (lv_lowerBound_0_0= ruleLOWER )
            // InternalNML.g:6039:5: lv_lowerBound_0_0= ruleLOWER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getLowerBoundLOWERParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_54);
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

            // InternalNML.g:6056:3: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==86) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalNML.g:6057:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) )
                    {
                    otherlv_1=(Token)match(input,86,FollowSets000.FOLLOW_84); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMultiplicityBoundsCSAccess().getFullStopFullStopKeyword_1_0());
                      			
                    }
                    // InternalNML.g:6061:4: ( (lv_upperBound_2_0= ruleUPPER ) )
                    // InternalNML.g:6062:5: (lv_upperBound_2_0= ruleUPPER )
                    {
                    // InternalNML.g:6062:5: (lv_upperBound_2_0= ruleUPPER )
                    // InternalNML.g:6063:6: lv_upperBound_2_0= ruleUPPER
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
    // InternalNML.g:6085:1: entryRuleMultiplicityCS returns [EObject current=null] : iv_ruleMultiplicityCS= ruleMultiplicityCS EOF ;
    public final EObject entryRuleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityCS = null;


        try {
            // InternalNML.g:6085:55: (iv_ruleMultiplicityCS= ruleMultiplicityCS EOF )
            // InternalNML.g:6086:2: iv_ruleMultiplicityCS= ruleMultiplicityCS EOF
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
    // InternalNML.g:6092:1: ruleMultiplicityCS returns [EObject current=null] : (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' ) ;
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
            // InternalNML.g:6098:2: ( (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' ) )
            // InternalNML.g:6099:2: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' )
            {
            // InternalNML.g:6099:2: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' )
            // InternalNML.g:6100:3: otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_85); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultiplicityCSAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalNML.g:6104:3: (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==RULE_INT) ) {
                alt121=1;
            }
            else if ( (LA121_0==49||LA121_0==60||LA121_0==106) ) {
                alt121=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }
            switch (alt121) {
                case 1 :
                    // InternalNML.g:6105:4: this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityBoundsCSParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_86);
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
                    // InternalNML.g:6117:4: this_MultiplicityStringCS_2= ruleMultiplicityStringCS
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityStringCSParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_86);
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

            // InternalNML.g:6129:3: (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )?
            int alt122=3;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==104) ) {
                alt122=1;
            }
            else if ( (LA122_0==105) ) {
                alt122=2;
            }
            switch (alt122) {
                case 1 :
                    // InternalNML.g:6130:4: otherlv_3= '|?'
                    {
                    otherlv_3=(Token)match(input,104,FollowSets000.FOLLOW_87); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMultiplicityCSAccess().getVerticalLineQuestionMarkKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalNML.g:6135:4: ( (lv_isNullFree_4_0= '|1' ) )
                    {
                    // InternalNML.g:6135:4: ( (lv_isNullFree_4_0= '|1' ) )
                    // InternalNML.g:6136:5: (lv_isNullFree_4_0= '|1' )
                    {
                    // InternalNML.g:6136:5: (lv_isNullFree_4_0= '|1' )
                    // InternalNML.g:6137:6: lv_isNullFree_4_0= '|1'
                    {
                    lv_isNullFree_4_0=(Token)match(input,105,FollowSets000.FOLLOW_87); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:6158:1: entryRuleMultiplicityStringCS returns [EObject current=null] : iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF ;
    public final EObject entryRuleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityStringCS = null;


        try {
            // InternalNML.g:6158:61: (iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF )
            // InternalNML.g:6159:2: iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF
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
    // InternalNML.g:6165:1: ruleMultiplicityStringCS returns [EObject current=null] : ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) ;
    public final EObject ruleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        Token lv_stringBounds_0_1=null;
        Token lv_stringBounds_0_2=null;
        Token lv_stringBounds_0_3=null;


        	enterRule();

        try {
            // InternalNML.g:6171:2: ( ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) )
            // InternalNML.g:6172:2: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            {
            // InternalNML.g:6172:2: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            // InternalNML.g:6173:3: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            {
            // InternalNML.g:6173:3: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            // InternalNML.g:6174:4: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            {
            // InternalNML.g:6174:4: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            int alt123=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt123=1;
                }
                break;
            case 49:
                {
                alt123=2;
                }
                break;
            case 106:
                {
                alt123=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }

            switch (alt123) {
                case 1 :
                    // InternalNML.g:6175:5: lv_stringBounds_0_1= '*'
                    {
                    lv_stringBounds_0_1=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                    // InternalNML.g:6186:5: lv_stringBounds_0_2= '+'
                    {
                    lv_stringBounds_0_2=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                    // InternalNML.g:6197:5: lv_stringBounds_0_3= '?'
                    {
                    lv_stringBounds_0_3=(Token)match(input,106,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:6213:1: entryRulePathNameCS returns [EObject current=null] : iv_rulePathNameCS= rulePathNameCS EOF ;
    public final EObject entryRulePathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameCS = null;


        try {
            // InternalNML.g:6213:51: (iv_rulePathNameCS= rulePathNameCS EOF )
            // InternalNML.g:6214:2: iv_rulePathNameCS= rulePathNameCS EOF
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
    // InternalNML.g:6220:1: rulePathNameCS returns [EObject current=null] : ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) ;
    public final EObject rulePathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedPathElements_0_0 = null;

        EObject lv_ownedPathElements_2_0 = null;



        	enterRule();

        try {
            // InternalNML.g:6226:2: ( ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) )
            // InternalNML.g:6227:2: ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            {
            // InternalNML.g:6227:2: ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            // InternalNML.g:6228:3: ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            {
            // InternalNML.g:6228:3: ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) )
            // InternalNML.g:6229:4: (lv_ownedPathElements_0_0= ruleFirstPathElementCS )
            {
            // InternalNML.g:6229:4: (lv_ownedPathElements_0_0= ruleFirstPathElementCS )
            // InternalNML.g:6230:5: lv_ownedPathElements_0_0= ruleFirstPathElementCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPathNameCSAccess().getOwnedPathElementsFirstPathElementCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_88);
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

            // InternalNML.g:6247:3: (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==107) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // InternalNML.g:6248:4: otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,107,FollowSets000.FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    // InternalNML.g:6252:4: ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    // InternalNML.g:6253:5: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    {
            	    // InternalNML.g:6253:5: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    // InternalNML.g:6254:6: lv_ownedPathElements_2_0= ruleNextPathElementCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPathNameCSAccess().getOwnedPathElementsNextPathElementCSParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_88);
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
            	    break loop124;
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
    // InternalNML.g:6276:1: entryRuleFirstPathElementCS returns [EObject current=null] : iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF ;
    public final EObject entryRuleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstPathElementCS = null;


        try {
            // InternalNML.g:6276:59: (iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF )
            // InternalNML.g:6277:2: iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF
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
    // InternalNML.g:6283:1: ruleFirstPathElementCS returns [EObject current=null] : ( ( ruleUnrestrictedName ) ) ;
    public final EObject ruleFirstPathElementCS() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalNML.g:6289:2: ( ( ( ruleUnrestrictedName ) ) )
            // InternalNML.g:6290:2: ( ( ruleUnrestrictedName ) )
            {
            // InternalNML.g:6290:2: ( ( ruleUnrestrictedName ) )
            // InternalNML.g:6291:3: ( ruleUnrestrictedName )
            {
            // InternalNML.g:6291:3: ( ruleUnrestrictedName )
            // InternalNML.g:6292:4: ruleUnrestrictedName
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
    // InternalNML.g:6312:1: entryRuleNextPathElementCS returns [EObject current=null] : iv_ruleNextPathElementCS= ruleNextPathElementCS EOF ;
    public final EObject entryRuleNextPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextPathElementCS = null;


        try {
            // InternalNML.g:6312:58: (iv_ruleNextPathElementCS= ruleNextPathElementCS EOF )
            // InternalNML.g:6313:2: iv_ruleNextPathElementCS= ruleNextPathElementCS EOF
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
    // InternalNML.g:6319:1: ruleNextPathElementCS returns [EObject current=null] : ( ( ruleUnreservedName ) ) ;
    public final EObject ruleNextPathElementCS() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalNML.g:6325:2: ( ( ( ruleUnreservedName ) ) )
            // InternalNML.g:6326:2: ( ( ruleUnreservedName ) )
            {
            // InternalNML.g:6326:2: ( ( ruleUnreservedName ) )
            // InternalNML.g:6327:3: ( ruleUnreservedName )
            {
            // InternalNML.g:6327:3: ( ruleUnreservedName )
            // InternalNML.g:6328:4: ruleUnreservedName
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
    // InternalNML.g:6348:1: entryRuleTemplateBindingCS returns [EObject current=null] : iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF ;
    public final EObject entryRuleTemplateBindingCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateBindingCS = null;


        try {
            // InternalNML.g:6348:58: (iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF )
            // InternalNML.g:6349:2: iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF
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
    // InternalNML.g:6355:1: ruleTemplateBindingCS returns [EObject current=null] : ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTemplateBindingCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedSubstitutions_0_0 = null;

        EObject lv_ownedSubstitutions_2_0 = null;

        EObject lv_ownedMultiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalNML.g:6361:2: ( ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) )
            // InternalNML.g:6362:2: ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            {
            // InternalNML.g:6362:2: ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            // InternalNML.g:6363:3: ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            {
            // InternalNML.g:6363:3: ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) )
            // InternalNML.g:6364:4: (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS )
            {
            // InternalNML.g:6364:4: (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS )
            // InternalNML.g:6365:5: lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedSubstitutionsTemplateParameterSubstitutionCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_89);
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

            // InternalNML.g:6382:3: (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==27) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // InternalNML.g:6383:4: otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_90); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getTemplateBindingCSAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalNML.g:6387:4: ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) )
            	    // InternalNML.g:6388:5: (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS )
            	    {
            	    // InternalNML.g:6388:5: (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS )
            	    // InternalNML.g:6389:6: lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedSubstitutionsTemplateParameterSubstitutionCSParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_89);
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
            	    break loop125;
                }
            } while (true);

            // InternalNML.g:6407:3: ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==40) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalNML.g:6408:4: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    {
                    // InternalNML.g:6408:4: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    // InternalNML.g:6409:5: lv_ownedMultiplicity_3_0= ruleMultiplicityCS
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
    // InternalNML.g:6430:1: entryRuleTemplateParameterSubstitutionCS returns [EObject current=null] : iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF ;
    public final EObject entryRuleTemplateParameterSubstitutionCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateParameterSubstitutionCS = null;


        try {
            // InternalNML.g:6430:72: (iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF )
            // InternalNML.g:6431:2: iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF
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
    // InternalNML.g:6437:1: ruleTemplateParameterSubstitutionCS returns [EObject current=null] : ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) ) ;
    public final EObject ruleTemplateParameterSubstitutionCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedActualParameter_0_0 = null;



        	enterRule();

        try {
            // InternalNML.g:6443:2: ( ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) ) )
            // InternalNML.g:6444:2: ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) )
            {
            // InternalNML.g:6444:2: ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) )
            // InternalNML.g:6445:3: (lv_ownedActualParameter_0_0= ruleTypeRefCS )
            {
            // InternalNML.g:6445:3: (lv_ownedActualParameter_0_0= ruleTypeRefCS )
            // InternalNML.g:6446:4: lv_ownedActualParameter_0_0= ruleTypeRefCS
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
    // InternalNML.g:6466:1: entryRuleTypeParameterCS returns [EObject current=null] : iv_ruleTypeParameterCS= ruleTypeParameterCS EOF ;
    public final EObject entryRuleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeParameterCS = null;


        try {
            // InternalNML.g:6466:56: (iv_ruleTypeParameterCS= ruleTypeParameterCS EOF )
            // InternalNML.g:6467:2: iv_ruleTypeParameterCS= ruleTypeParameterCS EOF
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
    // InternalNML.g:6473:1: ruleTypeParameterCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? ) ;
    public final EObject ruleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedExtends_2_0 = null;

        EObject lv_ownedExtends_4_0 = null;



        	enterRule();

        try {
            // InternalNML.g:6479:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? ) )
            // InternalNML.g:6480:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? )
            {
            // InternalNML.g:6480:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? )
            // InternalNML.g:6481:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )?
            {
            // InternalNML.g:6481:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalNML.g:6482:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalNML.g:6482:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalNML.g:6483:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeParameterCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_91);
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

            // InternalNML.g:6500:3: (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==30) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalNML.g:6501:4: otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )*
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypeParameterCSAccess().getExtendsKeyword_1_0());
                      			
                    }
                    // InternalNML.g:6505:4: ( (lv_ownedExtends_2_0= ruleTypedRefCS ) )
                    // InternalNML.g:6506:5: (lv_ownedExtends_2_0= ruleTypedRefCS )
                    {
                    // InternalNML.g:6506:5: (lv_ownedExtends_2_0= ruleTypedRefCS )
                    // InternalNML.g:6507:6: lv_ownedExtends_2_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeParameterCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_92);
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

                    // InternalNML.g:6524:4: (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )*
                    loop127:
                    do {
                        int alt127=2;
                        int LA127_0 = input.LA(1);

                        if ( (LA127_0==108) ) {
                            alt127=1;
                        }


                        switch (alt127) {
                    	case 1 :
                    	    // InternalNML.g:6525:5: otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,108,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getTypeParameterCSAccess().getAmpersandAmpersandKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalNML.g:6529:5: ( (lv_ownedExtends_4_0= ruleTypedRefCS ) )
                    	    // InternalNML.g:6530:6: (lv_ownedExtends_4_0= ruleTypedRefCS )
                    	    {
                    	    // InternalNML.g:6530:6: (lv_ownedExtends_4_0= ruleTypedRefCS )
                    	    // InternalNML.g:6531:7: lv_ownedExtends_4_0= ruleTypedRefCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTypeParameterCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_92);
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
                    	    break loop127;
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
    // InternalNML.g:6554:1: entryRuleTypeRefCS returns [EObject current=null] : iv_ruleTypeRefCS= ruleTypeRefCS EOF ;
    public final EObject entryRuleTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRefCS = null;


        try {
            // InternalNML.g:6554:50: (iv_ruleTypeRefCS= ruleTypeRefCS EOF )
            // InternalNML.g:6555:2: iv_ruleTypeRefCS= ruleTypeRefCS EOF
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
    // InternalNML.g:6561:1: ruleTypeRefCS returns [EObject current=null] : (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS ) ;
    public final EObject ruleTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypedRefCS_0 = null;

        EObject this_WildcardTypeRefCS_1 = null;



        	enterRule();

        try {
            // InternalNML.g:6567:2: ( (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS ) )
            // InternalNML.g:6568:2: (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS )
            {
            // InternalNML.g:6568:2: (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( ((LA129_0>=RULE_SIMPLE_ID && LA129_0<=RULE_ESCAPED_ID)) ) {
                alt129=1;
            }
            else if ( (LA129_0==106) ) {
                alt129=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // InternalNML.g:6569:3: this_TypedRefCS_0= ruleTypedRefCS
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
                    // InternalNML.g:6581:3: this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS
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
    // InternalNML.g:6596:1: entryRuleTypedRefCS returns [EObject current=null] : iv_ruleTypedRefCS= ruleTypedRefCS EOF ;
    public final EObject entryRuleTypedRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedRefCS = null;


        try {
            // InternalNML.g:6596:51: (iv_ruleTypedRefCS= ruleTypedRefCS EOF )
            // InternalNML.g:6597:2: iv_ruleTypedRefCS= ruleTypedRefCS EOF
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
    // InternalNML.g:6603:1: ruleTypedRefCS returns [EObject current=null] : this_TypedTypeRefCS_0= ruleTypedTypeRefCS ;
    public final EObject ruleTypedRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypedTypeRefCS_0 = null;



        	enterRule();

        try {
            // InternalNML.g:6609:2: (this_TypedTypeRefCS_0= ruleTypedTypeRefCS )
            // InternalNML.g:6610:2: this_TypedTypeRefCS_0= ruleTypedTypeRefCS
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
    // InternalNML.g:6624:1: entryRuleTypedTypeRefCS returns [EObject current=null] : iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF ;
    public final EObject entryRuleTypedTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedTypeRefCS = null;


        try {
            // InternalNML.g:6624:55: (iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF )
            // InternalNML.g:6625:2: iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF
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
    // InternalNML.g:6631:1: ruleTypedTypeRefCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleTypedTypeRefCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedBinding_2_0 = null;



        	enterRule();

        try {
            // InternalNML.g:6637:2: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? ) )
            // InternalNML.g:6638:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? )
            {
            // InternalNML.g:6638:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? )
            // InternalNML.g:6639:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )?
            {
            // InternalNML.g:6639:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalNML.g:6640:4: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalNML.g:6640:4: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalNML.g:6641:5: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedTypeRefCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_45);
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

            // InternalNML.g:6658:3: (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==47) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalNML.g:6659:4: otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_90); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypedTypeRefCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalNML.g:6663:4: ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) )
                    // InternalNML.g:6664:5: (lv_ownedBinding_2_0= ruleTemplateBindingCS )
                    {
                    // InternalNML.g:6664:5: (lv_ownedBinding_2_0= ruleTemplateBindingCS )
                    // InternalNML.g:6665:6: lv_ownedBinding_2_0= ruleTemplateBindingCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypedTypeRefCSAccess().getOwnedBindingTemplateBindingCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_39);
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

                    otherlv_3=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:6691:1: entryRuleWildcardTypeRefCS returns [EObject current=null] : iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF ;
    public final EObject entryRuleWildcardTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcardTypeRefCS = null;


        try {
            // InternalNML.g:6691:58: (iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF )
            // InternalNML.g:6692:2: iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF
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
    // InternalNML.g:6698:1: ruleWildcardTypeRefCS returns [EObject current=null] : ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? ) ;
    public final EObject ruleWildcardTypeRefCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ownedExtends_3_0 = null;



        	enterRule();

        try {
            // InternalNML.g:6704:2: ( ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? ) )
            // InternalNML.g:6705:2: ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? )
            {
            // InternalNML.g:6705:2: ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? )
            // InternalNML.g:6706:3: () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )?
            {
            // InternalNML.g:6706:3: ()
            // InternalNML.g:6707:4: 
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

            otherlv_1=(Token)match(input,106,FollowSets000.FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWildcardTypeRefCSAccess().getQuestionMarkKeyword_1());
              		
            }
            // InternalNML.g:6720:3: (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==30) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalNML.g:6721:4: otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) )
                    {
                    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getWildcardTypeRefCSAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalNML.g:6725:4: ( (lv_ownedExtends_3_0= ruleTypedRefCS ) )
                    // InternalNML.g:6726:5: (lv_ownedExtends_3_0= ruleTypedRefCS )
                    {
                    // InternalNML.g:6726:5: (lv_ownedExtends_3_0= ruleTypedRefCS )
                    // InternalNML.g:6727:6: lv_ownedExtends_3_0= ruleTypedRefCS
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
    // InternalNML.g:6749:1: entryRuleID returns [String current=null] : iv_ruleID= ruleID EOF ;
    public final String entryRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID = null;


        try {
            // InternalNML.g:6749:42: (iv_ruleID= ruleID EOF )
            // InternalNML.g:6750:2: iv_ruleID= ruleID EOF
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
    // InternalNML.g:6756:1: ruleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) ;
    public final AntlrDatatypeRuleToken ruleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;
        Token this_ESCAPED_ID_1=null;


        	enterRule();

        try {
            // InternalNML.g:6762:2: ( (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) )
            // InternalNML.g:6763:2: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            {
            // InternalNML.g:6763:2: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==RULE_SIMPLE_ID) ) {
                alt132=1;
            }
            else if ( (LA132_0==RULE_ESCAPED_ID) ) {
                alt132=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }
            switch (alt132) {
                case 1 :
                    // InternalNML.g:6764:3: this_SIMPLE_ID_0= RULE_SIMPLE_ID
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
                    // InternalNML.g:6772:3: this_ESCAPED_ID_1= RULE_ESCAPED_ID
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
    // InternalNML.g:6783:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // InternalNML.g:6783:50: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalNML.g:6784:2: iv_ruleIdentifier= ruleIdentifier EOF
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
    // InternalNML.g:6790:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= ruleID ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ID_0 = null;



        	enterRule();

        try {
            // InternalNML.g:6796:2: (this_ID_0= ruleID )
            // InternalNML.g:6797:2: this_ID_0= ruleID
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
    // InternalNML.g:6810:1: entryRuleLOWER returns [String current=null] : iv_ruleLOWER= ruleLOWER EOF ;
    public final String entryRuleLOWER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOWER = null;


        try {
            // InternalNML.g:6810:45: (iv_ruleLOWER= ruleLOWER EOF )
            // InternalNML.g:6811:2: iv_ruleLOWER= ruleLOWER EOF
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
    // InternalNML.g:6817:1: ruleLOWER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLOWER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalNML.g:6823:2: (this_INT_0= RULE_INT )
            // InternalNML.g:6824:2: this_INT_0= RULE_INT
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
    // InternalNML.g:6834:1: entryRuleNUMBER_LITERAL returns [String current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final String entryRuleNUMBER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER_LITERAL = null;


        try {
            // InternalNML.g:6834:54: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // InternalNML.g:6835:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
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
    // InternalNML.g:6841:1: ruleNUMBER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNUMBER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalNML.g:6847:2: (this_INT_0= RULE_INT )
            // InternalNML.g:6848:2: this_INT_0= RULE_INT
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
    // InternalNML.g:6858:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalNML.g:6858:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalNML.g:6859:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalNML.g:6865:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;


        	enterRule();

        try {
            // InternalNML.g:6871:2: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // InternalNML.g:6872:2: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
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
    // InternalNML.g:6882:1: entryRuleUPPER returns [String current=null] : iv_ruleUPPER= ruleUPPER EOF ;
    public final String entryRuleUPPER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUPPER = null;


        try {
            // InternalNML.g:6882:45: (iv_ruleUPPER= ruleUPPER EOF )
            // InternalNML.g:6883:2: iv_ruleUPPER= ruleUPPER EOF
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
    // InternalNML.g:6889:1: ruleUPPER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUPPER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalNML.g:6895:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalNML.g:6896:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalNML.g:6896:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==RULE_INT) ) {
                alt133=1;
            }
            else if ( (LA133_0==60) ) {
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
                    // InternalNML.g:6897:3: this_INT_0= RULE_INT
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
                    // InternalNML.g:6905:3: kw= '*'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalNML.g:6914:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // InternalNML.g:6914:43: (iv_ruleURI= ruleURI EOF )
            // InternalNML.g:6915:2: iv_ruleURI= ruleURI EOF
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
    // InternalNML.g:6921:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;


        	enterRule();

        try {
            // InternalNML.g:6927:2: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // InternalNML.g:6928:2: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
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
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_ownedConditions_12_0 = null;


        // InternalNML.g:962:5: ( (otherlv_10= 'or' | otherlv_11= 'and' )? ( (lv_ownedConditions_12_0= ruleConditionCS ) ) )
        // InternalNML.g:962:5: (otherlv_10= 'or' | otherlv_11= 'and' )? ( (lv_ownedConditions_12_0= ruleConditionCS ) )
        {
        // InternalNML.g:962:5: (otherlv_10= 'or' | otherlv_11= 'and' )?
        int alt143=3;
        int LA143_0 = input.LA(1);

        if ( (LA143_0==37) ) {
            alt143=1;
        }
        else if ( (LA143_0==38) ) {
            alt143=2;
        }
        switch (alt143) {
            case 1 :
                // InternalNML.g:963:6: otherlv_10= 'or'
                {
                otherlv_10=(Token)match(input,37,FollowSets000.FOLLOW_30); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalNML.g:968:6: otherlv_11= 'and'
                {
                otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_30); if (state.failed) return ;

                }
                break;

        }

        // InternalNML.g:973:5: ( (lv_ownedConditions_12_0= ruleConditionCS ) )
        // InternalNML.g:974:6: (lv_ownedConditions_12_0= ruleConditionCS )
        {
        // InternalNML.g:974:6: (lv_ownedConditions_12_0= ruleConditionCS )
        // InternalNML.g:975:7: lv_ownedConditions_12_0= ruleConditionCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getTransformationCPAccess().getOwnedConditionsConditionCSParserRuleCall_6_1_1_0());
          						
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_ownedConditions_12_0=ruleConditionCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred29_InternalNML

    // $ANTLR start synpred40_InternalNML
    public final void synpred40_InternalNML_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_ownedElement_0_0 = null;


        // InternalNML.g:1307:4: ( (lv_ownedElement_0_0= ruleFQN ) )
        // InternalNML.g:1307:4: (lv_ownedElement_0_0= ruleFQN )
        {
        // InternalNML.g:1307:4: (lv_ownedElement_0_0= ruleFQN )
        // InternalNML.g:1308:5: lv_ownedElement_0_0= ruleFQN
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
    // $ANTLR end synpred40_InternalNML

    // $ANTLR start synpred48_InternalNML
    public final void synpred48_InternalNML_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;


        // InternalNML.g:1400:4: (this_UnrestrictedName_0= ruleUnrestrictedName )
        // InternalNML.g:1400:4: this_UnrestrictedName_0= ruleUnrestrictedName
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
    // $ANTLR end synpred48_InternalNML

    // $ANTLR start synpred50_InternalNML
    public final void synpred50_InternalNML_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_UnrestrictedName_4 = null;


        // InternalNML.g:1437:5: (this_UnrestrictedName_4= ruleUnrestrictedName )
        // InternalNML.g:1437:5: this_UnrestrictedName_4= ruleUnrestrictedName
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
    // $ANTLR end synpred50_InternalNML

    // $ANTLR start synpred126_InternalNML
    public final void synpred126_InternalNML_fragment() throws RecognitionException {   
        EObject this_TypeLiteralCS_1 = null;


        // InternalNML.g:3883:3: (this_TypeLiteralCS_1= ruleTypeLiteralCS )
        // InternalNML.g:3883:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
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
    // $ANTLR end synpred126_InternalNML

    // $ANTLR start synpred129_InternalNML
    public final void synpred129_InternalNML_fragment() throws RecognitionException {   
        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;


        // InternalNML.g:3974:3: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) )
        // InternalNML.g:3974:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        {
        // InternalNML.g:3974:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        // InternalNML.g:3975:4: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        {
        if ( state.backtracking==0 ) {

          				/* */
          			
        }
        pushFollow(FollowSets000.FOLLOW_64);
        this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

        state._fsp--;
        if (state.failed) return ;
        // InternalNML.g:3986:4: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        int alt161=2;
        int LA161_0 = input.LA(1);

        if ( ((LA161_0>=37 && LA161_0<=38)||LA161_0==43||LA161_0==45||LA161_0==49||(LA161_0>=51 && LA161_0<=54)||(LA161_0>=56 && LA161_0<=57)||(LA161_0>=60 && LA161_0<=70)) ) {
            alt161=1;
        }
        switch (alt161) {
            case 1 :
                // InternalNML.g:3987:5: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                {
                // InternalNML.g:3987:5: ()
                // InternalNML.g:3988:6: 
                {
                if ( state.backtracking==0 ) {

                  						/* */
                  					
                }

                }

                // InternalNML.g:3997:5: ( (lv_name_2_0= ruleBinaryOperatorName ) )
                // InternalNML.g:3998:6: (lv_name_2_0= ruleBinaryOperatorName )
                {
                // InternalNML.g:3998:6: (lv_name_2_0= ruleBinaryOperatorName )
                // InternalNML.g:3999:7: lv_name_2_0= ruleBinaryOperatorName
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0());
                  						
                }
                pushFollow(FollowSets000.FOLLOW_55);
                lv_name_2_0=ruleBinaryOperatorName();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalNML.g:4016:5: ( (lv_ownedRight_3_0= ruleExpCS ) )
                // InternalNML.g:4017:6: (lv_ownedRight_3_0= ruleExpCS )
                {
                // InternalNML.g:4017:6: (lv_ownedRight_3_0= ruleExpCS )
                // InternalNML.g:4018:7: lv_ownedRight_3_0= ruleExpCS
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
    // $ANTLR end synpred129_InternalNML

    // $ANTLR start synpred136_InternalNML
    public final void synpred136_InternalNML_fragment() throws RecognitionException {   
        EObject this_TupleLiteralExpCS_4 = null;


        // InternalNML.g:4278:3: (this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS )
        // InternalNML.g:4278:3: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
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
    // $ANTLR end synpred136_InternalNML

    // $ANTLR start synpred137_InternalNML
    public final void synpred137_InternalNML_fragment() throws RecognitionException {   
        EObject this_MapLiteralExpCS_5 = null;


        // InternalNML.g:4290:3: (this_MapLiteralExpCS_5= ruleMapLiteralExpCS )
        // InternalNML.g:4290:3: this_MapLiteralExpCS_5= ruleMapLiteralExpCS
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
    // $ANTLR end synpred137_InternalNML

    // $ANTLR start synpred138_InternalNML
    public final void synpred138_InternalNML_fragment() throws RecognitionException {   
        EObject this_CollectionLiteralExpCS_6 = null;


        // InternalNML.g:4302:3: (this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS )
        // InternalNML.g:4302:3: this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS
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
    // $ANTLR end synpred138_InternalNML

    // $ANTLR start synpred140_InternalNML
    public final void synpred140_InternalNML_fragment() throws RecognitionException {   
        EObject this_TypeLiteralExpCS_8 = null;


        // InternalNML.g:4326:3: (this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS )
        // InternalNML.g:4326:3: this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS
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
    // $ANTLR end synpred140_InternalNML

    // $ANTLR start synpred153_InternalNML
    public final void synpred153_InternalNML_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedCoIterator_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;


        // InternalNML.g:4769:5: ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) )
        // InternalNML.g:4769:5: (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
        {
        // InternalNML.g:4769:5: (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
        // InternalNML.g:4770:6: otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
        {
        otherlv_1=(Token)match(input,89,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalNML.g:4774:6: ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) )
        // InternalNML.g:4775:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
        {
        // InternalNML.g:4775:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
        // InternalNML.g:4776:8: lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_0_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_74);
        lv_ownedCoIterator_2_0=ruleCoIteratorVariableCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalNML.g:4793:6: (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
        int alt166=2;
        int LA166_0 = input.LA(1);

        if ( (LA166_0==43) ) {
            alt166=1;
        }
        switch (alt166) {
            case 1 :
                // InternalNML.g:4794:7: otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                {
                otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_55); if (state.failed) return ;
                // InternalNML.g:4798:7: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                // InternalNML.g:4799:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                {
                // InternalNML.g:4799:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                // InternalNML.g:4800:9: lv_ownedInitExpression_4_0= ruleExpCS
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
    // $ANTLR end synpred153_InternalNML

    // $ANTLR start synpred156_InternalNML
    public final void synpred156_InternalNML_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_ownedType_6_0 = null;

        EObject lv_ownedCoIterator_8_0 = null;

        EObject lv_ownedInitExpression_10_0 = null;


        // InternalNML.g:4820:5: ( (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) )
        // InternalNML.g:4820:5: (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
        {
        // InternalNML.g:4820:5: (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
        // InternalNML.g:4821:6: otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
        {
        otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_46); if (state.failed) return ;
        // InternalNML.g:4825:6: ( (lv_ownedType_6_0= ruleTypeExpCS ) )
        // InternalNML.g:4826:7: (lv_ownedType_6_0= ruleTypeExpCS )
        {
        // InternalNML.g:4826:7: (lv_ownedType_6_0= ruleTypeExpCS )
        // InternalNML.g:4827:8: lv_ownedType_6_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_1_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_75);
        lv_ownedType_6_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalNML.g:4844:6: (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )?
        int alt167=2;
        int LA167_0 = input.LA(1);

        if ( (LA167_0==89) ) {
            alt167=1;
        }
        switch (alt167) {
            case 1 :
                // InternalNML.g:4845:7: otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                {
                otherlv_7=(Token)match(input,89,FollowSets000.FOLLOW_3); if (state.failed) return ;
                // InternalNML.g:4849:7: ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                // InternalNML.g:4850:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                {
                // InternalNML.g:4850:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                // InternalNML.g:4851:9: lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_1_2_1_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_74);
                lv_ownedCoIterator_8_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalNML.g:4869:6: (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
        int alt168=2;
        int LA168_0 = input.LA(1);

        if ( (LA168_0==43) ) {
            alt168=1;
        }
        switch (alt168) {
            case 1 :
                // InternalNML.g:4870:7: otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                {
                otherlv_9=(Token)match(input,43,FollowSets000.FOLLOW_55); if (state.failed) return ;
                // InternalNML.g:4874:7: ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                // InternalNML.g:4875:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                {
                // InternalNML.g:4875:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                // InternalNML.g:4876:9: lv_ownedInitExpression_10_0= ruleExpCS
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
    // $ANTLR end synpred156_InternalNML

    // $ANTLR start synpred159_InternalNML
    public final void synpred159_InternalNML_fragment() throws RecognitionException {   
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_ownedType_12_0 = null;

        EObject lv_ownedCoIterator_14_0 = null;

        EObject lv_ownedInitExpression_16_0 = null;


        // InternalNML.g:4896:5: ( ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )
        // InternalNML.g:4896:5: ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
        {
        // InternalNML.g:4896:5: ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
        // InternalNML.g:4897:6: (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
        {
        // InternalNML.g:4897:6: (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )?
        int alt169=2;
        int LA169_0 = input.LA(1);

        if ( (LA169_0==23) ) {
            alt169=1;
        }
        switch (alt169) {
            case 1 :
                // InternalNML.g:4898:7: otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                {
                otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_46); if (state.failed) return ;
                // InternalNML.g:4902:7: ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                // InternalNML.g:4903:8: (lv_ownedType_12_0= ruleTypeExpCS )
                {
                // InternalNML.g:4903:8: (lv_ownedType_12_0= ruleTypeExpCS )
                // InternalNML.g:4904:9: lv_ownedType_12_0= ruleTypeExpCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_2_0_1_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_76);
                lv_ownedType_12_0=ruleTypeExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalNML.g:4922:6: (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )?
        int alt170=2;
        int LA170_0 = input.LA(1);

        if ( (LA170_0==89) ) {
            alt170=1;
        }
        switch (alt170) {
            case 1 :
                // InternalNML.g:4923:7: otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                {
                otherlv_13=(Token)match(input,89,FollowSets000.FOLLOW_3); if (state.failed) return ;
                // InternalNML.g:4927:7: ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                // InternalNML.g:4928:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                {
                // InternalNML.g:4928:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                // InternalNML.g:4929:9: lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_2_1_1_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_77);
                lv_ownedCoIterator_14_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        otherlv_15=(Token)match(input,95,FollowSets000.FOLLOW_55); if (state.failed) return ;
        // InternalNML.g:4951:6: ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
        // InternalNML.g:4952:7: (lv_ownedInitExpression_16_0= ruleExpCS )
        {
        // InternalNML.g:4952:7: (lv_ownedInitExpression_16_0= ruleExpCS )
        // InternalNML.g:4953:8: lv_ownedInitExpression_16_0= ruleExpCS
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
    // $ANTLR end synpred159_InternalNML

    // $ANTLR start synpred164_InternalNML
    public final void synpred164_InternalNML_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedCoIterator_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;


        // InternalNML.g:5154:4: ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) )
        // InternalNML.g:5154:4: (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
        {
        // InternalNML.g:5154:4: (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
        // InternalNML.g:5155:5: otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
        {
        otherlv_2=(Token)match(input,89,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalNML.g:5159:5: ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) )
        // InternalNML.g:5160:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
        {
        // InternalNML.g:5160:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
        // InternalNML.g:5161:7: lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_0_1_0());
          						
        }
        pushFollow(FollowSets000.FOLLOW_74);
        lv_ownedCoIterator_3_0=ruleCoIteratorVariableCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalNML.g:5178:5: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
        int alt178=2;
        int LA178_0 = input.LA(1);

        if ( (LA178_0==43) ) {
            alt178=1;
        }
        switch (alt178) {
            case 1 :
                // InternalNML.g:5179:6: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                {
                otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_55); if (state.failed) return ;
                // InternalNML.g:5183:6: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                // InternalNML.g:5184:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                {
                // InternalNML.g:5184:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                // InternalNML.g:5185:8: lv_ownedInitExpression_5_0= ruleExpCS
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
    // $ANTLR end synpred164_InternalNML

    // $ANTLR start synpred167_InternalNML
    public final void synpred167_InternalNML_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_ownedType_7_0 = null;

        EObject lv_ownedCoIterator_9_0 = null;

        EObject lv_ownedInitExpression_11_0 = null;


        // InternalNML.g:5205:4: ( (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) )
        // InternalNML.g:5205:4: (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
        {
        // InternalNML.g:5205:4: (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
        // InternalNML.g:5206:5: otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
        {
        otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_46); if (state.failed) return ;
        // InternalNML.g:5210:5: ( (lv_ownedType_7_0= ruleTypeExpCS ) )
        // InternalNML.g:5211:6: (lv_ownedType_7_0= ruleTypeExpCS )
        {
        // InternalNML.g:5211:6: (lv_ownedType_7_0= ruleTypeExpCS )
        // InternalNML.g:5212:7: lv_ownedType_7_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_1_0());
          						
        }
        pushFollow(FollowSets000.FOLLOW_75);
        lv_ownedType_7_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalNML.g:5229:5: (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )?
        int alt179=2;
        int LA179_0 = input.LA(1);

        if ( (LA179_0==89) ) {
            alt179=1;
        }
        switch (alt179) {
            case 1 :
                // InternalNML.g:5230:6: otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                {
                otherlv_8=(Token)match(input,89,FollowSets000.FOLLOW_3); if (state.failed) return ;
                // InternalNML.g:5234:6: ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                // InternalNML.g:5235:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                {
                // InternalNML.g:5235:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                // InternalNML.g:5236:8: lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_1_2_1_0());
                  							
                }
                pushFollow(FollowSets000.FOLLOW_74);
                lv_ownedCoIterator_9_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalNML.g:5254:5: (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
        int alt180=2;
        int LA180_0 = input.LA(1);

        if ( (LA180_0==43) ) {
            alt180=1;
        }
        switch (alt180) {
            case 1 :
                // InternalNML.g:5255:6: otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                {
                otherlv_10=(Token)match(input,43,FollowSets000.FOLLOW_55); if (state.failed) return ;
                // InternalNML.g:5259:6: ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                // InternalNML.g:5260:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                {
                // InternalNML.g:5260:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                // InternalNML.g:5261:8: lv_ownedInitExpression_11_0= ruleExpCS
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
    // $ANTLR end synpred167_InternalNML

    // $ANTLR start synpred170_InternalNML
    public final void synpred170_InternalNML_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_ownedType_13_0 = null;

        EObject lv_ownedCoIterator_15_0 = null;

        EObject lv_ownedInitExpression_17_0 = null;


        // InternalNML.g:5281:4: ( ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )
        // InternalNML.g:5281:4: ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
        {
        // InternalNML.g:5281:4: ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
        // InternalNML.g:5282:5: (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
        {
        // InternalNML.g:5282:5: (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )?
        int alt181=2;
        int LA181_0 = input.LA(1);

        if ( (LA181_0==23) ) {
            alt181=1;
        }
        switch (alt181) {
            case 1 :
                // InternalNML.g:5283:6: otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                {
                otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_46); if (state.failed) return ;
                // InternalNML.g:5287:6: ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                // InternalNML.g:5288:7: (lv_ownedType_13_0= ruleTypeExpCS )
                {
                // InternalNML.g:5288:7: (lv_ownedType_13_0= ruleTypeExpCS )
                // InternalNML.g:5289:8: lv_ownedType_13_0= ruleTypeExpCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_2_0_1_0());
                  							
                }
                pushFollow(FollowSets000.FOLLOW_76);
                lv_ownedType_13_0=ruleTypeExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalNML.g:5307:5: (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )?
        int alt182=2;
        int LA182_0 = input.LA(1);

        if ( (LA182_0==89) ) {
            alt182=1;
        }
        switch (alt182) {
            case 1 :
                // InternalNML.g:5308:6: otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                {
                otherlv_14=(Token)match(input,89,FollowSets000.FOLLOW_3); if (state.failed) return ;
                // InternalNML.g:5312:6: ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                // InternalNML.g:5313:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                {
                // InternalNML.g:5313:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                // InternalNML.g:5314:8: lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_2_1_1_0());
                  							
                }
                pushFollow(FollowSets000.FOLLOW_77);
                lv_ownedCoIterator_15_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        otherlv_16=(Token)match(input,95,FollowSets000.FOLLOW_55); if (state.failed) return ;
        // InternalNML.g:5336:5: ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
        // InternalNML.g:5337:6: (lv_ownedInitExpression_17_0= ruleExpCS )
        {
        // InternalNML.g:5337:6: (lv_ownedInitExpression_17_0= ruleExpCS )
        // InternalNML.g:5338:7: lv_ownedInitExpression_17_0= ruleExpCS
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
    // $ANTLR end synpred170_InternalNML

    // Delegated rules

    public final boolean synpred170_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred170_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred140_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred140_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred164_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred164_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred153_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred153_InternalNML_fragment(); // can never throw exception
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
    public final boolean synpred126_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred126_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred159_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred159_InternalNML_fragment(); // can never throw exception
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
    public final boolean synpred48_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred129_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred129_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred136_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred136_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred156_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred156_InternalNML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred167_InternalNML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred167_InternalNML_fragment(); // can never throw exception
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
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA86 dfa86 = new DFA86(this);
    protected DFA102 dfa102 = new DFA102(this);
    protected DFA111 dfa111 = new DFA111(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\5\1\uffff\2\0\1\5\1\uffff\10\5";
    static final String dfa_3s = "\1\67\1\uffff\2\0\1\6\1\uffff\2\70\1\56\1\6\4\70";
    static final String dfa_4s = "\1\uffff\1\2\3\uffff\1\1\10\uffff";
    static final String dfa_5s = "\2\uffff\1\0\1\1\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\36\uffff\3\5\2\uffff\1\1\1\4\1\1\6\uffff\5\5",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\6\1\7",
            "",
            "\2\5\21\uffff\1\1\14\uffff\3\5\2\uffff\3\5\1\10\3\uffff\2\1\5\5\1\11",
            "\2\5\21\uffff\1\1\14\uffff\3\5\2\uffff\3\5\1\10\3\uffff\2\1\5\5\1\11",
            "\1\12\1\13\47\uffff\1\1",
            "\1\12\1\13",
            "\2\5\21\uffff\1\1\14\uffff\3\5\2\uffff\3\5\1\10\1\uffff\1\14\1\15\2\1\5\5\1\11",
            "\2\5\21\uffff\1\1\14\uffff\3\5\2\uffff\3\5\1\10\1\uffff\1\14\1\15\2\1\5\5\1\11",
            "\2\5\21\uffff\1\1\14\uffff\3\5\2\uffff\3\5\1\10\2\uffff\1\15\2\1\5\5\1\11",
            "\2\5\21\uffff\1\1\14\uffff\3\5\2\uffff\3\5\1\10\3\uffff\2\1\5\5\1\11"
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
            return "()+ loopback of 961:4: ( (otherlv_10= 'or' | otherlv_11= 'and' )? ( (lv_ownedConditions_12_0= ruleConditionCS ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalNML()) ) {s = 5;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index28_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_3 = input.LA(1);

                         
                        int index28_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalNML()) ) {s = 5;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index28_3);
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
    static final String dfa_9s = "\1\54\2\70\1\uffff\1\56\1\6\1\uffff\4\70";
    static final String dfa_10s = "\3\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\2\44\uffff\2\3",
            "\2\6\21\uffff\1\3\22\uffff\2\6\1\4\3\uffff\2\3\5\uffff\1\5",
            "\2\6\21\uffff\1\3\22\uffff\2\6\1\4\3\uffff\2\3\5\uffff\1\5",
            "",
            "\1\7\1\10\47\uffff\1\3",
            "\1\7\1\10",
            "",
            "\2\6\21\uffff\1\3\22\uffff\2\6\1\4\1\uffff\1\11\1\12\2\3\5\uffff\1\5",
            "\2\6\21\uffff\1\3\22\uffff\2\6\1\4\1\uffff\1\11\1\12\2\3\5\uffff\1\5",
            "\2\6\21\uffff\1\3\22\uffff\2\6\1\4\2\uffff\1\12\2\3\5\uffff\1\5",
            "\2\6\21\uffff\1\3\22\uffff\2\6\1\4\3\uffff\2\3\5\uffff\1\5"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1184:3: ( (lv_ownedElement_1_0= ruleFQN ) )?";
        }
    }
    static final String dfa_13s = "\23\uffff";
    static final String dfa_14s = "\1\5\12\uffff\5\0\3\uffff";
    static final String dfa_15s = "\1\125\12\uffff\5\0\3\uffff";
    static final String dfa_16s = "\1\uffff\1\1\1\uffff\1\2\16\uffff\1\3";
    static final String dfa_17s = "\13\uffff\1\0\1\1\1\2\1\3\1\4\3\uffff}>";
    static final String[] dfa_18s = {
            "\2\1\100\uffff\12\3\1\13\1\14\1\15\1\16\1\17",
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

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "3870:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_11 = input.LA(1);

                         
                        int index80_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_InternalNML()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index80_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA80_12 = input.LA(1);

                         
                        int index80_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_InternalNML()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index80_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA80_13 = input.LA(1);

                         
                        int index80_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_InternalNML()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index80_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA80_14 = input.LA(1);

                         
                        int index80_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_InternalNML()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index80_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA80_15 = input.LA(1);

                         
                        int index80_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_InternalNML()) ) {s = 3;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index80_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 80, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\41\uffff";
    static final String dfa_20s = "\1\4\3\0\35\uffff";
    static final String dfa_21s = "\1\147\3\0\35\uffff";
    static final String dfa_22s = "\4\uffff\1\1\33\uffff\1\2";
    static final String dfa_23s = "\1\uffff\1\0\1\1\1\2\35\uffff}>";
    static final String[] dfa_24s = {
            "\4\4\47\uffff\1\4\11\uffff\1\1\1\2\1\3\1\4\12\uffff\17\4\2\uffff\1\4\1\uffff\4\4\3\uffff\1\4\4\uffff\1\40\1\4",
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

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "3973:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA83_1 = input.LA(1);

                         
                        int index83_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred129_InternalNML()) ) {s = 4;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index83_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA83_2 = input.LA(1);

                         
                        int index83_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred129_InternalNML()) ) {s = 4;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index83_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA83_3 = input.LA(1);

                         
                        int index83_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred129_InternalNML()) ) {s = 4;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index83_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 83, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_25s = "\40\uffff";
    static final String dfa_26s = "\1\4\12\uffff\7\0\16\uffff";
    static final String dfa_27s = "\1\147\12\uffff\7\0\16\uffff";
    static final String dfa_28s = "\1\uffff\1\1\1\2\1\3\1\4\15\uffff\1\10\1\11\7\uffff\1\12\1\uffff\1\5\1\6\1\7";
    static final String dfa_29s = "\13\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\16\uffff}>";
    static final String[] dfa_30s = {
            "\1\4\2\33\1\4\47\uffff\1\1\14\uffff\1\4\12\uffff\1\14\1\13\10\23\1\15\1\16\1\17\1\20\1\21\2\uffff\1\22\1\uffff\4\4\3\uffff\1\2\5\uffff\1\3",
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

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "4229:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA86_11 = input.LA(1);

                         
                        int index86_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_InternalNML()) ) {s = 29;}

                        else if ( (synpred140_InternalNML()) ) {s = 19;}

                         
                        input.seek(index86_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA86_12 = input.LA(1);

                         
                        int index86_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_InternalNML()) ) {s = 30;}

                        else if ( (synpred140_InternalNML()) ) {s = 19;}

                         
                        input.seek(index86_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA86_13 = input.LA(1);

                         
                        int index86_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNML()) ) {s = 31;}

                        else if ( (synpred140_InternalNML()) ) {s = 19;}

                         
                        input.seek(index86_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA86_14 = input.LA(1);

                         
                        int index86_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNML()) ) {s = 31;}

                        else if ( (synpred140_InternalNML()) ) {s = 19;}

                         
                        input.seek(index86_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA86_15 = input.LA(1);

                         
                        int index86_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNML()) ) {s = 31;}

                        else if ( (synpred140_InternalNML()) ) {s = 19;}

                         
                        input.seek(index86_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA86_16 = input.LA(1);

                         
                        int index86_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNML()) ) {s = 31;}

                        else if ( (synpred140_InternalNML()) ) {s = 19;}

                         
                        input.seek(index86_16);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA86_17 = input.LA(1);

                         
                        int index86_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalNML()) ) {s = 31;}

                        else if ( (synpred140_InternalNML()) ) {s = 19;}

                         
                        input.seek(index86_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 86, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_31s = "\1\4\12\uffff";
    static final String dfa_32s = "\1\27\2\0\10\uffff";
    static final String dfa_33s = "\1\140\2\0\10\uffff";
    static final String dfa_34s = "\3\uffff\1\3\1\4\4\uffff\1\1\1\2";
    static final String dfa_35s = "\1\uffff\1\0\1\1\10\uffff}>";
    static final String[] dfa_36s = {
            "\1\2\1\4\2\uffff\1\4\24\uffff\1\4\50\uffff\1\1\5\uffff\1\3\1\4",
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

    class DFA102 extends DFA {

        public DFA102(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 102;
            this.eot = dfa_7;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "4768:4: ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA102_1 = input.LA(1);

                         
                        int index102_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred153_InternalNML()) ) {s = 9;}

                        else if ( (synpred159_InternalNML()) ) {s = 3;}

                         
                        input.seek(index102_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA102_2 = input.LA(1);

                         
                        int index102_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred156_InternalNML()) ) {s = 10;}

                        else if ( (synpred159_InternalNML()) ) {s = 3;}

                         
                        input.seek(index102_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 102, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA111 extends DFA {

        public DFA111(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 111;
            this.eot = dfa_7;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "5153:3: ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA111_1 = input.LA(1);

                         
                        int index111_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred164_InternalNML()) ) {s = 9;}

                        else if ( (synpred170_InternalNML()) ) {s = 3;}

                         
                        input.seek(index111_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA111_2 = input.LA(1);

                         
                        int index111_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred167_InternalNML()) ) {s = 10;}

                        else if ( (synpred170_InternalNML()) ) {s = 3;}

                         
                        input.seek(index111_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 111, _s, input);
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
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00001C0000080060L});
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
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00001C0000000060L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000238000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000320000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000220000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000028000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00001C1000000060L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00F808E000000060L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00F81CE000000060L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020008000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000180000000060L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0006200001000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0006000001000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00F8088000000060L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0100200000000002L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0101A00000000002L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0101200000000002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000060L,0x00000000003FFF80L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001010000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001000000000060L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001000008000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1E008000008800F0L,0x000000C23D3FFF80L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1E008000008000F0L,0x000000C23D3FFF80L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x1E008000000000F0L,0x000000C23D3FFF80L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000008000000L,0x0000000000800000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x1E008000000800F0L,0x000000C23D3FFF80L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000080000800000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0xF37A286000000002L,0x000000000000007FL});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x1E008000000000F0L,0x000000823D3FFF80L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000810000020002L,0x0000000040000000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000020002L,0x0000000040000000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x00000000000800E0L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x1E018000008000F0L,0x000000C23D3FFF80L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0001000009000000L,0x0000000100000000L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000800002L,0x0000000082000000L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000080000000002L,0x0000000002000000L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000082000000L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000002800000000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000008000000L,0x0000000080000000L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000880000800000L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x1000000000000010L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x1002000000000010L,0x0000040000000000L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000020000000000L,0x0000030000000000L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000010008000002L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000060L,0x0000040000000000L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    }


}
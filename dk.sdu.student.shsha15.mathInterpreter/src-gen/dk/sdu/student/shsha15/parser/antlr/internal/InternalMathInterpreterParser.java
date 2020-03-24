package dk.sdu.student.shsha15.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.student.shsha15.services.MathInterpreterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathInterpreterParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'result'", "'is'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMathInterpreterParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathInterpreterParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathInterpreterParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMathInterpreter.g"; }



     	private MathInterpreterGrammarAccess grammarAccess;

        public InternalMathInterpreterParser(TokenStream input, MathInterpreterGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected MathInterpreterGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMathInterpreter.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMathInterpreter.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMathInterpreter.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMathInterpreter.g:71:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:77:2: ( (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) ) )
            // InternalMathInterpreter.g:78:2: (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) )
            {
            // InternalMathInterpreter.g:78:2: (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) )
            // InternalMathInterpreter.g:79:3: otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getResultKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMathExpAccess().getIsKeyword_1());
            		
            // InternalMathInterpreter.g:87:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalMathInterpreter.g:88:4: (lv_exp_2_0= ruleExp )
            {
            // InternalMathInterpreter.g:88:4: (lv_exp_2_0= ruleExp )
            // InternalMathInterpreter.g:89:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"dk.sdu.student.shsha15.MathInterpreter.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMathInterpreter.g:110:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMathInterpreter.g:110:44: (iv_ruleExp= ruleExp EOF )
            // InternalMathInterpreter.g:111:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMathInterpreter.g:117:1: ruleExp returns [EObject current=null] : this_PlusMinusExp_0= rulePlusMinusExp ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject this_PlusMinusExp_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:123:2: (this_PlusMinusExp_0= rulePlusMinusExp )
            // InternalMathInterpreter.g:124:2: this_PlusMinusExp_0= rulePlusMinusExp
            {

            		newCompositeNode(grammarAccess.getExpAccess().getPlusMinusExpParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PlusMinusExp_0=rulePlusMinusExp();

            state._fsp--;


            		current = this_PlusMinusExp_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRulePlusMinusExp"
    // InternalMathInterpreter.g:135:1: entryRulePlusMinusExp returns [EObject current=null] : iv_rulePlusMinusExp= rulePlusMinusExp EOF ;
    public final EObject entryRulePlusMinusExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinusExp = null;


        try {
            // InternalMathInterpreter.g:135:53: (iv_rulePlusMinusExp= rulePlusMinusExp EOF )
            // InternalMathInterpreter.g:136:2: iv_rulePlusMinusExp= rulePlusMinusExp EOF
            {
             newCompositeNode(grammarAccess.getPlusMinusExpRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusMinusExp=rulePlusMinusExp();

            state._fsp--;

             current =iv_rulePlusMinusExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusMinusExp"


    // $ANTLR start "rulePlusMinusExp"
    // InternalMathInterpreter.g:142:1: rulePlusMinusExp returns [EObject current=null] : (this_MultiplyDivideExp_0= ruleMultiplyDivideExp ( () ( (lv_operator_2_0= rulePlusMinusOperator ) ) ( (lv_right_3_0= ruleMultiplyDivideExp ) ) )* ) ;
    public final EObject rulePlusMinusExp() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplyDivideExp_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:148:2: ( (this_MultiplyDivideExp_0= ruleMultiplyDivideExp ( () ( (lv_operator_2_0= rulePlusMinusOperator ) ) ( (lv_right_3_0= ruleMultiplyDivideExp ) ) )* ) )
            // InternalMathInterpreter.g:149:2: (this_MultiplyDivideExp_0= ruleMultiplyDivideExp ( () ( (lv_operator_2_0= rulePlusMinusOperator ) ) ( (lv_right_3_0= ruleMultiplyDivideExp ) ) )* )
            {
            // InternalMathInterpreter.g:149:2: (this_MultiplyDivideExp_0= ruleMultiplyDivideExp ( () ( (lv_operator_2_0= rulePlusMinusOperator ) ) ( (lv_right_3_0= ruleMultiplyDivideExp ) ) )* )
            // InternalMathInterpreter.g:150:3: this_MultiplyDivideExp_0= ruleMultiplyDivideExp ( () ( (lv_operator_2_0= rulePlusMinusOperator ) ) ( (lv_right_3_0= ruleMultiplyDivideExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusExpAccess().getMultiplyDivideExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_MultiplyDivideExp_0=ruleMultiplyDivideExp();

            state._fsp--;


            			current = this_MultiplyDivideExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathInterpreter.g:158:3: ( () ( (lv_operator_2_0= rulePlusMinusOperator ) ) ( (lv_right_3_0= ruleMultiplyDivideExp ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMathInterpreter.g:159:4: () ( (lv_operator_2_0= rulePlusMinusOperator ) ) ( (lv_right_3_0= ruleMultiplyDivideExp ) )
            	    {
            	    // InternalMathInterpreter.g:159:4: ()
            	    // InternalMathInterpreter.g:160:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusMinusExpAccess().getExpLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMathInterpreter.g:166:4: ( (lv_operator_2_0= rulePlusMinusOperator ) )
            	    // InternalMathInterpreter.g:167:5: (lv_operator_2_0= rulePlusMinusOperator )
            	    {
            	    // InternalMathInterpreter.g:167:5: (lv_operator_2_0= rulePlusMinusOperator )
            	    // InternalMathInterpreter.g:168:6: lv_operator_2_0= rulePlusMinusOperator
            	    {

            	    						newCompositeNode(grammarAccess.getPlusMinusExpAccess().getOperatorPlusMinusOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=rulePlusMinusOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusMinusExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"dk.sdu.student.shsha15.MathInterpreter.PlusMinusOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMathInterpreter.g:185:4: ( (lv_right_3_0= ruleMultiplyDivideExp ) )
            	    // InternalMathInterpreter.g:186:5: (lv_right_3_0= ruleMultiplyDivideExp )
            	    {
            	    // InternalMathInterpreter.g:186:5: (lv_right_3_0= ruleMultiplyDivideExp )
            	    // InternalMathInterpreter.g:187:6: lv_right_3_0= ruleMultiplyDivideExp
            	    {

            	    						newCompositeNode(grammarAccess.getPlusMinusExpAccess().getRightMultiplyDivideExpParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_right_3_0=ruleMultiplyDivideExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusMinusExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.student.shsha15.MathInterpreter.MultiplyDivideExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusMinusExp"


    // $ANTLR start "entryRuleMultiplyDivideExp"
    // InternalMathInterpreter.g:209:1: entryRuleMultiplyDivideExp returns [EObject current=null] : iv_ruleMultiplyDivideExp= ruleMultiplyDivideExp EOF ;
    public final EObject entryRuleMultiplyDivideExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplyDivideExp = null;


        try {
            // InternalMathInterpreter.g:209:58: (iv_ruleMultiplyDivideExp= ruleMultiplyDivideExp EOF )
            // InternalMathInterpreter.g:210:2: iv_ruleMultiplyDivideExp= ruleMultiplyDivideExp EOF
            {
             newCompositeNode(grammarAccess.getMultiplyDivideExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplyDivideExp=ruleMultiplyDivideExp();

            state._fsp--;

             current =iv_ruleMultiplyDivideExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplyDivideExp"


    // $ANTLR start "ruleMultiplyDivideExp"
    // InternalMathInterpreter.g:216:1: ruleMultiplyDivideExp returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleMultiplyDivideOperator ) ) ( (lv_right_3_0= rulePrimary ) ) ) ) ;
    public final EObject ruleMultiplyDivideExp() throws RecognitionException {
        EObject current = null;

        EObject this_Primary_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:222:2: ( (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleMultiplyDivideOperator ) ) ( (lv_right_3_0= rulePrimary ) ) ) ) )
            // InternalMathInterpreter.g:223:2: (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleMultiplyDivideOperator ) ) ( (lv_right_3_0= rulePrimary ) ) ) )
            {
            // InternalMathInterpreter.g:223:2: (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleMultiplyDivideOperator ) ) ( (lv_right_3_0= rulePrimary ) ) ) )
            // InternalMathInterpreter.g:224:3: this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleMultiplyDivideOperator ) ) ( (lv_right_3_0= rulePrimary ) ) )
            {

            			newCompositeNode(grammarAccess.getMultiplyDivideExpAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathInterpreter.g:232:3: ( () ( (lv_operator_2_0= ruleMultiplyDivideOperator ) ) ( (lv_right_3_0= rulePrimary ) ) )
            // InternalMathInterpreter.g:233:4: () ( (lv_operator_2_0= ruleMultiplyDivideOperator ) ) ( (lv_right_3_0= rulePrimary ) )
            {
            // InternalMathInterpreter.g:233:4: ()
            // InternalMathInterpreter.g:234:5: 
            {

            					current = forceCreateModelElementAndSet(
            						grammarAccess.getMultiplyDivideExpAccess().getExpLeftAction_1_0(),
            						current);
            				

            }

            // InternalMathInterpreter.g:240:4: ( (lv_operator_2_0= ruleMultiplyDivideOperator ) )
            // InternalMathInterpreter.g:241:5: (lv_operator_2_0= ruleMultiplyDivideOperator )
            {
            // InternalMathInterpreter.g:241:5: (lv_operator_2_0= ruleMultiplyDivideOperator )
            // InternalMathInterpreter.g:242:6: lv_operator_2_0= ruleMultiplyDivideOperator
            {

            						newCompositeNode(grammarAccess.getMultiplyDivideExpAccess().getOperatorMultiplyDivideOperatorParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_4);
            lv_operator_2_0=ruleMultiplyDivideOperator();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMultiplyDivideExpRule());
            						}
            						set(
            							current,
            							"operator",
            							lv_operator_2_0,
            							"dk.sdu.student.shsha15.MathInterpreter.MultiplyDivideOperator");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalMathInterpreter.g:259:4: ( (lv_right_3_0= rulePrimary ) )
            // InternalMathInterpreter.g:260:5: (lv_right_3_0= rulePrimary )
            {
            // InternalMathInterpreter.g:260:5: (lv_right_3_0= rulePrimary )
            // InternalMathInterpreter.g:261:6: lv_right_3_0= rulePrimary
            {

            						newCompositeNode(grammarAccess.getMultiplyDivideExpAccess().getRightPrimaryParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_2);
            lv_right_3_0=rulePrimary();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMultiplyDivideExpRule());
            						}
            						set(
            							current,
            							"right",
            							lv_right_3_0,
            							"dk.sdu.student.shsha15.MathInterpreter.Primary");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplyDivideExp"


    // $ANTLR start "entryRulePrimary"
    // InternalMathInterpreter.g:283:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMathInterpreter.g:283:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMathInterpreter.g:284:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMathInterpreter.g:290:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:296:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis ) )
            // InternalMathInterpreter.g:297:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis )
            {
            // InternalMathInterpreter.g:297:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMathInterpreter.g:298:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMathInterpreter.g:307:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRulePlusMinusOperator"
    // InternalMathInterpreter.g:319:1: entryRulePlusMinusOperator returns [EObject current=null] : iv_rulePlusMinusOperator= rulePlusMinusOperator EOF ;
    public final EObject entryRulePlusMinusOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinusOperator = null;


        try {
            // InternalMathInterpreter.g:319:58: (iv_rulePlusMinusOperator= rulePlusMinusOperator EOF )
            // InternalMathInterpreter.g:320:2: iv_rulePlusMinusOperator= rulePlusMinusOperator EOF
            {
             newCompositeNode(grammarAccess.getPlusMinusOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusMinusOperator=rulePlusMinusOperator();

            state._fsp--;

             current =iv_rulePlusMinusOperator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusMinusOperator"


    // $ANTLR start "rulePlusMinusOperator"
    // InternalMathInterpreter.g:326:1: rulePlusMinusOperator returns [EObject current=null] : ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) ;
    public final EObject rulePlusMinusOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMathInterpreter.g:332:2: ( ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) )
            // InternalMathInterpreter.g:333:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            {
            // InternalMathInterpreter.g:333:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMathInterpreter.g:334:3: ( () otherlv_1= '+' )
                    {
                    // InternalMathInterpreter.g:334:3: ( () otherlv_1= '+' )
                    // InternalMathInterpreter.g:335:4: () otherlv_1= '+'
                    {
                    // InternalMathInterpreter.g:335:4: ()
                    // InternalMathInterpreter.g:336:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPlusMinusOperatorAccess().getPlusAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getPlusMinusOperatorAccess().getPlusSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMathInterpreter.g:348:3: ( () otherlv_3= '-' )
                    {
                    // InternalMathInterpreter.g:348:3: ( () otherlv_3= '-' )
                    // InternalMathInterpreter.g:349:4: () otherlv_3= '-'
                    {
                    // InternalMathInterpreter.g:349:4: ()
                    // InternalMathInterpreter.g:350:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPlusMinusOperatorAccess().getMinusAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPlusMinusOperatorAccess().getHyphenMinusKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusMinusOperator"


    // $ANTLR start "entryRuleMultiplyDivideOperator"
    // InternalMathInterpreter.g:365:1: entryRuleMultiplyDivideOperator returns [EObject current=null] : iv_ruleMultiplyDivideOperator= ruleMultiplyDivideOperator EOF ;
    public final EObject entryRuleMultiplyDivideOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplyDivideOperator = null;


        try {
            // InternalMathInterpreter.g:365:63: (iv_ruleMultiplyDivideOperator= ruleMultiplyDivideOperator EOF )
            // InternalMathInterpreter.g:366:2: iv_ruleMultiplyDivideOperator= ruleMultiplyDivideOperator EOF
            {
             newCompositeNode(grammarAccess.getMultiplyDivideOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplyDivideOperator=ruleMultiplyDivideOperator();

            state._fsp--;

             current =iv_ruleMultiplyDivideOperator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplyDivideOperator"


    // $ANTLR start "ruleMultiplyDivideOperator"
    // InternalMathInterpreter.g:372:1: ruleMultiplyDivideOperator returns [EObject current=null] : ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) ) ;
    public final EObject ruleMultiplyDivideOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMathInterpreter.g:378:2: ( ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) ) )
            // InternalMathInterpreter.g:379:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) )
            {
            // InternalMathInterpreter.g:379:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMathInterpreter.g:380:3: ( () otherlv_1= '*' )
                    {
                    // InternalMathInterpreter.g:380:3: ( () otherlv_1= '*' )
                    // InternalMathInterpreter.g:381:4: () otherlv_1= '*'
                    {
                    // InternalMathInterpreter.g:381:4: ()
                    // InternalMathInterpreter.g:382:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMultiplyDivideOperatorAccess().getMultiplyAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getMultiplyDivideOperatorAccess().getAsteriskKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMathInterpreter.g:394:3: ( () otherlv_3= '/' )
                    {
                    // InternalMathInterpreter.g:394:3: ( () otherlv_3= '/' )
                    // InternalMathInterpreter.g:395:4: () otherlv_3= '/'
                    {
                    // InternalMathInterpreter.g:395:4: ()
                    // InternalMathInterpreter.g:396:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMultiplyDivideOperatorAccess().getDivideAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getMultiplyDivideOperatorAccess().getSolidusKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplyDivideOperator"


    // $ANTLR start "entryRuleNumber"
    // InternalMathInterpreter.g:411:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMathInterpreter.g:411:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMathInterpreter.g:412:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMathInterpreter.g:418:1: ruleNumber returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMathInterpreter.g:424:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalMathInterpreter.g:425:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalMathInterpreter.g:425:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalMathInterpreter.g:426:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalMathInterpreter.g:426:3: ()
            // InternalMathInterpreter.g:427:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumAction_0(),
            					current);
            			

            }

            // InternalMathInterpreter.g:433:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalMathInterpreter.g:434:4: (lv_value_1_0= RULE_INT )
            {
            // InternalMathInterpreter.g:434:4: (lv_value_1_0= RULE_INT )
            // InternalMathInterpreter.g:435:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMathInterpreter.g:455:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMathInterpreter.g:455:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMathInterpreter.g:456:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMathInterpreter.g:462:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:468:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) )
            // InternalMathInterpreter.g:469:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            {
            // InternalMathInterpreter.g:469:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            // InternalMathInterpreter.g:470:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMathInterpreter.g:474:3: ( (lv_exp_1_0= ruleExp ) )
            // InternalMathInterpreter.g:475:4: (lv_exp_1_0= ruleExp )
            {
            // InternalMathInterpreter.g:475:4: (lv_exp_1_0= ruleExp )
            // InternalMathInterpreter.g:476:5: lv_exp_1_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_exp_1_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"dk.sdu.student.shsha15.MathInterpreter.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesis"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});

}
/*
 * generated by Xtext 2.21.0
 */
grammar InternalMathInterpreter;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package dk.sdu.student.shsha15.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMathExp
entryRuleMathExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMathExpRule()); }
	iv_ruleMathExp=ruleMathExp
	{ $current=$iv_ruleMathExp.current; }
	EOF;

// Rule MathExp
ruleMathExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='result'
		{
			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getResultKeyword_0());
		}
		otherlv_1='is'
		{
			newLeafNode(otherlv_1, grammarAccess.getMathExpAccess().getIsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0());
				}
				lv_exp_2_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMathExpRule());
					}
					set(
						$current,
						"exp",
						lv_exp_2_0,
						"dk.sdu.student.shsha15.MathInterpreter.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExp
entryRuleExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpRule()); }
	iv_ruleExp=ruleExp
	{ $current=$iv_ruleExp.current; }
	EOF;

// Rule Exp
ruleExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getExpAccess().getPlusMinusExpParserRuleCall());
	}
	this_PlusMinusExp_0=rulePlusMinusExp
	{
		$current = $this_PlusMinusExp_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRulePlusMinusExp
entryRulePlusMinusExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlusMinusExpRule()); }
	iv_rulePlusMinusExp=rulePlusMinusExp
	{ $current=$iv_rulePlusMinusExp.current; }
	EOF;

// Rule PlusMinusExp
rulePlusMinusExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPlusMinusExpAccess().getMultiplyDivideExpParserRuleCall_0());
		}
		this_MultiplyDivideExp_0=ruleMultiplyDivideExp
		{
			$current = $this_MultiplyDivideExp_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getPlusMinusExpAccess().getExpLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPlusMinusExpAccess().getOperatorPlusMinusOperatorParserRuleCall_1_1_0());
					}
					lv_operator_2_0=rulePlusMinusOperator
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPlusMinusExpRule());
						}
						set(
							$current,
							"operator",
							lv_operator_2_0,
							"dk.sdu.student.shsha15.MathInterpreter.PlusMinusOperator");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPlusMinusExpAccess().getRightMultiplyDivideExpParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMultiplyDivideExp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPlusMinusExpRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"dk.sdu.student.shsha15.MathInterpreter.MultiplyDivideExp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMultiplyDivideExp
entryRuleMultiplyDivideExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplyDivideExpRule()); }
	iv_ruleMultiplyDivideExp=ruleMultiplyDivideExp
	{ $current=$iv_ruleMultiplyDivideExp.current; }
	EOF;

// Rule MultiplyDivideExp
ruleMultiplyDivideExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMultiplyDivideExpAccess().getPrimaryParserRuleCall_0());
		}
		this_Primary_0=rulePrimary
		{
			$current = $this_Primary_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMultiplyDivideExpAccess().getExpLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiplyDivideExpAccess().getOperatorMultiplyDivideOperatorParserRuleCall_1_1_0());
					}
					lv_operator_2_0=ruleMultiplyDivideOperator
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiplyDivideExpRule());
						}
						set(
							$current,
							"operator",
							lv_operator_2_0,
							"dk.sdu.student.shsha15.MathInterpreter.MultiplyDivideOperator");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiplyDivideExpAccess().getRightPrimaryParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiplyDivideExpRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"dk.sdu.student.shsha15.MathInterpreter.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
		}
		this_Number_0=ruleNumber
		{
			$current = $this_Number_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
		}
		this_Parenthesis_1=ruleParenthesis
		{
			$current = $this_Parenthesis_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePlusMinusOperator
entryRulePlusMinusOperator returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlusMinusOperatorRule()); }
	iv_rulePlusMinusOperator=rulePlusMinusOperator
	{ $current=$iv_rulePlusMinusOperator.current; }
	EOF;

// Rule PlusMinusOperator
rulePlusMinusOperator returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPlusMinusOperatorAccess().getPlusAction_0_0(),
						$current);
				}
			)
			otherlv_1='+'
			{
				newLeafNode(otherlv_1, grammarAccess.getPlusMinusOperatorAccess().getPlusSignKeyword_0_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPlusMinusOperatorAccess().getMinusAction_1_0(),
						$current);
				}
			)
			otherlv_3='-'
			{
				newLeafNode(otherlv_3, grammarAccess.getPlusMinusOperatorAccess().getHyphenMinusKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleMultiplyDivideOperator
entryRuleMultiplyDivideOperator returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplyDivideOperatorRule()); }
	iv_ruleMultiplyDivideOperator=ruleMultiplyDivideOperator
	{ $current=$iv_ruleMultiplyDivideOperator.current; }
	EOF;

// Rule MultiplyDivideOperator
ruleMultiplyDivideOperator returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getMultiplyDivideOperatorAccess().getMultiplyAction_0_0(),
						$current);
				}
			)
			otherlv_1='*'
			{
				newLeafNode(otherlv_1, grammarAccess.getMultiplyDivideOperatorAccess().getAsteriskKeyword_0_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getMultiplyDivideOperatorAccess().getDivideAction_1_0(),
						$current);
				}
			)
			otherlv_3='/'
			{
				newLeafNode(otherlv_3, grammarAccess.getMultiplyDivideOperatorAccess().getSolidusKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleNumber
entryRuleNumber returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumberRule()); }
	iv_ruleNumber=ruleNumber
	{ $current=$iv_ruleNumber.current; }
	EOF;

// Rule Number
ruleNumber returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getNumberAccess().getNumAction_0(),
					$current);
			}
		)
		(
			(
				lv_value_1_0=RULE_INT
				{
					newLeafNode(lv_value_1_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNumberRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleParenthesis
entryRuleParenthesis returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParenthesisRule()); }
	iv_ruleParenthesis=ruleParenthesis
	{ $current=$iv_ruleParenthesis.current; }
	EOF;

// Rule Parenthesis
ruleParenthesis returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0());
				}
				lv_exp_1_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParenthesisRule());
					}
					set(
						$current,
						"exp",
						lv_exp_1_0,
						"dk.sdu.student.shsha15.MathInterpreter.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

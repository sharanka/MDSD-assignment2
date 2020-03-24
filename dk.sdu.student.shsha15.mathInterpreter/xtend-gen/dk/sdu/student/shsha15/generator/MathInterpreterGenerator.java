/**
 * generated by Xtext 2.21.0
 */
package dk.sdu.student.shsha15.generator;

import com.google.common.collect.Iterators;
import dk.sdu.student.shsha15.mathInterpreter.Divide;
import dk.sdu.student.shsha15.mathInterpreter.Expression;
import dk.sdu.student.shsha15.mathInterpreter.MathExp;
import dk.sdu.student.shsha15.mathInterpreter.Minus;
import dk.sdu.student.shsha15.mathInterpreter.Multiply;
import dk.sdu.student.shsha15.mathInterpreter.Plus;
import javax.swing.JOptionPane;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MathInterpreterGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final MathExp math = Iterators.<MathExp>filter(resource.getAllContents(), MathExp.class).next();
    final int result = this.compute(math);
    CharSequence _display = this.display(math);
    String _plus = ("Math expression: " + _display);
    System.out.println(_plus);
    JOptionPane.showMessageDialog(null, ("result = " + Integer.valueOf(result)), "Math Language", JOptionPane.INFORMATION_MESSAGE);
  }
  
  public int compute(final MathExp math) {
    return this.computeExp(math.getExp());
  }
  
  public int computeExp(final Expression expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field left is undefined for the type Plus"
      + "\nThe method or field right is undefined for the type Plus"
      + "\nThe method or field left is undefined for the type Minus"
      + "\nThe method or field right is undefined for the type Minus"
      + "\nThe method or field left is undefined for the type Multiply"
      + "\nThe method or field right is undefined for the type Multiply"
      + "\nThe method or field left is undefined for the type Divide"
      + "\nThe method or field right is undefined for the type Divide"
      + "\ncomputeExp cannot be resolved"
      + "\n+ cannot be resolved"
      + "\ncomputeExp cannot be resolved"
      + "\ncomputeExp cannot be resolved"
      + "\n- cannot be resolved"
      + "\ncomputeExp cannot be resolved"
      + "\ncomputeExp cannot be resolved"
      + "\n* cannot be resolved"
      + "\ncomputeExp cannot be resolved"
      + "\ncomputeExp cannot be resolved"
      + "\n/ cannot be resolved"
      + "\ncomputeExp cannot be resolved");
  }
  
  public CharSequence display(final MathExp math) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Math[math.exp.displayExp]");
    return _builder;
  }
  
  public CharSequence displayExp(final Expression expression) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field left is undefined for the type Expression"
      + "\nThe method or field operator is undefined for the type Expression"
      + "\nThe method or field right is undefined for the type Expression"
      + "\ndisplayExpression cannot be resolved"
      + "\ndisplayOperation cannot be resolved"
      + "\ndisplayExpression cannot be resolved");
  }
  
  public CharSequence displayExpression(final Number number) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field value is undefined for the type Number");
  }
  
  public CharSequence displayExpression(final /* Parenthesis */Object parenthesis) {
    throw new Error("Unresolved compilation problems:"
      + "\nexp cannot be resolved"
      + "\ndisplayExpression cannot be resolved");
  }
  
  public CharSequence displayOperation(final Expression expression) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (expression instanceof Plus) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("+");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (expression instanceof Minus) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("-");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (expression instanceof Multiply) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("*");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (expression instanceof Divide) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("/");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
}

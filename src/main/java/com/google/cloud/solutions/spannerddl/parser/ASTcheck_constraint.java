/* Generated By:JJTree: Do not edit this line. ASTcheck_constraint.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.google.cloud.solutions.spannerddl.parser;

public class ASTcheck_constraint extends SimpleNode {

  public ASTcheck_constraint(int id) {
    super(id);
  }

  public ASTcheck_constraint(DdlParser p, int id) {
    super(p, id);
  }

  public String getName() {
    // name is optional
    if (children[0] instanceof ASTconstraint_name) {
      return ((ASTconstraint_name) children[0]).jjtGetFirstToken().toString();
    } else {
      return ASTcreate_table_statement.ANONYMOUS_NAME;
    }
  }

  public String getExpression() {
    int child = 0;
    if (children[0] instanceof ASTconstraint_name) {
      child++;
    }
    return ((ASTcheck_constraint_expression) children[child]).toString();
  }

  public String toString() {
    return "CONSTRAINT " + getName() + " CHECK (" + getExpression() + ")";
  }

  @Override
  public boolean equals(Object other) {
    if (other instanceof ASTcolumn_def) {
      return this.toString().equals(other.toString());
    }
    return false;
  }
}
/* JavaCC - OriginalChecksum=0932669f868149000fb0cf8f92a12b13 (do not edit this line) */

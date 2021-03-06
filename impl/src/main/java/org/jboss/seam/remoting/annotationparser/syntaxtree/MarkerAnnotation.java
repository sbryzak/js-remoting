//
// Generated by JTB 1.3.2
//

package org.jboss.seam.remoting.annotationparser.syntaxtree;

/**
 * Grammar production:
 * f0 -> "@"
 * f1 -> Name()
 */
public class MarkerAnnotation implements Node {
   public NodeToken f0;
   public Name f1;

   public MarkerAnnotation(NodeToken n0, Name n1) {
      f0 = n0;
      f1 = n1;
   }

   public MarkerAnnotation(Name n0) {
      f0 = new NodeToken("@");
      f1 = n0;
   }

   public void accept(org.jboss.seam.remoting.annotationparser.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(org.jboss.seam.remoting.annotationparser.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(org.jboss.seam.remoting.annotationparser.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(org.jboss.seam.remoting.annotationparser.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}


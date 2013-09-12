
/* First created by JCasGen Wed Sep 11 13:28:38 BOT 2013 */
package cmu.edu.iis.wtu.model;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** The evaluation result, including the top N answers and the precision.
 * Updated by JCasGen Wed Sep 11 20:34:06 BOT 2013
 * @generated */
public class Result_Type extends BaseAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Result_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Result_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Result(addr, Result_Type.this);
  			   Result_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Result(addr, Result_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Result.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cmu.edu.iis.wtu.model.Result");
 
  /** @generated */
  final Feature casFeat_sortedAnswer;
  /** @generated */
  final int     casFeatCode_sortedAnswer;
  /** @generated */ 
  public int getSortedAnswer(int addr) {
        if (featOkTst && casFeat_sortedAnswer == null)
      jcas.throwFeatMissing("sortedAnswer", "cmu.edu.iis.wtu.model.Result");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sortedAnswer);
  }
  /** @generated */    
  public void setSortedAnswer(int addr, int v) {
        if (featOkTst && casFeat_sortedAnswer == null)
      jcas.throwFeatMissing("sortedAnswer", "cmu.edu.iis.wtu.model.Result");
    ll_cas.ll_setRefValue(addr, casFeatCode_sortedAnswer, v);}
    
   /** @generated */
  public int getSortedAnswer(int addr, int i) {
        if (featOkTst && casFeat_sortedAnswer == null)
      jcas.throwFeatMissing("sortedAnswer", "cmu.edu.iis.wtu.model.Result");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sortedAnswer), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_sortedAnswer), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sortedAnswer), i);
  }
   
  /** @generated */ 
  public void setSortedAnswer(int addr, int i, int v) {
        if (featOkTst && casFeat_sortedAnswer == null)
      jcas.throwFeatMissing("sortedAnswer", "cmu.edu.iis.wtu.model.Result");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sortedAnswer), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_sortedAnswer), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sortedAnswer), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_precision;
  /** @generated */
  final int     casFeatCode_precision;
  /** @generated */ 
  public float getPrecision(int addr) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "cmu.edu.iis.wtu.model.Result");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_precision);
  }
  /** @generated */    
  public void setPrecision(int addr, float v) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "cmu.edu.iis.wtu.model.Result");
    ll_cas.ll_setFloatValue(addr, casFeatCode_precision, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Result_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sortedAnswer = jcas.getRequiredFeatureDE(casType, "sortedAnswer", "uima.cas.FSArray", featOkTst);
    casFeatCode_sortedAnswer  = (null == casFeat_sortedAnswer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sortedAnswer).getCode();

 
    casFeat_precision = jcas.getRequiredFeatureDE(casType, "precision", "uima.cas.Float", featOkTst);
    casFeatCode_precision  = (null == casFeat_precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precision).getCode();

  }
}



    
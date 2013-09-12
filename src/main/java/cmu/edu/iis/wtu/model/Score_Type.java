
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
import org.apache.uima.jcas.cas.TOP_Type;

/** A score for an answer made by a specific scorer.
 * Updated by JCasGen Wed Sep 11 20:34:06 BOT 2013
 * @generated */
public class Score_Type extends TOP_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Score_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Score_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Score(addr, Score_Type.this);
  			   Score_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Score(addr, Score_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Score.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cmu.edu.iis.wtu.model.Score");
 
  /** @generated */
  final Feature casFeat_source;
  /** @generated */
  final int     casFeatCode_source;
  /** @generated */ 
  public String getSource(int addr) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "cmu.edu.iis.wtu.model.Score");
    return ll_cas.ll_getStringValue(addr, casFeatCode_source);
  }
  /** @generated */    
  public void setSource(int addr, String v) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "cmu.edu.iis.wtu.model.Score");
    ll_cas.ll_setStringValue(addr, casFeatCode_source, v);}
    
  
 
  /** @generated */
  final Feature casFeat_value;
  /** @generated */
  final int     casFeatCode_value;
  /** @generated */ 
  public float getValue(int addr) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "cmu.edu.iis.wtu.model.Score");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_value);
  }
  /** @generated */    
  public void setValue(int addr, float v) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "cmu.edu.iis.wtu.model.Score");
    ll_cas.ll_setFloatValue(addr, casFeatCode_value, v);}
    
  
 
  /** @generated */
  final Feature casFeat_weight;
  /** @generated */
  final int     casFeatCode_weight;
  /** @generated */ 
  public float getWeight(int addr) {
        if (featOkTst && casFeat_weight == null)
      jcas.throwFeatMissing("weight", "cmu.edu.iis.wtu.model.Score");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_weight);
  }
  /** @generated */    
  public void setWeight(int addr, float v) {
        if (featOkTst && casFeat_weight == null)
      jcas.throwFeatMissing("weight", "cmu.edu.iis.wtu.model.Score");
    ll_cas.ll_setFloatValue(addr, casFeatCode_weight, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Score_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_source = jcas.getRequiredFeatureDE(casType, "source", "uima.cas.String", featOkTst);
    casFeatCode_source  = (null == casFeat_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_source).getCode();

 
    casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.Float", featOkTst);
    casFeatCode_value  = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_value).getCode();

 
    casFeat_weight = jcas.getRequiredFeatureDE(casType, "weight", "uima.cas.Float", featOkTst);
    casFeatCode_weight  = (null == casFeat_weight) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_weight).getCode();

  }
}



    

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

/** A setence along with its token list.
 * Updated by JCasGen Wed Sep 11 20:34:07 BOT 2013
 * @generated */
public class SetenceWithTokens_Type extends BaseAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (SetenceWithTokens_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = SetenceWithTokens_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new SetenceWithTokens(addr, SetenceWithTokens_Type.this);
  			   SetenceWithTokens_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new SetenceWithTokens(addr, SetenceWithTokens_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SetenceWithTokens.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cmu.edu.iis.wtu.model.SetenceWithTokens");
 
  /** @generated */
  final Feature casFeat_sentence;
  /** @generated */
  final int     casFeatCode_sentence;
  /** @generated */ 
  public int getSentence(int addr) {
        if (featOkTst && casFeat_sentence == null)
      jcas.throwFeatMissing("sentence", "cmu.edu.iis.wtu.model.SetenceWithTokens");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sentence);
  }
  /** @generated */    
  public void setSentence(int addr, int v) {
        if (featOkTst && casFeat_sentence == null)
      jcas.throwFeatMissing("sentence", "cmu.edu.iis.wtu.model.SetenceWithTokens");
    ll_cas.ll_setRefValue(addr, casFeatCode_sentence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tokenList;
  /** @generated */
  final int     casFeatCode_tokenList;
  /** @generated */ 
  public int getTokenList(int addr) {
        if (featOkTst && casFeat_tokenList == null)
      jcas.throwFeatMissing("tokenList", "cmu.edu.iis.wtu.model.SetenceWithTokens");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokenList);
  }
  /** @generated */    
  public void setTokenList(int addr, int v) {
        if (featOkTst && casFeat_tokenList == null)
      jcas.throwFeatMissing("tokenList", "cmu.edu.iis.wtu.model.SetenceWithTokens");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokenList, v);}
    
   /** @generated */
  public int getTokenList(int addr, int i) {
        if (featOkTst && casFeat_tokenList == null)
      jcas.throwFeatMissing("tokenList", "cmu.edu.iis.wtu.model.SetenceWithTokens");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenList), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokenList), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenList), i);
  }
   
  /** @generated */ 
  public void setTokenList(int addr, int i, int v) {
        if (featOkTst && casFeat_tokenList == null)
      jcas.throwFeatMissing("tokenList", "cmu.edu.iis.wtu.model.SetenceWithTokens");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenList), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokenList), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenList), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_isAnswer;
  /** @generated */
  final int     casFeatCode_isAnswer;
  /** @generated */ 
  public boolean getIsAnswer(int addr) {
        if (featOkTst && casFeat_isAnswer == null)
      jcas.throwFeatMissing("isAnswer", "cmu.edu.iis.wtu.model.SetenceWithTokens");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isAnswer);
  }
  /** @generated */    
  public void setIsAnswer(int addr, boolean v) {
        if (featOkTst && casFeat_isAnswer == null)
      jcas.throwFeatMissing("isAnswer", "cmu.edu.iis.wtu.model.SetenceWithTokens");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isAnswer, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public SetenceWithTokens_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sentence = jcas.getRequiredFeatureDE(casType, "sentence", "cmu.edu.iis.wtu.model.Sentence", featOkTst);
    casFeatCode_sentence  = (null == casFeat_sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentence).getCode();

 
    casFeat_tokenList = jcas.getRequiredFeatureDE(casType, "tokenList", "uima.cas.FSArray", featOkTst);
    casFeatCode_tokenList  = (null == casFeat_tokenList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenList).getCode();

 
    casFeat_isAnswer = jcas.getRequiredFeatureDE(casType, "isAnswer", "uima.cas.Boolean", featOkTst);
    casFeatCode_isAnswer  = (null == casFeat_isAnswer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isAnswer).getCode();

  }
}



    
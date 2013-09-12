
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

/** An answer along with all of its score.
 * Updated by JCasGen Wed Sep 11 20:34:06 BOT 2013
 * @generated */
public class AnswerWithScore_Type extends BaseAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AnswerWithScore_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AnswerWithScore_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AnswerWithScore(addr, AnswerWithScore_Type.this);
  			   AnswerWithScore_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AnswerWithScore(addr, AnswerWithScore_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnswerWithScore.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cmu.edu.iis.wtu.model.AnswerWithScore");
 
  /** @generated */
  final Feature casFeat_answer;
  /** @generated */
  final int     casFeatCode_answer;
  /** @generated */ 
  public int getAnswer(int addr) {
        if (featOkTst && casFeat_answer == null)
      jcas.throwFeatMissing("answer", "cmu.edu.iis.wtu.model.AnswerWithScore");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answer);
  }
  /** @generated */    
  public void setAnswer(int addr, int v) {
        if (featOkTst && casFeat_answer == null)
      jcas.throwFeatMissing("answer", "cmu.edu.iis.wtu.model.AnswerWithScore");
    ll_cas.ll_setRefValue(addr, casFeatCode_answer, v);}
    
  
 
  /** @generated */
  final Feature casFeat_scores;
  /** @generated */
  final int     casFeatCode_scores;
  /** @generated */ 
  public int getScores(int addr) {
        if (featOkTst && casFeat_scores == null)
      jcas.throwFeatMissing("scores", "cmu.edu.iis.wtu.model.AnswerWithScore");
    return ll_cas.ll_getRefValue(addr, casFeatCode_scores);
  }
  /** @generated */    
  public void setScores(int addr, int v) {
        if (featOkTst && casFeat_scores == null)
      jcas.throwFeatMissing("scores", "cmu.edu.iis.wtu.model.AnswerWithScore");
    ll_cas.ll_setRefValue(addr, casFeatCode_scores, v);}
    
   /** @generated */
  public int getScores(int addr, int i) {
        if (featOkTst && casFeat_scores == null)
      jcas.throwFeatMissing("scores", "cmu.edu.iis.wtu.model.AnswerWithScore");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_scores), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_scores), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_scores), i);
  }
   
  /** @generated */ 
  public void setScores(int addr, int i, int v) {
        if (featOkTst && casFeat_scores == null)
      jcas.throwFeatMissing("scores", "cmu.edu.iis.wtu.model.AnswerWithScore");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_scores), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_scores), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_scores), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_finalScore;
  /** @generated */
  final int     casFeatCode_finalScore;
  /** @generated */ 
  public float getFinalScore(int addr) {
        if (featOkTst && casFeat_finalScore == null)
      jcas.throwFeatMissing("finalScore", "cmu.edu.iis.wtu.model.AnswerWithScore");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_finalScore);
  }
  /** @generated */    
  public void setFinalScore(int addr, float v) {
        if (featOkTst && casFeat_finalScore == null)
      jcas.throwFeatMissing("finalScore", "cmu.edu.iis.wtu.model.AnswerWithScore");
    ll_cas.ll_setFloatValue(addr, casFeatCode_finalScore, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public AnswerWithScore_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_answer = jcas.getRequiredFeatureDE(casType, "answer", "cmu.edu.iis.wtu.model.Answer", featOkTst);
    casFeatCode_answer  = (null == casFeat_answer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answer).getCode();

 
    casFeat_scores = jcas.getRequiredFeatureDE(casType, "scores", "uima.cas.FSArray", featOkTst);
    casFeatCode_scores  = (null == casFeat_scores) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scores).getCode();

 
    casFeat_finalScore = jcas.getRequiredFeatureDE(casType, "finalScore", "uima.cas.Float", featOkTst);
    casFeatCode_finalScore  = (null == casFeat_finalScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_finalScore).getCode();

  }
}



    
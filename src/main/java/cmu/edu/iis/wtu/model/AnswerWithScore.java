

/* First created by JCasGen Wed Sep 11 13:28:38 BOT 2013 */
package cmu.edu.iis.wtu.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** An answer along with all of its score.
 * Updated by JCasGen Wed Sep 11 20:34:06 BOT 2013
 * XML source: F:/Workplace/hw1-wtu/src/main/resources/hw1-wtu-typesystem.xml
 * @generated */
public class AnswerWithScore extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerWithScore.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected AnswerWithScore() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerWithScore(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerWithScore(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerWithScore(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: answer

  /** getter for answer - gets The scored answer.
   * @generated */
  public Answer getAnswer() {
    if (AnswerWithScore_Type.featOkTst && ((AnswerWithScore_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "cmu.edu.iis.wtu.model.AnswerWithScore");
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerWithScore_Type)jcasType).casFeatCode_answer)));}
    
  /** setter for answer - sets The scored answer. 
   * @generated */
  public void setAnswer(Answer v) {
    if (AnswerWithScore_Type.featOkTst && ((AnswerWithScore_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "cmu.edu.iis.wtu.model.AnswerWithScore");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerWithScore_Type)jcasType).casFeatCode_answer, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: scores

  /** getter for scores - gets The scores of this answer that were made by different scorers.
   * @generated */
  public FSArray getScores() {
    if (AnswerWithScore_Type.featOkTst && ((AnswerWithScore_Type)jcasType).casFeat_scores == null)
      jcasType.jcas.throwFeatMissing("scores", "cmu.edu.iis.wtu.model.AnswerWithScore");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerWithScore_Type)jcasType).casFeatCode_scores)));}
    
  /** setter for scores - sets The scores of this answer that were made by different scorers. 
   * @generated */
  public void setScores(FSArray v) {
    if (AnswerWithScore_Type.featOkTst && ((AnswerWithScore_Type)jcasType).casFeat_scores == null)
      jcasType.jcas.throwFeatMissing("scores", "cmu.edu.iis.wtu.model.AnswerWithScore");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerWithScore_Type)jcasType).casFeatCode_scores, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for scores - gets an indexed value - The scores of this answer that were made by different scorers.
   * @generated */
  public Score getScores(int i) {
    if (AnswerWithScore_Type.featOkTst && ((AnswerWithScore_Type)jcasType).casFeat_scores == null)
      jcasType.jcas.throwFeatMissing("scores", "cmu.edu.iis.wtu.model.AnswerWithScore");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerWithScore_Type)jcasType).casFeatCode_scores), i);
    return (Score)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerWithScore_Type)jcasType).casFeatCode_scores), i)));}

  /** indexed setter for scores - sets an indexed value - The scores of this answer that were made by different scorers.
   * @generated */
  public void setScores(int i, Score v) { 
    if (AnswerWithScore_Type.featOkTst && ((AnswerWithScore_Type)jcasType).casFeat_scores == null)
      jcasType.jcas.throwFeatMissing("scores", "cmu.edu.iis.wtu.model.AnswerWithScore");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerWithScore_Type)jcasType).casFeatCode_scores), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerWithScore_Type)jcasType).casFeatCode_scores), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: finalScore

  /** getter for finalScore - gets The final score of this sentence.
   * @generated */
  public float getFinalScore() {
    if (AnswerWithScore_Type.featOkTst && ((AnswerWithScore_Type)jcasType).casFeat_finalScore == null)
      jcasType.jcas.throwFeatMissing("finalScore", "cmu.edu.iis.wtu.model.AnswerWithScore");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((AnswerWithScore_Type)jcasType).casFeatCode_finalScore);}
    
  /** setter for finalScore - sets The final score of this sentence. 
   * @generated */
  public void setFinalScore(float v) {
    if (AnswerWithScore_Type.featOkTst && ((AnswerWithScore_Type)jcasType).casFeat_finalScore == null)
      jcasType.jcas.throwFeatMissing("finalScore", "cmu.edu.iis.wtu.model.AnswerWithScore");
    jcasType.ll_cas.ll_setFloatValue(addr, ((AnswerWithScore_Type)jcasType).casFeatCode_finalScore, v);}    
  }

    
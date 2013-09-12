

/* First created by JCasGen Wed Sep 11 13:28:38 BOT 2013 */
package cmu.edu.iis.wtu.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** The evaluation result, including the top N answers and the precision.
 * Updated by JCasGen Wed Sep 11 20:34:06 BOT 2013
 * XML source: F:/Workplace/hw1-wtu/src/main/resources/hw1-wtu-typesystem.xml
 * @generated */
public class Result extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Result.class);
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
  protected Result() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Result(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Result(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Result(JCas jcas, int begin, int end) {
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
  //* Feature: sortedAnswer

  /** getter for sortedAnswer - gets The sorted answer list.
   * @generated */
  public FSArray getSortedAnswer() {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_sortedAnswer == null)
      jcasType.jcas.throwFeatMissing("sortedAnswer", "cmu.edu.iis.wtu.model.Result");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Result_Type)jcasType).casFeatCode_sortedAnswer)));}
    
  /** setter for sortedAnswer - sets The sorted answer list. 
   * @generated */
  public void setSortedAnswer(FSArray v) {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_sortedAnswer == null)
      jcasType.jcas.throwFeatMissing("sortedAnswer", "cmu.edu.iis.wtu.model.Result");
    jcasType.ll_cas.ll_setRefValue(addr, ((Result_Type)jcasType).casFeatCode_sortedAnswer, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for sortedAnswer - gets an indexed value - The sorted answer list.
   * @generated */
  public AnswerWithScore getSortedAnswer(int i) {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_sortedAnswer == null)
      jcasType.jcas.throwFeatMissing("sortedAnswer", "cmu.edu.iis.wtu.model.Result");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Result_Type)jcasType).casFeatCode_sortedAnswer), i);
    return (AnswerWithScore)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Result_Type)jcasType).casFeatCode_sortedAnswer), i)));}

  /** indexed setter for sortedAnswer - sets an indexed value - The sorted answer list.
   * @generated */
  public void setSortedAnswer(int i, AnswerWithScore v) { 
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_sortedAnswer == null)
      jcasType.jcas.throwFeatMissing("sortedAnswer", "cmu.edu.iis.wtu.model.Result");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Result_Type)jcasType).casFeatCode_sortedAnswer), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Result_Type)jcasType).casFeatCode_sortedAnswer), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets The precision of this evaluation.
   * @generated */
  public float getPrecision() {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "cmu.edu.iis.wtu.model.Result");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Result_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets The precision of this evaluation. 
   * @generated */
  public void setPrecision(float v) {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "cmu.edu.iis.wtu.model.Result");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Result_Type)jcasType).casFeatCode_precision, v);}    
  }

    


/* First created by JCasGen Wed Sep 11 13:28:38 BOT 2013 */
package cmu.edu.iis.wtu.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** A score for an answer made by a specific scorer.
 * Updated by JCasGen Wed Sep 11 20:34:06 BOT 2013
 * XML source: F:/Workplace/hw1-wtu/src/main/resources/hw1-wtu-typesystem.xml
 * @generated */
public class Score extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Score.class);
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
  protected Score() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Score(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Score(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets The scorer's name.
   * @generated */
  public String getSource() {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "cmu.edu.iis.wtu.model.Score");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Score_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets The scorer's name. 
   * @generated */
  public void setSource(String v) {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "cmu.edu.iis.wtu.model.Score");
    jcasType.ll_cas.ll_setStringValue(addr, ((Score_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets the value of this score.
   * @generated */
  public float getValue() {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "cmu.edu.iis.wtu.model.Score");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Score_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets the value of this score. 
   * @generated */
  public void setValue(float v) {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "cmu.edu.iis.wtu.model.Score");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Score_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: weight

  /** getter for weight - gets The weight of this score in the total score.
   * @generated */
  public float getWeight() {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_weight == null)
      jcasType.jcas.throwFeatMissing("weight", "cmu.edu.iis.wtu.model.Score");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Score_Type)jcasType).casFeatCode_weight);}
    
  /** setter for weight - sets The weight of this score in the total score. 
   * @generated */
  public void setWeight(float v) {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_weight == null)
      jcasType.jcas.throwFeatMissing("weight", "cmu.edu.iis.wtu.model.Score");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Score_Type)jcasType).casFeatCode_weight, v);}    
  }

    
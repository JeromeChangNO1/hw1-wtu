

/* First created by JCasGen Wed Sep 11 18:58:52 BOT 2013 */
package cmu.edu.iis.wtu.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Base type for annotation
 * Updated by JCasGen Wed Sep 11 20:34:06 BOT 2013
 * XML source: F:/Workplace/hw1-wtu/src/main/resources/hw1-wtu-typesystem.xml
 * @generated */
public class BaseAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BaseAnnotation.class);
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
  protected BaseAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BaseAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BaseAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public BaseAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: source

  /** getter for source - gets The source of the annotation. It's used for track where the annotation made by.
   * @generated */
  public String getSource() {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "cmu.edu.iis.wtu.model.BaseAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets The source of the annotation. It's used for track where the annotation made by. 
   * @generated */
  public void setSource(String v) {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "cmu.edu.iis.wtu.model.BaseAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets This is the confidence of the annotation. It helps to use the annotation more carefully.
   * @generated */
  public float getConfidence() {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "cmu.edu.iis.wtu.model.BaseAnnotation");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets This is the confidence of the annotation. It helps to use the annotation more carefully. 
   * @generated */
  public void setConfidence(float v) {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "cmu.edu.iis.wtu.model.BaseAnnotation");
    jcasType.ll_cas.ll_setFloatValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_confidence, v);}    
  }

    
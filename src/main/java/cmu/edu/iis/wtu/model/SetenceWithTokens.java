

/* First created by JCasGen Wed Sep 11 13:28:38 BOT 2013 */
package cmu.edu.iis.wtu.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** A setence along with its token list.
 * Updated by JCasGen Wed Sep 11 20:34:07 BOT 2013
 * XML source: F:/Workplace/hw1-wtu/src/main/resources/hw1-wtu-typesystem.xml
 * @generated */
public class SetenceWithTokens extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SetenceWithTokens.class);
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
  protected SetenceWithTokens() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public SetenceWithTokens(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public SetenceWithTokens(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public SetenceWithTokens(JCas jcas, int begin, int end) {
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
  //* Feature: sentence

  /** getter for sentence - gets The sentence contents.
   * @generated */
  public Sentence getSentence() {
    if (SetenceWithTokens_Type.featOkTst && ((SetenceWithTokens_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "cmu.edu.iis.wtu.model.SetenceWithTokens");
    return (Sentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SetenceWithTokens_Type)jcasType).casFeatCode_sentence)));}
    
  /** setter for sentence - sets The sentence contents. 
   * @generated */
  public void setSentence(Sentence v) {
    if (SetenceWithTokens_Type.featOkTst && ((SetenceWithTokens_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "cmu.edu.iis.wtu.model.SetenceWithTokens");
    jcasType.ll_cas.ll_setRefValue(addr, ((SetenceWithTokens_Type)jcasType).casFeatCode_sentence, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: tokenList

  /** getter for tokenList - gets The tokens that belongs to the sentence.
   * @generated */
  public FSArray getTokenList() {
    if (SetenceWithTokens_Type.featOkTst && ((SetenceWithTokens_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "cmu.edu.iis.wtu.model.SetenceWithTokens");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SetenceWithTokens_Type)jcasType).casFeatCode_tokenList)));}
    
  /** setter for tokenList - sets The tokens that belongs to the sentence. 
   * @generated */
  public void setTokenList(FSArray v) {
    if (SetenceWithTokens_Type.featOkTst && ((SetenceWithTokens_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "cmu.edu.iis.wtu.model.SetenceWithTokens");
    jcasType.ll_cas.ll_setRefValue(addr, ((SetenceWithTokens_Type)jcasType).casFeatCode_tokenList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokenList - gets an indexed value - The tokens that belongs to the sentence.
   * @generated */
  public Token getTokenList(int i) {
    if (SetenceWithTokens_Type.featOkTst && ((SetenceWithTokens_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "cmu.edu.iis.wtu.model.SetenceWithTokens");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SetenceWithTokens_Type)jcasType).casFeatCode_tokenList), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SetenceWithTokens_Type)jcasType).casFeatCode_tokenList), i)));}

  /** indexed setter for tokenList - sets an indexed value - The tokens that belongs to the sentence.
   * @generated */
  public void setTokenList(int i, Token v) { 
    if (SetenceWithTokens_Type.featOkTst && ((SetenceWithTokens_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "cmu.edu.iis.wtu.model.SetenceWithTokens");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SetenceWithTokens_Type)jcasType).casFeatCode_tokenList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SetenceWithTokens_Type)jcasType).casFeatCode_tokenList), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: isAnswer

  /** getter for isAnswer - gets This is the tag to distinguish question and answers. 0 for the question and 1 for the answers.
   * @generated */
  public boolean getIsAnswer() {
    if (SetenceWithTokens_Type.featOkTst && ((SetenceWithTokens_Type)jcasType).casFeat_isAnswer == null)
      jcasType.jcas.throwFeatMissing("isAnswer", "cmu.edu.iis.wtu.model.SetenceWithTokens");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SetenceWithTokens_Type)jcasType).casFeatCode_isAnswer);}
    
  /** setter for isAnswer - sets This is the tag to distinguish question and answers. 0 for the question and 1 for the answers. 
   * @generated */
  public void setIsAnswer(boolean v) {
    if (SetenceWithTokens_Type.featOkTst && ((SetenceWithTokens_Type)jcasType).casFeat_isAnswer == null)
      jcasType.jcas.throwFeatMissing("isAnswer", "cmu.edu.iis.wtu.model.SetenceWithTokens");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SetenceWithTokens_Type)jcasType).casFeatCode_isAnswer, v);}    
  }

    
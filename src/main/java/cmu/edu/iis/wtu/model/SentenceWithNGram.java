

/* First created by JCasGen Wed Sep 11 13:28:38 BOT 2013 */
package cmu.edu.iis.wtu.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** A setence along with its ngram list.
 * Updated by JCasGen Wed Sep 11 20:34:06 BOT 2013
 * XML source: F:/Workplace/hw1-wtu/src/main/resources/hw1-wtu-typesystem.xml
 * @generated */
public class SentenceWithNGram extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SentenceWithNGram.class);
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
  protected SentenceWithNGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public SentenceWithNGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public SentenceWithNGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public SentenceWithNGram(JCas jcas, int begin, int end) {
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

  /** getter for sentence - gets The sentence content.
   * @generated */
  public Sentence getSentence() {
    if (SentenceWithNGram_Type.featOkTst && ((SentenceWithNGram_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "cmu.edu.iis.wtu.model.SentenceWithNGram");
    return (Sentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SentenceWithNGram_Type)jcasType).casFeatCode_sentence)));}
    
  /** setter for sentence - sets The sentence content. 
   * @generated */
  public void setSentence(Sentence v) {
    if (SentenceWithNGram_Type.featOkTst && ((SentenceWithNGram_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "cmu.edu.iis.wtu.model.SentenceWithNGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((SentenceWithNGram_Type)jcasType).casFeatCode_sentence, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: ngramList

  /** getter for ngramList - gets The ngrams that are belong to the sentence.
   * @generated */
  public FSArray getNgramList() {
    if (SentenceWithNGram_Type.featOkTst && ((SentenceWithNGram_Type)jcasType).casFeat_ngramList == null)
      jcasType.jcas.throwFeatMissing("ngramList", "cmu.edu.iis.wtu.model.SentenceWithNGram");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SentenceWithNGram_Type)jcasType).casFeatCode_ngramList)));}
    
  /** setter for ngramList - sets The ngrams that are belong to the sentence. 
   * @generated */
  public void setNgramList(FSArray v) {
    if (SentenceWithNGram_Type.featOkTst && ((SentenceWithNGram_Type)jcasType).casFeat_ngramList == null)
      jcasType.jcas.throwFeatMissing("ngramList", "cmu.edu.iis.wtu.model.SentenceWithNGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((SentenceWithNGram_Type)jcasType).casFeatCode_ngramList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for ngramList - gets an indexed value - The ngrams that are belong to the sentence.
   * @generated */
  public NGram getNgramList(int i) {
    if (SentenceWithNGram_Type.featOkTst && ((SentenceWithNGram_Type)jcasType).casFeat_ngramList == null)
      jcasType.jcas.throwFeatMissing("ngramList", "cmu.edu.iis.wtu.model.SentenceWithNGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SentenceWithNGram_Type)jcasType).casFeatCode_ngramList), i);
    return (NGram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SentenceWithNGram_Type)jcasType).casFeatCode_ngramList), i)));}

  /** indexed setter for ngramList - sets an indexed value - The ngrams that are belong to the sentence.
   * @generated */
  public void setNgramList(int i, NGram v) { 
    if (SentenceWithNGram_Type.featOkTst && ((SentenceWithNGram_Type)jcasType).casFeat_ngramList == null)
      jcasType.jcas.throwFeatMissing("ngramList", "cmu.edu.iis.wtu.model.SentenceWithNGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SentenceWithNGram_Type)jcasType).casFeatCode_ngramList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SentenceWithNGram_Type)jcasType).casFeatCode_ngramList), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: isAnswer

  /** getter for isAnswer - gets This is a tag to distinguish question and answers. 0 for the question and 1 for answers.
   * @generated */
  public boolean getIsAnswer() {
    if (SentenceWithNGram_Type.featOkTst && ((SentenceWithNGram_Type)jcasType).casFeat_isAnswer == null)
      jcasType.jcas.throwFeatMissing("isAnswer", "cmu.edu.iis.wtu.model.SentenceWithNGram");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SentenceWithNGram_Type)jcasType).casFeatCode_isAnswer);}
    
  /** setter for isAnswer - sets This is a tag to distinguish question and answers. 0 for the question and 1 for answers. 
   * @generated */
  public void setIsAnswer(boolean v) {
    if (SentenceWithNGram_Type.featOkTst && ((SentenceWithNGram_Type)jcasType).casFeat_isAnswer == null)
      jcasType.jcas.throwFeatMissing("isAnswer", "cmu.edu.iis.wtu.model.SentenceWithNGram");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SentenceWithNGram_Type)jcasType).casFeatCode_isAnswer, v);}    
  }

    
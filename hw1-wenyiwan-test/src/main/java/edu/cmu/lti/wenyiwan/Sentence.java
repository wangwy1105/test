

/* First created by JCasGen Tue Sep 10 15:33:01 EDT 2013 */
package edu.cmu.lti.wenyiwan;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 15:33:01 EDT 2013
 * XML source: /Users/Apple/Documents/workspace_Java/hw1-wenyiwan-test/desc/typeSystemDescriptor.xml
 * @generated */
public class Sentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
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
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Sentence(JCas jcas, int begin, int end) {
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
  //* Feature: TokenList

  /** getter for TokenList - gets list of tokens in the sentence
   * @generated */
  public FSArray getTokenList() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.lti.wenyiwan.Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList)));}
    
  /** setter for TokenList - sets list of tokens in the sentence 
   * @generated */
  public void setTokenList(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.lti.wenyiwan.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for TokenList - gets an indexed value - list of tokens in the sentence
   * @generated */
  public Token getTokenList(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.lti.wenyiwan.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList), i)));}

  /** indexed setter for TokenList - sets an indexed value - list of tokens in the sentence
   * @generated */
  public void setTokenList(int i, Token v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.lti.wenyiwan.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TokenList), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: BigramList

  /** getter for BigramList - gets list of bigrams in the sentence
   * @generated */
  public FSArray getBigramList() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_BigramList == null)
      jcasType.jcas.throwFeatMissing("BigramList", "edu.cmu.lti.wenyiwan.Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_BigramList)));}
    
  /** setter for BigramList - sets list of bigrams in the sentence 
   * @generated */
  public void setBigramList(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_BigramList == null)
      jcasType.jcas.throwFeatMissing("BigramList", "edu.cmu.lti.wenyiwan.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_BigramList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for BigramList - gets an indexed value - list of bigrams in the sentence
   * @generated */
  public Bigram getBigramList(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_BigramList == null)
      jcasType.jcas.throwFeatMissing("BigramList", "edu.cmu.lti.wenyiwan.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_BigramList), i);
    return (Bigram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_BigramList), i)));}

  /** indexed setter for BigramList - sets an indexed value - list of bigrams in the sentence
   * @generated */
  public void setBigramList(int i, Bigram v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_BigramList == null)
      jcasType.jcas.throwFeatMissing("BigramList", "edu.cmu.lti.wenyiwan.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_BigramList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_BigramList), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: TrigramList

  /** getter for TrigramList - gets list of the trigrams in the sentence
   * @generated */
  public FSArray getTrigramList() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_TrigramList == null)
      jcasType.jcas.throwFeatMissing("TrigramList", "edu.cmu.lti.wenyiwan.Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TrigramList)));}
    
  /** setter for TrigramList - sets list of the trigrams in the sentence 
   * @generated */
  public void setTrigramList(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_TrigramList == null)
      jcasType.jcas.throwFeatMissing("TrigramList", "edu.cmu.lti.wenyiwan.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TrigramList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for TrigramList - gets an indexed value - list of the trigrams in the sentence
   * @generated */
  public Trigram getTrigramList(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_TrigramList == null)
      jcasType.jcas.throwFeatMissing("TrigramList", "edu.cmu.lti.wenyiwan.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TrigramList), i);
    return (Trigram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TrigramList), i)));}

  /** indexed setter for TrigramList - sets an indexed value - list of the trigrams in the sentence
   * @generated */
  public void setTrigramList(int i, Trigram v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_TrigramList == null)
      jcasType.jcas.throwFeatMissing("TrigramList", "edu.cmu.lti.wenyiwan.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TrigramList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_TrigramList), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: Other

  /** getter for Other - gets other elements/words in the sentence
   * @generated */
  public String getOther() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_Other == null)
      jcasType.jcas.throwFeatMissing("Other", "edu.cmu.lti.wenyiwan.Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_Other);}
    
  /** setter for Other - sets other elements/words in the sentence 
   * @generated */
  public void setOther(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_Other == null)
      jcasType.jcas.throwFeatMissing("Other", "edu.cmu.lti.wenyiwan.Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_Other, v);}    
   
    
  //*--------------*
  //* Feature: begin

  /** getter for begin - gets 
   * @generated */
  public int getBegin() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "edu.cmu.lti.wenyiwan.Sentence");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets  
   * @generated */
  public void setBegin(int v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "edu.cmu.lti.wenyiwan.Sentence");
    jcasType.ll_cas.ll_setIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets 
   * @generated */
  public int getEnd() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "edu.cmu.lti.wenyiwan.Sentence");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets  
   * @generated */
  public void setEnd(int v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "edu.cmu.lti.wenyiwan.Sentence");
    jcasType.ll_cas.ll_setIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_end, v);}    
  }

    
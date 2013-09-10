

/* First created by JCasGen Tue Sep 10 15:33:01 EDT 2013 */
package edu.cmu.lti.wenyiwan;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 15:33:01 EDT 2013
 * XML source: /Users/Apple/Documents/workspace_Java/hw1-wenyiwan-test/desc/typeSystemDescriptor.xml
 * @generated */
public class Token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
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
  //* Feature: Postag

  /** getter for Postag - gets POS tagging
   * @generated */
  public String getPostag() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_Postag == null)
      jcasType.jcas.throwFeatMissing("Postag", "edu.cmu.lti.wenyiwan.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_Postag);}
    
  /** setter for Postag - sets POS tagging 
   * @generated */
  public void setPostag(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_Postag == null)
      jcasType.jcas.throwFeatMissing("Postag", "edu.cmu.lti.wenyiwan.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_Postag, v);}    
   
    
  //*--------------*
  //* Feature: WordCount

  /** getter for WordCount - gets # of words in the token
   * @generated */
  public int getWordCount() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_WordCount == null)
      jcasType.jcas.throwFeatMissing("WordCount", "edu.cmu.lti.wenyiwan.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_WordCount);}
    
  /** setter for WordCount - sets # of words in the token 
   * @generated */
  public void setWordCount(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_WordCount == null)
      jcasType.jcas.throwFeatMissing("WordCount", "edu.cmu.lti.wenyiwan.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_WordCount, v);}    
   
    
  //*--------------*
  //* Feature: begin

  /** getter for begin - gets 
   * @generated */
  public int getBegin() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "edu.cmu.lti.wenyiwan.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets  
   * @generated */
  public void setBegin(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "edu.cmu.lti.wenyiwan.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets 
   * @generated */
  public int getEnd() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "edu.cmu.lti.wenyiwan.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets  
   * @generated */
  public void setEnd(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "edu.cmu.lti.wenyiwan.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_end, v);}    
  }

    
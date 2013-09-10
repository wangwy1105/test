

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
public class Trigram extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Trigram.class);
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
  protected Trigram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Trigram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Trigram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Trigram(JCas jcas, int begin, int end) {
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

  /** getter for TokenList - gets lits of tokens in the trigram
   * @generated */
  public FSArray getTokenList() {
    if (Trigram_Type.featOkTst && ((Trigram_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.lti.wenyiwan.Trigram");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Trigram_Type)jcasType).casFeatCode_TokenList)));}
    
  /** setter for TokenList - sets lits of tokens in the trigram 
   * @generated */
  public void setTokenList(FSArray v) {
    if (Trigram_Type.featOkTst && ((Trigram_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.lti.wenyiwan.Trigram");
    jcasType.ll_cas.ll_setRefValue(addr, ((Trigram_Type)jcasType).casFeatCode_TokenList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for TokenList - gets an indexed value - lits of tokens in the trigram
   * @generated */
  public Token getTokenList(int i) {
    if (Trigram_Type.featOkTst && ((Trigram_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.lti.wenyiwan.Trigram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Trigram_Type)jcasType).casFeatCode_TokenList), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Trigram_Type)jcasType).casFeatCode_TokenList), i)));}

  /** indexed setter for TokenList - sets an indexed value - lits of tokens in the trigram
   * @generated */
  public void setTokenList(int i, Token v) { 
    if (Trigram_Type.featOkTst && ((Trigram_Type)jcasType).casFeat_TokenList == null)
      jcasType.jcas.throwFeatMissing("TokenList", "edu.cmu.lti.wenyiwan.Trigram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Trigram_Type)jcasType).casFeatCode_TokenList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Trigram_Type)jcasType).casFeatCode_TokenList), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: begin

  /** getter for begin - gets 
   * @generated */
  public int getBegin() {
    if (Trigram_Type.featOkTst && ((Trigram_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "edu.cmu.lti.wenyiwan.Trigram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Trigram_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets  
   * @generated */
  public void setBegin(int v) {
    if (Trigram_Type.featOkTst && ((Trigram_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "edu.cmu.lti.wenyiwan.Trigram");
    jcasType.ll_cas.ll_setIntValue(addr, ((Trigram_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets 
   * @generated */
  public int getEnd() {
    if (Trigram_Type.featOkTst && ((Trigram_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "edu.cmu.lti.wenyiwan.Trigram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Trigram_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets  
   * @generated */
  public void setEnd(int v) {
    if (Trigram_Type.featOkTst && ((Trigram_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "edu.cmu.lti.wenyiwan.Trigram");
    jcasType.ll_cas.ll_setIntValue(addr, ((Trigram_Type)jcasType).casFeatCode_end, v);}    
  }

    
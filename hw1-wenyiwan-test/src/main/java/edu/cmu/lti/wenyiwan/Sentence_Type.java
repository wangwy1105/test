
/* First created by JCasGen Tue Sep 10 15:33:01 EDT 2013 */
package edu.cmu.lti.wenyiwan;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Sep 10 15:33:01 EDT 2013
 * @generated */
public class Sentence_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Sentence_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Sentence_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Sentence(addr, Sentence_Type.this);
  			   Sentence_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Sentence(addr, Sentence_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Sentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.wenyiwan.Sentence");
 
  /** @generated */
  final Feature casFeat_TokenList;
  /** @generated */
  final int     casFeatCode_TokenList;
  /** @generated */ 
  public int getTokenList(int addr) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "edu.cmu.lti.wenyiwan.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_TokenList);
  }
  /** @generated */    
  public void setTokenList(int addr, int v) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "edu.cmu.lti.wenyiwan.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_TokenList, v);}
    
   /** @generated */
  public int getTokenList(int addr, int i) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "edu.cmu.lti.wenyiwan.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i);
  }
   
  /** @generated */ 
  public void setTokenList(int addr, int i, int v) {
        if (featOkTst && casFeat_TokenList == null)
      jcas.throwFeatMissing("TokenList", "edu.cmu.lti.wenyiwan.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TokenList), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_BigramList;
  /** @generated */
  final int     casFeatCode_BigramList;
  /** @generated */ 
  public int getBigramList(int addr) {
        if (featOkTst && casFeat_BigramList == null)
      jcas.throwFeatMissing("BigramList", "edu.cmu.lti.wenyiwan.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_BigramList);
  }
  /** @generated */    
  public void setBigramList(int addr, int v) {
        if (featOkTst && casFeat_BigramList == null)
      jcas.throwFeatMissing("BigramList", "edu.cmu.lti.wenyiwan.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_BigramList, v);}
    
   /** @generated */
  public int getBigramList(int addr, int i) {
        if (featOkTst && casFeat_BigramList == null)
      jcas.throwFeatMissing("BigramList", "edu.cmu.lti.wenyiwan.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_BigramList), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_BigramList), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_BigramList), i);
  }
   
  /** @generated */ 
  public void setBigramList(int addr, int i, int v) {
        if (featOkTst && casFeat_BigramList == null)
      jcas.throwFeatMissing("BigramList", "edu.cmu.lti.wenyiwan.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_BigramList), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_BigramList), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_BigramList), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_TrigramList;
  /** @generated */
  final int     casFeatCode_TrigramList;
  /** @generated */ 
  public int getTrigramList(int addr) {
        if (featOkTst && casFeat_TrigramList == null)
      jcas.throwFeatMissing("TrigramList", "edu.cmu.lti.wenyiwan.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_TrigramList);
  }
  /** @generated */    
  public void setTrigramList(int addr, int v) {
        if (featOkTst && casFeat_TrigramList == null)
      jcas.throwFeatMissing("TrigramList", "edu.cmu.lti.wenyiwan.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_TrigramList, v);}
    
   /** @generated */
  public int getTrigramList(int addr, int i) {
        if (featOkTst && casFeat_TrigramList == null)
      jcas.throwFeatMissing("TrigramList", "edu.cmu.lti.wenyiwan.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TrigramList), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_TrigramList), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TrigramList), i);
  }
   
  /** @generated */ 
  public void setTrigramList(int addr, int i, int v) {
        if (featOkTst && casFeat_TrigramList == null)
      jcas.throwFeatMissing("TrigramList", "edu.cmu.lti.wenyiwan.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TrigramList), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_TrigramList), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_TrigramList), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_Other;
  /** @generated */
  final int     casFeatCode_Other;
  /** @generated */ 
  public String getOther(int addr) {
        if (featOkTst && casFeat_Other == null)
      jcas.throwFeatMissing("Other", "edu.cmu.lti.wenyiwan.Sentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Other);
  }
  /** @generated */    
  public void setOther(int addr, String v) {
        if (featOkTst && casFeat_Other == null)
      jcas.throwFeatMissing("Other", "edu.cmu.lti.wenyiwan.Sentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_Other, v);}
    
  
 
  /** @generated */
  final Feature casFeat_begin;
  /** @generated */
  final int     casFeatCode_begin;
  /** @generated */ 
  public int getBegin(int addr) {
        if (featOkTst && casFeat_begin == null)
      jcas.throwFeatMissing("begin", "edu.cmu.lti.wenyiwan.Sentence");
    return ll_cas.ll_getIntValue(addr, casFeatCode_begin);
  }
  /** @generated */    
  public void setBegin(int addr, int v) {
        if (featOkTst && casFeat_begin == null)
      jcas.throwFeatMissing("begin", "edu.cmu.lti.wenyiwan.Sentence");
    ll_cas.ll_setIntValue(addr, casFeatCode_begin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_end;
  /** @generated */
  final int     casFeatCode_end;
  /** @generated */ 
  public int getEnd(int addr) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "edu.cmu.lti.wenyiwan.Sentence");
    return ll_cas.ll_getIntValue(addr, casFeatCode_end);
  }
  /** @generated */    
  public void setEnd(int addr, int v) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "edu.cmu.lti.wenyiwan.Sentence");
    ll_cas.ll_setIntValue(addr, casFeatCode_end, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Sentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_TokenList = jcas.getRequiredFeatureDE(casType, "TokenList", "uima.cas.FSArray", featOkTst);
    casFeatCode_TokenList  = (null == casFeat_TokenList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TokenList).getCode();

 
    casFeat_BigramList = jcas.getRequiredFeatureDE(casType, "BigramList", "uima.cas.FSArray", featOkTst);
    casFeatCode_BigramList  = (null == casFeat_BigramList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_BigramList).getCode();

 
    casFeat_TrigramList = jcas.getRequiredFeatureDE(casType, "TrigramList", "uima.cas.FSArray", featOkTst);
    casFeatCode_TrigramList  = (null == casFeat_TrigramList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TrigramList).getCode();

 
    casFeat_Other = jcas.getRequiredFeatureDE(casType, "Other", "uima.cas.String", featOkTst);
    casFeatCode_Other  = (null == casFeat_Other) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Other).getCode();

 
    casFeat_begin = jcas.getRequiredFeatureDE(casType, "begin", "uima.cas.Integer", featOkTst);
    casFeatCode_begin  = (null == casFeat_begin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_begin).getCode();

 
    casFeat_end = jcas.getRequiredFeatureDE(casType, "end", "uima.cas.Integer", featOkTst);
    casFeatCode_end  = (null == casFeat_end) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_end).getCode();

  }
}



    
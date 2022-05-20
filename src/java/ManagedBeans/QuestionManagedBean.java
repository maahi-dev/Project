/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ManagedBeans;

import Admin.AdminSessionBeanLocal;
import Entity.TblDistrict;
import Entity.TblQuestion;
import Entity.TblQuestionType;
import Entity.TblState;
import Entity.TblTaluka;
import Entity.TblVillage;
import Entity.TblWard;
import Entity.TblZone;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;

/**
 *
 * @author HP
 */
@Named(value = "questionManagedBean")
@SessionScoped
public class QuestionManagedBean implements Serializable {

    @EJB
    AdminSessionBeanLocal asb;

    TblQuestion question = new TblQuestion();
    String QType, date;
    Integer QTypeId;

    private ArrayList<String> chkstate = null;
    private ArrayList<String> chkdist = null;
    private ArrayList<String> chktal = null;
    private ArrayList<String> chkvill = null;
    private ArrayList<String> chkzone = null;
    private ArrayList<String> chkward = null;
    private ArrayList<String> chkcast = null;

    Collection<Integer> st = new ArrayList();
    Collection<Integer> ds = new ArrayList();
    Collection<Integer> tt = new ArrayList();
    Collection<Integer> vv = new ArrayList();
    Collection<Integer> zz = new ArrayList();
    Collection<Integer> ww = new ArrayList();
    Collection<Integer> cast = new ArrayList();
    Collection<Integer> occu = new ArrayList();
    Collection<Integer> quali = new ArrayList();
    
    Collection<TblDistrict> cdist;
    Collection<TblTaluka> ctal;
    Collection<TblVillage> cvill;
    Collection<TblZone> czone;
    Collection<TblWard> cward;

     Integer wid, zid, did, tid, vid, sid;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
     
    public Collection<TblDistrict> getCdist() {
        return cdist;
    }

    public void setCdist(Collection<TblDistrict> cdist) {
        this.cdist = cdist;
    }

    public Collection<TblTaluka> getCtal() {
        return ctal;
    }

    public void setCtal(Collection<TblTaluka> ctal) {
        this.ctal = ctal;
    }

    public Collection<TblVillage> getCvill() {
        return cvill;
    }

    public void setCvill(Collection<TblVillage> cvill) {
        this.cvill = cvill;
    }

    public Collection<TblZone> getCzone() {
        return czone;
    }

    public void setCzone(Collection<TblZone> czone) {
        this.czone = czone;
    }

    public Collection<TblWard> getCward() {
        return cward;
    }

    public void setCward(Collection<TblWard> cward) {
        this.cward = cward;
    }


    public Collection<Integer> getSt() {
        return st;
    }

    public void setSt(Collection<Integer> st) {
        this.st = st;
    }

    public Collection<Integer> getDs() {
        return ds;
    }

    public void setDs(Collection<Integer> ds) {
        this.ds = ds;
    }

    public Collection<Integer> getTt() {
        return tt;
    }

    public void setTt(Collection<Integer> tt) {
        this.tt = tt;
    }

    public Collection<Integer> getVv() {
        return vv;
    }

    public void setVv(Collection<Integer> vv) {
        this.vv = vv;
    }

    public Collection<Integer> getZz() {
        return zz;
    }

    public void setZz(Collection<Integer> zz) {
        this.zz = zz;
    }

    public Collection<Integer> getWw() {
        return ww;
    }

    public void setWw(Collection<Integer> ww) {
        this.ww = ww;
    }

    public Collection<Integer> getCast() {
        return cast;
    }

    public void setCast(Collection<Integer> cast) {
        this.cast = cast;
    }

    public Collection<Integer> getOccu() {
        return occu;
    }

    public void setOccu(Collection<Integer> occu) {
        this.occu = occu;
    }

    public Collection<Integer> getQuali() {
        return quali;
    }

    public void setQuali(Collection<Integer> quali) {
        this.quali = quali;
    }

    
    public ArrayList<String> getChkstate() {
        return chkstate;
    }

    public void setChkstate(ArrayList<String> chkstate) {
        System.out.println("State Data : " + chkstate);
        this.chkstate = chkstate;
    }

    public ArrayList<String> getChkdist() {
        return chkdist;
    }

    public void setChkdist(ArrayList<String> chkdist) {
        System.out.println("District Data : " + chkdist);
        this.chkdist = chkdist;
    }

    public ArrayList<String> getChktal() {
        return chktal;
    }

    public void setChktal(ArrayList<String> chktal) {
        System.out.println("Taluka Data : " + chktal);
        this.chktal = chktal;
    }

    public ArrayList<String> getChkvill() {
        return chkvill;
    }

    public void setChkvill(ArrayList<String> chkvill) {
        System.out.println("Village Data : " + chkvill);
        this.chkvill = chkvill;
    }

    public ArrayList<String> getChkzone() {
        return chkzone;
    }

    public void setChkzone(ArrayList<String> chkzone) {
        System.out.println("Zone Data : " + chkzone);
        this.chkzone = chkzone;
    }

    public ArrayList<String> getChkward() {
        return chkward;
    }

    public void setChkward(ArrayList<String> chkward) {
        System.out.println("Ward Data : " + chkward);
        this.chkward = chkward;
    }

    public ArrayList<String> getChkcast() {
        return chkcast;
    }

    public void setChkcast(ArrayList<String> chkcast) {
        System.out.println("cast Data : " + chkcast);
        this.chkcast = chkcast;
    }

    public AdminSessionBeanLocal getAsb() {
        return asb;
    }

    public void setAsb(AdminSessionBeanLocal asb) {
        this.asb = asb;
    }

    public TblQuestion getQuestion() {
        return question;
    }

    public void setQuestion(TblQuestion question) {
        this.question = question;
    }

    public String getQType() {
        return QType;
    }

    public void setQType(String QType) {
        this.QType = QType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getQTypeId() {
        return QTypeId;
    }
    
        
    public Collection<TblState> findAllState(){
        return asb.findAllState();
    }
    
    public Collection<TblDistrict> findAllDistrict(){
        return asb.findStateByDistrictId(sid);
    }
    
    public Collection<TblTaluka> findAllTaluka(){
        return asb.findTalukaByDistrictId(did);
    }
    
    public Collection<TblVillage> findAllVillage(){
        return asb.findVillageByTalukaId(tid);
    }
    
    public Collection<TblZone> findAllZone(){
        return asb.findZoneByVillageId(vid);
    }
    
    public Collection<TblWard> findAllWard(){
        return asb.findwardByZoneId(zid);
    }
    
    public void dropState(AjaxBehaviorEvent enevt){
       cdist =  asb.findStateByDistrictId(sid);
    }
    
    public void dropdistrict(AjaxBehaviorEvent event){
        ctal = asb.findTalukaByDistrictId(did);
    }
    
    public void droptaluka(AjaxBehaviorEvent event){
        cvill = asb.findVillageByTalukaId(tid);
    }
    
    public void dropVillage(AjaxBehaviorEvent event){
        czone = asb.findZoneByVillageId(vid);
    }
    
    public void dropZone(AjaxBehaviorEvent event){
       cward = asb.findwardByZoneId(zid);
    }


  
    /**
     * Creates a new instance of QuestionManagedBean
     */
    public QuestionManagedBean() {
    }

    public Collection<TblQuestion> allQuestion() {
        return this.asb.findAllQuestion();
    }

    public String openAddQuestion() {
        return "/AdminSide/AddQuestion.jsf?faces-redirect=true";
    }

    public String removeQuestion(Integer questionId) {
        this.asb.DeleteQuestion(questionId);
        return "/AdminSide/ViewQuestion.jsf?faces-redirect=true";
    }

    public String insertQuestion() {
        System.out.println("Hello");
        if (!chkstate.isEmpty()) {
            question.setState("All");
        }
        if (!chkdist.isEmpty()) {
            question.setDistrict("All");
        }
        if (!chktal.isEmpty()) {
            question.setTaluka("All");
        }
        if (!chkvill.isEmpty()) {
            question.setVillage("All");
        }
        if (!chkzone.isEmpty()) {
            question.setZone("All");
        }
        if (!chkward.isEmpty()) {
            question.setWard("All");
        }
        if (!chkcast.isEmpty()) {
            question.setCast("All");
        }
//        asb.InsertQuestion(question, st, ds, tt, vv, zz, ww, cast, occu, quali);

        return "";
    }

    public Collection<TblQuestionType> allQuestionType() {
        return this.asb.findAllQuestionType();
    }

}

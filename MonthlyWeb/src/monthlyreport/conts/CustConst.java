package monthlyreport.conts;

import java.util.Locale;

public class CustConst {
    public static final String LANG_TH = "th";
    public static final String LANG_EN = "en";
    public static final Locale LOCALE_TH = new Locale("th","TH");
    public static final String COUNTRY_CODE_TH = "764";
    public static final String REX_WORD_3_50 = "[A-Z0-9a-z_.-]{1,50}";
    public static final String REX_ANY_1_50 = ".{1,50}";
    public static final String REX_GENDER = "[FM]";
    public static final String REX_MO_PHONE_0 = "0\\d{9}";
    public static final String REX_CITIZEN = "\\d{13}";
    public static final String REX_PASSPORT = ".{4,30}";
    public static final String REX_USER = "[A-Z0-9a-z_-]{3,20}";
    public static final String REX_PSWD = ".{8,}";


    public static final int[] CITIZEN_MUL = {13,12,11,10,9,8,7,6,5,4,3,2};

    public static final String FORM_BIRTH_DAY = "yyyy-MM-dd";
    public static final String FORM_DTTM = "yyyy-MM-dd HH:mm:ss.SSS Z";
    public static final String FORM_REQ_DTTM = "yyyy-MM-dd HH:mm:ss.SSS";
    public static final String FORM_BOOK_DTTM = "yyyy-MM-dd HH:mm";
    public static final String FORM_MYSQL_DTTM = "yyyy-MM-dd HH:mm:ss";
    public static final String FORM_DAY_DTTM = "yyyy-MM-dd";
    public static final String FORM_BOOK_VIEW_DTTM = "dd MMM yyyy HH:mm";
    public static final String FORM_VIEW_DATE= "dd MMM yyyy";
    public static final String SALT_H = "Tso#0";
    public static final String SALT_T = "90itlos3";
    public static final String NO_TOKEN = "noToken";
    public static final String BLIND_PARAM_LIST = ",password,oldPassword,cnfmNewPassword,newPassword";
    public static final String SALT_ENC_H = "9846283";
    public static final String SALT_ENC_T = "0418374496472";

    //Customer status
    public static final String CUST_STTS_ACTIVE = "A";
    public static final String BOOK_ITEM_TYPE_SRVC = "S";
    public static final String BOOK_ITEM_TYPE_SRVC_NAME_TH = "�?ิ�?�?รรม�?ีฬา";
    public static final String BOOK_ITEM_TYPE_SRVC_NAME_EN = "Sport";
    public static final String BOOK_ITEM_TYPE_PACK = "P";
    public static final String BOOK_ITEM_TYPE_PACK_NAME_TH = "�?�?�?�?เ�?�?";
    public static final String BOOK_ITEM_TYPE_PACK_NAME_EN = "Package";

    //Booking Status
    public static final String BOOKING_STTS_NEW = "N";
    public static final String BOOKING_STTS_CHKOUT = "O";
    public static final String BOOKING_STTS_PAID = "P";
    public static final String BOOKING_STTS_CNCL = "C";

    //
    public static final String BOOKING_ITEM_STTS_ACT = "A";
    public static final String BOOKING_ITEM_STTS_IACT = "I";
    public static final String BOOKING_ITEM_STTS_CNCL = "C";
    public static final String BOOKING_ITEM_STTS_RESELL = "R";
    public static final String BOOKING_ITEM_STTS_SOLD = "S";

    // rcpt_stts
    public static final String RCPT_STTS_NEW = "N";
    public static final String RCPT_STTS_WAIT_PYMT = "W";
    public static final String RCPT_STTS_PAID = "P";
    public static final String RCPT_STTS_CNCL = "C";

    // cust reserve calendar stts
    public static final String CUST_RESV_CAL_STTS_BOOKING = "B";
    public static final String CUST_RESV_CAL_STTS_BOOKED = "A";
    public static final String CUST_RESV_CAL_STTS_RESELL = "R";
    public static final String CUST_RESV_CAL_STTS_CNCL = "C";
    public static final String CUST_RESV_CAL_STTS_SOLD = "S";

    public static final String CUST_REVW_STTS_NEW = "N";
    // SQL Mapper for myBatis
    public static final String SQL_CUST_COUNT_USER = "cust.countCustUsername";
    public static final String SQL_CUST_COUNT_EMAIL = "cust.countCustEmail";
    public static final String SQL_CUST_ADD_NEW_CUST = "cust.addCustomer";
    public static final String SQL_CUST_ADD_TRESR = "cust.addNewTreasure";
    public static final String SQL_CUST_ADD_SPORT_FAV = "cust.addNewFavSport";
    public static final String SQL_CUST_GET_BY_AUTH = "cust.custByAuth";
    public static final String SQL_CUST_LOGIN = "cust.custLogin";
    public static final String SQL_CUST_UPDT_SESS = "cust.updateSess";
    public static final String SQL_CUST_CHK_SESS = "cust.checkSessToken";
    public static final String SQL_CUST_SPORT_STAT = "cust.custSportStat";
    public static final String SQL_CUST_LIST_NOTI = "cust.listNoti";
    public static final String SQL_CUST_UPDT_NOTI = "cust.updtNoti";
    public static final String SQL_CUST_DEL_NOTI = "cust.delNoti";
    public static final String SQL_CUST_INQR_CUST = "cust.inqrCustProfile";
    public static final String SQL_CUST_INQR_PACK = "cust.inqrCustPackage";
    public static final String SQL_CUST_GET_USER_BY_CUST_ID = "cust.getUserNameByCustId";
    public static final String SQL_CUST_INQR_BY_EMAIL = "cust.inqrCustByEmail";
    public static final String SQL_CUST_UPDT_PSWD = "cust.updtCustPswd";
    public static final String SQL_CUST_LIST_BOOKED = "cust.listCustSportBooking";
    public static final String SQL_CUST_CHNG_PASSWD = "cust.changePasswd";
    public static final String SQL_CUST_INQR_USER_BY_ID = "cust.inqrUserByCustId";
    public static final String SQL_CUST_DEL_FAV_SPORT = "cust.delCustFavSport";
    public static final String SQL_CUST_INQR_BILL_ADDR = "cust.inqrCustBillAddr";
    public static final String SQL_CUST_INQR_ADDR = "cust.inqrCustAddr";
    public static final String SQL_CUST_UPDT = "cust.updtCust";
    public static final String SQL_CUST_INQR_TREASR = "cust.inqrCustTreasr";
    public static final String SQL_CUST_PAID_BOOKING = "cust.listPaidBooking";
    public static final String SQL_CUST_PAID_BOOKING_COUNT = "cust.listPaidBookingCount";
    public static final String SQL_CUST_INQR_BOOKING_ITEM = "cust.inqrCustBookingItem";
    public static final String SQL_CUST_RESELLING_BOOKING = "cust.resellBookingItem";
    public static final String SQL_CUST_LIST_NOTI_REVW = "cust.listCustNotiRevw";
    public static final String SQL_CUST_ADD_REVW_SCORE = "cust.addRevwScore";
    public static final String SQL_CUST_INQR_REVW = "cust.inqrCustRevw";
    public static final String SQL_CUST_ACTV = "cust.activateCust";
    public static final String SQL_COUNT_AUTH_ID = "cust.countAuthId";
    public static final String SQL_CUST_UPDT_BOOKING_ITEM_STTS = "cust.updtBookingItemStts";


    public static final String SQL_MAST_ERR_MSSG = "master.getErrMssg";
    public static final String SQL_MAST_CONF = "master.getAppConf";
    public static final String SQL_MAST_INSERT_IMG_GRUP = "master.insertNewImgGrup";
    public static final String SQL_MAST_INSERT_IMG = "master.insertNewImg";
    public static final String SQL_MAST_CUST_TRACK = "master.insertCustTrack";

    public static final String SQL_ADDR_ALL_PRVNC = "addr.getAllPrvnc";
    public static final String SQL_ADDR_NEW_ADDR = "addr.addNewAddr";
    public static final String SQL_ADDR_NEW_BILL_ADDR = "addr.addNewBillAddr";
    public static final String SQL_ADDR_GET_ADDR = "addr.getCustAddr";
    public static final String SQL_ADDR_GET_BILL_ADDR = "addr.getCustBillAddr";
    public static final String SQL_ADDR_LIST_COUNTRY = "addr.listCountry";
    public static final String SQL_ADDR_LIST_PROVINCE = "addr.listProvince";
    public static final String SQL_ADDR_LIST_DISTRICT = "addr.listDistrict";
    public static final String SQL_ADDR_LIST_SUBDISTRICT = "addr.listSubDistrict";
    public static final String SQL_ADDR_UPDT_BILL_ADDR = "addr.updtBillAddr";
    public static final String SQL_ADDR_UPDT_ADDR = "addr.updtAddr";

    public static final String SQL_SRVC_LIST_SPORT = "mrchntsrvc.listSport";
    public static final String SQL_SRVC_INQR_SPORT = "mrchntsrvc.inqrSport";
    public static final String SQL_SRVC_LIST_PROMO = "mrchntsrvc.listPromotion";
    public static final String SQL_SRVC_SRCH_MRCHT_SRVC = "mrchntsrvc.srchMrchntSrvc";
    public static final String SQL_SRVC_SRCH_MRCHT = "mrchntsrvc.srchMrchnt";
    public static final String SQL_SRVC_SRCH_MRCHT_COUNT = "mrchntsrvc.srchMrchntCount";
    public static final String SQL_SRVC_SRCH_MRCHT_SRVC_COUNT = "mrchntsrvc.srchMrchntSrvcCount";
    public static final String SQL_SRVC_REVW_SUMM = "mrchntsrvc.srvcRevwSumm";
    public static final String SQL_SRVC_REVW_BY_SRVC_ID = "mrchntsrvc.srvcRevwBySrvcId";
    public static final String SQL_SRVC_INQR_MRCHNT = "mrchntsrvc.inqrMrchntProfile";
    public static final String SQL_SRVC_INQR_MRCHNT_SRVC = "mrchntsrvc.inqrMrchntSrvc";
    public static final String SQL_SRVC_INQR_SRVC_CAL = "mrchntsrvc.inqrSrvcCal";
    public static final String SQL_SRVC_INQR_SRVC_CAL_RESRC = "mrchntsrvc.inqrSrvcResrc";
    public static final String SQL_SRVC_INQR_SRVC_UNIT_TIME = "mrchntsrvc.inqrSrvcUnitTime";
    public static final String SQL_SRVC_INQR_EFFC_SRVC_TIME = "mrchntsrvc.inqrEffcMrchntSrvcTime";
    public static final String SQL_SRVC_INQR_PACK_BY_ID = "mrchntsrvc.inqrSrvcPackByPackageId";
    public static final String SQL_SRVC_INQR_SRVC_RESRC_TIME = "mrchntsrvc.inqrSrvcResrcTime";
    public static final String SQL_SRVC_CHK_SRVC_TIME_METRIX = "mrchntsrvc.checkSrvcTimeMetrix";
    public static final String SQL_SRVC_CHK_RESRC_AVAI = "mrchntsrvc.checkResrcAvailable";
    public static final String SQL_SRVC_CHK_RESRC_AVAI_PYMT = "mrchntsrvc.checkResrcAvailableForPayment";
    public static final String SQL_SRVC_BOOK_UNIT_COUNT = "mrchntsrvc.bookingUnitCount";
    public static final String SQL_SRVC_INQR_SRVC_RESRC_TIME_BY_ID = "mrchntsrvc.getSrvcResrcTimeById";

    public static final String SQL_PYMT_LIST_PYMTGW = "payment.listpymtgw";
    public static final String SQL_PYMT_INQR_CUST_NEW_BOOK = "payment.inqrNewBooking";
    public static final String SQL_PYMT_INQR_SRVC_PACK = "payment.inqrSrvcPack";
    public static final String SQL_PYMT_GET_BOOK_COLLISION = "payment.checkResrcBookCollision";
    public static final String SQL_PYMT_INQR_CUST_PACK_BY_ID = "payment.inqrCustPackByCustPackId";
    public static final String SQL_PYMT_CHK_HOLIDAY = "payment.chkBookDateInHoliday";
    public static final String SQL_PYMT_INSERT_NEW_BOOKING = "payment.insertNewCustBooking";
    public static final String SQL_PYMT_INSERT_NEW_BOOK_ITEM = "payment.insertNewBookingItem";
    public static final String SQL_PYMT_GET_BOOK_TOTL_PAID = "payment.getTotalPaidAmntByBookingId";
    public static final String SQL_PYMT_GET_SRVC_PRICE = "payment.getCostSetup";
    public static final String SQL_PYMT_GET_SRVC_PRICE_PROMO = "payment.getPromoCostSetup";
    public static final String SQL_PYMT_INQR_BOOK_CART = "payment.inqrBookingCart";
    public static final String SQL_PYMT_INQR_DISC_INFO = "payment.inqrDiscountInfo";
    public static final String SQL_PYMT_INQR_CUST_BOOKING = "payment.inqrCustBooking";
    public static final String SQL_PYMT_INQR_CUST_BOOKING_ITEM = "payment.inqrCustBookingItem";
    public static final String SQL_PYMT_INQR_RCPT = "payment.inqrRcpt";
    public static final String SQL_PYMT_UPDT_RCPT = "payment.updtRcpt";
    public static final String SQL_PYMT_INSERT_NEW_RCPT = "payment.newRcpt";
    public static final String SQL_PYMT_DEL_RCPT_ITEM = "payment.delRcptItem";
    public static final String SQL_PYMT_INQR_RESELL_BOOKING = "payment.inqrBookingResell";
    public static final String SQL_PYMT_UPDT_BOOKING_ITEM = "payment.updtBookingItem";
    public static final String SQL_PYMT_INQR_RESRC_BOOKED_COUNT = "payment.inqrResrcBookedCount";
    public static final String SQL_PYMT_NEW_RESRC_BOOKED_COUNT = "payment.newResrcBookedCount";
    public static final String SQL_PYMT_INC_RESRC_BOOKED_COUNT = "payment.incResrcBookedCount";
    public static final String SQL_PYMT_DEC_RESRC_BOOKED_COUNT = "payment.decResrcBookedCount";
    public static final String SQL_PYMT_UPDT_CUST_BOOKING = "payment.updtCustBooking";
    public static final String SQL_PYMT_NEW_RCPT_ITEM  = "payment.newRcptItem";
    public static final String SQL_PYMT_NEW_CUST_RESV_CAL = "payment.newCustResvCal";
    public static final String SQL_PYMT_DEL_CUST_RESV_CAL = "payment.delCustResvCal";
    public static final String SQL_PYMT_CUST_USE_CODE = "payment.newDiscCustUsed";
    public static final String SQL_PYMT_DEL_DISC_CUST_USE = "payment.delDiscCustUsed";
    public static final String SQL_PYMT_DEL_RCPT_BY_BOOK_ID = "payment.delRcptTaxByBookingId";
    public static final String SQL_PYMT_DEL_BOOK_ITEM = "payment.delBookingItem";
    public static final String SQL_PYMT_DEL_CUST_BOOKING = "payment.delCustBooking";
    public static final String SQL_PYMT_COUNT_CUST_PACK_USE = "payment.countCustPackToUse";
    public static final String SQL_PYMT_DEL_NEW_BOOKING_ITEM = "payment.delNewBookingItem";
    public static final String SQL_PYMT_NEW_RCPT_SEQ = "payment.newRcptSeq";


    public static final String SQL_POST_PYMT_NEW_MRCHNT_TRNS_BY_BOOKING_ID = "postpayment.newMrchntTrnsByBookingId";
    public static final String SQL_POST_PYMT_UPDT_COIN = "postpayment.updtCustCoin";
    public static final String SQL_POST_PYMT_UPDT_CUST_PACK_USED = "postpayment.updtCustPackUsed";
    public static final String SQL_POST_PYMT_NEW_CUST_PACK = "postpayment.newCustPack";
    public static final String SQL_POST_PYMT_NEW_SPORT_STAT = "postpayment.newSportStat";
    public static final String SQL_POST_PYMT_GET_SPORT_BY_SRVC_ID = "postpayment.getSportBySrvcId";
    public static final String SQL_POST_PYMT_NEW_NOTI_REVW = "postpayment.newRevwNoti";
    public static final String SQL_POST_PYMT_CUST_ID_BY_BOOKING_ID = "postpayment.getCustIdByBookingId";
    public static final String SQL_POST_PYMT_MRCHNT_TRNS_RESELL = "postpayment.stampMrchntTrnsResell";
    public static final String SQL_POST_PYMT_UPDT_CUST_RESV_STTS = "postpayment.updtCustResvCalStts";
    public static final String SQL_POST_DEL_CUST_REVW_BY_CUSTID_ITEMID = "postpayment.delCustRevwByCustIdAndBookingItemId";

    public static final String CONF_SESS_MIN = "sess_min_life";
    public static final String CONF_BOOK_LIFE_MIN = "booking_cart_life_min";
    public static final String CONF_BOOK_FEE = "booking_fee";
    public static final String CONF_PYMTGW_URL_CALL_BACK = "cust_pymt_redirect_url";
    public static final String CONF_VAT = "vat";
    public static final String CONF_CRM_TEL = "crmTelNo";
    public static final String CONF_PATH = "hotum.cust.confPath";
    public static final String CONF_MAIL_SENDER = "cust_mail_sender";
    public static final String CONF_MAIL_TEMP_FILE = "forgot_cust.txt";
    public static final String CONF_MAIL_TEMP_RESELL = "resellnoti.txt";
    public static final String CONF_MAIL_TEMP_BOOKING_CNFM = "bookingconfirm.txt";
    public static final String CONF_MAIL_TEMP_ACTV = "register_cust.txt";
    public static final String CONF_RESELL_RATE = "resell_rate";
    public static final String CONF_ACTV_URL = "activate_url";
    public static final String CONF_LGIN_URL = "login_url";
    public static final String CONF_BOOK_CNFM_JASPER = "HotumBookingConfirm.jasper";
    public static final String CONF_COIN_RATE = "coin_rate";

    public static final String SQL_ADDR_ALL_PRVNCC = "addr.getSomething";
}

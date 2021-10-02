
import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class DigiSTLoginResponse implements Serializable {

	@UserPIIdata
	private String daysCount;

	private String isRebindingrequired;

	@SerializedName("AcctSignalReason")
	private String acctSignalReason;

	private String accountStatus;

	private String addrInternalId;

	@SerializedName("addrInternalId_Mailing4")
	private String addrInternalIdMailing4;

	private String adhaarNumber;

	private String ageRange;

	private String avatarBase64;

	@SerializedName("BirthCityCode")
	private String birthCityCode;

	private String birthCityName;

	@SerializedName("BirthCtryCode")
	private String birthCtryCode;

	private String birthCtryName;

	@UserPIIdata
	@SerializedName("BirthDate")
	private String birthDate;

	@SerializedName("CampaignID")
	private String campaignID;

	@UserPIIdata
	private String cardExpiryDate;

	private String cardProdType;

	private String cardStatus;

	private String cardType;

	private String city;

	private String country;

	@SerializedName("CurrentDate")
	private String currentDate;

	private String currentDateTime;

	private String custInternalId;

	@SerializedName("CustPEPStatus")
	private String custPEPStatus;

	@SerializedName("CustSanctionsHitStatus")
	private String custSanctionsHitStatus;

	private String custSegment;

	@SerializedName("CustStatus")
	private String custStatus;

	@SerializedName("CustStatusReasonCode")
	private String custStatusReasonCode;

	@SerializedName("CustStatusReasonDesc")
	private String custStatusReasonDesc;

	private String custSubSegment;

	private String drCardNumber;

	private String drMaskedCardNumber;

	@UserPIIdata
	private String emailAddress;

	@SerializedName("FatherName")
	private String fatherName;

	private int fdCount;

	private String firstName;

	private String formattedFinnacleDate;

	private String formattedMFTotalMarketPrice;

	private String fullName;

	@SerializedName("Gender")
	private String gender;

	private int httpStatusCode;

	private String incomeSource;

	private String industry;

	private String interestRateFD;

	@UserPIIdata
	private String investMFAcctId;

	@SerializedName("InvestAssetType")
	private String investAssetType;

	@SerializedName("InvestmentProdType")
	private String investmentProdType;

	private String isAadharGiven;

	private String isAcctSignalReason35;

	private String isCustEWSSCheck;

	private String isNRICustomer;

	private String isCustOnboardStatus;

	private String isCustRiskRatingDone;

	private String isDeviceChanged;

	private String isProvisioningDeviceChanged;

	private String isMFRiskProfileExpired;

	private String isOVDGiven;

	private String isStaff;

	private String jobNature;

	private String lastName;

	@SerializedName("Location")
	private String location;

	@SerializedName("MFExpiryDate")
	private String mfExpiryDate;

	@SerializedName("MFRiskLevel")
	private String mFRiskLevel;

	@SerializedName("MFRiskLevelDateTime")
	private String mFRiskLevelDateTime;

	@SerializedName("MFRiskProfileExpiry")
	private String mFRiskProfileExpiry;

	@SerializedName("MFRiskScore")
	private String mFRiskScore;

	@SerializedName("MFTotalMarketPrice")
	private String mFTotalMarketPrice;

	@SerializedName("MMID")
	private String mMID;

	@SerializedName("MailEffDate")
	private String mailEffDate;

	private String mailEffectDate;

	@SerializedName("MaritalStatus")
	private String maritalStatus;

	@SerializedName("MaritalStatusDesc")
	private String maritalStatusDesc;

	private String mfFormattedOpenDate;

	private String middleName;

	private String mobileNumber;

	@SerializedName("MotherMaidenName")
	private String motherMaidenName;

	@SerializedName("MotherName")
	private String motherName;

	private String netWorth;

	private String noCardstatus;

	private String occupation;

	private String occupationDesc;

	@SerializedName("opstatus_readPartyLite")
	private int opstatusReadPartyLite;

	@SerializedName("opstatus_retrievePartyProductsLite")
	private int opstatusRetrievePartyProductsLite;

	@SerializedName("opstatus_retrieveVPIAccountDetails")
	private int opstatusRetrieveVPIAccountDetails;

	@SerializedName("PAN")
	private String pAN;

	@SerializedName("PanRetryCount")
	private String panRetryCount;

	private String totalCASAAmount;

	private String phoneCtryCode;

	private String phoneNum;

	private String postalCode;

	private String prefAddr;

	private String profileImage;

	@SerializedName("ResCity")
	private String resCity;

	private String salaryRange;

	private String salaryRangeFrom;

	private String salaryRangeTo;

	@SerializedName("Salutation")
	private String salutation;

	private String schemeTypeSA;

	@SerializedName("SpouseName")
	private String spouseName;

	private String state;

	private String taxType;

	private String totalFDAmount;

	private String isVcardAvailable;

	private String vcardStatus;

	private String vcardDebitNumber;

	private String simSerialNumber;

	private String upiToken;

	private String upiTokenType;

	private String keyXML;

	@SerializedName("opstatus_STlogin")
	private Integer opstatusSTlogin;

	private String tmsTokenStatus;

	private String userStatus;

	private String isPANGiven;
	@SerializedName("opstatus_dashboardComposite_v2")

	private Integer opstatusDashboardCompositeV2;

	private String deviceSoftTokenState;

	private String hasLinkedAccounts;

	private String coolOffServicesSet;
	@SerializedName("opstatus_isUPIrebindingrequired")

	private Integer opstatusIsUPIrebindingrequired;

	private String isFirstTimeLoginAfterFullAccConversion;

	private String panNumber;

	private Integer vpiCount;

	private String timeToCallRetrieveDepositAccountBal;
	@SerializedName("errmsg_retrievePartyProductsLite")

	private String errmsgRetrievePartyProductsLite;

	private String doContinueHTTPSession;

	private String simSubscriberId;

	private String coolOff;
	@SerializedName("CIF")

	private String cIF;

	private String kasistoContext;

	private String tokenAPIN;

	private String tokenFirmware;

	private String tokenSerialNo;

	private String defaultInsSumAmount;

	private boolean disableInsuranceFlag;

	private String panName;

	@SerializedName("isIAMUser")
	private String isIAMUser;

	@SerializedName("EkycMethod")
	private String eKYCMethod;

	@SerializedName("EkycStatus")
	private String eKYCStatus;

	@SerializedName("EkycDate")
	private String eKYCDate;

	@SerializedName("unMaskedaccId")
	private String accountNumber;

	@SerializedName("lsaConversionDate")
	private String createdDate;

	@SerializedName("isLoginFlow")
	private boolean isLoginFlow;

	private boolean isPaisaBazaarValidAadhaar;

	private boolean isPaisaBazaarValidPan;

	@SerializedName("LCIN")
	private String lcin;

	@SerializedName("isFATCACRS_REMEDIATION_REQUIRED")
	private boolean isFatcacrsRemediationRequired;

	@SerializedName("ADDRESS_REMEDIATION_REQUIRED")

	private boolean isAddressRemediation;

	@SerializedName("disableMFFlag")
	private boolean disableMFFlag;

	@SerializedName("ETB_OBL_REQUIRED")
	private String isETB_OBL_REQUIRED;

	@SerializedName("AppFlyerTriggeredHLE125")
	private String isAppFlyerTriggered;

	private String ekycStatusType;

	private String ekycFreezeCount; // F - freeze, C - closed

	@SerializedName("loanCustType")
	private String loanCustType;

	@SerializedName("upiDeviceId")
	private String upiDeviceId;

	private String isVCardAllowedForLSA;

	@UserPIIdata
	@SerializedName("digiInvestmentId")
	private String digiInvestmentId;

	@SerializedName("digiInvestAssetType")
	private String digiInvestAssetType;

	@SerializedName("hasMFInvestments")
	private String hasMFInvestments;

	@SerializedName("ISREMI_ENABLED")
	private String isRemitEnabled;

	@SerializedName("cardId")
	private String cardId;

	@SerializedName("status")
	private String status;

	@SerializedName("UNIVERSAL_ADDRESS_REMEDIATION_REQUIRED")
	private boolean isUniversalAddressRemediationRequired;

	@UserPIIdata
	private List<CardInqRec> cardInqRec;
	
	@UserPIIdata
	private List<LoanDisbursement> loanDisbusementInfo;

	@UserPIIdata
	private List<EmailDetl> emailDetl;

	@SerializedName("MessageParams")
	private List<MessageParamData> messageParams;

	@SerializedName("debitCardList")
	private List<DebitCardList> debitCardList = null;

	@UserPIIdata
	private List<InvestmentDetail> investmentDetails;

	@SerializedName("LoanOfferDetails")
	private List<LoanOfferDetail> mLoanOfferDetails;

	@SerializedName("LoanAcctIdRec")
	private List<DigiSTLoginResponse.LoanAcctIdRec> loanAcctIdRec;

	@SerializedName("MortgageLoanAcctIdRec")
	private List<DigiSTLoginResponse.LoanAcctIdRec> mortgageLoanAcctIdRec;

	private List<InsInvestmentDetails> insuInvestmentDetails;

	private List<RetrieveVPIAccountDetailsResponse.BankAccount> bankAccounts;

	@SerializedName("Prospect")
	private List<Prospect> prospect = null;

	@UserPIIdata
	private List<ProdInqRec> prodInqRec;

	private List<ProdInqRec> partyProductsFD;

	private List<ProdInqRec> partyProductsSA;

	private List<CasaProdInqRec> partyProductsCASA;

	@UserPIIdata
	private List<PhoneDetail> phoneDetails;

	@UserPIIdata
	private List<CustAddr> custAddr;

	private List<CustDocDetl> custDocDetls;

	@SerializedName("INS_ProdList")
	private List<INSProdList> iNSProdList = null;

	private List<CustDoc> custDocs;

	@SerializedName("AddnlProdDetl")
	private List<Object> addnlProdDetl;

	public DigiSTLoginResponse() {

	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public List<MessageParamData> getMessageParams() {
		return messageParams;
	}

	public void setMessageParams(List<MessageParamData> messageParams) {
		this.messageParams = messageParams;
	}

	public String getIsRemitEnabled() {
		return isRemitEnabled;
	}

	public void setIsRemitEnabled(String isRemitEnabled) {
		this.isRemitEnabled = isRemitEnabled;
	}

	public String getUpiDeviceId() {
		return upiDeviceId;
	}

	public void setUpiDeviceId(String upiDeviceId) {
		this.upiDeviceId = upiDeviceId;
	}

	public String getIsAppFlyerTriggered() {
		return isAppFlyerTriggered;
	}

	public void setIsAppFlyerTriggered(String isAppFlyerTriggered) {
		this.isAppFlyerTriggered = isAppFlyerTriggered;
	}

	public boolean isFatcacrsRemediationRequired() {
		return isFatcacrsRemediationRequired;
	}

	public void setFatcacrsRemediationRequired(boolean fatcacrsRemediationRequired) {
		isFatcacrsRemediationRequired = fatcacrsRemediationRequired;
	}

	public boolean isAddressRemediation() {
		return isAddressRemediation;
	}

	public void setAddressRemediation(boolean addressRemediation) {
		isAddressRemediation = addressRemediation;
	}

	public String getIsVCardAllowedForLSA() {
		return isVCardAllowedForLSA;
	}

	public void setIsVCardAllowedForLSA(String isVCardAllowedForLSA) {
		this.isVCardAllowedForLSA = isVCardAllowedForLSA;
	}

	public String geteKYCMethod() {
		return eKYCMethod;
	}

	public void seteKYCMethod(String eKYCMethod) {
		this.eKYCMethod = eKYCMethod;
	}

	public String geteKYCStatus() {
		return eKYCStatus;
	}

	public void seteKYCStatus(String eKYCStatus) {
		this.eKYCStatus = eKYCStatus;
	}

	public String geteKYCDate() {
		return eKYCDate;
	}

	public void seteKYCDate(String eKYCDate) {
		this.eKYCDate = eKYCDate;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getDaysCount() {
		return daysCount;
	}

	public void setDaysCount(String daysCount) {
		this.daysCount = daysCount;
	}

	public String getIsRebindingrequired() {
		return isRebindingrequired;
	}

	public void setIsRebindingrequired(String isRebindingrequired) {
		this.isRebindingrequired = isRebindingrequired;
	}

	public String getisETB_OBL_REQUIRED() {
		return isETB_OBL_REQUIRED;
	}

	public void setIsETB_OBL_REQUIRED(String IsETB_OBL_REQUIRED) {
		this.isETB_OBL_REQUIRED = IsETB_OBL_REQUIRED;
	}

	public boolean isPaisaBazaarValidAadhaar() {
		return isPaisaBazaarValidAadhaar;
	}

	public void setPaisaBazaarValidAadhaar(boolean paisaBazaarValidAadhaar) {
		isPaisaBazaarValidAadhaar = paisaBazaarValidAadhaar;
	}

	public boolean isPaisaBazaarValidPan() {
		return isPaisaBazaarValidPan;
	}

	public void setPaisaBazaarValidPan(boolean paisaBazaarValidPan) {
		isPaisaBazaarValidPan = paisaBazaarValidPan;
	}

	public boolean isDisableMFFlag() {
		return disableMFFlag;
	}

	public void setDisableMFFlag(boolean disableMFFlag) {
		this.disableMFFlag = disableMFFlag;
	}

	public String getAcctSignalReason() {
		return acctSignalReason;
	}

	public void setAcctSignalReason(String acctSignalReason) {
		this.acctSignalReason = acctSignalReason;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public List<Object> getAddnlProdDetl() {
		return addnlProdDetl;
	}

	public void setAddnlProdDetl(List<Object> addnlProdDetl) {
		this.addnlProdDetl = addnlProdDetl;
	}

	public String getAddrInternalId() {
		return addrInternalId;
	}

	public void setAddrInternalId(String addrInternalId) {
		this.addrInternalId = addrInternalId;
	}

	public String getAddrInternalIdMailing4() {
		return addrInternalIdMailing4;
	}

	public void setAddrInternalIdMailing4(String addrInternalIdMailing4) {
		this.addrInternalIdMailing4 = addrInternalIdMailing4;
	}

	public String getAdhaarNumber() {
		return adhaarNumber;
	}

	public void setAdhaarNumber(String adhaarNumber) {
		this.adhaarNumber = adhaarNumber;
	}

	public String getAgeRange() {
		return ageRange;
	}

	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}

	public String getAvatarBase64() {
		return avatarBase64;
	}

	public void setAvatarBase64(String avatarBase64) {
		this.avatarBase64 = avatarBase64;
	}

	public String getBirthCityCode() {
		return birthCityCode;
	}

	public void setBirthCityCode(String birthCityCode) {
		this.birthCityCode = birthCityCode;
	}

	public String getBirthCityName() {
		return birthCityName;
	}

	public void setBirthCityName(String birthCityName) {
		this.birthCityName = birthCityName;
	}

	public String getBirthCtryCode() {
		return birthCtryCode;
	}

	public void setBirthCtryCode(String birthCtryCode) {
		this.birthCtryCode = birthCtryCode;
	}

	public String getBirthCtryName() {
		return birthCtryName;
	}

	public void setBirthCtryName(String birthCtryName) {
		this.birthCtryName = birthCtryName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getCampaignID() {
		return campaignID;
	}

	public void setCampaignID(String campaignID) {
		this.campaignID = campaignID;
	}

	public String getCardExpiryDate() {
		return cardExpiryDate;
	}

	public void setCardExpiryDate(String cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}

	public List<CardInqRec> getCardInqRec() {
		return cardInqRec;
	}

	public void setCardInqRec(List<CardInqRec> cardInqRec) {
		this.cardInqRec = cardInqRec;
	}

	public String getCardProdType() {
		return cardProdType;
	}

	public void setCardProdType(String cardProdType) {
		this.cardProdType = cardProdType;
	}

	public String getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	public String getCurrentDateTime() {
		return currentDateTime;
	}

	public void setCurrentDateTime(String currentDateTime) {
		this.currentDateTime = currentDateTime;
	}

	public List<CustAddr> getCustAddr() {
		return custAddr;
	}

	public void setCustAddr(List<CustAddr> custAddr) {
		this.custAddr = custAddr;
	}

	public List<CustDocDetl> getCustDocDetls() {
		return custDocDetls;
	}

	public void setCustDocDetls(List<CustDocDetl> custDocDetls) {
		this.custDocDetls = custDocDetls;
	}

	public List<INSProdList> getiNSProdList() {
		return iNSProdList;
	}

	public void setiNSProdList(List<INSProdList> iNSProdList) {
		this.iNSProdList = iNSProdList;
	}

	public List<CustDoc> getCustDocs() {
		return custDocs;
	}

	public void setCustDocs(List<CustDoc> custDocs) {
		this.custDocs = custDocs;
	}

	public String getCustInternalId() {
		return custInternalId;
	}

	public void setCustInternalId(String custInternalId) {
		this.custInternalId = custInternalId;
	}

	public String getCustPEPStatus() {
		return custPEPStatus;
	}

	public void setCustPEPStatus(String custPEPStatus) {
		this.custPEPStatus = custPEPStatus;
	}

	public String getCustSanctionsHitStatus() {
		return custSanctionsHitStatus;
	}

	public void setCustSanctionsHitStatus(String custSanctionsHitStatus) {
		this.custSanctionsHitStatus = custSanctionsHitStatus;
	}

	public String getCustSegment() {
		return custSegment;
	}

	public void setCustSegment(String custSegment) {
		this.custSegment = custSegment;
	}

	public String getCustStatus() {
		return custStatus;
	}

	public void setCustStatus(String custStatus) {
		this.custStatus = custStatus;
	}

	public String getCustStatusReasonCode() {
		return custStatusReasonCode;
	}

	public void setCustStatusReasonCode(String custStatusReasonCode) {
		this.custStatusReasonCode = custStatusReasonCode;
	}

	public String getCustStatusReasonDesc() {
		return custStatusReasonDesc;
	}

	public void setCustStatusReasonDesc(String custStatusReasonDesc) {
		this.custStatusReasonDesc = custStatusReasonDesc;
	}

	public String getCustSubSegment() {
		return custSubSegment;
	}

	public void setCustSubSegment(String custSubSegment) {
		this.custSubSegment = custSubSegment;
	}

	public String getDrCardNumber() {
		return drCardNumber;
	}

	public void setDrCardNumber(String drCardNumber) {
		this.drCardNumber = drCardNumber;
	}

	public String getDrMaskedCardNumber() {
		return drMaskedCardNumber;
	}

	public void setDrMaskedCardNumber(String drMaskedCardNumber) {
		this.drMaskedCardNumber = drMaskedCardNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public List<EmailDetl> getEmailDetl() {
		return emailDetl;
	}

	public void setEmailDetl(List<EmailDetl> emailDetl) {
		this.emailDetl = emailDetl;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public int getFdCount() {
		return fdCount;
	}

	public void setFdCount(int fdCount) {
		this.fdCount = fdCount;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFormattedFinnacleDate() {
		return formattedFinnacleDate;
	}

	public void setFormattedFinnacleDate(String formattedFinnacleDate) {
		this.formattedFinnacleDate = formattedFinnacleDate;
	}

	public String getFormattedMFTotalMarketPrice() {
		return formattedMFTotalMarketPrice;
	}

	public void setFormattedMFTotalMarketPrice(String formattedMFTotalMarketPrice) {
		this.formattedMFTotalMarketPrice = formattedMFTotalMarketPrice;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(int httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getIncomeSource() {
		return incomeSource;
	}

	public void setIncomeSource(String incomeSource) {
		this.incomeSource = incomeSource;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getInterestRateFD() {
		return interestRateFD;
	}

	public void setInterestRateFD(String interestRateFD) {
		this.interestRateFD = interestRateFD;
	}

	public String getInvestMFAcctId() {
		return investMFAcctId;
	}

	public void setInvestMFAcctId(String investMFAcctId) {
		this.investMFAcctId = investMFAcctId;
	}

	public String getInvestAssetType() {
		return investAssetType;
	}

	public void setInvestAssetType(String investAssetType) {
		this.investAssetType = investAssetType;
	}

	public String getInvestmentProdType() {
		return investmentProdType;
	}

	public void setInvestmentProdType(String investmentProdType) {
		this.investmentProdType = investmentProdType;
	}

	public String getIsAadharGiven() {
		return isAadharGiven;
	}

	public void setIsAadharGiven(String isAadharGiven) {
		this.isAadharGiven = isAadharGiven;
	}

	public String getIsAcctSignalReason35() {
		return isAcctSignalReason35;
	}

	public void setIsAcctSignalReason35(String isAcctSignalReason35) {
		this.isAcctSignalReason35 = isAcctSignalReason35;
	}

	public String getIsCustEWSSCheck() {
		return isCustEWSSCheck;
	}

	public void setIsCustEWSSCheck(String isCustEWSSCheck) {
		this.isCustEWSSCheck = isCustEWSSCheck;
	}

	public String getIsNRICustomer() {
		return isNRICustomer;
	}

	public void setIsNRICustomer(String isNRICustomer) {
		this.isNRICustomer = isNRICustomer;
	}

	public String getIsCustOnboardStatus() {
		return isCustOnboardStatus;
	}

	public void setIsCustOnboardStatus(String isCustOnboardStatus) {
		this.isCustOnboardStatus = isCustOnboardStatus;
	}

	public String getIsCustRiskRatingDone() {
		return isCustRiskRatingDone;
	}

	public void setIsCustRiskRatingDone(String isCustRiskRatingDone) {
		this.isCustRiskRatingDone = isCustRiskRatingDone;
	}

	public String getIsDeviceChanged() {
		return isDeviceChanged;
	}

	public void setIsDeviceChanged(String isDeviceChanged) {
		this.isDeviceChanged = isDeviceChanged;
	}

	public String getIsProvisioningDeviceChanged() {
		return isProvisioningDeviceChanged;
	}

	public void setIsProvisioningDeviceChanged(String isProvisioningDeviceChanged) {
		this.isProvisioningDeviceChanged = isProvisioningDeviceChanged;
	}

	public String getIsMFRiskProfileExpired() {
		return isMFRiskProfileExpired;
	}

	public void setIsMFRiskProfileExpired(String isMFRiskProfileExpired) {
		this.isMFRiskProfileExpired = isMFRiskProfileExpired;
	}

	public String getIsOVDGiven() {
		return isOVDGiven;
	}

	public void setIsOVDGiven(String isOVDGiven) {
		this.isOVDGiven = isOVDGiven;
	}

	public String getIsStaff() {
		return isStaff;
	}

	public void setIsStaff(String isStaff) {
		this.isStaff = isStaff;
	}

	public String getJobNature() {
		return jobNature;
	}

	public void setJobNature(String jobNature) {
		this.jobNature = jobNature;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMfExpiryDate() {
		return mfExpiryDate;
	}

	public void setMfExpiryDate(String mfExpiryDate) {
		this.mfExpiryDate = mfExpiryDate;
	}

	public String getmFRiskLevel() {
		return mFRiskLevel;
	}

	public void setmFRiskLevel(String mFRiskLevel) {
		this.mFRiskLevel = mFRiskLevel;
	}

	public String getmFRiskLevelDateTime() {
		return mFRiskLevelDateTime;
	}

	public void setmFRiskLevelDateTime(String mFRiskLevelDateTime) {
		this.mFRiskLevelDateTime = mFRiskLevelDateTime;
	}

	public List<DebitCardList> getDebitCardList() {
		return debitCardList;
	}

	public void setDebitCardList(List<DebitCardList> debitCardList) {
		this.debitCardList = debitCardList;
	}

	public String getmFRiskProfileExpiry() {
		return mFRiskProfileExpiry;
	}

	public void setmFRiskProfileExpiry(String mFRiskProfileExpiry) {
		this.mFRiskProfileExpiry = mFRiskProfileExpiry;
	}

	public String getmFRiskScore() {
		return mFRiskScore;
	}

	public void setmFRiskScore(String mFRiskScore) {
		this.mFRiskScore = mFRiskScore;
	}

	public String getmFTotalMarketPrice() {
		return mFTotalMarketPrice;
	}

	public void setmFTotalMarketPrice(String mFTotalMarketPrice) {
		this.mFTotalMarketPrice = mFTotalMarketPrice;
	}

	public String getmMID() {
		return mMID;
	}

	public void setmMID(String mMID) {
		this.mMID = mMID;
	}

	public String getMailEffDate() {
		return mailEffDate;
	}

	public void setMailEffDate(String mailEffDate) {
		this.mailEffDate = mailEffDate;
	}

	public String getMailEffectDate() {
		return mailEffectDate;
	}

	public void setMailEffectDate(String mailEffectDate) {
		this.mailEffectDate = mailEffectDate;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMaritalStatusDesc() {
		return maritalStatusDesc;
	}

	public void setMaritalStatusDesc(String maritalStatusDesc) {
		this.maritalStatusDesc = maritalStatusDesc;
	}

	public String getMfFormattedOpenDate() {
		return mfFormattedOpenDate;
	}

	public void setMfFormattedOpenDate(String mfFormattedOpenDate) {
		this.mfFormattedOpenDate = mfFormattedOpenDate;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getMotherMaidenName() {
		return motherMaidenName;
	}

	public void setMotherMaidenName(String motherMaidenName) {
		this.motherMaidenName = motherMaidenName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getNetWorth() {
		return netWorth;
	}

	public void setNetWorth(String netWorth) {
		this.netWorth = netWorth;
	}

	public String getNoCardstatus() {
		return noCardstatus;
	}

	public void setNoCardstatus(String noCardstatus) {
		this.noCardstatus = noCardstatus;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getOccupationDesc() {
		return occupationDesc;
	}

	public void setOccupationDesc(String occupationDesc) {
		this.occupationDesc = occupationDesc;
	}

	public int getOpstatusReadPartyLite() {
		return opstatusReadPartyLite;
	}

	public void setOpstatusReadPartyLite(int opstatusReadPartyLite) {
		this.opstatusReadPartyLite = opstatusReadPartyLite;
	}

	public int getOpstatusRetrievePartyProductsLite() {
		return opstatusRetrievePartyProductsLite;
	}

	public void setOpstatusRetrievePartyProductsLite(int opstatusRetrievePartyProductsLite) {
		this.opstatusRetrievePartyProductsLite = opstatusRetrievePartyProductsLite;
	}

	public int getOpstatusRetrieveVPIAccountDetails() {
		return opstatusRetrieveVPIAccountDetails;
	}

	public void setOpstatusRetrieveVPIAccountDetails(int opstatusRetrieveVPIAccountDetails) {
		this.opstatusRetrieveVPIAccountDetails = opstatusRetrieveVPIAccountDetails;
	}

	public String getpAN() {
		return pAN;
	}

	public void setpAN(String pAN) {
		this.pAN = pAN;
	}

	public String getPanRetryCount() {
		return panRetryCount;
	}

	public void setPanRetryCount(String panRetryCount) {
		this.panRetryCount = panRetryCount;
	}

	public List<ProdInqRec> getPartyProductsFD() {
		return partyProductsFD;
	}

	public void setPartyProductsFD(List<ProdInqRec> partyProductsFD) {
		this.partyProductsFD = partyProductsFD;
	}

	public List<ProdInqRec> getPartyProductsSA() {
		return partyProductsSA;
	}

	public void setPartyProductsSA(List<ProdInqRec> partyProductsSA) {
		this.partyProductsSA = partyProductsSA;
	}

	public String getPhoneCtryCode() {
		return phoneCtryCode;
	}

	public void setPhoneCtryCode(String phoneCtryCode) {
		this.phoneCtryCode = phoneCtryCode;
	}

	public List<PhoneDetail> getPhoneDetails() {
		return phoneDetails;
	}

	public void setPhoneDetails(List<PhoneDetail> phoneDetails) {
		this.phoneDetails = phoneDetails;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPrefAddr() {
		return prefAddr;
	}

	public void setPrefAddr(String prefAddr) {
		this.prefAddr = prefAddr;
	}

	public List<ProdInqRec> getProdInqRec() {
		return prodInqRec;
	}

	public void setProdInqRec(List<ProdInqRec> prodInqRec) {
		this.prodInqRec = prodInqRec;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public String getResCity() {
		return resCity;
	}

	public void setResCity(String resCity) {
		this.resCity = resCity;
	}

	public String getSalaryRange() {
		return salaryRange;
	}

	public void setSalaryRange(String salaryRange) {
		this.salaryRange = salaryRange;
	}

	public String getSalaryRangeFrom() {
		return salaryRangeFrom;
	}

	public void setSalaryRangeFrom(String salaryRangeFrom) {
		this.salaryRangeFrom = salaryRangeFrom;
	}

	public String getSalaryRangeTo() {
		return salaryRangeTo;
	}

	public void setSalaryRangeTo(String salaryRangeTo) {
		this.salaryRangeTo = salaryRangeTo;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getSchemeTypeSA() {
		return schemeTypeSA;
	}

	public void setSchemeTypeSA(String schemeTypeSA) {
		this.schemeTypeSA = schemeTypeSA;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public String getTotalFDAmount() {
		return totalFDAmount;
	}

	public void setTotalFDAmount(String totalFDAmount) {
		this.totalFDAmount = totalFDAmount;
	}

	public String getIsVcardAvailable() {
		return isVcardAvailable;
	}

	public void setIsVcardAvailable(String isVcardAvailable) {
		this.isVcardAvailable = isVcardAvailable;
	}

	public String getVcardStatus() {
		return vcardStatus;
	}

	public void setVcardStatus(String vcardStatus) {
		this.vcardStatus = vcardStatus;
	}

	public String getVcardDebitNumber() {
		return vcardDebitNumber;
	}

	public void setVcardDebitNumber(String vcardDebitNumber) {
		this.vcardDebitNumber = vcardDebitNumber;
	}

	public String getSimSerialNumber() {
		return simSerialNumber;
	}

	public void setSimSerialNumber(String simSerialNumber) {
		this.simSerialNumber = simSerialNumber;
	}

	public String getUpiToken() {
		return upiToken;
	}

	public void setUpiToken(String upiToken) {
		this.upiToken = upiToken;
	}

	public String getUpiTokenType() {
		return upiTokenType;
	}

	public void setUpiTokenType(String upiTokenType) {
		this.upiTokenType = upiTokenType;
	}

	public String getKeyXML() {
		return keyXML;
	}

	public void setKeyXML(String keyXML) {
		this.keyXML = keyXML;
	}

	public Integer getOpstatusSTlogin() {
		return opstatusSTlogin;
	}

	public void setOpstatusSTlogin(Integer opstatusSTlogin) {
		this.opstatusSTlogin = opstatusSTlogin;
	}

	public String getTmsTokenStatus() {
		return tmsTokenStatus;
	}

	public void setTmsTokenStatus(String tmsTokenStatus) {
		this.tmsTokenStatus = tmsTokenStatus;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getIsPANGiven() {
		return isPANGiven;
	}

	public void setIsPANGiven(String isPANGiven) {
		this.isPANGiven = isPANGiven;
	}

	public Integer getOpstatusDashboardCompositeV2() {
		return opstatusDashboardCompositeV2;
	}

	public void setOpstatusDashboardCompositeV2(Integer opstatusDashboardCompositeV2) {
		this.opstatusDashboardCompositeV2 = opstatusDashboardCompositeV2;
	}

	public String getDeviceSoftTokenState() {
		return deviceSoftTokenState;
	}

	public void setDeviceSoftTokenState(String deviceSoftTokenState) {
		this.deviceSoftTokenState = deviceSoftTokenState;
	}

	public String getHasLinkedAccounts() {
		return hasLinkedAccounts;
	}

	public void setHasLinkedAccounts(String hasLinkedAccounts) {
		this.hasLinkedAccounts = hasLinkedAccounts;
	}

	public String getCoolOffServicesSet() {
		return coolOffServicesSet;
	}

	public void setCoolOffServicesSet(String coolOffServicesSet) {
		this.coolOffServicesSet = coolOffServicesSet;
	}

	public Integer getOpstatusIsUPIrebindingrequired() {
		return opstatusIsUPIrebindingrequired;
	}

	public void setOpstatusIsUPIrebindingrequired(Integer opstatusIsUPIrebindingrequired) {
		this.opstatusIsUPIrebindingrequired = opstatusIsUPIrebindingrequired;
	}

	public String getIsFirstTimeLoginAfterFullAccConversion() {
		return isFirstTimeLoginAfterFullAccConversion;
	}

	public void setIsFirstTimeLoginAfterFullAccConversion(String isFirstTimeLoginAfterFullAccConversion) {
		this.isFirstTimeLoginAfterFullAccConversion = isFirstTimeLoginAfterFullAccConversion;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public Integer getVpiCount() {
		return vpiCount;
	}

	public void setVpiCount(Integer vpiCount) {
		this.vpiCount = vpiCount;
	}

	public String getTimeToCallRetrieveDepositAccountBal() {
		return timeToCallRetrieveDepositAccountBal;
	}

	public void setTimeToCallRetrieveDepositAccountBal(String timeToCallRetrieveDepositAccountBal) {
		this.timeToCallRetrieveDepositAccountBal = timeToCallRetrieveDepositAccountBal;
	}

	public String getErrmsgRetrievePartyProductsLite() {
		return errmsgRetrievePartyProductsLite;
	}

	public void setErrmsgRetrievePartyProductsLite(String errmsgRetrievePartyProductsLite) {
		this.errmsgRetrievePartyProductsLite = errmsgRetrievePartyProductsLite;
	}

	public List<Prospect> getProspect() {
		return prospect;
	}

	public void setProspect(List<Prospect> prospect) {
		this.prospect = prospect;
	}

	public String getDoContinueHTTPSession() {
		return doContinueHTTPSession;
	}

	public void setDoContinueHTTPSession(String doContinueHTTPSession) {
		this.doContinueHTTPSession = doContinueHTTPSession;
	}

	public String getSimSubscriberId() {
		return simSubscriberId;
	}

	public void setSimSubscriberId(String simSubscriberId) {
		this.simSubscriberId = simSubscriberId;
	}

	public String getCoolOff() {
		return coolOff;
	}

	public void setCoolOff(String coolOff) {
		this.coolOff = coolOff;
	}

	public String getcIF() {
		return cIF;
	}

	public void setcIF(String cIF) {
		this.cIF = cIF;
	}

	public String getKasistoContext() {
		return kasistoContext;
	}

	public void setKasistoContext(String kasistoContext) {
		this.kasistoContext = kasistoContext;
	}

	public String getTokenAPIN() {
		return tokenAPIN;
	}

	public void setTokenAPIN(String tokenAPIN) {
		this.tokenAPIN = tokenAPIN;
	}

	public String getTokenFirmware() {
		return tokenFirmware;
	}

	public void setTokenFirmware(String tokenFirmware) {
		this.tokenFirmware = tokenFirmware;
	}

	public String getTokenSerialNo() {
		return tokenSerialNo;
	}

	public void setTokenSerialNo(String tokenSerialNo) {
		this.tokenSerialNo = tokenSerialNo;
	}

	public String getDefaultInsSumAmount() {
		return defaultInsSumAmount;
	}

	public void setDefaultInsSumAmount(String defaultInsSumAmount) {
		this.defaultInsSumAmount = defaultInsSumAmount;
	}

	public List<RetrieveVPIAccountDetailsResponse.BankAccount> getBankAccounts() {
		return bankAccounts;
	}

	public void setBankAccounts(List<RetrieveVPIAccountDetailsResponse.BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	public List<DigiSTLoginResponse.LoanAcctIdRec> getLoanAcctIdRec() {
		return loanAcctIdRec;
	}

	public void setLoanAcctIdRec(List<DigiSTLoginResponse.LoanAcctIdRec> loanAcctIdRec) {
		this.loanAcctIdRec = loanAcctIdRec;
	}

	public List<DigiSTLoginResponse.LoanAcctIdRec> getMortgageLoanAcctIdRec() {
		return mortgageLoanAcctIdRec;
	}

	public void setMortgageLoanAcctIdRec(List<DigiSTLoginResponse.LoanAcctIdRec> mortgageLoanAcctIdRec) {
		this.mortgageLoanAcctIdRec = mortgageLoanAcctIdRec;
	}

	public String isIAMUser() {
		return isIAMUser;
	}

	public void setIAMUser(String isIAMUser) {
		this.isIAMUser = isIAMUser;
	}

	public List<CasaProdInqRec> getPartyProductsCASA() {
		return partyProductsCASA;
	}

	public void setPartyProductsCASA(List<CasaProdInqRec> partyProductsCASA) {
		this.partyProductsCASA = partyProductsCASA;
	}

	public boolean isLoginFlow() {
		return isLoginFlow;
	}

	public void setLoginFlow(boolean isLoginFlow) {
		this.isLoginFlow = isLoginFlow;
	}

	public String getTotalCASAAmount() {
		return totalCASAAmount;
	}

	public void setTotalCASAAmount(String totalCASAAmount) {
		this.totalCASAAmount = totalCASAAmount;
	}

	public String getLcin() {
		return lcin;
	}

	public void setLcin(String lcin) {
		this.lcin = lcin;
	}

	public String getLoanCustType() {
		return loanCustType;
	}

	public void setLoanCustType(String loanCustType) {
		this.loanCustType = loanCustType;
	}

	public List<LoanDisbursement> getLoanDisbusementInfo() {
		return loanDisbusementInfo;
	}

	public void setLoanDisbusementInfo(List<LoanDisbursement> loanDisbusementInfo) {
		this.loanDisbusementInfo = loanDisbusementInfo;
	}

	public String getDigiInvestmentId() {
		return digiInvestmentId;
	}

	public void setDigiInvestmentId(String digiInvestmentId) {
		this.digiInvestmentId = digiInvestmentId;
	}

	public String getDigiInvestAssetType() {
		return digiInvestAssetType;
	}

	public void setDigiInvestAssetType(String digiInvestAssetType) {
		this.digiInvestAssetType = digiInvestAssetType;
	}

	public String getHasMFInvestments() {
		return hasMFInvestments;
	}

	public void setHasMFInvestments(String hasMFInvestments) {
		this.hasMFInvestments = hasMFInvestments;
	}

	public boolean isDisableInsuranceFlag() {
		return disableInsuranceFlag;
	}

	public void setDisableInsuranceFlag(boolean disableInsuranceFlag) {
		this.disableInsuranceFlag = disableInsuranceFlag;
	}

	public List<InsInvestmentDetails> getInsInvestmentDetails() {
		return insuInvestmentDetails;
	}

	public void setInsInvestmentDetails(List<InsInvestmentDetails> insuInvestmentDetails) {
		this.insuInvestmentDetails = insuInvestmentDetails;
	}

	public String getPanName() {
		return panName;
	}

	public void setPanName(String panName) {
		this.panName = panName;
	}

	public List<InvestmentDetail> getInvestmentDetails() {
		return investmentDetails;
	}

	public void setInvestmentDetails(List<InvestmentDetail> investmentDetails) {
		this.investmentDetails = investmentDetails;
	}

	public List<LoanOfferDetail> getLoanOfferDetails() {
		return mLoanOfferDetails;
	}

	public void setLoanOfferDetails(List<LoanOfferDetail> loanOfferDetails) {
		mLoanOfferDetails = loanOfferDetails;
	}

	public String getEkycStatusType() {
		return ekycStatusType;
	}

	public void setEkycStatusType(String ekycStatusType) {
		this.ekycStatusType = ekycStatusType;
	}

	public String getEkycFreezeCount() {
		return ekycFreezeCount;
	}

	public void setEkycFreezeCount(String ekycFreezeCount) {
		this.ekycFreezeCount = ekycFreezeCount;
	}

	public boolean isUniversalAddressRemediationRequired() {
		return isUniversalAddressRemediationRequired;
	}

	public void setUniversalAddressRemediationRequired(boolean universalAddressRemediationRequired) {
		isUniversalAddressRemediationRequired = universalAddressRemediationRequired;
	}

	public static class PhoneDetail implements Serializable {

		@UserPIIdata
		private String phoneAreaCode;

		@UserPIIdata
		private String phoneCountryCode;

		@UserPIIdata
		private String phoneInternalID;

		private String phoneNumber;

		@UserPIIdata
		private String phoneType;

		@UserPIIdata
		private String preferedPhone;

		public PhoneDetail() {
			// default
		}

		public String getPhoneAreaCode() {
			return phoneAreaCode;
		}

		public void setPhoneAreaCode(String phoneAreaCode) {
			this.phoneAreaCode = phoneAreaCode;
		}

		public String getPhoneCountryCode() {
			return phoneCountryCode;
		}

		public void setPhoneCountryCode(String phoneCountryCode) {
			this.phoneCountryCode = phoneCountryCode;
		}

		public String getPhoneInternalID() {
			return phoneInternalID;
		}

		public void setPhoneInternalID(String phoneInternalID) {
			this.phoneInternalID = phoneInternalID;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getPhoneType() {
			return phoneType;
		}

		public void setPhoneType(String phoneType) {
			this.phoneType = phoneType;
		}

		public String getPreferedPhone() {
			return preferedPhone;
		}

		public void setPreferedPhone(String preferedPhone) {
			this.preferedPhone = preferedPhone;
		}

	}

	public static class EmailDetl implements Serializable {

		@UserPIIdata
		private String emailAddr;

		@SerializedName("EmailInternalId")
		private String emailInternalId;

		private String prefEmail;

		public EmailDetl() {
			// default
		}

		public String getEmailAddr() {
			return emailAddr;
		}

		public void setEmailAddr(String emailAddr) {
			this.emailAddr = emailAddr;
		}

		public String getEmailInternalId() {
			return emailInternalId;
		}

		public void setEmailInternalId(String emailInternalId) {
			this.emailInternalId = emailInternalId;
		}

		public String getPrefEmail() {
			return prefEmail;
		}

		public void setPrefEmail(String prefEmail) {
			this.prefEmail = prefEmail;
		}

	}

	public static class ProspectDetails implements Serializable {

		@SerializedName("ProspectType")
		private String prospectType;

		private String isCredentialsCreated;

		protected ProspectDetails() {

		}

		public String getProspectType() {
			return prospectType;
		}

		public void setProspectType(String prospectType) {
			this.prospectType = prospectType;
		}

		public String getIsCredentialsCreated() {
			return isCredentialsCreated;
		}

		public void setIsCredentialsCreated(String isCredentialsCreated) {
			this.isCredentialsCreated = isCredentialsCreated;
		}

	}

	public static class CustDocDetl implements Serializable {

		@SerializedName("DocType")
		private String docType;

		@SerializedName("VerifyStatus")
		private String verifyStatus;

		@SerializedName("MaxRetryReached")
		private String maxRetryReached;

		public CustDocDetl() {
			// default
		}

		public String getDocType() {
			return docType;
		}

		public void setDocType(String docType) {
			this.docType = docType;
		}

		public String getVerifyStatus() {
			return verifyStatus;
		}

		public void setVerifyStatus(String verifyStatus) {
			this.verifyStatus = verifyStatus;
		}

		public String getMaxRetryReached() {
			return maxRetryReached;
		}

		public void setMaxRetryReached(String maxRetryReached) {
			this.maxRetryReached = maxRetryReached;
		}

	}

	public static class INSProdList implements Serializable {

		@SerializedName("visibilityFlag")

		private String visibilityFlag;
		@SerializedName("ProdCode")

		private String prodCode;

		public INSProdList() {
			// default
		}

		public String getVisibilityFlag() {
			return visibilityFlag;
		}

		public void setVisibilityFlag(String visibilityFlag) {
			this.visibilityFlag = visibilityFlag;
		}

		public String getProdCode() {
			return prodCode;
		}

		public void setProdCode(String prodCode) {
			this.prodCode = prodCode;
		}

	}

	public static class CustDoc implements Serializable {

		@SerializedName("DocType")
		private String docType;

		@SerializedName("DocNum")
		private String docNum;

		@SerializedName("DocTypeDesc")
		private String docTypeDesc;

		@SerializedName("BirthDate")
		private String birthDate;

		private String primaryDoc;

		public CustDoc() {
			// default
		}

		public String getDocType() {
			return docType;
		}

		public void setDocType(String docType) {
			this.docType = docType;
		}

		public String getDocNum() {
			return docNum;
		}

		public void setDocNum(String docNum) {
			this.docNum = docNum;
		}

		public String getDocTypeDesc() {
			return docTypeDesc;
		}

		public void setDocTypeDesc(String docTypeDesc) {
			this.docTypeDesc = docTypeDesc;
		}

		public String getPrimaryDoc() {
			return primaryDoc;
		}

		public void setPrimaryDoc(String primaryDoc) {
			this.primaryDoc = primaryDoc;
		}

		public String getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}

	}

	public static class StoreDet implements Serializable {

		@SerializedName("StoreAddr")
		private String storeAddr;

		@SerializedName("StoreName")
		private String storeName;

		public StoreDet() {
			// default
		}

		public String getStoreAddr() {
			return storeAddr;
		}

		public void setStoreAddr(String storeAddr) {
			this.storeAddr = storeAddr;
		}

		public String getStoreName() {
			return storeName;
		}

		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}
	}

	public static class CustAddr implements Serializable {

		@UserPIIdata
		private String addrInternalId;
		
		@UserPIIdata
		private String addrLine;

		@UserPIIdata
		private String city;

		@UserPIIdata
		private String country;

		@UserPIIdata
		private String mailEffectDate;

		@UserPIIdata
		private String postalCode;

		@UserPIIdata
		private String prefAddr;

		@UserPIIdata
		private String state;

		// added for viewprofile api response BEGIN.
		@UserPIIdata
		@SerializedName("AddnlAddr")
		private String addnlAddr;

		@UserPIIdata
		@SerializedName("District")
		private String district;

		@UserPIIdata
		@SerializedName("Estate")
		private String estate;

		// added for viewprofile api response END.
		@UserPIIdata
		private String addressLine1;

		@UserPIIdata
		private String addressLine2;

		@UserPIIdata
		private String addressLine3;

		public CustAddr() {
			// default
		}

		public String getAddrInternalId() {
			return addrInternalId;
		}

		public void setAddrInternalId(String addrInternalId) {
			this.addrInternalId = addrInternalId;
		}

		public String getAddrLine() {
			return addrLine;
		}

		public void setAddrLine(String addrLine) {
			this.addrLine = addrLine;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getMailEffectDate() {
			return mailEffectDate;
		}

		public void setMailEffectDate(String mailEffectDate) {
			this.mailEffectDate = mailEffectDate;
		}

		public String getPostalCode() {
			return postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		public String getPrefAddr() {
			return prefAddr;
		}

		public void setPrefAddr(String prefAddr) {
			this.prefAddr = prefAddr;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getAddnlAddr() {
			return addnlAddr;
		}

		public void setAddnlAddr(String addnlAddr) {
			this.addnlAddr = addnlAddr;
		}

		public String getDistrict() {
			return district;
		}

		public void setDistrict(String district) {
			this.district = district;
		}

		public String getEstate() {
			return estate;
		}

		public void setEstate(String estate) {
			this.estate = estate;
		}

		public String getAddressLine1() {
			return addressLine1;
		}

		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}

		public String getAddressLine2() {
			return addressLine2;
		}

		public void setAddressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
		}

		public String getAddressLine3() {
			return addressLine3;
		}

		public void setAddressLine3(String addressLine3) {
			this.addressLine3 = addressLine3;
		}
	}

	public static class CardInqRec implements Serializable {

		@UserPIIdata
		private String cardExpiryDate;

		@UserPIIdata
		private String cardProdType;

		@UserPIIdata
		private String cardStatus;

		@UserPIIdata
		private String cardType;

		private String drCardNumber;

		public CardInqRec() {
			// default
		}

		public String getCardExpiryDate() {
			return cardExpiryDate;
		}

		public void setCardExpiryDate(String cardExpiryDate) {
			this.cardExpiryDate = cardExpiryDate;
		}

		public String getCardProdType() {
			return cardProdType;
		}

		public void setCardProdType(String cardProdType) {
			this.cardProdType = cardProdType;
		}

		public String getCardStatus() {
			return cardStatus;
		}

		public void setCardStatus(String cardStatus) {
			this.cardStatus = cardStatus;
		}

		public String getCardType() {
			return cardType;
		}

		public void setCardType(String cardType) {
			this.cardType = cardType;
		}

		public String getDrCardNumber() {
			return drCardNumber;
		}

		public void setDrCardNumber(String drCardNumber) {
			this.drCardNumber = drCardNumber;
		}

	}

	public static class Prospect implements Serializable {

		private String isDCrequested;

		@SerializedName("PINCode")
		private String pINCode;

		private String prospectCampaignID;

		@SerializedName("ConversionStatus")
		private String conversionStatus;

		@SerializedName("ConversionType")
		private String conversionType;

		@SerializedName("StoreDet")
		private List<StoreDet> storeDet;

		@SerializedName("ProspectDtl")
		private List<ProspectDetails> prospectDetails;

		@SerializedName("channelName")
		private String channelName;

		public Prospect() {
			// default
		}

		public String getIsDCrequested() {
			return isDCrequested;
		}

		public void setIsDCrequested(String isDCrequested) {
			this.isDCrequested = isDCrequested;
		}

		public String getpINCode() {
			return pINCode;
		}

		public void setpINCode(String pINCode) {
			this.pINCode = pINCode;
		}

		public String getProspectCampaignID() {
			return prospectCampaignID;
		}

		public void setProspectCampaignID(String prospectCampaignID) {
			this.prospectCampaignID = prospectCampaignID;
		}

		public String getConversionStatus() {
			return conversionStatus;
		}

		public void setConversionStatus(String conversionStatus) {
			this.conversionStatus = conversionStatus;
		}

		public String getConversionType() {
			return conversionType;
		}

		public void setConversionType(String conversionType) {
			this.conversionType = conversionType;
		}

		public List<StoreDet> getStoreDet() {
			return storeDet;
		}

		public void setStoreDet(List<StoreDet> storeDet) {
			this.storeDet = storeDet;
		}

		public String getChannelName() {
			return channelName;
		}

		public void setChannelName(String channelName) {
			this.channelName = channelName;
		}

		public List<ProspectDetails> getProspectDetails() {
			return prospectDetails;
		}

		public void setProspectDetails(List<ProspectDetails> prospectDetails) {
			this.prospectDetails = prospectDetails;
		}

	}

	public static class FDRDImage {

		public FDRDImage() {
			// default
		}
	}

	public static class ProdInqRec implements Serializable {

		private String accountStatus;

		private String acctCurrency;

		private String acctID;

		private int acctIdIndex;

		private String acctName;

		private String acctNickName;

		private String accumulatedInvAmount;

		private String accumulatedInvAmountCurrency;

		private String accumulatedInvAmountFormatted;

		private String availBalAmount;

		private String availBalAmountFormated;

		private String availBalCurrency;

		@SerializedName("BalAsOfDateTime")
		private String balAsOfDateTime;

		private String bankID;

		@SerializedName("ImageID")
		private String imageID;

		private String ledgerBalance;

		@SerializedName("MMID")
		private String mMID;

		@UserPIIdata
		private String openDate;

		private String openDateFormatted;

		private String payBankId;

		private String principalAmount;

		private String principalAmountCurrency;

		private String principalAmountFormatted;

		private String productType;

		private String schemeType;

		private String virtualPayId;

		private String campaignId;

		// These are needed for the FD Accounts

		private String maturityAmount;

		private String maturityAmountFormatted;

		private String maturityDatePercentage;

		private String maturityDate;

		private String maturityAmountCurrency;

		private String interestRate;

		private String docContent;

		private String maturityDateFormatted;

		private String depositImage;

		@UserPIIdata
		private String acctIDOriginal;

		private int conversionLSADate;

		private String ewalletExpiryDate;

		private String vcardDebitNumber;

		private String isVcardAvailable;

		private String vcardStatus;

		@SerializedName("AcctSignal")
		private String acctSignal;

		private String depositType;

		private String header;

		@SerializedName("goalType")
		private String goalType;

		public String getGoalType() {
			return goalType;
		}

		public void setGoalType(String goalType) {
			this.goalType = goalType;
		}

		public String getHeader() {
			return header;
		}

		public void setHeader(String header) {
			this.header = header;
		}

		public ProdInqRec() {
			// default
		}

		public String getAcctIDOriginal() {
			return acctIDOriginal;
		}

		public void setAcctIDOriginal(String acctIDOriginal) {
			this.acctIDOriginal = acctIDOriginal;
		}

		public String getAcctSignal() {
			return acctSignal;
		}

		public void setAcctSignal(String acctSignal) {
			this.acctSignal = acctSignal;
		}

		public String getAccountStatus() {
			return accountStatus;
		}

		public void setAccountStatus(String accountStatus) {
			this.accountStatus = accountStatus;
		}

		public String getAcctCurrency() {
			return acctCurrency;
		}

		public void setAcctCurrency(String acctCurrency) {
			this.acctCurrency = acctCurrency;
		}

		public String getAcctID() {
			return acctID;
		}

		public void setAcctID(String acctID) {
			this.acctID = acctID;
		}

		public int getAcctIdIndex() {
			return acctIdIndex;
		}

		public void setAcctIdIndex(int acctIdIndex) {
			this.acctIdIndex = acctIdIndex;
		}

		public String getAcctName() {
			return acctName;
		}

		public void setAcctName(String acctName) {
			this.acctName = acctName;
		}

		public String getAcctNickName() {
			return acctNickName;
		}

		public void setAcctNickName(String acctNickName) {
			this.acctNickName = acctNickName;
		}

		public String getAccumulatedInvAmount() {
			return accumulatedInvAmount;
		}

		public void setAccumulatedInvAmount(String accumulatedInvAmount) {
			this.accumulatedInvAmount = accumulatedInvAmount;
		}

		public String getAccumulatedInvAmountCurrency() {
			return accumulatedInvAmountCurrency;
		}

		public void setAccumulatedInvAmountCurrency(String accumulatedInvAmountCurrency) {
			this.accumulatedInvAmountCurrency = accumulatedInvAmountCurrency;
		}

		public String getAccumulatedInvAmountFormatted() {
			return accumulatedInvAmountFormatted;
		}

		public void setAccumulatedInvAmountFormatted(String accumulatedInvAmountFormatted) {
			this.accumulatedInvAmountFormatted = accumulatedInvAmountFormatted;
		}

		public String getAvailBalAmount() {
			return availBalAmount;
		}

		public void setAvailBalAmount(String availBalAmount) {
			this.availBalAmount = availBalAmount;
		}

		public String getAvailBalAmountFormated() {
			return availBalAmountFormated;
		}

		public void setAvailBalAmountFormated(String availBalAmountFormated) {
			this.availBalAmountFormated = availBalAmountFormated;
		}

		public String getAvailBalCurrency() {
			return availBalCurrency;
		}

		public void setAvailBalCurrency(String availBalCurrency) {
			this.availBalCurrency = availBalCurrency;
		}

		public String getBalAsOfDateTime() {
			return balAsOfDateTime;
		}

		public void setBalAsOfDateTime(String balAsOfDateTime) {
			this.balAsOfDateTime = balAsOfDateTime;
		}

		public String getBankID() {
			return bankID;
		}

		public void setBankID(String bankID) {
			this.bankID = bankID;
		}

		public String getImageID() {
			return imageID;
		}

		public void setImageID(String imageID) {
			this.imageID = imageID;
		}

		public String getLedgerBalance() {
			return ledgerBalance;
		}

		public void setLedgerBalance(String ledgerBalance) {
			this.ledgerBalance = ledgerBalance;
		}

		public String getmMID() {
			return mMID;
		}

		public void setmMID(String mMID) {
			this.mMID = mMID;
		}

		public String getOpenDate() {
			return openDate;
		}

		public void setOpenDate(String openDate) {
			this.openDate = openDate;
		}

		public String getOpenDateFormatted() {
			return openDateFormatted;
		}

		public void setOpenDateFormatted(String openDateFormatted) {
			this.openDateFormatted = openDateFormatted;
		}

		public String getPayBankId() {
			return payBankId;
		}

		public void setPayBankId(String payBankId) {
			this.payBankId = payBankId;
		}

		public String getPrincipalAmount() {
			return principalAmount;
		}

		public void setPrincipalAmount(String principalAmount) {
			this.principalAmount = principalAmount;
		}

		public String getEwalletExpiryDate() {
			return ewalletExpiryDate;
		}

		public void setEwalletExpiryDate(String ewalletExpiryDate) {
			this.ewalletExpiryDate = ewalletExpiryDate;
		}

		public String getPrincipalAmountCurrency() {
			return principalAmountCurrency;
		}

		public void setPrincipalAmountCurrency(String principalAmountCurrency) {
			this.principalAmountCurrency = principalAmountCurrency;
		}

		public String getPrincipalAmountFormatted() {
			return principalAmountFormatted;
		}

		public void setPrincipalAmountFormatted(String principalAmountFormatted) {
			this.principalAmountFormatted = principalAmountFormatted;
		}

		public String getProductType() {
			return productType;
		}

		public void setProductType(String productType) {
			this.productType = productType;
		}

		public String getSchemeType() {
			return schemeType;
		}

		public void setSchemeType(String schemeType) {
			this.schemeType = schemeType;
		}

		public String getVirtualPayId() {
			return virtualPayId;
		}

		public void setVirtualPayId(String virtualPayId) {
			this.virtualPayId = virtualPayId;
		}

		public String getCampaignId() {
			return campaignId;
		}

		public void setCampaignId(String campaignId) {
			this.campaignId = campaignId;
		}

		public String getMaturityAmount() {
			return maturityAmount;
		}

		public void setMaturityAmount(String maturityAmount) {
			this.maturityAmount = maturityAmount;
		}

		public String getMaturityAmountFormatted() {
			return maturityAmountFormatted;
		}

		public void setMaturityAmountFormatted(String maturityAmountFormatted) {
			this.maturityAmountFormatted = maturityAmountFormatted;
		}

		public String getMaturityDatePercentage() {
			return maturityDatePercentage;
		}

		public void setMaturityDatePercentage(String maturityDatePercentage) {
			this.maturityDatePercentage = maturityDatePercentage;
		}

		public String getMaturityDate() {
			return maturityDate;
		}

		public void setMaturityDate(String maturityDate) {
			this.maturityDate = maturityDate;
		}

		public String getMaturityAmountCurrency() {
			return maturityAmountCurrency;
		}

		public void setMaturityAmountCurrency(String maturityAmountCurrency) {
			this.maturityAmountCurrency = maturityAmountCurrency;
		}

		public String getInterestRate() {
			return interestRate;
		}

		public void setInterestRate(String interestRate) {
			this.interestRate = interestRate;
		}

		public String getDocContent() {
			return docContent;
		}

		public void setDocContent(String docContent) {
			this.docContent = docContent;
		}

		public String getMaturityDateFormatted() {
			return maturityDateFormatted;
		}

		public void setMaturityDateFormatted(String maturityDateFormatted) {
			this.maturityDateFormatted = maturityDateFormatted;
		}

		public String getDepositImage() {
			return depositImage;
		}

		public void setDepositImage(String depositImage) {
			this.depositImage = depositImage;
		}

		public int getConversionLSADate() {
			return conversionLSADate;
		}

		public void setConversionLSADate(int conversionLSADate) {
			this.conversionLSADate = conversionLSADate;
		}

		public String getVcardDebitNumber() {
			return vcardDebitNumber;
		}

		public void setVcardDebitNumber(String vcardDebitNumber) {
			this.vcardDebitNumber = vcardDebitNumber;
		}

		public String getIsVcardAvailable() {
			return isVcardAvailable;
		}

		public void setIsVcardAvailable(String isVcardAvailable) {
			this.isVcardAvailable = isVcardAvailable;
		}

		public String getVcardStatus() {
			return vcardStatus;
		}

		public void setVcardStatus(String vcardStatus) {
			this.vcardStatus = vcardStatus;
		}

		public String getDepositType() {
			return depositType;
		}

		public void setDepositType(String depositType) {
			this.depositType = depositType;
		}
	}

	public static class CasaProdInqRec extends ProdInqRec {

		private String accDescrInApp;

		private String drCardNumber;

		private String drMaskedCardNumber;

		private String cardStatus;

		private String cardProdType;

		private String cardType;

		private String cardExpiryDate;

		public String getAccDescrInApp() {
			return accDescrInApp;
		}

		public void setAccDescrInApp(String accDescrInApp) {
			this.accDescrInApp = accDescrInApp;
		}

		public String getDrCardNumber() {
			return drCardNumber;
		}

		public void setDrCardNumber(String drCardNumber) {
			this.drCardNumber = drCardNumber;
		}

		public String getDrMaskedCardNumber() {
			return drMaskedCardNumber;
		}

		public void setDrMaskedCardNumber(String drMaskedCardNumber) {
			this.drMaskedCardNumber = drMaskedCardNumber;
		}

		public String getCardStatus() {
			return cardStatus;
		}

		public void setCardStatus(String cardStatus) {
			this.cardStatus = cardStatus;
		}

		public String getCardProdType() {
			return cardProdType;
		}

		public void setCardProdType(String cardProdType) {
			this.cardProdType = cardProdType;
		}

		public String getCardType() {
			return cardType;
		}

		public void setCardType(String cardType) {
			this.cardType = cardType;
		}

		public String getCardExpiryDate() {
			return cardExpiryDate;
		}

		public void setCardExpiryDate(String cardExpiryDate) {
			this.cardExpiryDate = cardExpiryDate;
		}
	}

	public static class InvestmentDetail implements Serializable {

		private String mfAvailFundUnits;

		@UserPIIdata
		private String mfFolioNum;

		private String mfFullName;

		private String mfFundCode;

		private String mfFundCur;

		private String mfFundHouseID;

		private String mfFundName;

		private String mfFundPurchaseDate;

		private String mfMarketPrice;

		private String mfMarketPriceCur;

		private String mfProfitLossValue;

		private String mfProfitLossValueCur;

		public InvestmentDetail() {
			// default
		}

		public String getMfAvailFundUnits() {
			return mfAvailFundUnits;
		}

		public void setMfAvailFundUnits(String mfAvailFundUnits) {
			this.mfAvailFundUnits = mfAvailFundUnits;
		}

		public String getMfFolioNum() {
			return mfFolioNum;
		}

		public void setMfFolioNum(String mfFolioNum) {
			this.mfFolioNum = mfFolioNum;
		}

		public String getMfFullName() {
			return mfFullName;
		}

		public void setMfFullName(String mfFullName) {
			this.mfFullName = mfFullName;
		}

		public String getMfFundCode() {
			return mfFundCode;
		}

		public void setMfFundCode(String mfFundCode) {
			this.mfFundCode = mfFundCode;
		}

		public String getMfFundCur() {
			return mfFundCur;
		}

		public void setMfFundCur(String mfFundCur) {
			this.mfFundCur = mfFundCur;
		}

		public String getMfFundHouseID() {
			return mfFundHouseID;
		}

		public void setMfFundHouseID(String mfFundHouseID) {
			this.mfFundHouseID = mfFundHouseID;
		}

		public String getMfFundName() {
			return mfFundName;
		}

		public void setMfFundName(String mfFundName) {
			this.mfFundName = mfFundName;
		}

		public String getMfFundPurchaseDate() {
			return mfFundPurchaseDate;
		}

		public void setMfFundPurchaseDate(String mfFundPurchaseDate) {
			this.mfFundPurchaseDate = mfFundPurchaseDate;
		}

		public String getMfMarketPrice() {
			return mfMarketPrice;
		}

		public void setMfMarketPrice(String mfMarketPrice) {
			this.mfMarketPrice = mfMarketPrice;
		}

		public String getMfMarketPriceCur() {
			return mfMarketPriceCur;
		}

		public void setMfMarketPriceCur(String mfMarketPriceCur) {
			this.mfMarketPriceCur = mfMarketPriceCur;
		}

		public String getMfProfitLossValue() {
			return mfProfitLossValue;
		}

		public void setMfProfitLossValue(String mfProfitLossValue) {
			this.mfProfitLossValue = mfProfitLossValue;
		}

		public String getMfProfitLossValueCur() {
			return mfProfitLossValueCur;
		}

		public void setMfProfitLossValueCur(String mfProfitLossValueCur) {
			this.mfProfitLossValueCur = mfProfitLossValueCur;
		}

	}

	public static class LoanOfferDetail implements Serializable {

		@SerializedName("IsHigherLoanEligible")
		private String mIsHigherLoanEligible;

		@SerializedName("IsSmallLoanEligible")
		private String mIsSmallLoanEligible;

		@SerializedName("LoanOfferApplicationID")
		private String mLoanOfferApplicationID;

		@SerializedName("LoanOfferApplicationId")
		private String mLoanOfferAppId;

		@SerializedName("LoanOfferMaxLimit")
		private String mLoanOfferMaxLimit;

		@SerializedName("LoanOfferMinLimit")
		private String mLoanOfferMinLimit;

		@SerializedName("LoanOfferType")
		private String mLoanOfferType;

		public LoanOfferDetail() {
			// default
		}

		public String getmIsHigherLoanEligible() {
			return mIsHigherLoanEligible;
		}

		public void setmIsHigherLoanEligible(String mIsHigherLoanEligible) {
			this.mIsHigherLoanEligible = mIsHigherLoanEligible;
		}

		public String getmIsSmallLoanEligible() {
			return mIsSmallLoanEligible;
		}

		public void setmIsSmallLoanEligible(String mIsSmallLoanEligible) {
			this.mIsSmallLoanEligible = mIsSmallLoanEligible;
		}

		public String getmLoanOfferApplicationID() {
			return mLoanOfferApplicationID;
		}

		public void setmLoanOfferApplicationID(String mLoanOfferApplicationID) {
			this.mLoanOfferApplicationID = mLoanOfferApplicationID;
		}

		public String getmLoanOfferAppId() {
			return mLoanOfferAppId;
		}

		public void setmLoanOfferAppId(String mLoanOfferAppId) {
			this.mLoanOfferAppId = mLoanOfferAppId;
		}

		public String getmLoanOfferMaxLimit() {
			return mLoanOfferMaxLimit;
		}

		public void setmLoanOfferMaxLimit(String mLoanOfferMaxLimit) {
			this.mLoanOfferMaxLimit = mLoanOfferMaxLimit;
		}

		public String getmLoanOfferMinLimit() {
			return mLoanOfferMinLimit;
		}

		public void setmLoanOfferMinLimit(String mLoanOfferMinLimit) {
			this.mLoanOfferMinLimit = mLoanOfferMinLimit;
		}

		public String getmLoanOfferType() {
			return mLoanOfferType;
		}

		public void setmLoanOfferType(String mLoanOfferType) {
			this.mLoanOfferType = mLoanOfferType;
		}
	}

	public static class LoanAcctIdRec implements Serializable {

		public LoanAcctIdRec() {
			// default
		}

		private String accDescrInApp;

		private String loanAcctId;

		private String loanActivatedAmt;

		private String loanIntRate;

		private String loanOutstdgPrincipalAmt;

		private String loanProdType;

		private String loanStatus;

		private String loanSchemeType;

		@SerializedName("AcctType")
		private String acctType;

		private boolean isHeader;

		private String headerName;

		private String loanType;

		private boolean lastItem;

		public boolean isLastItem() {
			return lastItem;
		}

		public void setLastItem(boolean lastItem) {
			this.lastItem = lastItem;
		}

		public String getLoanSchemeType() {
			return loanSchemeType;
		}

		public void setLoanSchemeType(String loanSchemeType) {
			this.loanSchemeType = loanSchemeType;
		}

		public boolean isHeader() {
			return isHeader;
		}

		public void setHeader(boolean header) {
			isHeader = header;
		}

		public String getHeaderName() {
			return headerName;
		}

		public void setHeaderName(String headerName) {
			this.headerName = headerName;
		}

		public String getLoanType() {
			return loanType;
		}

		public void setLoanType(String loanType) {
			this.loanType = loanType;
		}

		public String getAccDescrInApp() {
			return accDescrInApp;
		}

		public void setAccDescrInApp(String accDescrInApp) {
			this.accDescrInApp = accDescrInApp;
		}

		public String getAcctType() {
			return acctType;
		}

		public void setAcctType(String acctType) {
			this.acctType = acctType;
		}

		public String getLoanAcctId() {
			return loanAcctId;
		}

		public void setLoanAcctId(String loanAcctId) {
			this.loanAcctId = loanAcctId;
		}

		public String getLoanActivatedAmt() {
			return loanActivatedAmt;
		}

		public void setLoanActivatedAmt(String loanActivatedAmt) {
			this.loanActivatedAmt = loanActivatedAmt;
		}

		public String getLoanIntRate() {
			return loanIntRate;
		}

		public void setLoanIntRate(String loanIntRate) {
			this.loanIntRate = loanIntRate;
		}

		public String getLoanOutstdgPrincipalAmt() {
			return loanOutstdgPrincipalAmt;
		}

		public void setLoanOutstdgPrincipalAmt(String loanOutstdgPrincipalAmt) {
			this.loanOutstdgPrincipalAmt = loanOutstdgPrincipalAmt;
		}

		public String getLoanProdType() {
			return loanProdType;
		}

		public void setLoanProdType(String loanProdType) {
			this.loanProdType = loanProdType;
		}

		public String getLoanStatus() {
			return loanStatus;
		}

		public void setLoanStatus(String loanStatus) {
			this.loanStatus = loanStatus;
		}

	}

	public static class DebitCardList implements Serializable {

		@SerializedName("cardProdType")
		private String cardProdType;

		@SerializedName("drCardNumber")
		private String drCardNumber;

		@SerializedName("cardAcctId")
		private String cardAcctId;

		@SerializedName("cardType")
		private String cardType;

		@SerializedName("cardStatus")
		private String cardStatus;

		@SerializedName("cardExpiryDate")
		private String cardExpiryDate;

		private String isVcardAvailable;

		private String vcardDebitNumber;

		private String vcardStatus;

		public DebitCardList() {

		}

		public String getCardProdType() {
			return cardProdType;
		}

		public void setCardProdType(String cardProdType) {
			this.cardProdType = cardProdType;
		}

		public String getDrCardNumber() {
			return drCardNumber;
		}

		public void setDrCardNumber(String drCardNumber) {
			this.drCardNumber = drCardNumber;
		}

		public String getCardAcctId() {
			return cardAcctId;
		}

		public void setCardAcctId(String cardAcctId) {
			this.cardAcctId = cardAcctId;
		}

		public String getCardType() {
			return cardType;
		}

		public void setCardType(String cardType) {
			this.cardType = cardType;
		}

		public String getCardStatus() {
			return cardStatus;
		}

		public void setCardStatus(String cardStatus) {
			this.cardStatus = cardStatus;
		}

		public String getCardExpiryDate() {
			return cardExpiryDate;
		}

		public void setCardExpiryDate(String cardExpiryDate) {
			this.cardExpiryDate = cardExpiryDate;
		}

		public String getIsVcardAvailable() {
			return isVcardAvailable;
		}

		public void setIsVcardAvailable(String isVcardAvailable) {
			this.isVcardAvailable = isVcardAvailable;
		}

		public String getVcardDebitNumber() {
			return vcardDebitNumber;
		}

		public void setVcardDebitNumber(String vcardDebitNumber) {
			this.vcardDebitNumber = vcardDebitNumber;
		}

		public String getVcardStatus() {
			return vcardStatus;
		}

		public void setVcardStatus(String vcardStatus) {
			this.vcardStatus = vcardStatus;
		}

	}

	public static class LoanDisbursement implements Serializable {

		@UserPIIdata
		@SerializedName("AcctId")
		private String acctId;

		@UserPIIdata
		private String formattedStdate;
		
		@UserPIIdata
		private String emiDeductOn;

		@UserPIIdata
		private String formattedEnddate;

		@UserPIIdata
		private String formattedDisbdate;

		@UserPIIdata
		private String loanAmount;

		@UserPIIdata
		private String tenure;

		@UserPIIdata
		private String processingFee;

		@UserPIIdata
		private String rateOfInterest;

		@UserPIIdata
		private String emiAmount;

		@UserPIIdata
		@SerializedName("taxamt")
		private String taxAmt;

		@UserPIIdata
		private String finalAmtRcvd;

		@UserPIIdata
		private String emiDuration;

		@UserPIIdata
		@SerializedName("CPVFlag")
		private String cpvFlag;

		@UserPIIdata
		@SerializedName("CardId")
		private String cardId;

		public String getAcctId() {
			return acctId;
		}

		public void setAcctId(String acctId) {
			this.acctId = acctId;
		}

		public String getFormattedStdate() {
			return formattedStdate;
		}

		public void setFormattedStdate(String formattedStdate) {
			this.formattedStdate = formattedStdate;
		}

		public String getEmiDeductOn() {
			return emiDeductOn;
		}

		public void setEmiDeductOn(String emiDeductOn) {
			this.emiDeductOn = emiDeductOn;
		}

		public String getFormattedEnddate() {
			return formattedEnddate;
		}

		public void setFormattedEnddate(String formattedEnddate) {
			this.formattedEnddate = formattedEnddate;
		}

		public String getFormattedDisbdate() {
			return formattedDisbdate;
		}

		public void setFormattedDisbdate(String formattedDisbdate) {
			this.formattedDisbdate = formattedDisbdate;
		}

		public String getLoanAmount() {
			return loanAmount;
		}

		public void setLoanAmount(String loanAmount) {
			this.loanAmount = loanAmount;
		}

		public String getTenure() {
			return tenure;
		}

		public void setTenure(String tenure) {
			this.tenure = tenure;
		}

		public String getProcessingFee() {
			return processingFee;
		}

		public void setProcessingFee(String processingFee) {
			this.processingFee = processingFee;
		}

		public String getRateOfInterest() {
			return rateOfInterest;
		}

		public void setRateOfInterest(String rateOfInterest) {
			this.rateOfInterest = rateOfInterest;
		}

		public String getEmiAmount() {
			return emiAmount;
		}

		public void setEmiAmount(String emiAmount) {
			this.emiAmount = emiAmount;
		}

		public String getTaxAmt() {
			return taxAmt;
		}

		public void setTaxAmt(String taxAmt) {
			this.taxAmt = taxAmt;
		}

		public String getFinalAmtRcvd() {
			return finalAmtRcvd;
		}

		public void setFinalAmtRcvd(String finalAmtRcvd) {
			this.finalAmtRcvd = finalAmtRcvd;
		}

		public String getEmiDuration() {
			return emiDuration;
		}

		public void setEmiDuration(String emiDuration) {
			this.emiDuration = emiDuration;
		}

		public String getCpvFlag() {
			return cpvFlag;
		}

		public void setCpvFlag(String cpvFlag) {
			this.cpvFlag = cpvFlag;
		}

		public String getCardId() {
			return cardId;
		}

		public void setCardId(String cardId) {
			this.cardId = cardId;
		}

	}

	public static class MessageParamData implements Serializable {

		private String fieldName;

		private String fieldValue;

		public String getFieldName() {
			return fieldName;
		}

		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getFieldValue() {
			return fieldValue;
		}

		public void setFieldValue(String fieldValue) {
			this.fieldValue = fieldValue;
		}
	}

	public class InsInvestmentDetails implements Serializable {

		private String insuTranRef;

		private String insuSumAssuredAmt;

		private String insuInsurerId;

		private String insuPolicyNum;

		private String insuProdType;

		private String insuEndDate;

		private String insuQuoteId;

		private String insuTotalPremPaidAmt;

		private String insuTranStatus;

		private String insuPolicyStatus;

		private String insuStartDate;

		private String insuProdCode;

		private String isCancelledInsurence;

		private String gracePeriod;

		private String prevPolicyNum;

		private String restBenFlag;

		private String insuRenewStatus;

		private String displayHeader;

		public InsInvestmentDetails() {
			// default
		}

		public String getInsuTranRef() {
			return insuTranRef;
		}

		public void setInsuTranRef(String insuTranRef) {
			this.insuTranRef = insuTranRef;
		}

		public String getInsuSumAssuredAmt() {
			return insuSumAssuredAmt;
		}

		public void setInsuSumAssuredAmt(String insuSumAssuredAmt) {
			this.insuSumAssuredAmt = insuSumAssuredAmt;
		}

		public String getInsuInsurerId() {
			return insuInsurerId;
		}

		public void setInsuInsurerId(String insuInsurerId) {
			this.insuInsurerId = insuInsurerId;
		}

		public String getInsuPolicyNum() {
			return insuPolicyNum;
		}

		public void setInsuPolicyNum(String insuPolicyNum) {
			this.insuPolicyNum = insuPolicyNum;
		}

		public String getInsuProdType() {
			return insuProdType;
		}

		public void setInsuProdType(String insuProdType) {
			this.insuProdType = insuProdType;
		}

		public String getInsuEndDate() {
			return insuEndDate;
		}

		public void setInsuEndDate(String insuEndDate) {
			this.insuEndDate = insuEndDate;
		}

		public String getInsuQuoteId() {
			return insuQuoteId;
		}

		public void setInsuQuoteId(String insuQuoteId) {
			this.insuQuoteId = insuQuoteId;
		}

		public String getInsuTotalPremPaidAmt() {
			return insuTotalPremPaidAmt;
		}

		public void setInsuTotalPremPaidAmt(String insuTotalPremPaidAmt) {
			this.insuTotalPremPaidAmt = insuTotalPremPaidAmt;
		}

		public String getInsuTranStatus() {
			return insuTranStatus;
		}

		public void setInsuTranStatus(String insuTranStatus) {
			this.insuTranStatus = insuTranStatus;
		}

		public String getInsuPolicyStatus() {
			return insuPolicyStatus;
		}

		public void setInsuPolicyStatus(String insuPolicyStatus) {
			this.insuPolicyStatus = insuPolicyStatus;
		}

		public String getInsuStartDate() {
			return insuStartDate;
		}

		public void setInsuStartDate(String insuStartDate) {
			this.insuStartDate = insuStartDate;
		}

		public String getInsuProdCode() {
			return insuProdCode;
		}

		public void setInsuProdCode(String insuProdCode) {
			this.insuProdCode = insuProdCode;
		}

		public String getIsCancelledInsurence() {
			return isCancelledInsurence;
		}

		public void setIsCancelledInsurence(String isCancelledInsurence) {
			this.isCancelledInsurence = isCancelledInsurence;
		}

		public String getGracePeriod() {
			return gracePeriod;
		}

		public void setGracePeriod(String gracePeriod) {
			this.gracePeriod = gracePeriod;
		}

		public String getPrevPolicyNum() {
			return prevPolicyNum;
		}

		public void setPrevPolicyNum(String prevPolicyNum) {
			this.prevPolicyNum = prevPolicyNum;
		}

		public String getRestBenFlag() {
			return restBenFlag;
		}

		public void setRestBenFlag(String restBenFlag) {
			this.restBenFlag = restBenFlag;
		}

		public String getDisplayHeader() {
			return displayHeader;
		}

		public void setDisplayHeader(String displayHeader) {
			this.displayHeader = displayHeader;
		}

		public String getInsuRenewStatus() {
			return insuRenewStatus;
		}

		public void setInsuRenewStatus(String insuRenewStatus) {
			this.insuRenewStatus = insuRenewStatus;
		}
	}

	public static class RetrieveVPIAccountDetailsResponse implements Serializable {

		private List<BankAccount> bankAccounts;

		public RetrieveVPIAccountDetailsResponse() {

		}

		public static class BankAccount implements Serializable {

			private String accountIndex;

			@SerializedName("AcctHolderName")
			private String acctHolderName;

			@SerializedName("AcctId")
			private String acctId;

			@SerializedName("BankName")
			private String bankName;

			private String displayText;

			@SerializedName("IssuerIdNum")
			private String issuerIdNum;

			@SerializedName("MaskedAcctId")
			private String maskedAcctId;

			@SerializedName("MobilePinAvail")
			private String mobilePinAvail;

			@SerializedName("MobilePinLength")
			private String mobilePinLength;

			@SerializedName("MobilePinType")
			private String mobilePinType;

			@SerializedName("SWIFTAddr")
			private String sWIFTAddr;

			@SerializedName("VirtualPayId")
			private String virtualPayId;

			@SerializedName("AcctBalAmt")
			private String acctBalAmt;

			@SerializedName("AcctBalUpdDateTime")
			private String acctBalUpdateTime;

			@SerializedName("ATMPinLength")
			private String atmPinLength;

			@SerializedName("ATMPinFormat")
			private String atmPinFormat;

			@SerializedName("SchemeType")
			private String schemeType;

			@SerializedName("prodType")
			private String prodType;

			@SerializedName("AcctType")
			private String acctType;

			@SerializedName("AcctAvailBal")
			private String acctAvailBal;

			private String standingInstructions;

			private int drawableImg;

			private boolean isLinkedAccount = true;

			public String getAcctAvailBal() {
				return acctAvailBal;
			}

			public void setAcctAvailBal(String acctAvailBal) {
				this.acctAvailBal = acctAvailBal;
			}

			public String getAcctType() {
				return acctType;
			}

			public void setAcctType(String acctType) {
				this.acctType = acctType;
			}

			public String getSchemeType() {
				return schemeType;
			}

			public void setSchemeType(String schemeType) {
				this.schemeType = schemeType;
			}

			public String getProdType() {
				return prodType;
			}

			public void setProdType(String prodType) {
				this.prodType = prodType;
			}

			public BankAccount() {

			}

			public String getAccountIndex() {
				return accountIndex;
			}

			public void setAccountIndex(String accountIndex) {
				this.accountIndex = accountIndex;
			}

			public String getAcctHolderName() {
				return acctHolderName;
			}

			public void setAcctHolderName(String acctHolderName) {
				this.acctHolderName = acctHolderName;
			}

			public String getAcctId() {
				return acctId;
			}

			public void setAcctId(String acctId) {
				this.acctId = acctId;
			}

			public String getBankName() {
				return bankName;
			}

			public void setBankName(String bankName) {
				this.bankName = bankName;
			}

			public String getDisplayText() {
				return displayText;
			}

			public void setDisplayText(String displayText) {
				this.displayText = displayText;
			}

			public String getIssuerIdNum() {
				return issuerIdNum;
			}

			public void setIssuerIdNum(String issuerIdNum) {
				this.issuerIdNum = issuerIdNum;
			}

			public String getMaskedAcctId() {
				return maskedAcctId;
			}

			public void setMaskedAcctId(String maskedAcctId) {
				this.maskedAcctId = maskedAcctId;
			}

			public String getMobilePinAvail() {
				return mobilePinAvail;
			}

			public void setMobilePinAvail(String mobilePinAvail) {
				this.mobilePinAvail = mobilePinAvail;
			}

			public String getMobilePinLength() {
				return mobilePinLength;
			}

			public void setMobilePinLength(String mobilePinLength) {
				this.mobilePinLength = mobilePinLength;
			}

			public String getMobilePinType() {
				return mobilePinType;
			}

			public void setMobilePinType(String mobilePinType) {
				this.mobilePinType = mobilePinType;
			}

			public String getsWIFTAddr() {
				return sWIFTAddr;
			}

			public void setsWIFTAddr(String sWIFTAddr) {
				this.sWIFTAddr = sWIFTAddr;
			}

			public String getVirtualPayId() {
				return virtualPayId;
			}

			public void setVirtualPayId(String virtualPayId) {
				this.virtualPayId = virtualPayId;
			}

			public String getAcctBalAmt() {
				return acctBalAmt;
			}

			public void setAcctBalAmt(String acctBalAmt) {
				this.acctBalAmt = acctBalAmt;
			}

			public String getAcctBalUpdateTime() {
				return acctBalUpdateTime;
			}

			public void setAcctBalUpdateTime(String acctBalUpdateTime) {
				this.acctBalUpdateTime = acctBalUpdateTime;
			}

			public String getAtmPinLength() {
				return atmPinLength;
			}

			public void setAtmPinLength(String atmPinLength) {
				this.atmPinLength = atmPinLength;
			}

			public String getAtmPinFormat() {
				return atmPinFormat;
			}

			public void setAtmPinFormat(String atmPinFormat) {
				this.atmPinFormat = atmPinFormat;
			}

			public String getStandingInstructions() {
				return standingInstructions;
			}

			public void setStandingInstructions(String standingInstructions) {
				this.standingInstructions = standingInstructions;
			}

			public int getDrawableImg() {
				return drawableImg;
			}

			public void setDrawableImg(int drawableImg) {
				this.drawableImg = drawableImg;
			}

			public boolean isLinkedAccount() {
				return isLinkedAccount;
			}

			public void setLinkedAccount(boolean linkedAccount) {
				isLinkedAccount = linkedAccount;
			}

		}

		public List<BankAccount> getBankAccounts() {
			return bankAccounts;
		}

		public void setBankAccounts(List<BankAccount> bankAccounts) {
			this.bankAccounts = bankAccounts;
		}
	}
}
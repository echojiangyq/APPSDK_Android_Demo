package cn.com.broadlink.blappsdkdemo.common;

public class BLConstants {

    public static class APPConfigInfo{
        /**app文件夹目录**/
        public static final String BASE_FILE_PATH = "broadlink/eControl";
        
        public static final String BROADLINK = "BroadLink";
    }

    public static final String BROADLINK_LOG_TAG = "BROADLINK_DEMO";
    
    public static final String SDK_PACKAGE = "com.broadlink.blappsdkdemo";
    public static final String SDK_LICENSE = "4oQxAHVFYnnY7HPuDlYnm0I6pGcRvFTh/Ct2Vv+/5qZDpJJiIweBn2RUUA6oE8InRDV+XAAAAABz4LOxmXdGndIQ0J762DN4lXimLcoYN1h90T3OlpYrQrNgvm0/7+Kdmrgfawtr+QWBY+UBaf8hxk19tobFrLsFsEkbxXTfoUSQjDzWcfVjcAAAAAA=";
    
    /**MD5加密后缀*/
    public static final String STR_BODY_ENCRYPT = "xgx3d*fe3478$ukx";
    public static final String STR_RM_KEY_PF = "aas45^#*";
    public static final byte[] BYTES_RM_CODE_IV = {(byte) 0xea, (byte) 0xa4, 0x7a, 0x3a, (byte) 0xeb, 0x08,
            0x22, (byte) 0xa2, 0x19, 0x18, (byte) 0xc5, (byte) 0xd7, 0x1d, 0x36, 0x15, (byte) 0xaa};
    
    
    /** 文件夹名称 存放一些APP临时数据**/
    public static final String FILE_DATA = "data";
    //分享备份文件夹
    public static final String FILE_SHARE = "SharedData";
    //云空调控制指令
    public static final String FILE_CON_CODE = "ConCode";
    //设备图标
    public static final String FILE_DEVICE_ICON = "DeviceIcon";
    //RM数据
    public static final String FILE_IR_DATA = "IrData";
    //场景图标
    public static final String SCENE_NAME = "SceneIcon";
    //设备脚本文件
    public static final String FILE_SCRIPTS = "Scripts";
    //存放下载下来的HTML5文件夹
    public static final String FILE_DRPS = "Drps";
    //MS1背景图片
    public static final String FILE_MS1 = "MS1";
    //家庭文件夹名称
    public static final String FILE_FAMILY = "Family";
    //离线图标
    public static final String OFF_LINE_ICON = "OffLineIcon";

    /** 隐藏文件夹 存放S1的传感器信息文件 **/
    public static final String FILE_S1 = ".S1";

    //IRCode Device type
    public static final int BL_IRCODE_DEVICE_TV = 1;
    public static final int BL_IRCODE_DEVICE_TV_BOX = 2;
    public static final int BL_IRCODE_DEVICE_AC = 3;

    public static final String INTENT_NAME = "INTENT_NAME";
    public static final String INTENT_CODE = "INTENT_CODE";
    public static final String INTENT_VALUE = "INTENT_VALUE";
    public static final String INTENT_EMAIL = "INTENT_EMAIL";
    public static final String INTENT_PHONE = "INTENT_PHONE";
    public static final String INTENT_EXTEND = "INTENT_EXTEND";
    public static final String INTENT_ID = "INTENT_ID";
    public static final String INTENT_FAMILY_ID = BLConstants.INTENT_FAMILY_ID;
    public static final String INTENT_ACTION = "INTENT_ACTION";
    public static final String INTENT_URL = "INTENT_URL";
    public static final String INTENT_MODULE = "INTENT_MODULE";
    public static final String INTENT_DEVICE = "INTENT_DEVICE";
    public static final String INTENT_PARCELABLE = "INTENT_PARCELABLE";
    public static final String INTENT_MODEL = "INTENT_MODEL";
    public static final String INTENT_CLASS = "INTENT_CLASS";
    public static final String INTENT_PARAM = "INTENT_PARAM";
    public static final String INTENT_TYPE = "INTENT_TYPE";
    public static final String INTENT_ARRAY = "INTENT_ARRAY";
    public static final String INTENT_TITLE = "INTENT_TITLE";

}

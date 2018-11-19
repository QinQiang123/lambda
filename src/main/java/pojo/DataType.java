package pojo;

/**
 * @author QinQiang
 * @since 2018-11-12 17:06
 */
public enum DataType {

    NUM_TYPE("int tinyint bigint byte", 1),

    STRING_TYPE("vachar text char", 2),

    DATE_TYPE("data datatime", 3);


    private String code;
    private Integer msg;

    DataType(String code, Integer msg){
        this.code = code;
    }
    private Integer getMsg(String code){

        if (NUM_TYPE.code.contains(code)) {
            return NUM_TYPE.msg;
        }else if(STRING_TYPE.code.contains(code)){
            return STRING_TYPE.msg;
        }else{
            return DATE_TYPE.msg;
        }



    }





}

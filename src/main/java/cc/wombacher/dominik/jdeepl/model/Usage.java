package cc.wombacher.dominik.jdeepl.model;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Usage {
    @JsonProperty("character_count")
    private Integer usageCharacterCount;
    @JsonProperty("character_limit")
    private Integer usageCharaceterLimit;


    public Integer getUsageCharacterCount() {
        return this.usageCharacterCount;
    }
    public Integer getUsageCharaceterLimit() {
        return this.usageCharaceterLimit;
    }
}

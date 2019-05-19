package com.lry.generate.code.demo;

/**
 * Created by qinqin on 2019/3/15.
 */
public class ConfigItem {
    private String name;
    private String displayName;
    private Boolean required;
    private String valueType;
    private String defaultValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Boolean isRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfigItem item = (ConfigItem) o;

        return name.equals(item.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "ConfigItem{" +
                "name='" + name + '\'' +
                ", displayName='" + displayName + '\'' +
                ", required=" + required +
                ", valueType='" + valueType + '\'' +
                ", defaultValue='" + defaultValue + '\'' +
                '}';
    }
}

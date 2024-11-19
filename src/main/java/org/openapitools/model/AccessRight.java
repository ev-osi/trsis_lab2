package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AccessRight
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-19T13:26:52.449819500+03:00[Europe/Moscow]", comments = "Generator version: 7.10.0")
public class AccessRight {

  private Integer id;

  private Integer personId;

  private Integer roomId;

  public AccessRight id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AccessRight personId(Integer personId) {
    this.personId = personId;
    return this;
  }

  /**
   * Get personId
   * @return personId
   */
  
  @Schema(name = "personId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("personId")
  public Integer getPersonId() {
    return personId;
  }

  public void setPersonId(Integer personId) {
    this.personId = personId;
  }

  public AccessRight roomId(Integer roomId) {
    this.roomId = roomId;
    return this;
  }

  /**
   * Get roomId
   * @return roomId
   */
  
  @Schema(name = "roomId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roomId")
  public Integer getRoomId() {
    return roomId;
  }

  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessRight accessRight = (AccessRight) o;
    return Objects.equals(this.id, accessRight.id) &&
        Objects.equals(this.personId, accessRight.personId) &&
        Objects.equals(this.roomId, accessRight.roomId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, personId, roomId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessRight {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


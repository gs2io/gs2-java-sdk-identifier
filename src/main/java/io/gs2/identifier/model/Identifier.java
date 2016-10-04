package io.gs2.identifier.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * GSI
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Identifier implements Serializable {

	/** GSI ID */
	String identifierId;
	/** オーナーID */
	String ownerId;
	/** クライアントID */
	String clientId;
	/** 作成日時 */
	Long createAt;
	
	/**
	 * GSI ID を取得
	 * 
	 * @return GSI ID を取得
	 */
	public String getIdentifierId() {
		return identifierId;
	}
	
	/**
	 * GSI ID を設定
	 * 
	 * @param identifierId GSI ID
	 */
	public void setIdentifierId(String identifierId) {
		this.identifierId = identifierId;
	}
	
	/**
	 * オーナーIDを取得
	 * 
	 * @return オーナーIDを取得
	 */
	public String getOwnerId() {
		return ownerId;
	}
	
	/**
	 * オーナーIDを設定
	 * 
	 * @param ownerId オーナーID
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	
	/**
	 * クライアントIDを取得
	 * 
	 * @return クライアントIDを取得
	 */
	public String getClientId() {
		return clientId;
	}
	
	/**
	 * クライアントIDを設定
	 * 
	 * @param clientId クライアントID
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	
	/**
	 * 作成日時を取得
	 * 
	 * @return 作成日時を取得
	 */
	public Long getCreateAt() {
		return createAt;
	}
	
	/**
	 * 作成日時を設定
	 * 
	 * @param createAt 作成日時
	 */
	public void setCreateAt(Long createAt) {
		this.createAt = createAt;
	}
}

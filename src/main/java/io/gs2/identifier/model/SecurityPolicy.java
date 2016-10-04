package io.gs2.identifier.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * セキュリティポリシー
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class SecurityPolicy implements Serializable {

	/** セキュリティポリシー ID */
	String securityPolicyId;
	/** オーナーID */
	String ownerId;
	/** セキュリティポリシー名 */
	String name;
	/** ポリシー */
	String policy;
	/** 作成日時 */
	Long createAt;
	/** 更新日時 */
	Long updateAt;
	
	/**
	 * セキュリティポリシー IDを取得
	 * 
	 * @return セキュリティポリシー ID
	 */
	public String getSecurityPolicyId() {
		return securityPolicyId;
	}
	
	/**
	 * セキュリティポリシー IDを設定
	 * 
	 * @param securityPolicyId セキュリティポリシー ID
	 */
	public void setSecurityPolicyId(String securityPolicyId) {
		this.securityPolicyId = securityPolicyId;
	}
	
	/**
	 * オーナーIDを取得
	 * 
	 * @return オーナーID
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
	 * ポリシー名を取得
	 * 
	 * @return ポリシー名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * ポリシー名を設定
	 * 
	 * @param name ポリシー名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * ポリシードキュメントを取得
	 * 
	 * @return ポリシードキュメント
	 */
	public String getPolicy() {
		return policy;
	}
	
	/**
	 * ポリシードキュメントを設定
	 * 
	 * @param policy ポリシードキュメント
	 */
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	
	/**
	 * 作成日時を取得
	 * 
	 * @return 作成日時
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
	
	/**
	 * 更新日時を取得
	 * 
	 * @return 更新日時
	 */
	public Long getUpdateAt() {
		return updateAt;
	}
	
	/**
	 * 更新日時を設定
	 * 
	 * @param updateAt 更新日時
	 */
	public void setUpdateAt(Long updateAt) {
		this.updateAt = updateAt;
	}
}

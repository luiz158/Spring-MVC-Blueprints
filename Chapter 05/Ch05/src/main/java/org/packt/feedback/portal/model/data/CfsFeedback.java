
package org.packt.feedback.portal.model.data;
// Generated 08 28, 15 12:01:01 AM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CfsFeedback generated by hbm2java
 */
@Entity
@Table(name = "cfs_feedback", catalog = "cfs")
public class CfsFeedback implements java.io.Serializable {

	private Integer id;
	private CfsTopic cfsTopic;
	private String name;
	private String email;
	private String feedback;
	private Date date;

	public CfsFeedback() {
	}

	public CfsFeedback(CfsTopic cfsTopic, String name, String email, String feedback, Date date) {
		this.cfsTopic = cfsTopic;
		this.name = name;
		this.email = email;
		this.feedback = feedback;
		this.date = date;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "topicId", nullable = false)
	public CfsTopic getCfsTopic() {
		return this.cfsTopic;
	}

	public void setCfsTopic(CfsTopic cfsTopic) {
		this.cfsTopic = cfsTopic;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "email", nullable = false, length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "feedback", nullable = false)
	public String getFeedback() {
		return this.feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date", nullable = false, length = 10)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}

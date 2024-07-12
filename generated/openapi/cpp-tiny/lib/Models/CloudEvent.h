
/*
 * CloudEvent.h
 *
 * CloudEvents Specification JSON Schema
 */

#ifndef TINY_CPP_CLIENT_CloudEvent_H_
#define TINY_CPP_CLIENT_CloudEvent_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CloudEvent_data.h"

namespace Tiny {


/*! \brief CloudEvents Specification JSON Schema
 *
 *  \ingroup Models
 *
 */

class CloudEvent{
public:

    /*! \brief Constructor.
	 */
    CloudEvent();
    CloudEvent(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CloudEvent();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Identifies the event.
	 */
	std::string getId();

	/*! \brief Set Identifies the event.
	 */
	void setId(std::string  id);
	/*! \brief Get Identifies the context in which an event happened.
	 */
	std::string getSource();

	/*! \brief Set Identifies the context in which an event happened.
	 */
	void setSource(std::string  source);
	/*! \brief Get The version of the CloudEvents specification which the event uses.
	 */
	std::string getSpecversion();

	/*! \brief Set The version of the CloudEvents specification which the event uses.
	 */
	void setSpecversion(std::string  specversion);
	/*! \brief Get Describes the type of event related to the originating occurrence.
	 */
	std::string getType();

	/*! \brief Set Describes the type of event related to the originating occurrence.
	 */
	void setType(std::string  type);
	/*! \brief Get Content type of the data value. Must adhere to RFC 2046 format.
	 */
	std::string getDatacontenttype();

	/*! \brief Set Content type of the data value. Must adhere to RFC 2046 format.
	 */
	void setDatacontenttype(std::string  datacontenttype);
	/*! \brief Get Identifies the schema that data adheres to.
	 */
	std::string getDataschema();

	/*! \brief Set Identifies the schema that data adheres to.
	 */
	void setDataschema(std::string  dataschema);
	/*! \brief Get Describes the subject of the event in the context of the event producer (identified by source).
	 */
	std::string getSubject();

	/*! \brief Set Describes the subject of the event in the context of the event producer (identified by source).
	 */
	void setSubject(std::string  subject);
	/*! \brief Get Timestamp of when the occurrence happened. Must adhere to RFC 3339.
	 */
	std::string getTime();

	/*! \brief Set Timestamp of when the occurrence happened. Must adhere to RFC 3339.
	 */
	void setTime(std::string  time);
	/*! \brief Get 
	 */
	CloudEvent_data getData();

	/*! \brief Set 
	 */
	void setData(CloudEvent_data  data);
	/*! \brief Get Base64 encoded event payload. Must adhere to RFC4648.
	 */
	std::string getDataBase64();

	/*! \brief Set Base64 encoded event payload. Must adhere to RFC4648.
	 */
	void setDataBase64(std::string  data_base64);


    private:
    std::string id{};
    std::string source{};
    std::string specversion{};
    std::string type{};
    std::string datacontenttype{};
    std::string dataschema{};
    std::string subject{};
    std::string time{};
    CloudEvent_data data;
    std::string data_base64{};
};
}

#endif /* TINY_CPP_CLIENT_CloudEvent_H_ */

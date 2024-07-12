
/*
 * IoDocument.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_IoDocument_H_
#define TINY_CPP_CLIENT_IoDocument_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include "TmuxPaneIoDocument.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class IoDocument{
public:

    /*! \brief Constructor.
	 */
    IoDocument();
    IoDocument(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~IoDocument();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getType();

	/*! \brief Set 
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	std::string getSource();

	/*! \brief Set 
	 */
	void setSource(std::string  source);
	/*! \brief Get 
	 */
	TmuxPaneIoDocument getData();

	/*! \brief Set 
	 */
	void setData(TmuxPaneIoDocument  data);
	/*! \brief Get Identifies the event.
	 */
	std::string getId();

	/*! \brief Set Identifies the event.
	 */
	void setId(std::string  id);
	/*! \brief Get The version of the CloudEvents specification which the event uses.
	 */
	std::string getSpecversion();

	/*! \brief Set The version of the CloudEvents specification which the event uses.
	 */
	void setSpecversion(std::string  specversion);
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
	/*! \brief Get 
	 */
	std::string getSubject();

	/*! \brief Set 
	 */
	void setSubject(std::string  subject);
	/*! \brief Get Timestamp of when the occurrence happened. Must adhere to RFC 3339.
	 */
	std::string getTime();

	/*! \brief Set Timestamp of when the occurrence happened. Must adhere to RFC 3339.
	 */
	void setTime(std::string  time);
	/*! \brief Get Base64 encoded event payload. Must adhere to RFC4648.
	 */
	std::string getDataBase64();

	/*! \brief Set Base64 encoded event payload. Must adhere to RFC4648.
	 */
	void setDataBase64(std::string  data_base64);


    private:
    std::string type{};
    std::string source{};
    TmuxPaneIoDocument data;
    std::string id{};
    std::string specversion{};
    std::string datacontenttype{};
    std::string dataschema{};
    std::string subject{};
    std::string time{};
    std::string data_base64{};
};
}

#endif /* TINY_CPP_CLIENT_IoDocument_H_ */

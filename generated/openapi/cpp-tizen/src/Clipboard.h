/*
 * Clipboard.h
 *
 * 
 */

#ifndef _Clipboard_H_
#define _Clipboard_H_


#include <string>
#include "AnyType.h"
#include "ClipboardPayload.h"
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Clipboard : public Object {
public:
	/*! \brief Constructor.
	 */
	Clipboard();
	Clipboard(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Clipboard();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Identifies the event.
	 */
	std::string getId();

	/*! \brief Set Identifies the event.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getSource();

	/*! \brief Set 
	 */
	void setSource(std::string  source);
	/*! \brief Get The version of the CloudEvents specification which the event uses.
	 */
	std::string getSpecversion();

	/*! \brief Set The version of the CloudEvents specification which the event uses.
	 */
	void setSpecversion(std::string  specversion);
	/*! \brief Get 
	 */
	std::string getType();

	/*! \brief Set 
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
	/*! \brief Get 
	 */
	ClipboardPayload getData();

	/*! \brief Set 
	 */
	void setData(ClipboardPayload  data);
	/*! \brief Get Base64 encoded event payload. Must adhere to RFC4648.
	 */
	std::string getDataBase64();

	/*! \brief Set Base64 encoded event payload. Must adhere to RFC4648.
	 */
	void setDataBase64(std::string  data_base64);

private:
	std::string id;
	std::string source;
	std::string specversion;
	std::string type;
	std::string datacontenttype;
	std::string dataschema;
	std::string subject;
	std::string time;
	ClipboardPayload data;
	std::string data_base64;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Clipboard_H_ */

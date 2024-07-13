/*
 * Neo4jCaptureDataChange.h
 *
 * 
 */

#ifndef _Neo4jCaptureDataChange_H_
#define _Neo4jCaptureDataChange_H_


#include <string>
#include "AnyType.h"
#include "Neo4jCaptureDataChange_meta.h"
#include "Neo4jCaptureDataChange_payload.h"
#include "Neo4jCaptureDataChange_schema.h"
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

class Neo4jCaptureDataChange : public Object {
public:
	/*! \brief Constructor.
	 */
	Neo4jCaptureDataChange();
	Neo4jCaptureDataChange(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Neo4jCaptureDataChange();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::map<std::string, std::string> getHeaders();

	/*! \brief Set 
	 */
	void setHeaders(std::map <std::string, std::string> headers);
	/*! \brief Get 
	 */
	std::string getMessageKey();

	/*! \brief Set 
	 */
	void setMessageKey(std::string  message_key);
	/*! \brief Get 
	 */
	Neo4jCaptureDataChange_meta getMeta();

	/*! \brief Set 
	 */
	void setMeta(Neo4jCaptureDataChange_meta  meta);
	/*! \brief Get 
	 */
	int getOffset();

	/*! \brief Set 
	 */
	void setOffset(int  offset);
	/*! \brief Get 
	 */
	int getPartition();

	/*! \brief Set 
	 */
	void setPartition(int  partition);
	/*! \brief Get 
	 */
	std::string getSourceType();

	/*! \brief Set 
	 */
	void setSourceType(std::string  source_type);
	/*! \brief Get 
	 */
	std::string getTimestamp();

	/*! \brief Set 
	 */
	void setTimestamp(std::string  timestamp);
	/*! \brief Get 
	 */
	std::string getTopic();

	/*! \brief Set 
	 */
	void setTopic(std::string  topic);
	/*! \brief Get 
	 */
	Neo4jCaptureDataChange_schema getSchema();

	/*! \brief Set 
	 */
	void setSchema(Neo4jCaptureDataChange_schema  schema);
	/*! \brief Get 
	 */
	Neo4jCaptureDataChange_payload getPayload();

	/*! \brief Set 
	 */
	void setPayload(Neo4jCaptureDataChange_payload  payload);

private:
	std::map <std::string, std::string>headers;
	std::string message_key;
	Neo4jCaptureDataChange_meta meta;
	int offset;
	int partition;
	std::string source_type;
	std::string timestamp;
	std::string topic;
	Neo4jCaptureDataChange_schema schema;
	Neo4jCaptureDataChange_payload payload;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Neo4jCaptureDataChange_H_ */

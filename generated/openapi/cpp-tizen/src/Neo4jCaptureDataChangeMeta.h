/*
 * Neo4jCaptureDataChange_meta.h
 *
 * 
 */

#ifndef _Neo4jCaptureDataChange_meta_H_
#define _Neo4jCaptureDataChange_meta_H_


#include <string>
#include "Neo4jCaptureDataChange_meta_source.h"
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

class Neo4jCaptureDataChange_meta : public Object {
public:
	/*! \brief Constructor.
	 */
	Neo4jCaptureDataChange_meta();
	Neo4jCaptureDataChange_meta(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Neo4jCaptureDataChange_meta();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string  operation);
	/*! \brief Get 
	 */
	Neo4jCaptureDataChange_meta_source getSource();

	/*! \brief Set 
	 */
	void setSource(Neo4jCaptureDataChange_meta_source  source);
	/*! \brief Get 
	 */
	int getTimestamp();

	/*! \brief Set 
	 */
	void setTimestamp(int  timestamp);
	/*! \brief Get 
	 */
	int getTxEventId();

	/*! \brief Set 
	 */
	void setTxEventId(int  txEventId);
	/*! \brief Get 
	 */
	int getTxEventsCount();

	/*! \brief Set 
	 */
	void setTxEventsCount(int  txEventsCount);
	/*! \brief Get 
	 */
	int getTxId();

	/*! \brief Set 
	 */
	void setTxId(int  txId);
	/*! \brief Get 
	 */
	std::string getUsername();

	/*! \brief Set 
	 */
	void setUsername(std::string  username);

private:
	std::string operation;
	Neo4jCaptureDataChange_meta_source source;
	int timestamp;
	int txEventId;
	int txEventsCount;
	int txId;
	std::string username;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Neo4jCaptureDataChange_meta_H_ */

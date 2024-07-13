/*
 * Neo4jCaptureDataChangeNodePayload.h
 *
 * 
 */

#ifndef _Neo4jCaptureDataChangeNodePayload_H_
#define _Neo4jCaptureDataChangeNodePayload_H_


#include <string>
#include "Neo4jCaptureDataChangeNodePayload_after.h"
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

class Neo4jCaptureDataChangeNodePayload : public Object {
public:
	/*! \brief Constructor.
	 */
	Neo4jCaptureDataChangeNodePayload();
	Neo4jCaptureDataChangeNodePayload(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Neo4jCaptureDataChangeNodePayload();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Neo4jCaptureDataChangeNodePayload_after getAfter();

	/*! \brief Set 
	 */
	void setAfter(Neo4jCaptureDataChangeNodePayload_after  after);
	/*! \brief Get 
	 */
	std::string getBefore();

	/*! \brief Set 
	 */
	void setBefore(std::string  before);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getType();

	/*! \brief Set 
	 */
	void setType(std::string  type);

private:
	Neo4jCaptureDataChangeNodePayload_after after;
	std::string before;
	std::string id;
	std::string type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Neo4jCaptureDataChangeNodePayload_H_ */

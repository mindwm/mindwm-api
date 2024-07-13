/*
 * Neo4jCaptureDataChange_payload.h
 *
 * 
 */

#ifndef _Neo4jCaptureDataChange_payload_H_
#define _Neo4jCaptureDataChange_payload_H_


#include <string>
#include "Neo4jCaptureDataChangeNodePayload.h"
#include "Neo4jCaptureDataChangeRelationshipPayload.h"
#include "Neo4jCaptureDataChangeRelationshipPayload_end.h"
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

class Neo4jCaptureDataChange_payload : public Object {
public:
	/*! \brief Constructor.
	 */
	Neo4jCaptureDataChange_payload();
	Neo4jCaptureDataChange_payload(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Neo4jCaptureDataChange_payload();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getAfter();

	/*! \brief Set 
	 */
	void setAfter(std::string  after);
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
	/*! \brief Get 
	 */
	Neo4jCaptureDataChangeRelationshipPayload_end getEnd();

	/*! \brief Set 
	 */
	void setEnd(Neo4jCaptureDataChangeRelationshipPayload_end  end);
	/*! \brief Get 
	 */
	std::string getLabel();

	/*! \brief Set 
	 */
	void setLabel(std::string  label);
	/*! \brief Get 
	 */
	Neo4jCaptureDataChangeRelationshipPayload_end getStart();

	/*! \brief Set 
	 */
	void setStart(Neo4jCaptureDataChangeRelationshipPayload_end  start);

private:
	std::string after;
	std::string before;
	std::string id;
	std::string type;
	Neo4jCaptureDataChangeRelationshipPayload_end end;
	std::string label;
	Neo4jCaptureDataChangeRelationshipPayload_end start;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Neo4jCaptureDataChange_payload_H_ */

/*
 * Neo4jCaptureDataChangeRelationshipPayload_end.h
 *
 * 
 */

#ifndef _Neo4jCaptureDataChangeRelationshipPayload_end_H_
#define _Neo4jCaptureDataChangeRelationshipPayload_end_H_


#include <string>
#include "AnyType.h"
#include <list>
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

class Neo4jCaptureDataChangeRelationshipPayload_end : public Object {
public:
	/*! \brief Constructor.
	 */
	Neo4jCaptureDataChangeRelationshipPayload_end();
	Neo4jCaptureDataChangeRelationshipPayload_end(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Neo4jCaptureDataChangeRelationshipPayload_end();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::map<std::string, std::string> getIds();

	/*! \brief Set 
	 */
	void setIds(std::map <std::string, std::string> ids);
	/*! \brief Get 
	 */
	std::list<std::string> getLabels();

	/*! \brief Set 
	 */
	void setLabels(std::list <std::string> labels);

private:
	std::string id;
	std::map <std::string, std::string>ids;
	std::list <std::string>labels;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Neo4jCaptureDataChangeRelationshipPayload_end_H_ */

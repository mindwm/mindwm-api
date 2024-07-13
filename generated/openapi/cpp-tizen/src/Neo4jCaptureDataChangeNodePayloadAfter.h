/*
 * Neo4jCaptureDataChangeNodePayload_after.h
 *
 * 
 */

#ifndef _Neo4jCaptureDataChangeNodePayload_after_H_
#define _Neo4jCaptureDataChangeNodePayload_after_H_


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

class Neo4jCaptureDataChangeNodePayload_after : public Object {
public:
	/*! \brief Constructor.
	 */
	Neo4jCaptureDataChangeNodePayload_after();
	Neo4jCaptureDataChangeNodePayload_after(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Neo4jCaptureDataChangeNodePayload_after();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<std::string> getLabels();

	/*! \brief Set 
	 */
	void setLabels(std::list <std::string> labels);
	/*! \brief Get 
	 */
	std::map<std::string, std::string> getProperties();

	/*! \brief Set 
	 */
	void setProperties(std::map <std::string, std::string> properties);

private:
	std::list <std::string>labels;
	std::map <std::string, std::string>properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Neo4jCaptureDataChangeNodePayload_after_H_ */

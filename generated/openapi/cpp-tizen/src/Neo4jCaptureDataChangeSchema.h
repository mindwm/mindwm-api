/*
 * Neo4jCaptureDataChange_schema.h
 *
 * 
 */

#ifndef _Neo4jCaptureDataChange_schema_H_
#define _Neo4jCaptureDataChange_schema_H_


#include <string>
#include "AnyType.h"
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

class Neo4jCaptureDataChange_schema : public Object {
public:
	/*! \brief Constructor.
	 */
	Neo4jCaptureDataChange_schema();
	Neo4jCaptureDataChange_schema(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Neo4jCaptureDataChange_schema();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::map<std::string, std::string> getConstraints();

	/*! \brief Set 
	 */
	void setConstraints(std::map <std::string, std::string> constraints);
	/*! \brief Get 
	 */
	std::map<std::string, std::string> getProperties();

	/*! \brief Set 
	 */
	void setProperties(std::map <std::string, std::string> properties);

private:
	std::map <std::string, std::string>constraints;
	std::map <std::string, std::string>properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Neo4jCaptureDataChange_schema_H_ */

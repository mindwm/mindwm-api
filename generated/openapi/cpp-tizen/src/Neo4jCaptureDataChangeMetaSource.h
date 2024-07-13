/*
 * Neo4jCaptureDataChange_meta_source.h
 *
 * 
 */

#ifndef _Neo4jCaptureDataChange_meta_source_H_
#define _Neo4jCaptureDataChange_meta_source_H_


#include <string>
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

class Neo4jCaptureDataChange_meta_source : public Object {
public:
	/*! \brief Constructor.
	 */
	Neo4jCaptureDataChange_meta_source();
	Neo4jCaptureDataChange_meta_source(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Neo4jCaptureDataChange_meta_source();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getHostname();

	/*! \brief Set 
	 */
	void setHostname(std::string  hostname);

private:
	std::string hostname;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Neo4jCaptureDataChange_meta_source_H_ */

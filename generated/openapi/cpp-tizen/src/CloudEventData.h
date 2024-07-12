/*
 * CloudEvent_data.h
 *
 * The event payload.
 */

#ifndef _CloudEvent_data_H_
#define _CloudEvent_data_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The event payload.
 *
 *  \ingroup Models
 *
 */

class CloudEvent_data : public Object {
public:
	/*! \brief Constructor.
	 */
	CloudEvent_data();
	CloudEvent_data(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CloudEvent_data();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _CloudEvent_data_H_ */

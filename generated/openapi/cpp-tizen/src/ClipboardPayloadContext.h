/*
 * ClipboardPayload_context.h
 *
 * Selection context
 */

#ifndef _ClipboardPayload_context_H_
#define _ClipboardPayload_context_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Selection context
 *
 *  \ingroup Models
 *
 */

class ClipboardPayload_context : public Object {
public:
	/*! \brief Constructor.
	 */
	ClipboardPayload_context();
	ClipboardPayload_context(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ClipboardPayload_context();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get window id
	 */
	std::string getWindow();

	/*! \brief Set window id
	 */
	void setWindow(std::string  window);

private:
	std::string window;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ClipboardPayload_context_H_ */

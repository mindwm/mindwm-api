/*
 * ClipboardPayload.h
 *
 * 
 */

#ifndef _ClipboardPayload_H_
#define _ClipboardPayload_H_


#include <string>
#include "ClipboardPayload_context.h"
#include <list>
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

class ClipboardPayload : public Object {
public:
	/*! \brief Constructor.
	 */
	ClipboardPayload();
	ClipboardPayload(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ClipboardPayload();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Starting position of clipboard selection [x,y]
	 */
	std::list<int> getStart();

	/*! \brief Set Starting position of clipboard selection [x,y]
	 */
	void setStart(std::list <int> start);
	/*! \brief Get Ending position of clipboard selection [x,y]
	 */
	std::list<int> getStop();

	/*! \brief Set Ending position of clipboard selection [x,y]
	 */
	void setStop(std::list <int> stop);
	/*! \brief Get Clipboard data
	 */
	std::string getData();

	/*! \brief Set Clipboard data
	 */
	void setData(std::string  data);
	/*! \brief Get Clipboard type
	 */
	std::string getType();

	/*! \brief Set Clipboard type
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	ClipboardPayload_context getContext();

	/*! \brief Set 
	 */
	void setContext(ClipboardPayload_context  context);

private:
	std::list <int>start;
	std::list <int>stop;
	std::string data;
	std::string type;
	ClipboardPayload_context context;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ClipboardPayload_H_ */

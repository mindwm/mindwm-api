
/*
 * ClipboardPayload.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ClipboardPayload_H_
#define TINY_CPP_CLIENT_ClipboardPayload_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ClipboardPayload_context.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ClipboardPayload{
public:

    /*! \brief Constructor.
	 */
    ClipboardPayload();
    ClipboardPayload(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ClipboardPayload();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<int> start;
    std::list<int> stop;
    std::string data{};
    std::string type{};
    ClipboardPayload_context context;
};
}

#endif /* TINY_CPP_CLIENT_ClipboardPayload_H_ */

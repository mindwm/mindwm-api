/*
 * TmuxPaneIoDocument.h
 *
 * 
 */

#ifndef _TmuxPaneIoDocument_H_
#define _TmuxPaneIoDocument_H_


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

class TmuxPaneIoDocument : public Object {
public:
	/*! \brief Constructor.
	 */
	TmuxPaneIoDocument();
	TmuxPaneIoDocument(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TmuxPaneIoDocument();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get User input
	 */
	std::string getInput();

	/*! \brief Set User input
	 */
	void setInput(std::string  input);
	/*! \brief Get Command output (mix of stdout & stderr)
	 */
	std::string getOutput();

	/*! \brief Set Command output (mix of stdout & stderr)
	 */
	void setOutput(std::string  output);
	/*! \brief Get ps1 (prompt) AFTER the input and output
	 */
	std::string getPs1();

	/*! \brief Set ps1 (prompt) AFTER the input and output
	 */
	void setPs1(std::string  ps1);

private:
	std::string input;
	std::string output;
	std::string ps1;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TmuxPaneIoDocument_H_ */

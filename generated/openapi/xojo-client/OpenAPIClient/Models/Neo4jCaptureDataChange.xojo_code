#tag Class
Protected Class Neo4jCaptureDataChange

	#tag Property, Flags = &h0
		headers As Dictionary
	#tag EndProperty


	#tag Property, Flags = &h0
		message_key As String
	#tag EndProperty


	#tag Property, Flags = &h0
		meta As OpenAPIClient.Models.Neo4jCaptureDataChangeMeta
	#tag EndProperty


	#tag Property, Flags = &h0
		offset As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		partition As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		source_type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		timestamp As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		topic As String
	#tag EndProperty


	#tag Property, Flags = &h0
		schema As OpenAPIClient.Models.Neo4jCaptureDataChangeSchema
	#tag EndProperty


	#tag Property, Flags = &h0
		payload As OpenAPIClient.Models.Neo4jCaptureDataChangePayload
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="headers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="message_key"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="meta"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Neo4jCaptureDataChangeMeta"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="offset"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="partition"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="source_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="timestamp"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="topic"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="schema"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Neo4jCaptureDataChangeSchema"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="payload"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Neo4jCaptureDataChangePayload"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


